package org.xtext.example.dr.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.dr.services.DataRetrievalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDataRetrievalParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'retrieve'", "'{'", "'}'", "'destination='", "'folder='", "'extraction'", "'operation'", "'source='", "'path='", "'get=['", "']'", "','", "'->'", "'rename='", "'prepend='", "'append='", "'filter='", "'top='", "'bottom='", "'['", "'N'", "'average='", "'sum='", "'all'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDataRetrievalParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDataRetrievalParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDataRetrievalParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDataRetrieval.g"; }


    	private DataRetrievalGrammarAccess grammarAccess;

    	public void setGrammarAccess(DataRetrievalGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleRetrieve"
    // InternalDataRetrieval.g:53:1: entryRuleRetrieve : ruleRetrieve EOF ;
    public final void entryRuleRetrieve() throws RecognitionException {
        try {
            // InternalDataRetrieval.g:54:1: ( ruleRetrieve EOF )
            // InternalDataRetrieval.g:55:1: ruleRetrieve EOF
            {
             before(grammarAccess.getRetrieveRule()); 
            pushFollow(FOLLOW_1);
            ruleRetrieve();

            state._fsp--;

             after(grammarAccess.getRetrieveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRetrieve"


    // $ANTLR start "ruleRetrieve"
    // InternalDataRetrieval.g:62:1: ruleRetrieve : ( ( rule__Retrieve__Group__0 ) ) ;
    public final void ruleRetrieve() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:66:2: ( ( ( rule__Retrieve__Group__0 ) ) )
            // InternalDataRetrieval.g:67:2: ( ( rule__Retrieve__Group__0 ) )
            {
            // InternalDataRetrieval.g:67:2: ( ( rule__Retrieve__Group__0 ) )
            // InternalDataRetrieval.g:68:3: ( rule__Retrieve__Group__0 )
            {
             before(grammarAccess.getRetrieveAccess().getGroup()); 
            // InternalDataRetrieval.g:69:3: ( rule__Retrieve__Group__0 )
            // InternalDataRetrieval.g:69:4: rule__Retrieve__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Retrieve__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRetrieveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRetrieve"


    // $ANTLR start "entryRuleDest"
    // InternalDataRetrieval.g:78:1: entryRuleDest : ruleDest EOF ;
    public final void entryRuleDest() throws RecognitionException {
        try {
            // InternalDataRetrieval.g:79:1: ( ruleDest EOF )
            // InternalDataRetrieval.g:80:1: ruleDest EOF
            {
             before(grammarAccess.getDestRule()); 
            pushFollow(FOLLOW_1);
            ruleDest();

            state._fsp--;

             after(grammarAccess.getDestRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDest"


    // $ANTLR start "ruleDest"
    // InternalDataRetrieval.g:87:1: ruleDest : ( ( rule__Dest__Group__0 ) ) ;
    public final void ruleDest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:91:2: ( ( ( rule__Dest__Group__0 ) ) )
            // InternalDataRetrieval.g:92:2: ( ( rule__Dest__Group__0 ) )
            {
            // InternalDataRetrieval.g:92:2: ( ( rule__Dest__Group__0 ) )
            // InternalDataRetrieval.g:93:3: ( rule__Dest__Group__0 )
            {
             before(grammarAccess.getDestAccess().getGroup()); 
            // InternalDataRetrieval.g:94:3: ( rule__Dest__Group__0 )
            // InternalDataRetrieval.g:94:4: rule__Dest__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Dest__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDest"


    // $ANTLR start "entryRuleSourceFolder"
    // InternalDataRetrieval.g:103:1: entryRuleSourceFolder : ruleSourceFolder EOF ;
    public final void entryRuleSourceFolder() throws RecognitionException {
        try {
            // InternalDataRetrieval.g:104:1: ( ruleSourceFolder EOF )
            // InternalDataRetrieval.g:105:1: ruleSourceFolder EOF
            {
             before(grammarAccess.getSourceFolderRule()); 
            pushFollow(FOLLOW_1);
            ruleSourceFolder();

            state._fsp--;

             after(grammarAccess.getSourceFolderRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSourceFolder"


    // $ANTLR start "ruleSourceFolder"
    // InternalDataRetrieval.g:112:1: ruleSourceFolder : ( ( rule__SourceFolder__Group__0 ) ) ;
    public final void ruleSourceFolder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:116:2: ( ( ( rule__SourceFolder__Group__0 ) ) )
            // InternalDataRetrieval.g:117:2: ( ( rule__SourceFolder__Group__0 ) )
            {
            // InternalDataRetrieval.g:117:2: ( ( rule__SourceFolder__Group__0 ) )
            // InternalDataRetrieval.g:118:3: ( rule__SourceFolder__Group__0 )
            {
             before(grammarAccess.getSourceFolderAccess().getGroup()); 
            // InternalDataRetrieval.g:119:3: ( rule__SourceFolder__Group__0 )
            // InternalDataRetrieval.g:119:4: rule__SourceFolder__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SourceFolder__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSourceFolderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSourceFolder"


    // $ANTLR start "entryRuleConfigList"
    // InternalDataRetrieval.g:128:1: entryRuleConfigList : ruleConfigList EOF ;
    public final void entryRuleConfigList() throws RecognitionException {
        try {
            // InternalDataRetrieval.g:129:1: ( ruleConfigList EOF )
            // InternalDataRetrieval.g:130:1: ruleConfigList EOF
            {
             before(grammarAccess.getConfigListRule()); 
            pushFollow(FOLLOW_1);
            ruleConfigList();

            state._fsp--;

             after(grammarAccess.getConfigListRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfigList"


    // $ANTLR start "ruleConfigList"
    // InternalDataRetrieval.g:137:1: ruleConfigList : ( ( rule__ConfigList__Group__0 ) ) ;
    public final void ruleConfigList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:141:2: ( ( ( rule__ConfigList__Group__0 ) ) )
            // InternalDataRetrieval.g:142:2: ( ( rule__ConfigList__Group__0 ) )
            {
            // InternalDataRetrieval.g:142:2: ( ( rule__ConfigList__Group__0 ) )
            // InternalDataRetrieval.g:143:3: ( rule__ConfigList__Group__0 )
            {
             before(grammarAccess.getConfigListAccess().getGroup()); 
            // InternalDataRetrieval.g:144:3: ( rule__ConfigList__Group__0 )
            // InternalDataRetrieval.g:144:4: rule__ConfigList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConfigList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfigList"


    // $ANTLR start "entryRuleOpList"
    // InternalDataRetrieval.g:153:1: entryRuleOpList : ruleOpList EOF ;
    public final void entryRuleOpList() throws RecognitionException {
        try {
            // InternalDataRetrieval.g:154:1: ( ruleOpList EOF )
            // InternalDataRetrieval.g:155:1: ruleOpList EOF
            {
             before(grammarAccess.getOpListRule()); 
            pushFollow(FOLLOW_1);
            ruleOpList();

            state._fsp--;

             after(grammarAccess.getOpListRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOpList"


    // $ANTLR start "ruleOpList"
    // InternalDataRetrieval.g:162:1: ruleOpList : ( ( rule__OpList__Group__0 ) ) ;
    public final void ruleOpList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:166:2: ( ( ( rule__OpList__Group__0 ) ) )
            // InternalDataRetrieval.g:167:2: ( ( rule__OpList__Group__0 ) )
            {
            // InternalDataRetrieval.g:167:2: ( ( rule__OpList__Group__0 ) )
            // InternalDataRetrieval.g:168:3: ( rule__OpList__Group__0 )
            {
             before(grammarAccess.getOpListAccess().getGroup()); 
            // InternalDataRetrieval.g:169:3: ( rule__OpList__Group__0 )
            // InternalDataRetrieval.g:169:4: rule__OpList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OpList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOpListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOpList"


    // $ANTLR start "entryRuleSource"
    // InternalDataRetrieval.g:178:1: entryRuleSource : ruleSource EOF ;
    public final void entryRuleSource() throws RecognitionException {
        try {
            // InternalDataRetrieval.g:179:1: ( ruleSource EOF )
            // InternalDataRetrieval.g:180:1: ruleSource EOF
            {
             before(grammarAccess.getSourceRule()); 
            pushFollow(FOLLOW_1);
            ruleSource();

            state._fsp--;

             after(grammarAccess.getSourceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSource"


    // $ANTLR start "ruleSource"
    // InternalDataRetrieval.g:187:1: ruleSource : ( ( rule__Source__Group__0 ) ) ;
    public final void ruleSource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:191:2: ( ( ( rule__Source__Group__0 ) ) )
            // InternalDataRetrieval.g:192:2: ( ( rule__Source__Group__0 ) )
            {
            // InternalDataRetrieval.g:192:2: ( ( rule__Source__Group__0 ) )
            // InternalDataRetrieval.g:193:3: ( rule__Source__Group__0 )
            {
             before(grammarAccess.getSourceAccess().getGroup()); 
            // InternalDataRetrieval.g:194:3: ( rule__Source__Group__0 )
            // InternalDataRetrieval.g:194:4: rule__Source__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSource"


    // $ANTLR start "entryRulePath"
    // InternalDataRetrieval.g:203:1: entryRulePath : rulePath EOF ;
    public final void entryRulePath() throws RecognitionException {
        try {
            // InternalDataRetrieval.g:204:1: ( rulePath EOF )
            // InternalDataRetrieval.g:205:1: rulePath EOF
            {
             before(grammarAccess.getPathRule()); 
            pushFollow(FOLLOW_1);
            rulePath();

            state._fsp--;

             after(grammarAccess.getPathRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePath"


    // $ANTLR start "rulePath"
    // InternalDataRetrieval.g:212:1: rulePath : ( ( rule__Path__Group__0 ) ) ;
    public final void rulePath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:216:2: ( ( ( rule__Path__Group__0 ) ) )
            // InternalDataRetrieval.g:217:2: ( ( rule__Path__Group__0 ) )
            {
            // InternalDataRetrieval.g:217:2: ( ( rule__Path__Group__0 ) )
            // InternalDataRetrieval.g:218:3: ( rule__Path__Group__0 )
            {
             before(grammarAccess.getPathAccess().getGroup()); 
            // InternalDataRetrieval.g:219:3: ( rule__Path__Group__0 )
            // InternalDataRetrieval.g:219:4: rule__Path__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Path__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPathAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePath"


    // $ANTLR start "entryRuleKeysToExtract"
    // InternalDataRetrieval.g:228:1: entryRuleKeysToExtract : ruleKeysToExtract EOF ;
    public final void entryRuleKeysToExtract() throws RecognitionException {
        try {
            // InternalDataRetrieval.g:229:1: ( ruleKeysToExtract EOF )
            // InternalDataRetrieval.g:230:1: ruleKeysToExtract EOF
            {
             before(grammarAccess.getKeysToExtractRule()); 
            pushFollow(FOLLOW_1);
            ruleKeysToExtract();

            state._fsp--;

             after(grammarAccess.getKeysToExtractRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKeysToExtract"


    // $ANTLR start "ruleKeysToExtract"
    // InternalDataRetrieval.g:237:1: ruleKeysToExtract : ( ( rule__KeysToExtract__Group__0 ) ) ;
    public final void ruleKeysToExtract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:241:2: ( ( ( rule__KeysToExtract__Group__0 ) ) )
            // InternalDataRetrieval.g:242:2: ( ( rule__KeysToExtract__Group__0 ) )
            {
            // InternalDataRetrieval.g:242:2: ( ( rule__KeysToExtract__Group__0 ) )
            // InternalDataRetrieval.g:243:3: ( rule__KeysToExtract__Group__0 )
            {
             before(grammarAccess.getKeysToExtractAccess().getGroup()); 
            // InternalDataRetrieval.g:244:3: ( rule__KeysToExtract__Group__0 )
            // InternalDataRetrieval.g:244:4: rule__KeysToExtract__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__KeysToExtract__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKeysToExtractAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKeysToExtract"


    // $ANTLR start "entryRuleKey"
    // InternalDataRetrieval.g:253:1: entryRuleKey : ruleKey EOF ;
    public final void entryRuleKey() throws RecognitionException {
        try {
            // InternalDataRetrieval.g:254:1: ( ruleKey EOF )
            // InternalDataRetrieval.g:255:1: ruleKey EOF
            {
             before(grammarAccess.getKeyRule()); 
            pushFollow(FOLLOW_1);
            ruleKey();

            state._fsp--;

             after(grammarAccess.getKeyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKey"


    // $ANTLR start "ruleKey"
    // InternalDataRetrieval.g:262:1: ruleKey : ( ( rule__Key__Group__0 ) ) ;
    public final void ruleKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:266:2: ( ( ( rule__Key__Group__0 ) ) )
            // InternalDataRetrieval.g:267:2: ( ( rule__Key__Group__0 ) )
            {
            // InternalDataRetrieval.g:267:2: ( ( rule__Key__Group__0 ) )
            // InternalDataRetrieval.g:268:3: ( rule__Key__Group__0 )
            {
             before(grammarAccess.getKeyAccess().getGroup()); 
            // InternalDataRetrieval.g:269:3: ( rule__Key__Group__0 )
            // InternalDataRetrieval.g:269:4: rule__Key__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Key__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKeyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKey"


    // $ANTLR start "entryRuleRename"
    // InternalDataRetrieval.g:278:1: entryRuleRename : ruleRename EOF ;
    public final void entryRuleRename() throws RecognitionException {
        try {
            // InternalDataRetrieval.g:279:1: ( ruleRename EOF )
            // InternalDataRetrieval.g:280:1: ruleRename EOF
            {
             before(grammarAccess.getRenameRule()); 
            pushFollow(FOLLOW_1);
            ruleRename();

            state._fsp--;

             after(grammarAccess.getRenameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRename"


    // $ANTLR start "ruleRename"
    // InternalDataRetrieval.g:287:1: ruleRename : ( ( rule__Rename__Alternatives ) ) ;
    public final void ruleRename() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:291:2: ( ( ( rule__Rename__Alternatives ) ) )
            // InternalDataRetrieval.g:292:2: ( ( rule__Rename__Alternatives ) )
            {
            // InternalDataRetrieval.g:292:2: ( ( rule__Rename__Alternatives ) )
            // InternalDataRetrieval.g:293:3: ( rule__Rename__Alternatives )
            {
             before(grammarAccess.getRenameAccess().getAlternatives()); 
            // InternalDataRetrieval.g:294:3: ( rule__Rename__Alternatives )
            // InternalDataRetrieval.g:294:4: rule__Rename__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Rename__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRenameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRename"


    // $ANTLR start "entryRuleRenameAll"
    // InternalDataRetrieval.g:303:1: entryRuleRenameAll : ruleRenameAll EOF ;
    public final void entryRuleRenameAll() throws RecognitionException {
        try {
            // InternalDataRetrieval.g:304:1: ( ruleRenameAll EOF )
            // InternalDataRetrieval.g:305:1: ruleRenameAll EOF
            {
             before(grammarAccess.getRenameAllRule()); 
            pushFollow(FOLLOW_1);
            ruleRenameAll();

            state._fsp--;

             after(grammarAccess.getRenameAllRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRenameAll"


    // $ANTLR start "ruleRenameAll"
    // InternalDataRetrieval.g:312:1: ruleRenameAll : ( ( rule__RenameAll__Alternatives ) ) ;
    public final void ruleRenameAll() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:316:2: ( ( ( rule__RenameAll__Alternatives ) ) )
            // InternalDataRetrieval.g:317:2: ( ( rule__RenameAll__Alternatives ) )
            {
            // InternalDataRetrieval.g:317:2: ( ( rule__RenameAll__Alternatives ) )
            // InternalDataRetrieval.g:318:3: ( rule__RenameAll__Alternatives )
            {
             before(grammarAccess.getRenameAllAccess().getAlternatives()); 
            // InternalDataRetrieval.g:319:3: ( rule__RenameAll__Alternatives )
            // InternalDataRetrieval.g:319:4: rule__RenameAll__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RenameAll__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRenameAllAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRenameAll"


    // $ANTLR start "entryRuleFullRename"
    // InternalDataRetrieval.g:328:1: entryRuleFullRename : ruleFullRename EOF ;
    public final void entryRuleFullRename() throws RecognitionException {
        try {
            // InternalDataRetrieval.g:329:1: ( ruleFullRename EOF )
            // InternalDataRetrieval.g:330:1: ruleFullRename EOF
            {
             before(grammarAccess.getFullRenameRule()); 
            pushFollow(FOLLOW_1);
            ruleFullRename();

            state._fsp--;

             after(grammarAccess.getFullRenameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFullRename"


    // $ANTLR start "ruleFullRename"
    // InternalDataRetrieval.g:337:1: ruleFullRename : ( ( rule__FullRename__Group__0 ) ) ;
    public final void ruleFullRename() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:341:2: ( ( ( rule__FullRename__Group__0 ) ) )
            // InternalDataRetrieval.g:342:2: ( ( rule__FullRename__Group__0 ) )
            {
            // InternalDataRetrieval.g:342:2: ( ( rule__FullRename__Group__0 ) )
            // InternalDataRetrieval.g:343:3: ( rule__FullRename__Group__0 )
            {
             before(grammarAccess.getFullRenameAccess().getGroup()); 
            // InternalDataRetrieval.g:344:3: ( rule__FullRename__Group__0 )
            // InternalDataRetrieval.g:344:4: rule__FullRename__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FullRename__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFullRenameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFullRename"


    // $ANTLR start "entryRuleAddPrefix"
    // InternalDataRetrieval.g:353:1: entryRuleAddPrefix : ruleAddPrefix EOF ;
    public final void entryRuleAddPrefix() throws RecognitionException {
        try {
            // InternalDataRetrieval.g:354:1: ( ruleAddPrefix EOF )
            // InternalDataRetrieval.g:355:1: ruleAddPrefix EOF
            {
             before(grammarAccess.getAddPrefixRule()); 
            pushFollow(FOLLOW_1);
            ruleAddPrefix();

            state._fsp--;

             after(grammarAccess.getAddPrefixRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddPrefix"


    // $ANTLR start "ruleAddPrefix"
    // InternalDataRetrieval.g:362:1: ruleAddPrefix : ( ( rule__AddPrefix__Group__0 ) ) ;
    public final void ruleAddPrefix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:366:2: ( ( ( rule__AddPrefix__Group__0 ) ) )
            // InternalDataRetrieval.g:367:2: ( ( rule__AddPrefix__Group__0 ) )
            {
            // InternalDataRetrieval.g:367:2: ( ( rule__AddPrefix__Group__0 ) )
            // InternalDataRetrieval.g:368:3: ( rule__AddPrefix__Group__0 )
            {
             before(grammarAccess.getAddPrefixAccess().getGroup()); 
            // InternalDataRetrieval.g:369:3: ( rule__AddPrefix__Group__0 )
            // InternalDataRetrieval.g:369:4: rule__AddPrefix__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddPrefix__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddPrefixAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddPrefix"


    // $ANTLR start "entryRuleAddSuffix"
    // InternalDataRetrieval.g:378:1: entryRuleAddSuffix : ruleAddSuffix EOF ;
    public final void entryRuleAddSuffix() throws RecognitionException {
        try {
            // InternalDataRetrieval.g:379:1: ( ruleAddSuffix EOF )
            // InternalDataRetrieval.g:380:1: ruleAddSuffix EOF
            {
             before(grammarAccess.getAddSuffixRule()); 
            pushFollow(FOLLOW_1);
            ruleAddSuffix();

            state._fsp--;

             after(grammarAccess.getAddSuffixRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddSuffix"


    // $ANTLR start "ruleAddSuffix"
    // InternalDataRetrieval.g:387:1: ruleAddSuffix : ( ( rule__AddSuffix__Group__0 ) ) ;
    public final void ruleAddSuffix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:391:2: ( ( ( rule__AddSuffix__Group__0 ) ) )
            // InternalDataRetrieval.g:392:2: ( ( rule__AddSuffix__Group__0 ) )
            {
            // InternalDataRetrieval.g:392:2: ( ( rule__AddSuffix__Group__0 ) )
            // InternalDataRetrieval.g:393:3: ( rule__AddSuffix__Group__0 )
            {
             before(grammarAccess.getAddSuffixAccess().getGroup()); 
            // InternalDataRetrieval.g:394:3: ( rule__AddSuffix__Group__0 )
            // InternalDataRetrieval.g:394:4: rule__AddSuffix__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddSuffix__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddSuffixAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddSuffix"


    // $ANTLR start "entryRuleFilter"
    // InternalDataRetrieval.g:403:1: entryRuleFilter : ruleFilter EOF ;
    public final void entryRuleFilter() throws RecognitionException {
        try {
            // InternalDataRetrieval.g:404:1: ( ruleFilter EOF )
            // InternalDataRetrieval.g:405:1: ruleFilter EOF
            {
             before(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getFilterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalDataRetrieval.g:412:1: ruleFilter : ( ( rule__Filter__Group__0 ) ) ;
    public final void ruleFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:416:2: ( ( ( rule__Filter__Group__0 ) ) )
            // InternalDataRetrieval.g:417:2: ( ( rule__Filter__Group__0 ) )
            {
            // InternalDataRetrieval.g:417:2: ( ( rule__Filter__Group__0 ) )
            // InternalDataRetrieval.g:418:3: ( rule__Filter__Group__0 )
            {
             before(grammarAccess.getFilterAccess().getGroup()); 
            // InternalDataRetrieval.g:419:3: ( rule__Filter__Group__0 )
            // InternalDataRetrieval.g:419:4: rule__Filter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Filter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleThreshold"
    // InternalDataRetrieval.g:428:1: entryRuleThreshold : ruleThreshold EOF ;
    public final void entryRuleThreshold() throws RecognitionException {
        try {
            // InternalDataRetrieval.g:429:1: ( ruleThreshold EOF )
            // InternalDataRetrieval.g:430:1: ruleThreshold EOF
            {
             before(grammarAccess.getThresholdRule()); 
            pushFollow(FOLLOW_1);
            ruleThreshold();

            state._fsp--;

             after(grammarAccess.getThresholdRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleThreshold"


    // $ANTLR start "ruleThreshold"
    // InternalDataRetrieval.g:437:1: ruleThreshold : ( ( rule__Threshold__Alternatives ) ) ;
    public final void ruleThreshold() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:441:2: ( ( ( rule__Threshold__Alternatives ) ) )
            // InternalDataRetrieval.g:442:2: ( ( rule__Threshold__Alternatives ) )
            {
            // InternalDataRetrieval.g:442:2: ( ( rule__Threshold__Alternatives ) )
            // InternalDataRetrieval.g:443:3: ( rule__Threshold__Alternatives )
            {
             before(grammarAccess.getThresholdAccess().getAlternatives()); 
            // InternalDataRetrieval.g:444:3: ( rule__Threshold__Alternatives )
            // InternalDataRetrieval.g:444:4: rule__Threshold__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Threshold__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getThresholdAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleThreshold"


    // $ANTLR start "entryRuleTopN"
    // InternalDataRetrieval.g:453:1: entryRuleTopN : ruleTopN EOF ;
    public final void entryRuleTopN() throws RecognitionException {
        try {
            // InternalDataRetrieval.g:454:1: ( ruleTopN EOF )
            // InternalDataRetrieval.g:455:1: ruleTopN EOF
            {
             before(grammarAccess.getTopNRule()); 
            pushFollow(FOLLOW_1);
            ruleTopN();

            state._fsp--;

             after(grammarAccess.getTopNRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTopN"


    // $ANTLR start "ruleTopN"
    // InternalDataRetrieval.g:462:1: ruleTopN : ( ( rule__TopN__Group__0 ) ) ;
    public final void ruleTopN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:466:2: ( ( ( rule__TopN__Group__0 ) ) )
            // InternalDataRetrieval.g:467:2: ( ( rule__TopN__Group__0 ) )
            {
            // InternalDataRetrieval.g:467:2: ( ( rule__TopN__Group__0 ) )
            // InternalDataRetrieval.g:468:3: ( rule__TopN__Group__0 )
            {
             before(grammarAccess.getTopNAccess().getGroup()); 
            // InternalDataRetrieval.g:469:3: ( rule__TopN__Group__0 )
            // InternalDataRetrieval.g:469:4: rule__TopN__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TopN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTopNAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTopN"


    // $ANTLR start "entryRuleBottomN"
    // InternalDataRetrieval.g:478:1: entryRuleBottomN : ruleBottomN EOF ;
    public final void entryRuleBottomN() throws RecognitionException {
        try {
            // InternalDataRetrieval.g:479:1: ( ruleBottomN EOF )
            // InternalDataRetrieval.g:480:1: ruleBottomN EOF
            {
             before(grammarAccess.getBottomNRule()); 
            pushFollow(FOLLOW_1);
            ruleBottomN();

            state._fsp--;

             after(grammarAccess.getBottomNRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBottomN"


    // $ANTLR start "ruleBottomN"
    // InternalDataRetrieval.g:487:1: ruleBottomN : ( ( rule__BottomN__Group__0 ) ) ;
    public final void ruleBottomN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:491:2: ( ( ( rule__BottomN__Group__0 ) ) )
            // InternalDataRetrieval.g:492:2: ( ( rule__BottomN__Group__0 ) )
            {
            // InternalDataRetrieval.g:492:2: ( ( rule__BottomN__Group__0 ) )
            // InternalDataRetrieval.g:493:3: ( rule__BottomN__Group__0 )
            {
             before(grammarAccess.getBottomNAccess().getGroup()); 
            // InternalDataRetrieval.g:494:3: ( rule__BottomN__Group__0 )
            // InternalDataRetrieval.g:494:4: rule__BottomN__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BottomN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBottomNAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBottomN"


    // $ANTLR start "entryRuleOpType"
    // InternalDataRetrieval.g:503:1: entryRuleOpType : ruleOpType EOF ;
    public final void entryRuleOpType() throws RecognitionException {
        try {
            // InternalDataRetrieval.g:504:1: ( ruleOpType EOF )
            // InternalDataRetrieval.g:505:1: ruleOpType EOF
            {
             before(grammarAccess.getOpTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleOpType();

            state._fsp--;

             after(grammarAccess.getOpTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOpType"


    // $ANTLR start "ruleOpType"
    // InternalDataRetrieval.g:512:1: ruleOpType : ( ( rule__OpType__Group__0 ) ) ;
    public final void ruleOpType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:516:2: ( ( ( rule__OpType__Group__0 ) ) )
            // InternalDataRetrieval.g:517:2: ( ( rule__OpType__Group__0 ) )
            {
            // InternalDataRetrieval.g:517:2: ( ( rule__OpType__Group__0 ) )
            // InternalDataRetrieval.g:518:3: ( rule__OpType__Group__0 )
            {
             before(grammarAccess.getOpTypeAccess().getGroup()); 
            // InternalDataRetrieval.g:519:3: ( rule__OpType__Group__0 )
            // InternalDataRetrieval.g:519:4: rule__OpType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OpType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOpTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOpType"


    // $ANTLR start "rule__Rename__Alternatives"
    // InternalDataRetrieval.g:527:1: rule__Rename__Alternatives : ( ( ruleFullRename ) | ( ruleAddPrefix ) | ( ruleAddSuffix ) );
    public final void rule__Rename__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:531:1: ( ( ruleFullRename ) | ( ruleAddPrefix ) | ( ruleAddSuffix ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt1=1;
                }
                break;
            case 25:
                {
                alt1=2;
                }
                break;
            case 26:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalDataRetrieval.g:532:2: ( ruleFullRename )
                    {
                    // InternalDataRetrieval.g:532:2: ( ruleFullRename )
                    // InternalDataRetrieval.g:533:3: ruleFullRename
                    {
                     before(grammarAccess.getRenameAccess().getFullRenameParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFullRename();

                    state._fsp--;

                     after(grammarAccess.getRenameAccess().getFullRenameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataRetrieval.g:538:2: ( ruleAddPrefix )
                    {
                    // InternalDataRetrieval.g:538:2: ( ruleAddPrefix )
                    // InternalDataRetrieval.g:539:3: ruleAddPrefix
                    {
                     before(grammarAccess.getRenameAccess().getAddPrefixParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAddPrefix();

                    state._fsp--;

                     after(grammarAccess.getRenameAccess().getAddPrefixParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataRetrieval.g:544:2: ( ruleAddSuffix )
                    {
                    // InternalDataRetrieval.g:544:2: ( ruleAddSuffix )
                    // InternalDataRetrieval.g:545:3: ruleAddSuffix
                    {
                     before(grammarAccess.getRenameAccess().getAddSuffixParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAddSuffix();

                    state._fsp--;

                     after(grammarAccess.getRenameAccess().getAddSuffixParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rename__Alternatives"


    // $ANTLR start "rule__RenameAll__Alternatives"
    // InternalDataRetrieval.g:554:1: rule__RenameAll__Alternatives : ( ( ruleAddPrefix ) | ( ruleAddSuffix ) );
    public final void rule__RenameAll__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:558:1: ( ( ruleAddPrefix ) | ( ruleAddSuffix ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==25) ) {
                alt2=1;
            }
            else if ( (LA2_0==26) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDataRetrieval.g:559:2: ( ruleAddPrefix )
                    {
                    // InternalDataRetrieval.g:559:2: ( ruleAddPrefix )
                    // InternalDataRetrieval.g:560:3: ruleAddPrefix
                    {
                     before(grammarAccess.getRenameAllAccess().getAddPrefixParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAddPrefix();

                    state._fsp--;

                     after(grammarAccess.getRenameAllAccess().getAddPrefixParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataRetrieval.g:565:2: ( ruleAddSuffix )
                    {
                    // InternalDataRetrieval.g:565:2: ( ruleAddSuffix )
                    // InternalDataRetrieval.g:566:3: ruleAddSuffix
                    {
                     before(grammarAccess.getRenameAllAccess().getAddSuffixParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAddSuffix();

                    state._fsp--;

                     after(grammarAccess.getRenameAllAccess().getAddSuffixParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameAll__Alternatives"


    // $ANTLR start "rule__Threshold__Alternatives"
    // InternalDataRetrieval.g:575:1: rule__Threshold__Alternatives : ( ( ruleTopN ) | ( ruleBottomN ) );
    public final void rule__Threshold__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:579:1: ( ( ruleTopN ) | ( ruleBottomN ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==28) ) {
                alt3=1;
            }
            else if ( (LA3_0==29) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDataRetrieval.g:580:2: ( ruleTopN )
                    {
                    // InternalDataRetrieval.g:580:2: ( ruleTopN )
                    // InternalDataRetrieval.g:581:3: ruleTopN
                    {
                     before(grammarAccess.getThresholdAccess().getTopNParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTopN();

                    state._fsp--;

                     after(grammarAccess.getThresholdAccess().getTopNParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataRetrieval.g:586:2: ( ruleBottomN )
                    {
                    // InternalDataRetrieval.g:586:2: ( ruleBottomN )
                    // InternalDataRetrieval.g:587:3: ruleBottomN
                    {
                     before(grammarAccess.getThresholdAccess().getBottomNParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBottomN();

                    state._fsp--;

                     after(grammarAccess.getThresholdAccess().getBottomNParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Threshold__Alternatives"


    // $ANTLR start "rule__OpType__Alternatives_0"
    // InternalDataRetrieval.g:596:1: rule__OpType__Alternatives_0 : ( ( ( rule__OpType__AverageAssignment_0_0 ) ) | ( ( rule__OpType__SumAssignment_0_1 ) ) );
    public final void rule__OpType__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:600:1: ( ( ( rule__OpType__AverageAssignment_0_0 ) ) | ( ( rule__OpType__SumAssignment_0_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==32) ) {
                alt4=1;
            }
            else if ( (LA4_0==33) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDataRetrieval.g:601:2: ( ( rule__OpType__AverageAssignment_0_0 ) )
                    {
                    // InternalDataRetrieval.g:601:2: ( ( rule__OpType__AverageAssignment_0_0 ) )
                    // InternalDataRetrieval.g:602:3: ( rule__OpType__AverageAssignment_0_0 )
                    {
                     before(grammarAccess.getOpTypeAccess().getAverageAssignment_0_0()); 
                    // InternalDataRetrieval.g:603:3: ( rule__OpType__AverageAssignment_0_0 )
                    // InternalDataRetrieval.g:603:4: rule__OpType__AverageAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpType__AverageAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOpTypeAccess().getAverageAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataRetrieval.g:607:2: ( ( rule__OpType__SumAssignment_0_1 ) )
                    {
                    // InternalDataRetrieval.g:607:2: ( ( rule__OpType__SumAssignment_0_1 ) )
                    // InternalDataRetrieval.g:608:3: ( rule__OpType__SumAssignment_0_1 )
                    {
                     before(grammarAccess.getOpTypeAccess().getSumAssignment_0_1()); 
                    // InternalDataRetrieval.g:609:3: ( rule__OpType__SumAssignment_0_1 )
                    // InternalDataRetrieval.g:609:4: rule__OpType__SumAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpType__SumAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getOpTypeAccess().getSumAssignment_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpType__Alternatives_0"


    // $ANTLR start "rule__OpType__Alternatives_1"
    // InternalDataRetrieval.g:617:1: rule__OpType__Alternatives_1 : ( ( ( rule__OpType__AllAssignment_1_0 ) ) | ( ( rule__OpType__Group_1_1__0 ) ) );
    public final void rule__OpType__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:621:1: ( ( ( rule__OpType__AllAssignment_1_0 ) ) | ( ( rule__OpType__Group_1_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==34) ) {
                alt5=1;
            }
            else if ( (LA5_0==30) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDataRetrieval.g:622:2: ( ( rule__OpType__AllAssignment_1_0 ) )
                    {
                    // InternalDataRetrieval.g:622:2: ( ( rule__OpType__AllAssignment_1_0 ) )
                    // InternalDataRetrieval.g:623:3: ( rule__OpType__AllAssignment_1_0 )
                    {
                     before(grammarAccess.getOpTypeAccess().getAllAssignment_1_0()); 
                    // InternalDataRetrieval.g:624:3: ( rule__OpType__AllAssignment_1_0 )
                    // InternalDataRetrieval.g:624:4: rule__OpType__AllAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpType__AllAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOpTypeAccess().getAllAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataRetrieval.g:628:2: ( ( rule__OpType__Group_1_1__0 ) )
                    {
                    // InternalDataRetrieval.g:628:2: ( ( rule__OpType__Group_1_1__0 ) )
                    // InternalDataRetrieval.g:629:3: ( rule__OpType__Group_1_1__0 )
                    {
                     before(grammarAccess.getOpTypeAccess().getGroup_1_1()); 
                    // InternalDataRetrieval.g:630:3: ( rule__OpType__Group_1_1__0 )
                    // InternalDataRetrieval.g:630:4: rule__OpType__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpType__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOpTypeAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpType__Alternatives_1"


    // $ANTLR start "rule__Retrieve__Group__0"
    // InternalDataRetrieval.g:638:1: rule__Retrieve__Group__0 : rule__Retrieve__Group__0__Impl rule__Retrieve__Group__1 ;
    public final void rule__Retrieve__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:642:1: ( rule__Retrieve__Group__0__Impl rule__Retrieve__Group__1 )
            // InternalDataRetrieval.g:643:2: rule__Retrieve__Group__0__Impl rule__Retrieve__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Retrieve__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Retrieve__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retrieve__Group__0"


    // $ANTLR start "rule__Retrieve__Group__0__Impl"
    // InternalDataRetrieval.g:650:1: rule__Retrieve__Group__0__Impl : ( 'retrieve' ) ;
    public final void rule__Retrieve__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:654:1: ( ( 'retrieve' ) )
            // InternalDataRetrieval.g:655:1: ( 'retrieve' )
            {
            // InternalDataRetrieval.g:655:1: ( 'retrieve' )
            // InternalDataRetrieval.g:656:2: 'retrieve'
            {
             before(grammarAccess.getRetrieveAccess().getRetrieveKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getRetrieveAccess().getRetrieveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retrieve__Group__0__Impl"


    // $ANTLR start "rule__Retrieve__Group__1"
    // InternalDataRetrieval.g:665:1: rule__Retrieve__Group__1 : rule__Retrieve__Group__1__Impl rule__Retrieve__Group__2 ;
    public final void rule__Retrieve__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:669:1: ( rule__Retrieve__Group__1__Impl rule__Retrieve__Group__2 )
            // InternalDataRetrieval.g:670:2: rule__Retrieve__Group__1__Impl rule__Retrieve__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Retrieve__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Retrieve__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retrieve__Group__1"


    // $ANTLR start "rule__Retrieve__Group__1__Impl"
    // InternalDataRetrieval.g:677:1: rule__Retrieve__Group__1__Impl : ( ( rule__Retrieve__DestAssignment_1 ) ) ;
    public final void rule__Retrieve__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:681:1: ( ( ( rule__Retrieve__DestAssignment_1 ) ) )
            // InternalDataRetrieval.g:682:1: ( ( rule__Retrieve__DestAssignment_1 ) )
            {
            // InternalDataRetrieval.g:682:1: ( ( rule__Retrieve__DestAssignment_1 ) )
            // InternalDataRetrieval.g:683:2: ( rule__Retrieve__DestAssignment_1 )
            {
             before(grammarAccess.getRetrieveAccess().getDestAssignment_1()); 
            // InternalDataRetrieval.g:684:2: ( rule__Retrieve__DestAssignment_1 )
            // InternalDataRetrieval.g:684:3: rule__Retrieve__DestAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Retrieve__DestAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRetrieveAccess().getDestAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retrieve__Group__1__Impl"


    // $ANTLR start "rule__Retrieve__Group__2"
    // InternalDataRetrieval.g:692:1: rule__Retrieve__Group__2 : rule__Retrieve__Group__2__Impl rule__Retrieve__Group__3 ;
    public final void rule__Retrieve__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:696:1: ( rule__Retrieve__Group__2__Impl rule__Retrieve__Group__3 )
            // InternalDataRetrieval.g:697:2: rule__Retrieve__Group__2__Impl rule__Retrieve__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Retrieve__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Retrieve__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retrieve__Group__2"


    // $ANTLR start "rule__Retrieve__Group__2__Impl"
    // InternalDataRetrieval.g:704:1: rule__Retrieve__Group__2__Impl : ( ( rule__Retrieve__SourceFolderAssignment_2 )? ) ;
    public final void rule__Retrieve__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:708:1: ( ( ( rule__Retrieve__SourceFolderAssignment_2 )? ) )
            // InternalDataRetrieval.g:709:1: ( ( rule__Retrieve__SourceFolderAssignment_2 )? )
            {
            // InternalDataRetrieval.g:709:1: ( ( rule__Retrieve__SourceFolderAssignment_2 )? )
            // InternalDataRetrieval.g:710:2: ( rule__Retrieve__SourceFolderAssignment_2 )?
            {
             before(grammarAccess.getRetrieveAccess().getSourceFolderAssignment_2()); 
            // InternalDataRetrieval.g:711:2: ( rule__Retrieve__SourceFolderAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDataRetrieval.g:711:3: rule__Retrieve__SourceFolderAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Retrieve__SourceFolderAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRetrieveAccess().getSourceFolderAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retrieve__Group__2__Impl"


    // $ANTLR start "rule__Retrieve__Group__3"
    // InternalDataRetrieval.g:719:1: rule__Retrieve__Group__3 : rule__Retrieve__Group__3__Impl rule__Retrieve__Group__4 ;
    public final void rule__Retrieve__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:723:1: ( rule__Retrieve__Group__3__Impl rule__Retrieve__Group__4 )
            // InternalDataRetrieval.g:724:2: rule__Retrieve__Group__3__Impl rule__Retrieve__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Retrieve__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Retrieve__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retrieve__Group__3"


    // $ANTLR start "rule__Retrieve__Group__3__Impl"
    // InternalDataRetrieval.g:731:1: rule__Retrieve__Group__3__Impl : ( '{' ) ;
    public final void rule__Retrieve__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:735:1: ( ( '{' ) )
            // InternalDataRetrieval.g:736:1: ( '{' )
            {
            // InternalDataRetrieval.g:736:1: ( '{' )
            // InternalDataRetrieval.g:737:2: '{'
            {
             before(grammarAccess.getRetrieveAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRetrieveAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retrieve__Group__3__Impl"


    // $ANTLR start "rule__Retrieve__Group__4"
    // InternalDataRetrieval.g:746:1: rule__Retrieve__Group__4 : rule__Retrieve__Group__4__Impl rule__Retrieve__Group__5 ;
    public final void rule__Retrieve__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:750:1: ( rule__Retrieve__Group__4__Impl rule__Retrieve__Group__5 )
            // InternalDataRetrieval.g:751:2: rule__Retrieve__Group__4__Impl rule__Retrieve__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Retrieve__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Retrieve__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retrieve__Group__4"


    // $ANTLR start "rule__Retrieve__Group__4__Impl"
    // InternalDataRetrieval.g:758:1: rule__Retrieve__Group__4__Impl : ( ( ( rule__Retrieve__ConfigListAssignment_4 ) ) ( ( rule__Retrieve__ConfigListAssignment_4 )* ) ) ;
    public final void rule__Retrieve__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:762:1: ( ( ( ( rule__Retrieve__ConfigListAssignment_4 ) ) ( ( rule__Retrieve__ConfigListAssignment_4 )* ) ) )
            // InternalDataRetrieval.g:763:1: ( ( ( rule__Retrieve__ConfigListAssignment_4 ) ) ( ( rule__Retrieve__ConfigListAssignment_4 )* ) )
            {
            // InternalDataRetrieval.g:763:1: ( ( ( rule__Retrieve__ConfigListAssignment_4 ) ) ( ( rule__Retrieve__ConfigListAssignment_4 )* ) )
            // InternalDataRetrieval.g:764:2: ( ( rule__Retrieve__ConfigListAssignment_4 ) ) ( ( rule__Retrieve__ConfigListAssignment_4 )* )
            {
            // InternalDataRetrieval.g:764:2: ( ( rule__Retrieve__ConfigListAssignment_4 ) )
            // InternalDataRetrieval.g:765:3: ( rule__Retrieve__ConfigListAssignment_4 )
            {
             before(grammarAccess.getRetrieveAccess().getConfigListAssignment_4()); 
            // InternalDataRetrieval.g:766:3: ( rule__Retrieve__ConfigListAssignment_4 )
            // InternalDataRetrieval.g:766:4: rule__Retrieve__ConfigListAssignment_4
            {
            pushFollow(FOLLOW_7);
            rule__Retrieve__ConfigListAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRetrieveAccess().getConfigListAssignment_4()); 

            }

            // InternalDataRetrieval.g:769:2: ( ( rule__Retrieve__ConfigListAssignment_4 )* )
            // InternalDataRetrieval.g:770:3: ( rule__Retrieve__ConfigListAssignment_4 )*
            {
             before(grammarAccess.getRetrieveAccess().getConfigListAssignment_4()); 
            // InternalDataRetrieval.g:771:3: ( rule__Retrieve__ConfigListAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDataRetrieval.g:771:4: rule__Retrieve__ConfigListAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Retrieve__ConfigListAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getRetrieveAccess().getConfigListAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retrieve__Group__4__Impl"


    // $ANTLR start "rule__Retrieve__Group__5"
    // InternalDataRetrieval.g:780:1: rule__Retrieve__Group__5 : rule__Retrieve__Group__5__Impl rule__Retrieve__Group__6 ;
    public final void rule__Retrieve__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:784:1: ( rule__Retrieve__Group__5__Impl rule__Retrieve__Group__6 )
            // InternalDataRetrieval.g:785:2: rule__Retrieve__Group__5__Impl rule__Retrieve__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Retrieve__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Retrieve__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retrieve__Group__5"


    // $ANTLR start "rule__Retrieve__Group__5__Impl"
    // InternalDataRetrieval.g:792:1: rule__Retrieve__Group__5__Impl : ( ( rule__Retrieve__OpListAssignment_5 )* ) ;
    public final void rule__Retrieve__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:796:1: ( ( ( rule__Retrieve__OpListAssignment_5 )* ) )
            // InternalDataRetrieval.g:797:1: ( ( rule__Retrieve__OpListAssignment_5 )* )
            {
            // InternalDataRetrieval.g:797:1: ( ( rule__Retrieve__OpListAssignment_5 )* )
            // InternalDataRetrieval.g:798:2: ( rule__Retrieve__OpListAssignment_5 )*
            {
             before(grammarAccess.getRetrieveAccess().getOpListAssignment_5()); 
            // InternalDataRetrieval.g:799:2: ( rule__Retrieve__OpListAssignment_5 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDataRetrieval.g:799:3: rule__Retrieve__OpListAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Retrieve__OpListAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getRetrieveAccess().getOpListAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retrieve__Group__5__Impl"


    // $ANTLR start "rule__Retrieve__Group__6"
    // InternalDataRetrieval.g:807:1: rule__Retrieve__Group__6 : rule__Retrieve__Group__6__Impl ;
    public final void rule__Retrieve__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:811:1: ( rule__Retrieve__Group__6__Impl )
            // InternalDataRetrieval.g:812:2: rule__Retrieve__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Retrieve__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retrieve__Group__6"


    // $ANTLR start "rule__Retrieve__Group__6__Impl"
    // InternalDataRetrieval.g:818:1: rule__Retrieve__Group__6__Impl : ( '}' ) ;
    public final void rule__Retrieve__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:822:1: ( ( '}' ) )
            // InternalDataRetrieval.g:823:1: ( '}' )
            {
            // InternalDataRetrieval.g:823:1: ( '}' )
            // InternalDataRetrieval.g:824:2: '}'
            {
             before(grammarAccess.getRetrieveAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRetrieveAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retrieve__Group__6__Impl"


    // $ANTLR start "rule__Dest__Group__0"
    // InternalDataRetrieval.g:834:1: rule__Dest__Group__0 : rule__Dest__Group__0__Impl rule__Dest__Group__1 ;
    public final void rule__Dest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:838:1: ( rule__Dest__Group__0__Impl rule__Dest__Group__1 )
            // InternalDataRetrieval.g:839:2: rule__Dest__Group__0__Impl rule__Dest__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Dest__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dest__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dest__Group__0"


    // $ANTLR start "rule__Dest__Group__0__Impl"
    // InternalDataRetrieval.g:846:1: rule__Dest__Group__0__Impl : ( 'destination=' ) ;
    public final void rule__Dest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:850:1: ( ( 'destination=' ) )
            // InternalDataRetrieval.g:851:1: ( 'destination=' )
            {
            // InternalDataRetrieval.g:851:1: ( 'destination=' )
            // InternalDataRetrieval.g:852:2: 'destination='
            {
             before(grammarAccess.getDestAccess().getDestinationKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDestAccess().getDestinationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dest__Group__0__Impl"


    // $ANTLR start "rule__Dest__Group__1"
    // InternalDataRetrieval.g:861:1: rule__Dest__Group__1 : rule__Dest__Group__1__Impl ;
    public final void rule__Dest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:865:1: ( rule__Dest__Group__1__Impl )
            // InternalDataRetrieval.g:866:2: rule__Dest__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dest__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dest__Group__1"


    // $ANTLR start "rule__Dest__Group__1__Impl"
    // InternalDataRetrieval.g:872:1: rule__Dest__Group__1__Impl : ( ( rule__Dest__NameAssignment_1 ) ) ;
    public final void rule__Dest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:876:1: ( ( ( rule__Dest__NameAssignment_1 ) ) )
            // InternalDataRetrieval.g:877:1: ( ( rule__Dest__NameAssignment_1 ) )
            {
            // InternalDataRetrieval.g:877:1: ( ( rule__Dest__NameAssignment_1 ) )
            // InternalDataRetrieval.g:878:2: ( rule__Dest__NameAssignment_1 )
            {
             before(grammarAccess.getDestAccess().getNameAssignment_1()); 
            // InternalDataRetrieval.g:879:2: ( rule__Dest__NameAssignment_1 )
            // InternalDataRetrieval.g:879:3: rule__Dest__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Dest__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDestAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dest__Group__1__Impl"


    // $ANTLR start "rule__SourceFolder__Group__0"
    // InternalDataRetrieval.g:888:1: rule__SourceFolder__Group__0 : rule__SourceFolder__Group__0__Impl rule__SourceFolder__Group__1 ;
    public final void rule__SourceFolder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:892:1: ( rule__SourceFolder__Group__0__Impl rule__SourceFolder__Group__1 )
            // InternalDataRetrieval.g:893:2: rule__SourceFolder__Group__0__Impl rule__SourceFolder__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__SourceFolder__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceFolder__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceFolder__Group__0"


    // $ANTLR start "rule__SourceFolder__Group__0__Impl"
    // InternalDataRetrieval.g:900:1: rule__SourceFolder__Group__0__Impl : ( 'folder=' ) ;
    public final void rule__SourceFolder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:904:1: ( ( 'folder=' ) )
            // InternalDataRetrieval.g:905:1: ( 'folder=' )
            {
            // InternalDataRetrieval.g:905:1: ( 'folder=' )
            // InternalDataRetrieval.g:906:2: 'folder='
            {
             before(grammarAccess.getSourceFolderAccess().getFolderKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSourceFolderAccess().getFolderKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceFolder__Group__0__Impl"


    // $ANTLR start "rule__SourceFolder__Group__1"
    // InternalDataRetrieval.g:915:1: rule__SourceFolder__Group__1 : rule__SourceFolder__Group__1__Impl ;
    public final void rule__SourceFolder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:919:1: ( rule__SourceFolder__Group__1__Impl )
            // InternalDataRetrieval.g:920:2: rule__SourceFolder__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SourceFolder__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceFolder__Group__1"


    // $ANTLR start "rule__SourceFolder__Group__1__Impl"
    // InternalDataRetrieval.g:926:1: rule__SourceFolder__Group__1__Impl : ( ( rule__SourceFolder__NameAssignment_1 ) ) ;
    public final void rule__SourceFolder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:930:1: ( ( ( rule__SourceFolder__NameAssignment_1 ) ) )
            // InternalDataRetrieval.g:931:1: ( ( rule__SourceFolder__NameAssignment_1 ) )
            {
            // InternalDataRetrieval.g:931:1: ( ( rule__SourceFolder__NameAssignment_1 ) )
            // InternalDataRetrieval.g:932:2: ( rule__SourceFolder__NameAssignment_1 )
            {
             before(grammarAccess.getSourceFolderAccess().getNameAssignment_1()); 
            // InternalDataRetrieval.g:933:2: ( rule__SourceFolder__NameAssignment_1 )
            // InternalDataRetrieval.g:933:3: rule__SourceFolder__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SourceFolder__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSourceFolderAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceFolder__Group__1__Impl"


    // $ANTLR start "rule__ConfigList__Group__0"
    // InternalDataRetrieval.g:942:1: rule__ConfigList__Group__0 : rule__ConfigList__Group__0__Impl rule__ConfigList__Group__1 ;
    public final void rule__ConfigList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:946:1: ( rule__ConfigList__Group__0__Impl rule__ConfigList__Group__1 )
            // InternalDataRetrieval.g:947:2: rule__ConfigList__Group__0__Impl rule__ConfigList__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ConfigList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigList__Group__0"


    // $ANTLR start "rule__ConfigList__Group__0__Impl"
    // InternalDataRetrieval.g:954:1: rule__ConfigList__Group__0__Impl : ( 'extraction' ) ;
    public final void rule__ConfigList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:958:1: ( ( 'extraction' ) )
            // InternalDataRetrieval.g:959:1: ( 'extraction' )
            {
            // InternalDataRetrieval.g:959:1: ( 'extraction' )
            // InternalDataRetrieval.g:960:2: 'extraction'
            {
             before(grammarAccess.getConfigListAccess().getExtractionKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getConfigListAccess().getExtractionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigList__Group__0__Impl"


    // $ANTLR start "rule__ConfigList__Group__1"
    // InternalDataRetrieval.g:969:1: rule__ConfigList__Group__1 : rule__ConfigList__Group__1__Impl rule__ConfigList__Group__2 ;
    public final void rule__ConfigList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:973:1: ( rule__ConfigList__Group__1__Impl rule__ConfigList__Group__2 )
            // InternalDataRetrieval.g:974:2: rule__ConfigList__Group__1__Impl rule__ConfigList__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ConfigList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigList__Group__1"


    // $ANTLR start "rule__ConfigList__Group__1__Impl"
    // InternalDataRetrieval.g:981:1: rule__ConfigList__Group__1__Impl : ( '{' ) ;
    public final void rule__ConfigList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:985:1: ( ( '{' ) )
            // InternalDataRetrieval.g:986:1: ( '{' )
            {
            // InternalDataRetrieval.g:986:1: ( '{' )
            // InternalDataRetrieval.g:987:2: '{'
            {
             before(grammarAccess.getConfigListAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getConfigListAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigList__Group__1__Impl"


    // $ANTLR start "rule__ConfigList__Group__2"
    // InternalDataRetrieval.g:996:1: rule__ConfigList__Group__2 : rule__ConfigList__Group__2__Impl rule__ConfigList__Group__3 ;
    public final void rule__ConfigList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1000:1: ( rule__ConfigList__Group__2__Impl rule__ConfigList__Group__3 )
            // InternalDataRetrieval.g:1001:2: rule__ConfigList__Group__2__Impl rule__ConfigList__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__ConfigList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigList__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigList__Group__2"


    // $ANTLR start "rule__ConfigList__Group__2__Impl"
    // InternalDataRetrieval.g:1008:1: rule__ConfigList__Group__2__Impl : ( ( rule__ConfigList__SourceAssignment_2 ) ) ;
    public final void rule__ConfigList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1012:1: ( ( ( rule__ConfigList__SourceAssignment_2 ) ) )
            // InternalDataRetrieval.g:1013:1: ( ( rule__ConfigList__SourceAssignment_2 ) )
            {
            // InternalDataRetrieval.g:1013:1: ( ( rule__ConfigList__SourceAssignment_2 ) )
            // InternalDataRetrieval.g:1014:2: ( rule__ConfigList__SourceAssignment_2 )
            {
             before(grammarAccess.getConfigListAccess().getSourceAssignment_2()); 
            // InternalDataRetrieval.g:1015:2: ( rule__ConfigList__SourceAssignment_2 )
            // InternalDataRetrieval.g:1015:3: rule__ConfigList__SourceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ConfigList__SourceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConfigListAccess().getSourceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigList__Group__2__Impl"


    // $ANTLR start "rule__ConfigList__Group__3"
    // InternalDataRetrieval.g:1023:1: rule__ConfigList__Group__3 : rule__ConfigList__Group__3__Impl rule__ConfigList__Group__4 ;
    public final void rule__ConfigList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1027:1: ( rule__ConfigList__Group__3__Impl rule__ConfigList__Group__4 )
            // InternalDataRetrieval.g:1028:2: rule__ConfigList__Group__3__Impl rule__ConfigList__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__ConfigList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigList__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigList__Group__3"


    // $ANTLR start "rule__ConfigList__Group__3__Impl"
    // InternalDataRetrieval.g:1035:1: rule__ConfigList__Group__3__Impl : ( ( rule__ConfigList__PathAssignment_3 )? ) ;
    public final void rule__ConfigList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1039:1: ( ( ( rule__ConfigList__PathAssignment_3 )? ) )
            // InternalDataRetrieval.g:1040:1: ( ( rule__ConfigList__PathAssignment_3 )? )
            {
            // InternalDataRetrieval.g:1040:1: ( ( rule__ConfigList__PathAssignment_3 )? )
            // InternalDataRetrieval.g:1041:2: ( rule__ConfigList__PathAssignment_3 )?
            {
             before(grammarAccess.getConfigListAccess().getPathAssignment_3()); 
            // InternalDataRetrieval.g:1042:2: ( rule__ConfigList__PathAssignment_3 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDataRetrieval.g:1042:3: rule__ConfigList__PathAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConfigList__PathAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfigListAccess().getPathAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigList__Group__3__Impl"


    // $ANTLR start "rule__ConfigList__Group__4"
    // InternalDataRetrieval.g:1050:1: rule__ConfigList__Group__4 : rule__ConfigList__Group__4__Impl rule__ConfigList__Group__5 ;
    public final void rule__ConfigList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1054:1: ( rule__ConfigList__Group__4__Impl rule__ConfigList__Group__5 )
            // InternalDataRetrieval.g:1055:2: rule__ConfigList__Group__4__Impl rule__ConfigList__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__ConfigList__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigList__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigList__Group__4"


    // $ANTLR start "rule__ConfigList__Group__4__Impl"
    // InternalDataRetrieval.g:1062:1: rule__ConfigList__Group__4__Impl : ( ( rule__ConfigList__KeysToExtractAssignment_4 )? ) ;
    public final void rule__ConfigList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1066:1: ( ( ( rule__ConfigList__KeysToExtractAssignment_4 )? ) )
            // InternalDataRetrieval.g:1067:1: ( ( rule__ConfigList__KeysToExtractAssignment_4 )? )
            {
            // InternalDataRetrieval.g:1067:1: ( ( rule__ConfigList__KeysToExtractAssignment_4 )? )
            // InternalDataRetrieval.g:1068:2: ( rule__ConfigList__KeysToExtractAssignment_4 )?
            {
             before(grammarAccess.getConfigListAccess().getKeysToExtractAssignment_4()); 
            // InternalDataRetrieval.g:1069:2: ( rule__ConfigList__KeysToExtractAssignment_4 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDataRetrieval.g:1069:3: rule__ConfigList__KeysToExtractAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConfigList__KeysToExtractAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfigListAccess().getKeysToExtractAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigList__Group__4__Impl"


    // $ANTLR start "rule__ConfigList__Group__5"
    // InternalDataRetrieval.g:1077:1: rule__ConfigList__Group__5 : rule__ConfigList__Group__5__Impl rule__ConfigList__Group__6 ;
    public final void rule__ConfigList__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1081:1: ( rule__ConfigList__Group__5__Impl rule__ConfigList__Group__6 )
            // InternalDataRetrieval.g:1082:2: rule__ConfigList__Group__5__Impl rule__ConfigList__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__ConfigList__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigList__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigList__Group__5"


    // $ANTLR start "rule__ConfigList__Group__5__Impl"
    // InternalDataRetrieval.g:1089:1: rule__ConfigList__Group__5__Impl : ( ( rule__ConfigList__RenameAllAssignment_5 )? ) ;
    public final void rule__ConfigList__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1093:1: ( ( ( rule__ConfigList__RenameAllAssignment_5 )? ) )
            // InternalDataRetrieval.g:1094:1: ( ( rule__ConfigList__RenameAllAssignment_5 )? )
            {
            // InternalDataRetrieval.g:1094:1: ( ( rule__ConfigList__RenameAllAssignment_5 )? )
            // InternalDataRetrieval.g:1095:2: ( rule__ConfigList__RenameAllAssignment_5 )?
            {
             before(grammarAccess.getConfigListAccess().getRenameAllAssignment_5()); 
            // InternalDataRetrieval.g:1096:2: ( rule__ConfigList__RenameAllAssignment_5 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=25 && LA11_0<=26)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDataRetrieval.g:1096:3: rule__ConfigList__RenameAllAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConfigList__RenameAllAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfigListAccess().getRenameAllAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigList__Group__5__Impl"


    // $ANTLR start "rule__ConfigList__Group__6"
    // InternalDataRetrieval.g:1104:1: rule__ConfigList__Group__6 : rule__ConfigList__Group__6__Impl rule__ConfigList__Group__7 ;
    public final void rule__ConfigList__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1108:1: ( rule__ConfigList__Group__6__Impl rule__ConfigList__Group__7 )
            // InternalDataRetrieval.g:1109:2: rule__ConfigList__Group__6__Impl rule__ConfigList__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__ConfigList__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigList__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigList__Group__6"


    // $ANTLR start "rule__ConfigList__Group__6__Impl"
    // InternalDataRetrieval.g:1116:1: rule__ConfigList__Group__6__Impl : ( ( rule__ConfigList__Group_6__0 )? ) ;
    public final void rule__ConfigList__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1120:1: ( ( ( rule__ConfigList__Group_6__0 )? ) )
            // InternalDataRetrieval.g:1121:1: ( ( rule__ConfigList__Group_6__0 )? )
            {
            // InternalDataRetrieval.g:1121:1: ( ( rule__ConfigList__Group_6__0 )? )
            // InternalDataRetrieval.g:1122:2: ( rule__ConfigList__Group_6__0 )?
            {
             before(grammarAccess.getConfigListAccess().getGroup_6()); 
            // InternalDataRetrieval.g:1123:2: ( rule__ConfigList__Group_6__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDataRetrieval.g:1123:3: rule__ConfigList__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConfigList__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfigListAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigList__Group__6__Impl"


    // $ANTLR start "rule__ConfigList__Group__7"
    // InternalDataRetrieval.g:1131:1: rule__ConfigList__Group__7 : rule__ConfigList__Group__7__Impl ;
    public final void rule__ConfigList__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1135:1: ( rule__ConfigList__Group__7__Impl )
            // InternalDataRetrieval.g:1136:2: rule__ConfigList__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigList__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigList__Group__7"


    // $ANTLR start "rule__ConfigList__Group__7__Impl"
    // InternalDataRetrieval.g:1142:1: rule__ConfigList__Group__7__Impl : ( '}' ) ;
    public final void rule__ConfigList__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1146:1: ( ( '}' ) )
            // InternalDataRetrieval.g:1147:1: ( '}' )
            {
            // InternalDataRetrieval.g:1147:1: ( '}' )
            // InternalDataRetrieval.g:1148:2: '}'
            {
             before(grammarAccess.getConfigListAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getConfigListAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigList__Group__7__Impl"


    // $ANTLR start "rule__ConfigList__Group_6__0"
    // InternalDataRetrieval.g:1158:1: rule__ConfigList__Group_6__0 : rule__ConfigList__Group_6__0__Impl rule__ConfigList__Group_6__1 ;
    public final void rule__ConfigList__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1162:1: ( rule__ConfigList__Group_6__0__Impl rule__ConfigList__Group_6__1 )
            // InternalDataRetrieval.g:1163:2: rule__ConfigList__Group_6__0__Impl rule__ConfigList__Group_6__1
            {
            pushFollow(FOLLOW_13);
            rule__ConfigList__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigList__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigList__Group_6__0"


    // $ANTLR start "rule__ConfigList__Group_6__0__Impl"
    // InternalDataRetrieval.g:1170:1: rule__ConfigList__Group_6__0__Impl : ( ( rule__ConfigList__FilterAssignment_6_0 ) ) ;
    public final void rule__ConfigList__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1174:1: ( ( ( rule__ConfigList__FilterAssignment_6_0 ) ) )
            // InternalDataRetrieval.g:1175:1: ( ( rule__ConfigList__FilterAssignment_6_0 ) )
            {
            // InternalDataRetrieval.g:1175:1: ( ( rule__ConfigList__FilterAssignment_6_0 ) )
            // InternalDataRetrieval.g:1176:2: ( rule__ConfigList__FilterAssignment_6_0 )
            {
             before(grammarAccess.getConfigListAccess().getFilterAssignment_6_0()); 
            // InternalDataRetrieval.g:1177:2: ( rule__ConfigList__FilterAssignment_6_0 )
            // InternalDataRetrieval.g:1177:3: rule__ConfigList__FilterAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__ConfigList__FilterAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getConfigListAccess().getFilterAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigList__Group_6__0__Impl"


    // $ANTLR start "rule__ConfigList__Group_6__1"
    // InternalDataRetrieval.g:1185:1: rule__ConfigList__Group_6__1 : rule__ConfigList__Group_6__1__Impl ;
    public final void rule__ConfigList__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1189:1: ( rule__ConfigList__Group_6__1__Impl )
            // InternalDataRetrieval.g:1190:2: rule__ConfigList__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigList__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigList__Group_6__1"


    // $ANTLR start "rule__ConfigList__Group_6__1__Impl"
    // InternalDataRetrieval.g:1196:1: rule__ConfigList__Group_6__1__Impl : ( ( rule__ConfigList__ThresholdAssignment_6_1 ) ) ;
    public final void rule__ConfigList__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1200:1: ( ( ( rule__ConfigList__ThresholdAssignment_6_1 ) ) )
            // InternalDataRetrieval.g:1201:1: ( ( rule__ConfigList__ThresholdAssignment_6_1 ) )
            {
            // InternalDataRetrieval.g:1201:1: ( ( rule__ConfigList__ThresholdAssignment_6_1 ) )
            // InternalDataRetrieval.g:1202:2: ( rule__ConfigList__ThresholdAssignment_6_1 )
            {
             before(grammarAccess.getConfigListAccess().getThresholdAssignment_6_1()); 
            // InternalDataRetrieval.g:1203:2: ( rule__ConfigList__ThresholdAssignment_6_1 )
            // InternalDataRetrieval.g:1203:3: rule__ConfigList__ThresholdAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__ConfigList__ThresholdAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigListAccess().getThresholdAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigList__Group_6__1__Impl"


    // $ANTLR start "rule__OpList__Group__0"
    // InternalDataRetrieval.g:1212:1: rule__OpList__Group__0 : rule__OpList__Group__0__Impl rule__OpList__Group__1 ;
    public final void rule__OpList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1216:1: ( rule__OpList__Group__0__Impl rule__OpList__Group__1 )
            // InternalDataRetrieval.g:1217:2: rule__OpList__Group__0__Impl rule__OpList__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__OpList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpList__Group__0"


    // $ANTLR start "rule__OpList__Group__0__Impl"
    // InternalDataRetrieval.g:1224:1: rule__OpList__Group__0__Impl : ( 'operation' ) ;
    public final void rule__OpList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1228:1: ( ( 'operation' ) )
            // InternalDataRetrieval.g:1229:1: ( 'operation' )
            {
            // InternalDataRetrieval.g:1229:1: ( 'operation' )
            // InternalDataRetrieval.g:1230:2: 'operation'
            {
             before(grammarAccess.getOpListAccess().getOperationKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getOpListAccess().getOperationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpList__Group__0__Impl"


    // $ANTLR start "rule__OpList__Group__1"
    // InternalDataRetrieval.g:1239:1: rule__OpList__Group__1 : rule__OpList__Group__1__Impl rule__OpList__Group__2 ;
    public final void rule__OpList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1243:1: ( rule__OpList__Group__1__Impl rule__OpList__Group__2 )
            // InternalDataRetrieval.g:1244:2: rule__OpList__Group__1__Impl rule__OpList__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__OpList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpList__Group__1"


    // $ANTLR start "rule__OpList__Group__1__Impl"
    // InternalDataRetrieval.g:1251:1: rule__OpList__Group__1__Impl : ( '{' ) ;
    public final void rule__OpList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1255:1: ( ( '{' ) )
            // InternalDataRetrieval.g:1256:1: ( '{' )
            {
            // InternalDataRetrieval.g:1256:1: ( '{' )
            // InternalDataRetrieval.g:1257:2: '{'
            {
             before(grammarAccess.getOpListAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getOpListAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpList__Group__1__Impl"


    // $ANTLR start "rule__OpList__Group__2"
    // InternalDataRetrieval.g:1266:1: rule__OpList__Group__2 : rule__OpList__Group__2__Impl rule__OpList__Group__3 ;
    public final void rule__OpList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1270:1: ( rule__OpList__Group__2__Impl rule__OpList__Group__3 )
            // InternalDataRetrieval.g:1271:2: rule__OpList__Group__2__Impl rule__OpList__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__OpList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpList__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpList__Group__2"


    // $ANTLR start "rule__OpList__Group__2__Impl"
    // InternalDataRetrieval.g:1278:1: rule__OpList__Group__2__Impl : ( ( rule__OpList__OpTypeAssignment_2 ) ) ;
    public final void rule__OpList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1282:1: ( ( ( rule__OpList__OpTypeAssignment_2 ) ) )
            // InternalDataRetrieval.g:1283:1: ( ( rule__OpList__OpTypeAssignment_2 ) )
            {
            // InternalDataRetrieval.g:1283:1: ( ( rule__OpList__OpTypeAssignment_2 ) )
            // InternalDataRetrieval.g:1284:2: ( rule__OpList__OpTypeAssignment_2 )
            {
             before(grammarAccess.getOpListAccess().getOpTypeAssignment_2()); 
            // InternalDataRetrieval.g:1285:2: ( rule__OpList__OpTypeAssignment_2 )
            // InternalDataRetrieval.g:1285:3: rule__OpList__OpTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OpList__OpTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOpListAccess().getOpTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpList__Group__2__Impl"


    // $ANTLR start "rule__OpList__Group__3"
    // InternalDataRetrieval.g:1293:1: rule__OpList__Group__3 : rule__OpList__Group__3__Impl ;
    public final void rule__OpList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1297:1: ( rule__OpList__Group__3__Impl )
            // InternalDataRetrieval.g:1298:2: rule__OpList__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpList__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpList__Group__3"


    // $ANTLR start "rule__OpList__Group__3__Impl"
    // InternalDataRetrieval.g:1304:1: rule__OpList__Group__3__Impl : ( '}' ) ;
    public final void rule__OpList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1308:1: ( ( '}' ) )
            // InternalDataRetrieval.g:1309:1: ( '}' )
            {
            // InternalDataRetrieval.g:1309:1: ( '}' )
            // InternalDataRetrieval.g:1310:2: '}'
            {
             before(grammarAccess.getOpListAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getOpListAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpList__Group__3__Impl"


    // $ANTLR start "rule__Source__Group__0"
    // InternalDataRetrieval.g:1320:1: rule__Source__Group__0 : rule__Source__Group__0__Impl rule__Source__Group__1 ;
    public final void rule__Source__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1324:1: ( rule__Source__Group__0__Impl rule__Source__Group__1 )
            // InternalDataRetrieval.g:1325:2: rule__Source__Group__0__Impl rule__Source__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Source__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__0"


    // $ANTLR start "rule__Source__Group__0__Impl"
    // InternalDataRetrieval.g:1332:1: rule__Source__Group__0__Impl : ( 'source=' ) ;
    public final void rule__Source__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1336:1: ( ( 'source=' ) )
            // InternalDataRetrieval.g:1337:1: ( 'source=' )
            {
            // InternalDataRetrieval.g:1337:1: ( 'source=' )
            // InternalDataRetrieval.g:1338:2: 'source='
            {
             before(grammarAccess.getSourceAccess().getSourceKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getSourceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__0__Impl"


    // $ANTLR start "rule__Source__Group__1"
    // InternalDataRetrieval.g:1347:1: rule__Source__Group__1 : rule__Source__Group__1__Impl ;
    public final void rule__Source__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1351:1: ( rule__Source__Group__1__Impl )
            // InternalDataRetrieval.g:1352:2: rule__Source__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__1"


    // $ANTLR start "rule__Source__Group__1__Impl"
    // InternalDataRetrieval.g:1358:1: rule__Source__Group__1__Impl : ( ( rule__Source__NameAssignment_1 ) ) ;
    public final void rule__Source__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1362:1: ( ( ( rule__Source__NameAssignment_1 ) ) )
            // InternalDataRetrieval.g:1363:1: ( ( rule__Source__NameAssignment_1 ) )
            {
            // InternalDataRetrieval.g:1363:1: ( ( rule__Source__NameAssignment_1 ) )
            // InternalDataRetrieval.g:1364:2: ( rule__Source__NameAssignment_1 )
            {
             before(grammarAccess.getSourceAccess().getNameAssignment_1()); 
            // InternalDataRetrieval.g:1365:2: ( rule__Source__NameAssignment_1 )
            // InternalDataRetrieval.g:1365:3: rule__Source__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Source__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSourceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__1__Impl"


    // $ANTLR start "rule__Path__Group__0"
    // InternalDataRetrieval.g:1374:1: rule__Path__Group__0 : rule__Path__Group__0__Impl rule__Path__Group__1 ;
    public final void rule__Path__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1378:1: ( rule__Path__Group__0__Impl rule__Path__Group__1 )
            // InternalDataRetrieval.g:1379:2: rule__Path__Group__0__Impl rule__Path__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Path__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Path__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__0"


    // $ANTLR start "rule__Path__Group__0__Impl"
    // InternalDataRetrieval.g:1386:1: rule__Path__Group__0__Impl : ( 'path=' ) ;
    public final void rule__Path__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1390:1: ( ( 'path=' ) )
            // InternalDataRetrieval.g:1391:1: ( 'path=' )
            {
            // InternalDataRetrieval.g:1391:1: ( 'path=' )
            // InternalDataRetrieval.g:1392:2: 'path='
            {
             before(grammarAccess.getPathAccess().getPathKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPathAccess().getPathKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__0__Impl"


    // $ANTLR start "rule__Path__Group__1"
    // InternalDataRetrieval.g:1401:1: rule__Path__Group__1 : rule__Path__Group__1__Impl ;
    public final void rule__Path__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1405:1: ( rule__Path__Group__1__Impl )
            // InternalDataRetrieval.g:1406:2: rule__Path__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Path__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__1"


    // $ANTLR start "rule__Path__Group__1__Impl"
    // InternalDataRetrieval.g:1412:1: rule__Path__Group__1__Impl : ( ( rule__Path__NameAssignment_1 ) ) ;
    public final void rule__Path__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1416:1: ( ( ( rule__Path__NameAssignment_1 ) ) )
            // InternalDataRetrieval.g:1417:1: ( ( rule__Path__NameAssignment_1 ) )
            {
            // InternalDataRetrieval.g:1417:1: ( ( rule__Path__NameAssignment_1 ) )
            // InternalDataRetrieval.g:1418:2: ( rule__Path__NameAssignment_1 )
            {
             before(grammarAccess.getPathAccess().getNameAssignment_1()); 
            // InternalDataRetrieval.g:1419:2: ( rule__Path__NameAssignment_1 )
            // InternalDataRetrieval.g:1419:3: rule__Path__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Path__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPathAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__1__Impl"


    // $ANTLR start "rule__KeysToExtract__Group__0"
    // InternalDataRetrieval.g:1428:1: rule__KeysToExtract__Group__0 : rule__KeysToExtract__Group__0__Impl rule__KeysToExtract__Group__1 ;
    public final void rule__KeysToExtract__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1432:1: ( rule__KeysToExtract__Group__0__Impl rule__KeysToExtract__Group__1 )
            // InternalDataRetrieval.g:1433:2: rule__KeysToExtract__Group__0__Impl rule__KeysToExtract__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__KeysToExtract__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeysToExtract__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeysToExtract__Group__0"


    // $ANTLR start "rule__KeysToExtract__Group__0__Impl"
    // InternalDataRetrieval.g:1440:1: rule__KeysToExtract__Group__0__Impl : ( () ) ;
    public final void rule__KeysToExtract__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1444:1: ( ( () ) )
            // InternalDataRetrieval.g:1445:1: ( () )
            {
            // InternalDataRetrieval.g:1445:1: ( () )
            // InternalDataRetrieval.g:1446:2: ()
            {
             before(grammarAccess.getKeysToExtractAccess().getKeysToExtractAction_0()); 
            // InternalDataRetrieval.g:1447:2: ()
            // InternalDataRetrieval.g:1447:3: 
            {
            }

             after(grammarAccess.getKeysToExtractAccess().getKeysToExtractAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeysToExtract__Group__0__Impl"


    // $ANTLR start "rule__KeysToExtract__Group__1"
    // InternalDataRetrieval.g:1455:1: rule__KeysToExtract__Group__1 : rule__KeysToExtract__Group__1__Impl rule__KeysToExtract__Group__2 ;
    public final void rule__KeysToExtract__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1459:1: ( rule__KeysToExtract__Group__1__Impl rule__KeysToExtract__Group__2 )
            // InternalDataRetrieval.g:1460:2: rule__KeysToExtract__Group__1__Impl rule__KeysToExtract__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__KeysToExtract__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeysToExtract__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeysToExtract__Group__1"


    // $ANTLR start "rule__KeysToExtract__Group__1__Impl"
    // InternalDataRetrieval.g:1467:1: rule__KeysToExtract__Group__1__Impl : ( 'get=[' ) ;
    public final void rule__KeysToExtract__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1471:1: ( ( 'get=[' ) )
            // InternalDataRetrieval.g:1472:1: ( 'get=[' )
            {
            // InternalDataRetrieval.g:1472:1: ( 'get=[' )
            // InternalDataRetrieval.g:1473:2: 'get=['
            {
             before(grammarAccess.getKeysToExtractAccess().getGetKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getKeysToExtractAccess().getGetKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeysToExtract__Group__1__Impl"


    // $ANTLR start "rule__KeysToExtract__Group__2"
    // InternalDataRetrieval.g:1482:1: rule__KeysToExtract__Group__2 : rule__KeysToExtract__Group__2__Impl rule__KeysToExtract__Group__3 ;
    public final void rule__KeysToExtract__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1486:1: ( rule__KeysToExtract__Group__2__Impl rule__KeysToExtract__Group__3 )
            // InternalDataRetrieval.g:1487:2: rule__KeysToExtract__Group__2__Impl rule__KeysToExtract__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__KeysToExtract__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeysToExtract__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeysToExtract__Group__2"


    // $ANTLR start "rule__KeysToExtract__Group__2__Impl"
    // InternalDataRetrieval.g:1494:1: rule__KeysToExtract__Group__2__Impl : ( ( rule__KeysToExtract__Key1Assignment_2 ) ) ;
    public final void rule__KeysToExtract__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1498:1: ( ( ( rule__KeysToExtract__Key1Assignment_2 ) ) )
            // InternalDataRetrieval.g:1499:1: ( ( rule__KeysToExtract__Key1Assignment_2 ) )
            {
            // InternalDataRetrieval.g:1499:1: ( ( rule__KeysToExtract__Key1Assignment_2 ) )
            // InternalDataRetrieval.g:1500:2: ( rule__KeysToExtract__Key1Assignment_2 )
            {
             before(grammarAccess.getKeysToExtractAccess().getKey1Assignment_2()); 
            // InternalDataRetrieval.g:1501:2: ( rule__KeysToExtract__Key1Assignment_2 )
            // InternalDataRetrieval.g:1501:3: rule__KeysToExtract__Key1Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__KeysToExtract__Key1Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getKeysToExtractAccess().getKey1Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeysToExtract__Group__2__Impl"


    // $ANTLR start "rule__KeysToExtract__Group__3"
    // InternalDataRetrieval.g:1509:1: rule__KeysToExtract__Group__3 : rule__KeysToExtract__Group__3__Impl rule__KeysToExtract__Group__4 ;
    public final void rule__KeysToExtract__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1513:1: ( rule__KeysToExtract__Group__3__Impl rule__KeysToExtract__Group__4 )
            // InternalDataRetrieval.g:1514:2: rule__KeysToExtract__Group__3__Impl rule__KeysToExtract__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__KeysToExtract__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeysToExtract__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeysToExtract__Group__3"


    // $ANTLR start "rule__KeysToExtract__Group__3__Impl"
    // InternalDataRetrieval.g:1521:1: rule__KeysToExtract__Group__3__Impl : ( ( rule__KeysToExtract__Group_3__0 )* ) ;
    public final void rule__KeysToExtract__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1525:1: ( ( ( rule__KeysToExtract__Group_3__0 )* ) )
            // InternalDataRetrieval.g:1526:1: ( ( rule__KeysToExtract__Group_3__0 )* )
            {
            // InternalDataRetrieval.g:1526:1: ( ( rule__KeysToExtract__Group_3__0 )* )
            // InternalDataRetrieval.g:1527:2: ( rule__KeysToExtract__Group_3__0 )*
            {
             before(grammarAccess.getKeysToExtractAccess().getGroup_3()); 
            // InternalDataRetrieval.g:1528:2: ( rule__KeysToExtract__Group_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==22) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDataRetrieval.g:1528:3: rule__KeysToExtract__Group_3__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__KeysToExtract__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getKeysToExtractAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeysToExtract__Group__3__Impl"


    // $ANTLR start "rule__KeysToExtract__Group__4"
    // InternalDataRetrieval.g:1536:1: rule__KeysToExtract__Group__4 : rule__KeysToExtract__Group__4__Impl ;
    public final void rule__KeysToExtract__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1540:1: ( rule__KeysToExtract__Group__4__Impl )
            // InternalDataRetrieval.g:1541:2: rule__KeysToExtract__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KeysToExtract__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeysToExtract__Group__4"


    // $ANTLR start "rule__KeysToExtract__Group__4__Impl"
    // InternalDataRetrieval.g:1547:1: rule__KeysToExtract__Group__4__Impl : ( ']' ) ;
    public final void rule__KeysToExtract__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1551:1: ( ( ']' ) )
            // InternalDataRetrieval.g:1552:1: ( ']' )
            {
            // InternalDataRetrieval.g:1552:1: ( ']' )
            // InternalDataRetrieval.g:1553:2: ']'
            {
             before(grammarAccess.getKeysToExtractAccess().getRightSquareBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getKeysToExtractAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeysToExtract__Group__4__Impl"


    // $ANTLR start "rule__KeysToExtract__Group_3__0"
    // InternalDataRetrieval.g:1563:1: rule__KeysToExtract__Group_3__0 : rule__KeysToExtract__Group_3__0__Impl rule__KeysToExtract__Group_3__1 ;
    public final void rule__KeysToExtract__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1567:1: ( rule__KeysToExtract__Group_3__0__Impl rule__KeysToExtract__Group_3__1 )
            // InternalDataRetrieval.g:1568:2: rule__KeysToExtract__Group_3__0__Impl rule__KeysToExtract__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__KeysToExtract__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeysToExtract__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeysToExtract__Group_3__0"


    // $ANTLR start "rule__KeysToExtract__Group_3__0__Impl"
    // InternalDataRetrieval.g:1575:1: rule__KeysToExtract__Group_3__0__Impl : ( ',' ) ;
    public final void rule__KeysToExtract__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1579:1: ( ( ',' ) )
            // InternalDataRetrieval.g:1580:1: ( ',' )
            {
            // InternalDataRetrieval.g:1580:1: ( ',' )
            // InternalDataRetrieval.g:1581:2: ','
            {
             before(grammarAccess.getKeysToExtractAccess().getCommaKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getKeysToExtractAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeysToExtract__Group_3__0__Impl"


    // $ANTLR start "rule__KeysToExtract__Group_3__1"
    // InternalDataRetrieval.g:1590:1: rule__KeysToExtract__Group_3__1 : rule__KeysToExtract__Group_3__1__Impl ;
    public final void rule__KeysToExtract__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1594:1: ( rule__KeysToExtract__Group_3__1__Impl )
            // InternalDataRetrieval.g:1595:2: rule__KeysToExtract__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KeysToExtract__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeysToExtract__Group_3__1"


    // $ANTLR start "rule__KeysToExtract__Group_3__1__Impl"
    // InternalDataRetrieval.g:1601:1: rule__KeysToExtract__Group_3__1__Impl : ( ( rule__KeysToExtract__Key1Assignment_3_1 ) ) ;
    public final void rule__KeysToExtract__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1605:1: ( ( ( rule__KeysToExtract__Key1Assignment_3_1 ) ) )
            // InternalDataRetrieval.g:1606:1: ( ( rule__KeysToExtract__Key1Assignment_3_1 ) )
            {
            // InternalDataRetrieval.g:1606:1: ( ( rule__KeysToExtract__Key1Assignment_3_1 ) )
            // InternalDataRetrieval.g:1607:2: ( rule__KeysToExtract__Key1Assignment_3_1 )
            {
             before(grammarAccess.getKeysToExtractAccess().getKey1Assignment_3_1()); 
            // InternalDataRetrieval.g:1608:2: ( rule__KeysToExtract__Key1Assignment_3_1 )
            // InternalDataRetrieval.g:1608:3: rule__KeysToExtract__Key1Assignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__KeysToExtract__Key1Assignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getKeysToExtractAccess().getKey1Assignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeysToExtract__Group_3__1__Impl"


    // $ANTLR start "rule__Key__Group__0"
    // InternalDataRetrieval.g:1617:1: rule__Key__Group__0 : rule__Key__Group__0__Impl rule__Key__Group__1 ;
    public final void rule__Key__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1621:1: ( rule__Key__Group__0__Impl rule__Key__Group__1 )
            // InternalDataRetrieval.g:1622:2: rule__Key__Group__0__Impl rule__Key__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Key__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Key__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__Group__0"


    // $ANTLR start "rule__Key__Group__0__Impl"
    // InternalDataRetrieval.g:1629:1: rule__Key__Group__0__Impl : ( ( rule__Key__NameAssignment_0 ) ) ;
    public final void rule__Key__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1633:1: ( ( ( rule__Key__NameAssignment_0 ) ) )
            // InternalDataRetrieval.g:1634:1: ( ( rule__Key__NameAssignment_0 ) )
            {
            // InternalDataRetrieval.g:1634:1: ( ( rule__Key__NameAssignment_0 ) )
            // InternalDataRetrieval.g:1635:2: ( rule__Key__NameAssignment_0 )
            {
             before(grammarAccess.getKeyAccess().getNameAssignment_0()); 
            // InternalDataRetrieval.g:1636:2: ( rule__Key__NameAssignment_0 )
            // InternalDataRetrieval.g:1636:3: rule__Key__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Key__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getKeyAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__Group__0__Impl"


    // $ANTLR start "rule__Key__Group__1"
    // InternalDataRetrieval.g:1644:1: rule__Key__Group__1 : rule__Key__Group__1__Impl ;
    public final void rule__Key__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1648:1: ( rule__Key__Group__1__Impl )
            // InternalDataRetrieval.g:1649:2: rule__Key__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Key__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__Group__1"


    // $ANTLR start "rule__Key__Group__1__Impl"
    // InternalDataRetrieval.g:1655:1: rule__Key__Group__1__Impl : ( ( rule__Key__Group_1__0 )? ) ;
    public final void rule__Key__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1659:1: ( ( ( rule__Key__Group_1__0 )? ) )
            // InternalDataRetrieval.g:1660:1: ( ( rule__Key__Group_1__0 )? )
            {
            // InternalDataRetrieval.g:1660:1: ( ( rule__Key__Group_1__0 )? )
            // InternalDataRetrieval.g:1661:2: ( rule__Key__Group_1__0 )?
            {
             before(grammarAccess.getKeyAccess().getGroup_1()); 
            // InternalDataRetrieval.g:1662:2: ( rule__Key__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDataRetrieval.g:1662:3: rule__Key__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Key__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKeyAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__Group__1__Impl"


    // $ANTLR start "rule__Key__Group_1__0"
    // InternalDataRetrieval.g:1671:1: rule__Key__Group_1__0 : rule__Key__Group_1__0__Impl rule__Key__Group_1__1 ;
    public final void rule__Key__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1675:1: ( rule__Key__Group_1__0__Impl rule__Key__Group_1__1 )
            // InternalDataRetrieval.g:1676:2: rule__Key__Group_1__0__Impl rule__Key__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Key__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Key__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__Group_1__0"


    // $ANTLR start "rule__Key__Group_1__0__Impl"
    // InternalDataRetrieval.g:1683:1: rule__Key__Group_1__0__Impl : ( '->' ) ;
    public final void rule__Key__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1687:1: ( ( '->' ) )
            // InternalDataRetrieval.g:1688:1: ( '->' )
            {
            // InternalDataRetrieval.g:1688:1: ( '->' )
            // InternalDataRetrieval.g:1689:2: '->'
            {
             before(grammarAccess.getKeyAccess().getHyphenMinusGreaterThanSignKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getKeyAccess().getHyphenMinusGreaterThanSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__Group_1__0__Impl"


    // $ANTLR start "rule__Key__Group_1__1"
    // InternalDataRetrieval.g:1698:1: rule__Key__Group_1__1 : rule__Key__Group_1__1__Impl ;
    public final void rule__Key__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1702:1: ( rule__Key__Group_1__1__Impl )
            // InternalDataRetrieval.g:1703:2: rule__Key__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Key__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__Group_1__1"


    // $ANTLR start "rule__Key__Group_1__1__Impl"
    // InternalDataRetrieval.g:1709:1: rule__Key__Group_1__1__Impl : ( ( rule__Key__RenameAssignment_1_1 ) ) ;
    public final void rule__Key__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1713:1: ( ( ( rule__Key__RenameAssignment_1_1 ) ) )
            // InternalDataRetrieval.g:1714:1: ( ( rule__Key__RenameAssignment_1_1 ) )
            {
            // InternalDataRetrieval.g:1714:1: ( ( rule__Key__RenameAssignment_1_1 ) )
            // InternalDataRetrieval.g:1715:2: ( rule__Key__RenameAssignment_1_1 )
            {
             before(grammarAccess.getKeyAccess().getRenameAssignment_1_1()); 
            // InternalDataRetrieval.g:1716:2: ( rule__Key__RenameAssignment_1_1 )
            // InternalDataRetrieval.g:1716:3: rule__Key__RenameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Key__RenameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getKeyAccess().getRenameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__Group_1__1__Impl"


    // $ANTLR start "rule__FullRename__Group__0"
    // InternalDataRetrieval.g:1725:1: rule__FullRename__Group__0 : rule__FullRename__Group__0__Impl rule__FullRename__Group__1 ;
    public final void rule__FullRename__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1729:1: ( rule__FullRename__Group__0__Impl rule__FullRename__Group__1 )
            // InternalDataRetrieval.g:1730:2: rule__FullRename__Group__0__Impl rule__FullRename__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__FullRename__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FullRename__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FullRename__Group__0"


    // $ANTLR start "rule__FullRename__Group__0__Impl"
    // InternalDataRetrieval.g:1737:1: rule__FullRename__Group__0__Impl : ( 'rename=' ) ;
    public final void rule__FullRename__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1741:1: ( ( 'rename=' ) )
            // InternalDataRetrieval.g:1742:1: ( 'rename=' )
            {
            // InternalDataRetrieval.g:1742:1: ( 'rename=' )
            // InternalDataRetrieval.g:1743:2: 'rename='
            {
             before(grammarAccess.getFullRenameAccess().getRenameKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFullRenameAccess().getRenameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FullRename__Group__0__Impl"


    // $ANTLR start "rule__FullRename__Group__1"
    // InternalDataRetrieval.g:1752:1: rule__FullRename__Group__1 : rule__FullRename__Group__1__Impl rule__FullRename__Group__2 ;
    public final void rule__FullRename__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1756:1: ( rule__FullRename__Group__1__Impl rule__FullRename__Group__2 )
            // InternalDataRetrieval.g:1757:2: rule__FullRename__Group__1__Impl rule__FullRename__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__FullRename__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FullRename__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FullRename__Group__1"


    // $ANTLR start "rule__FullRename__Group__1__Impl"
    // InternalDataRetrieval.g:1764:1: rule__FullRename__Group__1__Impl : ( ( rule__FullRename__NameAssignment_1 ) ) ;
    public final void rule__FullRename__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1768:1: ( ( ( rule__FullRename__NameAssignment_1 ) ) )
            // InternalDataRetrieval.g:1769:1: ( ( rule__FullRename__NameAssignment_1 ) )
            {
            // InternalDataRetrieval.g:1769:1: ( ( rule__FullRename__NameAssignment_1 ) )
            // InternalDataRetrieval.g:1770:2: ( rule__FullRename__NameAssignment_1 )
            {
             before(grammarAccess.getFullRenameAccess().getNameAssignment_1()); 
            // InternalDataRetrieval.g:1771:2: ( rule__FullRename__NameAssignment_1 )
            // InternalDataRetrieval.g:1771:3: rule__FullRename__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FullRename__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFullRenameAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FullRename__Group__1__Impl"


    // $ANTLR start "rule__FullRename__Group__2"
    // InternalDataRetrieval.g:1779:1: rule__FullRename__Group__2 : rule__FullRename__Group__2__Impl ;
    public final void rule__FullRename__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1783:1: ( rule__FullRename__Group__2__Impl )
            // InternalDataRetrieval.g:1784:2: rule__FullRename__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FullRename__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FullRename__Group__2"


    // $ANTLR start "rule__FullRename__Group__2__Impl"
    // InternalDataRetrieval.g:1790:1: rule__FullRename__Group__2__Impl : ( ( rule__FullRename__NAssignment_2 )? ) ;
    public final void rule__FullRename__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1794:1: ( ( ( rule__FullRename__NAssignment_2 )? ) )
            // InternalDataRetrieval.g:1795:1: ( ( rule__FullRename__NAssignment_2 )? )
            {
            // InternalDataRetrieval.g:1795:1: ( ( rule__FullRename__NAssignment_2 )? )
            // InternalDataRetrieval.g:1796:2: ( rule__FullRename__NAssignment_2 )?
            {
             before(grammarAccess.getFullRenameAccess().getNAssignment_2()); 
            // InternalDataRetrieval.g:1797:2: ( rule__FullRename__NAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDataRetrieval.g:1797:3: rule__FullRename__NAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__FullRename__NAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFullRenameAccess().getNAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FullRename__Group__2__Impl"


    // $ANTLR start "rule__AddPrefix__Group__0"
    // InternalDataRetrieval.g:1806:1: rule__AddPrefix__Group__0 : rule__AddPrefix__Group__0__Impl rule__AddPrefix__Group__1 ;
    public final void rule__AddPrefix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1810:1: ( rule__AddPrefix__Group__0__Impl rule__AddPrefix__Group__1 )
            // InternalDataRetrieval.g:1811:2: rule__AddPrefix__Group__0__Impl rule__AddPrefix__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__AddPrefix__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddPrefix__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddPrefix__Group__0"


    // $ANTLR start "rule__AddPrefix__Group__0__Impl"
    // InternalDataRetrieval.g:1818:1: rule__AddPrefix__Group__0__Impl : ( 'prepend=' ) ;
    public final void rule__AddPrefix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1822:1: ( ( 'prepend=' ) )
            // InternalDataRetrieval.g:1823:1: ( 'prepend=' )
            {
            // InternalDataRetrieval.g:1823:1: ( 'prepend=' )
            // InternalDataRetrieval.g:1824:2: 'prepend='
            {
             before(grammarAccess.getAddPrefixAccess().getPrependKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAddPrefixAccess().getPrependKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddPrefix__Group__0__Impl"


    // $ANTLR start "rule__AddPrefix__Group__1"
    // InternalDataRetrieval.g:1833:1: rule__AddPrefix__Group__1 : rule__AddPrefix__Group__1__Impl ;
    public final void rule__AddPrefix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1837:1: ( rule__AddPrefix__Group__1__Impl )
            // InternalDataRetrieval.g:1838:2: rule__AddPrefix__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddPrefix__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddPrefix__Group__1"


    // $ANTLR start "rule__AddPrefix__Group__1__Impl"
    // InternalDataRetrieval.g:1844:1: rule__AddPrefix__Group__1__Impl : ( ( rule__AddPrefix__NameAssignment_1 ) ) ;
    public final void rule__AddPrefix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1848:1: ( ( ( rule__AddPrefix__NameAssignment_1 ) ) )
            // InternalDataRetrieval.g:1849:1: ( ( rule__AddPrefix__NameAssignment_1 ) )
            {
            // InternalDataRetrieval.g:1849:1: ( ( rule__AddPrefix__NameAssignment_1 ) )
            // InternalDataRetrieval.g:1850:2: ( rule__AddPrefix__NameAssignment_1 )
            {
             before(grammarAccess.getAddPrefixAccess().getNameAssignment_1()); 
            // InternalDataRetrieval.g:1851:2: ( rule__AddPrefix__NameAssignment_1 )
            // InternalDataRetrieval.g:1851:3: rule__AddPrefix__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AddPrefix__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAddPrefixAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddPrefix__Group__1__Impl"


    // $ANTLR start "rule__AddSuffix__Group__0"
    // InternalDataRetrieval.g:1860:1: rule__AddSuffix__Group__0 : rule__AddSuffix__Group__0__Impl rule__AddSuffix__Group__1 ;
    public final void rule__AddSuffix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1864:1: ( rule__AddSuffix__Group__0__Impl rule__AddSuffix__Group__1 )
            // InternalDataRetrieval.g:1865:2: rule__AddSuffix__Group__0__Impl rule__AddSuffix__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__AddSuffix__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddSuffix__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddSuffix__Group__0"


    // $ANTLR start "rule__AddSuffix__Group__0__Impl"
    // InternalDataRetrieval.g:1872:1: rule__AddSuffix__Group__0__Impl : ( 'append=' ) ;
    public final void rule__AddSuffix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1876:1: ( ( 'append=' ) )
            // InternalDataRetrieval.g:1877:1: ( 'append=' )
            {
            // InternalDataRetrieval.g:1877:1: ( 'append=' )
            // InternalDataRetrieval.g:1878:2: 'append='
            {
             before(grammarAccess.getAddSuffixAccess().getAppendKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAddSuffixAccess().getAppendKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddSuffix__Group__0__Impl"


    // $ANTLR start "rule__AddSuffix__Group__1"
    // InternalDataRetrieval.g:1887:1: rule__AddSuffix__Group__1 : rule__AddSuffix__Group__1__Impl ;
    public final void rule__AddSuffix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1891:1: ( rule__AddSuffix__Group__1__Impl )
            // InternalDataRetrieval.g:1892:2: rule__AddSuffix__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddSuffix__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddSuffix__Group__1"


    // $ANTLR start "rule__AddSuffix__Group__1__Impl"
    // InternalDataRetrieval.g:1898:1: rule__AddSuffix__Group__1__Impl : ( ( rule__AddSuffix__NameAssignment_1 ) ) ;
    public final void rule__AddSuffix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1902:1: ( ( ( rule__AddSuffix__NameAssignment_1 ) ) )
            // InternalDataRetrieval.g:1903:1: ( ( rule__AddSuffix__NameAssignment_1 ) )
            {
            // InternalDataRetrieval.g:1903:1: ( ( rule__AddSuffix__NameAssignment_1 ) )
            // InternalDataRetrieval.g:1904:2: ( rule__AddSuffix__NameAssignment_1 )
            {
             before(grammarAccess.getAddSuffixAccess().getNameAssignment_1()); 
            // InternalDataRetrieval.g:1905:2: ( rule__AddSuffix__NameAssignment_1 )
            // InternalDataRetrieval.g:1905:3: rule__AddSuffix__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AddSuffix__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAddSuffixAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddSuffix__Group__1__Impl"


    // $ANTLR start "rule__Filter__Group__0"
    // InternalDataRetrieval.g:1914:1: rule__Filter__Group__0 : rule__Filter__Group__0__Impl rule__Filter__Group__1 ;
    public final void rule__Filter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1918:1: ( rule__Filter__Group__0__Impl rule__Filter__Group__1 )
            // InternalDataRetrieval.g:1919:2: rule__Filter__Group__0__Impl rule__Filter__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Filter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__0"


    // $ANTLR start "rule__Filter__Group__0__Impl"
    // InternalDataRetrieval.g:1926:1: rule__Filter__Group__0__Impl : ( 'filter=' ) ;
    public final void rule__Filter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1930:1: ( ( 'filter=' ) )
            // InternalDataRetrieval.g:1931:1: ( 'filter=' )
            {
            // InternalDataRetrieval.g:1931:1: ( 'filter=' )
            // InternalDataRetrieval.g:1932:2: 'filter='
            {
             before(grammarAccess.getFilterAccess().getFilterKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getFilterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__0__Impl"


    // $ANTLR start "rule__Filter__Group__1"
    // InternalDataRetrieval.g:1941:1: rule__Filter__Group__1 : rule__Filter__Group__1__Impl ;
    public final void rule__Filter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1945:1: ( rule__Filter__Group__1__Impl )
            // InternalDataRetrieval.g:1946:2: rule__Filter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Filter__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__1"


    // $ANTLR start "rule__Filter__Group__1__Impl"
    // InternalDataRetrieval.g:1952:1: rule__Filter__Group__1__Impl : ( ( rule__Filter__NameAssignment_1 ) ) ;
    public final void rule__Filter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1956:1: ( ( ( rule__Filter__NameAssignment_1 ) ) )
            // InternalDataRetrieval.g:1957:1: ( ( rule__Filter__NameAssignment_1 ) )
            {
            // InternalDataRetrieval.g:1957:1: ( ( rule__Filter__NameAssignment_1 ) )
            // InternalDataRetrieval.g:1958:2: ( rule__Filter__NameAssignment_1 )
            {
             before(grammarAccess.getFilterAccess().getNameAssignment_1()); 
            // InternalDataRetrieval.g:1959:2: ( rule__Filter__NameAssignment_1 )
            // InternalDataRetrieval.g:1959:3: rule__Filter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Filter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__1__Impl"


    // $ANTLR start "rule__TopN__Group__0"
    // InternalDataRetrieval.g:1968:1: rule__TopN__Group__0 : rule__TopN__Group__0__Impl rule__TopN__Group__1 ;
    public final void rule__TopN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1972:1: ( rule__TopN__Group__0__Impl rule__TopN__Group__1 )
            // InternalDataRetrieval.g:1973:2: rule__TopN__Group__0__Impl rule__TopN__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__TopN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopN__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopN__Group__0"


    // $ANTLR start "rule__TopN__Group__0__Impl"
    // InternalDataRetrieval.g:1980:1: rule__TopN__Group__0__Impl : ( 'top=' ) ;
    public final void rule__TopN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1984:1: ( ( 'top=' ) )
            // InternalDataRetrieval.g:1985:1: ( 'top=' )
            {
            // InternalDataRetrieval.g:1985:1: ( 'top=' )
            // InternalDataRetrieval.g:1986:2: 'top='
            {
             before(grammarAccess.getTopNAccess().getTopKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTopNAccess().getTopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopN__Group__0__Impl"


    // $ANTLR start "rule__TopN__Group__1"
    // InternalDataRetrieval.g:1995:1: rule__TopN__Group__1 : rule__TopN__Group__1__Impl ;
    public final void rule__TopN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:1999:1: ( rule__TopN__Group__1__Impl )
            // InternalDataRetrieval.g:2000:2: rule__TopN__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TopN__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopN__Group__1"


    // $ANTLR start "rule__TopN__Group__1__Impl"
    // InternalDataRetrieval.g:2006:1: rule__TopN__Group__1__Impl : ( ( rule__TopN__ValueAssignment_1 ) ) ;
    public final void rule__TopN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2010:1: ( ( ( rule__TopN__ValueAssignment_1 ) ) )
            // InternalDataRetrieval.g:2011:1: ( ( rule__TopN__ValueAssignment_1 ) )
            {
            // InternalDataRetrieval.g:2011:1: ( ( rule__TopN__ValueAssignment_1 ) )
            // InternalDataRetrieval.g:2012:2: ( rule__TopN__ValueAssignment_1 )
            {
             before(grammarAccess.getTopNAccess().getValueAssignment_1()); 
            // InternalDataRetrieval.g:2013:2: ( rule__TopN__ValueAssignment_1 )
            // InternalDataRetrieval.g:2013:3: rule__TopN__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TopN__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTopNAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopN__Group__1__Impl"


    // $ANTLR start "rule__BottomN__Group__0"
    // InternalDataRetrieval.g:2022:1: rule__BottomN__Group__0 : rule__BottomN__Group__0__Impl rule__BottomN__Group__1 ;
    public final void rule__BottomN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2026:1: ( rule__BottomN__Group__0__Impl rule__BottomN__Group__1 )
            // InternalDataRetrieval.g:2027:2: rule__BottomN__Group__0__Impl rule__BottomN__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__BottomN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BottomN__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BottomN__Group__0"


    // $ANTLR start "rule__BottomN__Group__0__Impl"
    // InternalDataRetrieval.g:2034:1: rule__BottomN__Group__0__Impl : ( 'bottom=' ) ;
    public final void rule__BottomN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2038:1: ( ( 'bottom=' ) )
            // InternalDataRetrieval.g:2039:1: ( 'bottom=' )
            {
            // InternalDataRetrieval.g:2039:1: ( 'bottom=' )
            // InternalDataRetrieval.g:2040:2: 'bottom='
            {
             before(grammarAccess.getBottomNAccess().getBottomKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getBottomNAccess().getBottomKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BottomN__Group__0__Impl"


    // $ANTLR start "rule__BottomN__Group__1"
    // InternalDataRetrieval.g:2049:1: rule__BottomN__Group__1 : rule__BottomN__Group__1__Impl ;
    public final void rule__BottomN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2053:1: ( rule__BottomN__Group__1__Impl )
            // InternalDataRetrieval.g:2054:2: rule__BottomN__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BottomN__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BottomN__Group__1"


    // $ANTLR start "rule__BottomN__Group__1__Impl"
    // InternalDataRetrieval.g:2060:1: rule__BottomN__Group__1__Impl : ( ( rule__BottomN__ValueAssignment_1 ) ) ;
    public final void rule__BottomN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2064:1: ( ( ( rule__BottomN__ValueAssignment_1 ) ) )
            // InternalDataRetrieval.g:2065:1: ( ( rule__BottomN__ValueAssignment_1 ) )
            {
            // InternalDataRetrieval.g:2065:1: ( ( rule__BottomN__ValueAssignment_1 ) )
            // InternalDataRetrieval.g:2066:2: ( rule__BottomN__ValueAssignment_1 )
            {
             before(grammarAccess.getBottomNAccess().getValueAssignment_1()); 
            // InternalDataRetrieval.g:2067:2: ( rule__BottomN__ValueAssignment_1 )
            // InternalDataRetrieval.g:2067:3: rule__BottomN__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BottomN__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBottomNAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BottomN__Group__1__Impl"


    // $ANTLR start "rule__OpType__Group__0"
    // InternalDataRetrieval.g:2076:1: rule__OpType__Group__0 : rule__OpType__Group__0__Impl rule__OpType__Group__1 ;
    public final void rule__OpType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2080:1: ( rule__OpType__Group__0__Impl rule__OpType__Group__1 )
            // InternalDataRetrieval.g:2081:2: rule__OpType__Group__0__Impl rule__OpType__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__OpType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpType__Group__0"


    // $ANTLR start "rule__OpType__Group__0__Impl"
    // InternalDataRetrieval.g:2088:1: rule__OpType__Group__0__Impl : ( ( rule__OpType__Alternatives_0 ) ) ;
    public final void rule__OpType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2092:1: ( ( ( rule__OpType__Alternatives_0 ) ) )
            // InternalDataRetrieval.g:2093:1: ( ( rule__OpType__Alternatives_0 ) )
            {
            // InternalDataRetrieval.g:2093:1: ( ( rule__OpType__Alternatives_0 ) )
            // InternalDataRetrieval.g:2094:2: ( rule__OpType__Alternatives_0 )
            {
             before(grammarAccess.getOpTypeAccess().getAlternatives_0()); 
            // InternalDataRetrieval.g:2095:2: ( rule__OpType__Alternatives_0 )
            // InternalDataRetrieval.g:2095:3: rule__OpType__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__OpType__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getOpTypeAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpType__Group__0__Impl"


    // $ANTLR start "rule__OpType__Group__1"
    // InternalDataRetrieval.g:2103:1: rule__OpType__Group__1 : rule__OpType__Group__1__Impl ;
    public final void rule__OpType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2107:1: ( rule__OpType__Group__1__Impl )
            // InternalDataRetrieval.g:2108:2: rule__OpType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpType__Group__1"


    // $ANTLR start "rule__OpType__Group__1__Impl"
    // InternalDataRetrieval.g:2114:1: rule__OpType__Group__1__Impl : ( ( rule__OpType__Alternatives_1 ) ) ;
    public final void rule__OpType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2118:1: ( ( ( rule__OpType__Alternatives_1 ) ) )
            // InternalDataRetrieval.g:2119:1: ( ( rule__OpType__Alternatives_1 ) )
            {
            // InternalDataRetrieval.g:2119:1: ( ( rule__OpType__Alternatives_1 ) )
            // InternalDataRetrieval.g:2120:2: ( rule__OpType__Alternatives_1 )
            {
             before(grammarAccess.getOpTypeAccess().getAlternatives_1()); 
            // InternalDataRetrieval.g:2121:2: ( rule__OpType__Alternatives_1 )
            // InternalDataRetrieval.g:2121:3: rule__OpType__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__OpType__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getOpTypeAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpType__Group__1__Impl"


    // $ANTLR start "rule__OpType__Group_1_1__0"
    // InternalDataRetrieval.g:2130:1: rule__OpType__Group_1_1__0 : rule__OpType__Group_1_1__0__Impl rule__OpType__Group_1_1__1 ;
    public final void rule__OpType__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2134:1: ( rule__OpType__Group_1_1__0__Impl rule__OpType__Group_1_1__1 )
            // InternalDataRetrieval.g:2135:2: rule__OpType__Group_1_1__0__Impl rule__OpType__Group_1_1__1
            {
            pushFollow(FOLLOW_9);
            rule__OpType__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpType__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpType__Group_1_1__0"


    // $ANTLR start "rule__OpType__Group_1_1__0__Impl"
    // InternalDataRetrieval.g:2142:1: rule__OpType__Group_1_1__0__Impl : ( '[' ) ;
    public final void rule__OpType__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2146:1: ( ( '[' ) )
            // InternalDataRetrieval.g:2147:1: ( '[' )
            {
            // InternalDataRetrieval.g:2147:1: ( '[' )
            // InternalDataRetrieval.g:2148:2: '['
            {
             before(grammarAccess.getOpTypeAccess().getLeftSquareBracketKeyword_1_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getOpTypeAccess().getLeftSquareBracketKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpType__Group_1_1__0__Impl"


    // $ANTLR start "rule__OpType__Group_1_1__1"
    // InternalDataRetrieval.g:2157:1: rule__OpType__Group_1_1__1 : rule__OpType__Group_1_1__1__Impl rule__OpType__Group_1_1__2 ;
    public final void rule__OpType__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2161:1: ( rule__OpType__Group_1_1__1__Impl rule__OpType__Group_1_1__2 )
            // InternalDataRetrieval.g:2162:2: rule__OpType__Group_1_1__1__Impl rule__OpType__Group_1_1__2
            {
            pushFollow(FOLLOW_17);
            rule__OpType__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpType__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpType__Group_1_1__1"


    // $ANTLR start "rule__OpType__Group_1_1__1__Impl"
    // InternalDataRetrieval.g:2169:1: rule__OpType__Group_1_1__1__Impl : ( ( rule__OpType__Key1Assignment_1_1_1 ) ) ;
    public final void rule__OpType__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2173:1: ( ( ( rule__OpType__Key1Assignment_1_1_1 ) ) )
            // InternalDataRetrieval.g:2174:1: ( ( rule__OpType__Key1Assignment_1_1_1 ) )
            {
            // InternalDataRetrieval.g:2174:1: ( ( rule__OpType__Key1Assignment_1_1_1 ) )
            // InternalDataRetrieval.g:2175:2: ( rule__OpType__Key1Assignment_1_1_1 )
            {
             before(grammarAccess.getOpTypeAccess().getKey1Assignment_1_1_1()); 
            // InternalDataRetrieval.g:2176:2: ( rule__OpType__Key1Assignment_1_1_1 )
            // InternalDataRetrieval.g:2176:3: rule__OpType__Key1Assignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OpType__Key1Assignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOpTypeAccess().getKey1Assignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpType__Group_1_1__1__Impl"


    // $ANTLR start "rule__OpType__Group_1_1__2"
    // InternalDataRetrieval.g:2184:1: rule__OpType__Group_1_1__2 : rule__OpType__Group_1_1__2__Impl rule__OpType__Group_1_1__3 ;
    public final void rule__OpType__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2188:1: ( rule__OpType__Group_1_1__2__Impl rule__OpType__Group_1_1__3 )
            // InternalDataRetrieval.g:2189:2: rule__OpType__Group_1_1__2__Impl rule__OpType__Group_1_1__3
            {
            pushFollow(FOLLOW_17);
            rule__OpType__Group_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpType__Group_1_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpType__Group_1_1__2"


    // $ANTLR start "rule__OpType__Group_1_1__2__Impl"
    // InternalDataRetrieval.g:2196:1: rule__OpType__Group_1_1__2__Impl : ( ( rule__OpType__Group_1_1_2__0 )* ) ;
    public final void rule__OpType__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2200:1: ( ( ( rule__OpType__Group_1_1_2__0 )* ) )
            // InternalDataRetrieval.g:2201:1: ( ( rule__OpType__Group_1_1_2__0 )* )
            {
            // InternalDataRetrieval.g:2201:1: ( ( rule__OpType__Group_1_1_2__0 )* )
            // InternalDataRetrieval.g:2202:2: ( rule__OpType__Group_1_1_2__0 )*
            {
             before(grammarAccess.getOpTypeAccess().getGroup_1_1_2()); 
            // InternalDataRetrieval.g:2203:2: ( rule__OpType__Group_1_1_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==22) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDataRetrieval.g:2203:3: rule__OpType__Group_1_1_2__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__OpType__Group_1_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getOpTypeAccess().getGroup_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpType__Group_1_1__2__Impl"


    // $ANTLR start "rule__OpType__Group_1_1__3"
    // InternalDataRetrieval.g:2211:1: rule__OpType__Group_1_1__3 : rule__OpType__Group_1_1__3__Impl ;
    public final void rule__OpType__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2215:1: ( rule__OpType__Group_1_1__3__Impl )
            // InternalDataRetrieval.g:2216:2: rule__OpType__Group_1_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpType__Group_1_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpType__Group_1_1__3"


    // $ANTLR start "rule__OpType__Group_1_1__3__Impl"
    // InternalDataRetrieval.g:2222:1: rule__OpType__Group_1_1__3__Impl : ( ']' ) ;
    public final void rule__OpType__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2226:1: ( ( ']' ) )
            // InternalDataRetrieval.g:2227:1: ( ']' )
            {
            // InternalDataRetrieval.g:2227:1: ( ']' )
            // InternalDataRetrieval.g:2228:2: ']'
            {
             before(grammarAccess.getOpTypeAccess().getRightSquareBracketKeyword_1_1_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getOpTypeAccess().getRightSquareBracketKeyword_1_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpType__Group_1_1__3__Impl"


    // $ANTLR start "rule__OpType__Group_1_1_2__0"
    // InternalDataRetrieval.g:2238:1: rule__OpType__Group_1_1_2__0 : rule__OpType__Group_1_1_2__0__Impl rule__OpType__Group_1_1_2__1 ;
    public final void rule__OpType__Group_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2242:1: ( rule__OpType__Group_1_1_2__0__Impl rule__OpType__Group_1_1_2__1 )
            // InternalDataRetrieval.g:2243:2: rule__OpType__Group_1_1_2__0__Impl rule__OpType__Group_1_1_2__1
            {
            pushFollow(FOLLOW_9);
            rule__OpType__Group_1_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpType__Group_1_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpType__Group_1_1_2__0"


    // $ANTLR start "rule__OpType__Group_1_1_2__0__Impl"
    // InternalDataRetrieval.g:2250:1: rule__OpType__Group_1_1_2__0__Impl : ( ',' ) ;
    public final void rule__OpType__Group_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2254:1: ( ( ',' ) )
            // InternalDataRetrieval.g:2255:1: ( ',' )
            {
            // InternalDataRetrieval.g:2255:1: ( ',' )
            // InternalDataRetrieval.g:2256:2: ','
            {
             before(grammarAccess.getOpTypeAccess().getCommaKeyword_1_1_2_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getOpTypeAccess().getCommaKeyword_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpType__Group_1_1_2__0__Impl"


    // $ANTLR start "rule__OpType__Group_1_1_2__1"
    // InternalDataRetrieval.g:2265:1: rule__OpType__Group_1_1_2__1 : rule__OpType__Group_1_1_2__1__Impl ;
    public final void rule__OpType__Group_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2269:1: ( rule__OpType__Group_1_1_2__1__Impl )
            // InternalDataRetrieval.g:2270:2: rule__OpType__Group_1_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpType__Group_1_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpType__Group_1_1_2__1"


    // $ANTLR start "rule__OpType__Group_1_1_2__1__Impl"
    // InternalDataRetrieval.g:2276:1: rule__OpType__Group_1_1_2__1__Impl : ( ( rule__OpType__Key1Assignment_1_1_2_1 ) ) ;
    public final void rule__OpType__Group_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2280:1: ( ( ( rule__OpType__Key1Assignment_1_1_2_1 ) ) )
            // InternalDataRetrieval.g:2281:1: ( ( rule__OpType__Key1Assignment_1_1_2_1 ) )
            {
            // InternalDataRetrieval.g:2281:1: ( ( rule__OpType__Key1Assignment_1_1_2_1 ) )
            // InternalDataRetrieval.g:2282:2: ( rule__OpType__Key1Assignment_1_1_2_1 )
            {
             before(grammarAccess.getOpTypeAccess().getKey1Assignment_1_1_2_1()); 
            // InternalDataRetrieval.g:2283:2: ( rule__OpType__Key1Assignment_1_1_2_1 )
            // InternalDataRetrieval.g:2283:3: rule__OpType__Key1Assignment_1_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__OpType__Key1Assignment_1_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOpTypeAccess().getKey1Assignment_1_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpType__Group_1_1_2__1__Impl"


    // $ANTLR start "rule__Retrieve__DestAssignment_1"
    // InternalDataRetrieval.g:2292:1: rule__Retrieve__DestAssignment_1 : ( ruleDest ) ;
    public final void rule__Retrieve__DestAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2296:1: ( ( ruleDest ) )
            // InternalDataRetrieval.g:2297:2: ( ruleDest )
            {
            // InternalDataRetrieval.g:2297:2: ( ruleDest )
            // InternalDataRetrieval.g:2298:3: ruleDest
            {
             before(grammarAccess.getRetrieveAccess().getDestDestParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDest();

            state._fsp--;

             after(grammarAccess.getRetrieveAccess().getDestDestParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retrieve__DestAssignment_1"


    // $ANTLR start "rule__Retrieve__SourceFolderAssignment_2"
    // InternalDataRetrieval.g:2307:1: rule__Retrieve__SourceFolderAssignment_2 : ( ruleSourceFolder ) ;
    public final void rule__Retrieve__SourceFolderAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2311:1: ( ( ruleSourceFolder ) )
            // InternalDataRetrieval.g:2312:2: ( ruleSourceFolder )
            {
            // InternalDataRetrieval.g:2312:2: ( ruleSourceFolder )
            // InternalDataRetrieval.g:2313:3: ruleSourceFolder
            {
             before(grammarAccess.getRetrieveAccess().getSourceFolderSourceFolderParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSourceFolder();

            state._fsp--;

             after(grammarAccess.getRetrieveAccess().getSourceFolderSourceFolderParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retrieve__SourceFolderAssignment_2"


    // $ANTLR start "rule__Retrieve__ConfigListAssignment_4"
    // InternalDataRetrieval.g:2322:1: rule__Retrieve__ConfigListAssignment_4 : ( ruleConfigList ) ;
    public final void rule__Retrieve__ConfigListAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2326:1: ( ( ruleConfigList ) )
            // InternalDataRetrieval.g:2327:2: ( ruleConfigList )
            {
            // InternalDataRetrieval.g:2327:2: ( ruleConfigList )
            // InternalDataRetrieval.g:2328:3: ruleConfigList
            {
             before(grammarAccess.getRetrieveAccess().getConfigListConfigListParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleConfigList();

            state._fsp--;

             after(grammarAccess.getRetrieveAccess().getConfigListConfigListParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retrieve__ConfigListAssignment_4"


    // $ANTLR start "rule__Retrieve__OpListAssignment_5"
    // InternalDataRetrieval.g:2337:1: rule__Retrieve__OpListAssignment_5 : ( ruleOpList ) ;
    public final void rule__Retrieve__OpListAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2341:1: ( ( ruleOpList ) )
            // InternalDataRetrieval.g:2342:2: ( ruleOpList )
            {
            // InternalDataRetrieval.g:2342:2: ( ruleOpList )
            // InternalDataRetrieval.g:2343:3: ruleOpList
            {
             before(grammarAccess.getRetrieveAccess().getOpListOpListParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleOpList();

            state._fsp--;

             after(grammarAccess.getRetrieveAccess().getOpListOpListParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retrieve__OpListAssignment_5"


    // $ANTLR start "rule__Dest__NameAssignment_1"
    // InternalDataRetrieval.g:2352:1: rule__Dest__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Dest__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2356:1: ( ( RULE_STRING ) )
            // InternalDataRetrieval.g:2357:2: ( RULE_STRING )
            {
            // InternalDataRetrieval.g:2357:2: ( RULE_STRING )
            // InternalDataRetrieval.g:2358:3: RULE_STRING
            {
             before(grammarAccess.getDestAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDestAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dest__NameAssignment_1"


    // $ANTLR start "rule__SourceFolder__NameAssignment_1"
    // InternalDataRetrieval.g:2367:1: rule__SourceFolder__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__SourceFolder__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2371:1: ( ( RULE_STRING ) )
            // InternalDataRetrieval.g:2372:2: ( RULE_STRING )
            {
            // InternalDataRetrieval.g:2372:2: ( RULE_STRING )
            // InternalDataRetrieval.g:2373:3: RULE_STRING
            {
             before(grammarAccess.getSourceFolderAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSourceFolderAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceFolder__NameAssignment_1"


    // $ANTLR start "rule__ConfigList__SourceAssignment_2"
    // InternalDataRetrieval.g:2382:1: rule__ConfigList__SourceAssignment_2 : ( ruleSource ) ;
    public final void rule__ConfigList__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2386:1: ( ( ruleSource ) )
            // InternalDataRetrieval.g:2387:2: ( ruleSource )
            {
            // InternalDataRetrieval.g:2387:2: ( ruleSource )
            // InternalDataRetrieval.g:2388:3: ruleSource
            {
             before(grammarAccess.getConfigListAccess().getSourceSourceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSource();

            state._fsp--;

             after(grammarAccess.getConfigListAccess().getSourceSourceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigList__SourceAssignment_2"


    // $ANTLR start "rule__ConfigList__PathAssignment_3"
    // InternalDataRetrieval.g:2397:1: rule__ConfigList__PathAssignment_3 : ( rulePath ) ;
    public final void rule__ConfigList__PathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2401:1: ( ( rulePath ) )
            // InternalDataRetrieval.g:2402:2: ( rulePath )
            {
            // InternalDataRetrieval.g:2402:2: ( rulePath )
            // InternalDataRetrieval.g:2403:3: rulePath
            {
             before(grammarAccess.getConfigListAccess().getPathPathParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePath();

            state._fsp--;

             after(grammarAccess.getConfigListAccess().getPathPathParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigList__PathAssignment_3"


    // $ANTLR start "rule__ConfigList__KeysToExtractAssignment_4"
    // InternalDataRetrieval.g:2412:1: rule__ConfigList__KeysToExtractAssignment_4 : ( ruleKeysToExtract ) ;
    public final void rule__ConfigList__KeysToExtractAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2416:1: ( ( ruleKeysToExtract ) )
            // InternalDataRetrieval.g:2417:2: ( ruleKeysToExtract )
            {
            // InternalDataRetrieval.g:2417:2: ( ruleKeysToExtract )
            // InternalDataRetrieval.g:2418:3: ruleKeysToExtract
            {
             before(grammarAccess.getConfigListAccess().getKeysToExtractKeysToExtractParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleKeysToExtract();

            state._fsp--;

             after(grammarAccess.getConfigListAccess().getKeysToExtractKeysToExtractParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigList__KeysToExtractAssignment_4"


    // $ANTLR start "rule__ConfigList__RenameAllAssignment_5"
    // InternalDataRetrieval.g:2427:1: rule__ConfigList__RenameAllAssignment_5 : ( ruleRenameAll ) ;
    public final void rule__ConfigList__RenameAllAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2431:1: ( ( ruleRenameAll ) )
            // InternalDataRetrieval.g:2432:2: ( ruleRenameAll )
            {
            // InternalDataRetrieval.g:2432:2: ( ruleRenameAll )
            // InternalDataRetrieval.g:2433:3: ruleRenameAll
            {
             before(grammarAccess.getConfigListAccess().getRenameAllRenameAllParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRenameAll();

            state._fsp--;

             after(grammarAccess.getConfigListAccess().getRenameAllRenameAllParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigList__RenameAllAssignment_5"


    // $ANTLR start "rule__ConfigList__FilterAssignment_6_0"
    // InternalDataRetrieval.g:2442:1: rule__ConfigList__FilterAssignment_6_0 : ( ruleFilter ) ;
    public final void rule__ConfigList__FilterAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2446:1: ( ( ruleFilter ) )
            // InternalDataRetrieval.g:2447:2: ( ruleFilter )
            {
            // InternalDataRetrieval.g:2447:2: ( ruleFilter )
            // InternalDataRetrieval.g:2448:3: ruleFilter
            {
             before(grammarAccess.getConfigListAccess().getFilterFilterParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getConfigListAccess().getFilterFilterParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigList__FilterAssignment_6_0"


    // $ANTLR start "rule__ConfigList__ThresholdAssignment_6_1"
    // InternalDataRetrieval.g:2457:1: rule__ConfigList__ThresholdAssignment_6_1 : ( ruleThreshold ) ;
    public final void rule__ConfigList__ThresholdAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2461:1: ( ( ruleThreshold ) )
            // InternalDataRetrieval.g:2462:2: ( ruleThreshold )
            {
            // InternalDataRetrieval.g:2462:2: ( ruleThreshold )
            // InternalDataRetrieval.g:2463:3: ruleThreshold
            {
             before(grammarAccess.getConfigListAccess().getThresholdThresholdParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleThreshold();

            state._fsp--;

             after(grammarAccess.getConfigListAccess().getThresholdThresholdParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigList__ThresholdAssignment_6_1"


    // $ANTLR start "rule__OpList__OpTypeAssignment_2"
    // InternalDataRetrieval.g:2472:1: rule__OpList__OpTypeAssignment_2 : ( ruleOpType ) ;
    public final void rule__OpList__OpTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2476:1: ( ( ruleOpType ) )
            // InternalDataRetrieval.g:2477:2: ( ruleOpType )
            {
            // InternalDataRetrieval.g:2477:2: ( ruleOpType )
            // InternalDataRetrieval.g:2478:3: ruleOpType
            {
             before(grammarAccess.getOpListAccess().getOpTypeOpTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOpType();

            state._fsp--;

             after(grammarAccess.getOpListAccess().getOpTypeOpTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpList__OpTypeAssignment_2"


    // $ANTLR start "rule__Source__NameAssignment_1"
    // InternalDataRetrieval.g:2487:1: rule__Source__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Source__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2491:1: ( ( RULE_STRING ) )
            // InternalDataRetrieval.g:2492:2: ( RULE_STRING )
            {
            // InternalDataRetrieval.g:2492:2: ( RULE_STRING )
            // InternalDataRetrieval.g:2493:3: RULE_STRING
            {
             before(grammarAccess.getSourceAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__NameAssignment_1"


    // $ANTLR start "rule__Path__NameAssignment_1"
    // InternalDataRetrieval.g:2502:1: rule__Path__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Path__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2506:1: ( ( RULE_STRING ) )
            // InternalDataRetrieval.g:2507:2: ( RULE_STRING )
            {
            // InternalDataRetrieval.g:2507:2: ( RULE_STRING )
            // InternalDataRetrieval.g:2508:3: RULE_STRING
            {
             before(grammarAccess.getPathAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPathAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__NameAssignment_1"


    // $ANTLR start "rule__KeysToExtract__Key1Assignment_2"
    // InternalDataRetrieval.g:2517:1: rule__KeysToExtract__Key1Assignment_2 : ( ruleKey ) ;
    public final void rule__KeysToExtract__Key1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2521:1: ( ( ruleKey ) )
            // InternalDataRetrieval.g:2522:2: ( ruleKey )
            {
            // InternalDataRetrieval.g:2522:2: ( ruleKey )
            // InternalDataRetrieval.g:2523:3: ruleKey
            {
             before(grammarAccess.getKeysToExtractAccess().getKey1KeyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleKey();

            state._fsp--;

             after(grammarAccess.getKeysToExtractAccess().getKey1KeyParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeysToExtract__Key1Assignment_2"


    // $ANTLR start "rule__KeysToExtract__Key1Assignment_3_1"
    // InternalDataRetrieval.g:2532:1: rule__KeysToExtract__Key1Assignment_3_1 : ( ruleKey ) ;
    public final void rule__KeysToExtract__Key1Assignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2536:1: ( ( ruleKey ) )
            // InternalDataRetrieval.g:2537:2: ( ruleKey )
            {
            // InternalDataRetrieval.g:2537:2: ( ruleKey )
            // InternalDataRetrieval.g:2538:3: ruleKey
            {
             before(grammarAccess.getKeysToExtractAccess().getKey1KeyParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleKey();

            state._fsp--;

             after(grammarAccess.getKeysToExtractAccess().getKey1KeyParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeysToExtract__Key1Assignment_3_1"


    // $ANTLR start "rule__Key__NameAssignment_0"
    // InternalDataRetrieval.g:2547:1: rule__Key__NameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Key__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2551:1: ( ( RULE_STRING ) )
            // InternalDataRetrieval.g:2552:2: ( RULE_STRING )
            {
            // InternalDataRetrieval.g:2552:2: ( RULE_STRING )
            // InternalDataRetrieval.g:2553:3: RULE_STRING
            {
             before(grammarAccess.getKeyAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getKeyAccess().getNameSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__NameAssignment_0"


    // $ANTLR start "rule__Key__RenameAssignment_1_1"
    // InternalDataRetrieval.g:2562:1: rule__Key__RenameAssignment_1_1 : ( ruleRename ) ;
    public final void rule__Key__RenameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2566:1: ( ( ruleRename ) )
            // InternalDataRetrieval.g:2567:2: ( ruleRename )
            {
            // InternalDataRetrieval.g:2567:2: ( ruleRename )
            // InternalDataRetrieval.g:2568:3: ruleRename
            {
             before(grammarAccess.getKeyAccess().getRenameRenameParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRename();

            state._fsp--;

             after(grammarAccess.getKeyAccess().getRenameRenameParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__RenameAssignment_1_1"


    // $ANTLR start "rule__FullRename__NameAssignment_1"
    // InternalDataRetrieval.g:2577:1: rule__FullRename__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__FullRename__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2581:1: ( ( RULE_STRING ) )
            // InternalDataRetrieval.g:2582:2: ( RULE_STRING )
            {
            // InternalDataRetrieval.g:2582:2: ( RULE_STRING )
            // InternalDataRetrieval.g:2583:3: RULE_STRING
            {
             before(grammarAccess.getFullRenameAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFullRenameAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FullRename__NameAssignment_1"


    // $ANTLR start "rule__FullRename__NAssignment_2"
    // InternalDataRetrieval.g:2592:1: rule__FullRename__NAssignment_2 : ( ( 'N' ) ) ;
    public final void rule__FullRename__NAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2596:1: ( ( ( 'N' ) ) )
            // InternalDataRetrieval.g:2597:2: ( ( 'N' ) )
            {
            // InternalDataRetrieval.g:2597:2: ( ( 'N' ) )
            // InternalDataRetrieval.g:2598:3: ( 'N' )
            {
             before(grammarAccess.getFullRenameAccess().getNNKeyword_2_0()); 
            // InternalDataRetrieval.g:2599:3: ( 'N' )
            // InternalDataRetrieval.g:2600:4: 'N'
            {
             before(grammarAccess.getFullRenameAccess().getNNKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFullRenameAccess().getNNKeyword_2_0()); 

            }

             after(grammarAccess.getFullRenameAccess().getNNKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FullRename__NAssignment_2"


    // $ANTLR start "rule__AddPrefix__NameAssignment_1"
    // InternalDataRetrieval.g:2611:1: rule__AddPrefix__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__AddPrefix__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2615:1: ( ( RULE_STRING ) )
            // InternalDataRetrieval.g:2616:2: ( RULE_STRING )
            {
            // InternalDataRetrieval.g:2616:2: ( RULE_STRING )
            // InternalDataRetrieval.g:2617:3: RULE_STRING
            {
             before(grammarAccess.getAddPrefixAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAddPrefixAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddPrefix__NameAssignment_1"


    // $ANTLR start "rule__AddSuffix__NameAssignment_1"
    // InternalDataRetrieval.g:2626:1: rule__AddSuffix__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__AddSuffix__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2630:1: ( ( RULE_STRING ) )
            // InternalDataRetrieval.g:2631:2: ( RULE_STRING )
            {
            // InternalDataRetrieval.g:2631:2: ( RULE_STRING )
            // InternalDataRetrieval.g:2632:3: RULE_STRING
            {
             before(grammarAccess.getAddSuffixAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAddSuffixAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddSuffix__NameAssignment_1"


    // $ANTLR start "rule__Filter__NameAssignment_1"
    // InternalDataRetrieval.g:2641:1: rule__Filter__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Filter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2645:1: ( ( RULE_STRING ) )
            // InternalDataRetrieval.g:2646:2: ( RULE_STRING )
            {
            // InternalDataRetrieval.g:2646:2: ( RULE_STRING )
            // InternalDataRetrieval.g:2647:3: RULE_STRING
            {
             before(grammarAccess.getFilterAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__NameAssignment_1"


    // $ANTLR start "rule__TopN__ValueAssignment_1"
    // InternalDataRetrieval.g:2656:1: rule__TopN__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__TopN__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2660:1: ( ( RULE_INT ) )
            // InternalDataRetrieval.g:2661:2: ( RULE_INT )
            {
            // InternalDataRetrieval.g:2661:2: ( RULE_INT )
            // InternalDataRetrieval.g:2662:3: RULE_INT
            {
             before(grammarAccess.getTopNAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTopNAccess().getValueINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopN__ValueAssignment_1"


    // $ANTLR start "rule__BottomN__ValueAssignment_1"
    // InternalDataRetrieval.g:2671:1: rule__BottomN__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__BottomN__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2675:1: ( ( RULE_INT ) )
            // InternalDataRetrieval.g:2676:2: ( RULE_INT )
            {
            // InternalDataRetrieval.g:2676:2: ( RULE_INT )
            // InternalDataRetrieval.g:2677:3: RULE_INT
            {
             before(grammarAccess.getBottomNAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBottomNAccess().getValueINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BottomN__ValueAssignment_1"


    // $ANTLR start "rule__OpType__AverageAssignment_0_0"
    // InternalDataRetrieval.g:2686:1: rule__OpType__AverageAssignment_0_0 : ( ( 'average=' ) ) ;
    public final void rule__OpType__AverageAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2690:1: ( ( ( 'average=' ) ) )
            // InternalDataRetrieval.g:2691:2: ( ( 'average=' ) )
            {
            // InternalDataRetrieval.g:2691:2: ( ( 'average=' ) )
            // InternalDataRetrieval.g:2692:3: ( 'average=' )
            {
             before(grammarAccess.getOpTypeAccess().getAverageAverageKeyword_0_0_0()); 
            // InternalDataRetrieval.g:2693:3: ( 'average=' )
            // InternalDataRetrieval.g:2694:4: 'average='
            {
             before(grammarAccess.getOpTypeAccess().getAverageAverageKeyword_0_0_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getOpTypeAccess().getAverageAverageKeyword_0_0_0()); 

            }

             after(grammarAccess.getOpTypeAccess().getAverageAverageKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpType__AverageAssignment_0_0"


    // $ANTLR start "rule__OpType__SumAssignment_0_1"
    // InternalDataRetrieval.g:2705:1: rule__OpType__SumAssignment_0_1 : ( ( 'sum=' ) ) ;
    public final void rule__OpType__SumAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2709:1: ( ( ( 'sum=' ) ) )
            // InternalDataRetrieval.g:2710:2: ( ( 'sum=' ) )
            {
            // InternalDataRetrieval.g:2710:2: ( ( 'sum=' ) )
            // InternalDataRetrieval.g:2711:3: ( 'sum=' )
            {
             before(grammarAccess.getOpTypeAccess().getSumSumKeyword_0_1_0()); 
            // InternalDataRetrieval.g:2712:3: ( 'sum=' )
            // InternalDataRetrieval.g:2713:4: 'sum='
            {
             before(grammarAccess.getOpTypeAccess().getSumSumKeyword_0_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getOpTypeAccess().getSumSumKeyword_0_1_0()); 

            }

             after(grammarAccess.getOpTypeAccess().getSumSumKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpType__SumAssignment_0_1"


    // $ANTLR start "rule__OpType__AllAssignment_1_0"
    // InternalDataRetrieval.g:2724:1: rule__OpType__AllAssignment_1_0 : ( ( 'all' ) ) ;
    public final void rule__OpType__AllAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2728:1: ( ( ( 'all' ) ) )
            // InternalDataRetrieval.g:2729:2: ( ( 'all' ) )
            {
            // InternalDataRetrieval.g:2729:2: ( ( 'all' ) )
            // InternalDataRetrieval.g:2730:3: ( 'all' )
            {
             before(grammarAccess.getOpTypeAccess().getAllAllKeyword_1_0_0()); 
            // InternalDataRetrieval.g:2731:3: ( 'all' )
            // InternalDataRetrieval.g:2732:4: 'all'
            {
             before(grammarAccess.getOpTypeAccess().getAllAllKeyword_1_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getOpTypeAccess().getAllAllKeyword_1_0_0()); 

            }

             after(grammarAccess.getOpTypeAccess().getAllAllKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpType__AllAssignment_1_0"


    // $ANTLR start "rule__OpType__Key1Assignment_1_1_1"
    // InternalDataRetrieval.g:2743:1: rule__OpType__Key1Assignment_1_1_1 : ( ruleKey ) ;
    public final void rule__OpType__Key1Assignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2747:1: ( ( ruleKey ) )
            // InternalDataRetrieval.g:2748:2: ( ruleKey )
            {
            // InternalDataRetrieval.g:2748:2: ( ruleKey )
            // InternalDataRetrieval.g:2749:3: ruleKey
            {
             before(grammarAccess.getOpTypeAccess().getKey1KeyParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleKey();

            state._fsp--;

             after(grammarAccess.getOpTypeAccess().getKey1KeyParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpType__Key1Assignment_1_1_1"


    // $ANTLR start "rule__OpType__Key1Assignment_1_1_2_1"
    // InternalDataRetrieval.g:2758:1: rule__OpType__Key1Assignment_1_1_2_1 : ( ruleKey ) ;
    public final void rule__OpType__Key1Assignment_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataRetrieval.g:2762:1: ( ( ruleKey ) )
            // InternalDataRetrieval.g:2763:2: ( ruleKey )
            {
            // InternalDataRetrieval.g:2763:2: ( ruleKey )
            // InternalDataRetrieval.g:2764:3: ruleKey
            {
             before(grammarAccess.getOpTypeAccess().getKey1KeyParserRuleCall_1_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleKey();

            state._fsp--;

             after(grammarAccess.getOpTypeAccess().getKey1KeyParserRuleCall_1_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpType__Key1Assignment_1_1_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000E182000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000440000000L});

}