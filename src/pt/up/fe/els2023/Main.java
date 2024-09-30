package pt.up.fe.els2023;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.IParser;
import org.xml.sax.SAXException;
import org.xtext.example.dr.DataRetrievalStandaloneSetup;
import pt.up.fe.els2023.parser.Parser;
import pt.up.fe.els2023.internalDsl.DataRetrievalBuilder;
import pt.up.fe.specs.util.SpecsIo;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.StringReader;

public class Main {

	@Inject
	private IParser parser;

	public Main() {
		var injector = new DataRetrievalStandaloneSetup().createInjectorAndDoEMFRegistration();
		injector.injectMembers(this);

	}

	public void parse(String code) throws IOException, ParserConfigurationException, SAXException {

		var result = parser.parse(new StringReader(code));

		if(result.hasSyntaxErrors()) {
			System.out.println("Errors:");
			for (var error: result.getSyntaxErrors()) {
				System.out.println(" - " + error.getSyntaxErrorMessage());
			}
			return;
		}

		var DslParser = new Parser(result);
		DataRetrievalBuilder builder = DslParser.parse();

		builder.build().execute();
	}

	public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {

		// Run external DSL for assignment 1 example
		// DOES NOT WORK
		//new Main().parse(SpecsIo.getResource("pt/up/fe/els2023/assignment_1.dr"));

		// Run external DSL for assignment 2 example
		// ONLY WORKS IF RENAME INCLUDES VARIABLE AS IN ASSIGNMENT 3, BUT EXTRACTS 2 FIELDS FROM DECISION_TREE.YAML THAT ARE NOT AT THE ROOT LEVEL
		//new Main().parse(SpecsIo.getResource("pt/up/fe/els2023/assignment_2.dr"));

		// Run external DSL for assignment 3 example
		// WORKS
		new Main().parse(SpecsIo.getResource("pt/up/fe/els2023/assignment_3.dr"));
    }
}