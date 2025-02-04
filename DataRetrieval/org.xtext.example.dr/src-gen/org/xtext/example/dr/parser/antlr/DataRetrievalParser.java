/*
 * generated by Xtext 2.32.0
 */
package org.xtext.example.dr.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.dr.parser.antlr.internal.InternalDataRetrievalParser;
import org.xtext.example.dr.services.DataRetrievalGrammarAccess;

public class DataRetrievalParser extends AbstractAntlrParser {

	@Inject
	private DataRetrievalGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalDataRetrievalParser createParser(XtextTokenStream stream) {
		return new InternalDataRetrievalParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Retrieve";
	}

	public DataRetrievalGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DataRetrievalGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
