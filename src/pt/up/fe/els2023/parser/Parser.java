package pt.up.fe.els2023.parser;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.IParseResult;
import org.xml.sax.SAXException;
import org.xtext.example.dr.dataRetrieval.*;
import pt.up.fe.els2023.internalDsl.DataRetrievalBuilder;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Parser {
    IParseResult result;

    public Parser(IParseResult result) {
        this.result = result;
    }

    public DataRetrievalBuilder parse() throws IOException, ParserConfigurationException, SAXException {
        DataRetrievalBuilder builder = new DataRetrievalBuilder();

        var ast = result.getRootASTElement();
        var treeIterator = ast.eAllContents();
        String currDest = null;
        boolean someRename;

        while(treeIterator.hasNext()) {
            var element = treeIterator.next();

            if (element instanceof Dest dest) {
                currDest = dest.getName();
            }
            else if (element instanceof SourceFolder sourceFolder) {
                builder.allFromDir(new File(sourceFolder.getName()).listFiles(File::isDirectory));
            }
            else if (element instanceof Source source) {
                builder.from(source.getName());
                builder.to(currDest);
            }
            else if (element instanceof Path path) {
                builder.fromInFile(path.getName());
            }
            else if (element instanceof KeysToExtract keysToExtract) {
                someRename = false;
                ArrayList<String> get = new ArrayList<>();
                ArrayList<String> rename = new ArrayList<>();
                for (TreeIterator<EObject> it = keysToExtract.eAllContents(); it.hasNext(); ) {
                    var kteElement = it.next();
                    if (kteElement instanceof Key key) {
                        get.add(key.getName());
                        var renameSingle = key.getRename();
                        if (renameSingle instanceof FullRename) {
                            if (((FullRename) renameSingle).getN() != null) {
                                builder.filterRelatedRename();
                            }
                            rename.add(renameSingle.getName());
                            someRename = true;
                        }
                        else if (renameSingle instanceof AddPrefix) {
                            rename.add(renameSingle.getName() + key.getName());
                            someRename = true;
                        }
                        else if (renameSingle instanceof AddSuffix) {
                            rename.add(key.getName() + renameSingle.getName());
                            someRename = true;
                        }
                        else {
                            rename.add("");
                        }
                    }
                }
                builder.get(get);
                if (someRename) {
                    builder.rename(rename);
                }
            }
            else if (element instanceof RenameAll renameAll) {
                if (renameAll instanceof AddPrefix addPrefix) {
                    builder.renameAll(addPrefix.getName(), "");
                }
                if (renameAll instanceof AddSuffix addSuffix) {
                    builder.renameAll("", addSuffix.getName());
                }
            }
            else if (element instanceof Filter filter) {
                builder.filter(filter.getName());
            }
            else if (element instanceof TopN topN) {
                builder.top(topN.getValue());
            }
            else if (element instanceof BottomN bottomN) {
                builder.bottom(bottomN.getValue());
            }
            else if (element instanceof OpType opType) {
                if (opType.getSum() != null) {
                    if (opType.getAll() != null) {
                        builder.sumOf("all");
                    }
                    else {
                        ArrayList<String> keysSum = new ArrayList<>();
                        for (TreeIterator<EObject> it = opType.eAllContents(); it.hasNext(); ) {
                            var kteElement2 = it.next();
                            if (kteElement2 instanceof Key key) {
                                keysSum.add(key.getName());
                            }
                        }
                        builder.sumOf(keysSum);
                    }
                }
                else if (opType.getAverage() != null) {
                    if (opType.getAll() != null) {
                        builder.averageOf("all");
                    }
                    else {
                        ArrayList<String> keysAverage = new ArrayList<>();
                        for (TreeIterator<EObject> it = opType.eAllContents(); it.hasNext(); ) {
                            var kteElement3 = it.next();
                            if (kteElement3 instanceof Key key) {
                                keysAverage.add(key.getName());
                            }
                        }
                        builder.averageOf(keysAverage);
                    }
                }
            }
        }

        return builder;
    }
}
