package org.xtext.example.dr.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.dr.services.DataRetrievalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDataRetrievalParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'retrieve'", "'{'", "'}'", "'destination='", "'folder='", "'extraction'", "'operation'", "'source='", "'path='", "'get=['", "','", "']'", "'->'", "'rename='", "'N'", "'prepend='", "'append='", "'filter='", "'top='", "'bottom='", "'average='", "'sum='", "'all'", "'['"
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

        public InternalDataRetrievalParser(TokenStream input, DataRetrievalGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Retrieve";
       	}

       	@Override
       	protected DataRetrievalGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRetrieve"
    // InternalDataRetrieval.g:64:1: entryRuleRetrieve returns [EObject current=null] : iv_ruleRetrieve= ruleRetrieve EOF ;
    public final EObject entryRuleRetrieve() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetrieve = null;


        try {
            // InternalDataRetrieval.g:64:49: (iv_ruleRetrieve= ruleRetrieve EOF )
            // InternalDataRetrieval.g:65:2: iv_ruleRetrieve= ruleRetrieve EOF
            {
             newCompositeNode(grammarAccess.getRetrieveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRetrieve=ruleRetrieve();

            state._fsp--;

             current =iv_ruleRetrieve; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRetrieve"


    // $ANTLR start "ruleRetrieve"
    // InternalDataRetrieval.g:71:1: ruleRetrieve returns [EObject current=null] : (otherlv_0= 'retrieve' ( (lv_dest_1_0= ruleDest ) ) ( (lv_sourceFolder_2_0= ruleSourceFolder ) )? otherlv_3= '{' ( (lv_configList_4_0= ruleConfigList ) )+ ( (lv_opList_5_0= ruleOpList ) )* otherlv_6= '}' ) ;
    public final EObject ruleRetrieve() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_dest_1_0 = null;

        EObject lv_sourceFolder_2_0 = null;

        EObject lv_configList_4_0 = null;

        EObject lv_opList_5_0 = null;



        	enterRule();

        try {
            // InternalDataRetrieval.g:77:2: ( (otherlv_0= 'retrieve' ( (lv_dest_1_0= ruleDest ) ) ( (lv_sourceFolder_2_0= ruleSourceFolder ) )? otherlv_3= '{' ( (lv_configList_4_0= ruleConfigList ) )+ ( (lv_opList_5_0= ruleOpList ) )* otherlv_6= '}' ) )
            // InternalDataRetrieval.g:78:2: (otherlv_0= 'retrieve' ( (lv_dest_1_0= ruleDest ) ) ( (lv_sourceFolder_2_0= ruleSourceFolder ) )? otherlv_3= '{' ( (lv_configList_4_0= ruleConfigList ) )+ ( (lv_opList_5_0= ruleOpList ) )* otherlv_6= '}' )
            {
            // InternalDataRetrieval.g:78:2: (otherlv_0= 'retrieve' ( (lv_dest_1_0= ruleDest ) ) ( (lv_sourceFolder_2_0= ruleSourceFolder ) )? otherlv_3= '{' ( (lv_configList_4_0= ruleConfigList ) )+ ( (lv_opList_5_0= ruleOpList ) )* otherlv_6= '}' )
            // InternalDataRetrieval.g:79:3: otherlv_0= 'retrieve' ( (lv_dest_1_0= ruleDest ) ) ( (lv_sourceFolder_2_0= ruleSourceFolder ) )? otherlv_3= '{' ( (lv_configList_4_0= ruleConfigList ) )+ ( (lv_opList_5_0= ruleOpList ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRetrieveAccess().getRetrieveKeyword_0());
            		
            // InternalDataRetrieval.g:83:3: ( (lv_dest_1_0= ruleDest ) )
            // InternalDataRetrieval.g:84:4: (lv_dest_1_0= ruleDest )
            {
            // InternalDataRetrieval.g:84:4: (lv_dest_1_0= ruleDest )
            // InternalDataRetrieval.g:85:5: lv_dest_1_0= ruleDest
            {

            					newCompositeNode(grammarAccess.getRetrieveAccess().getDestDestParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_dest_1_0=ruleDest();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRetrieveRule());
            					}
            					set(
            						current,
            						"dest",
            						lv_dest_1_0,
            						"org.xtext.example.dr.DataRetrieval.Dest");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDataRetrieval.g:102:3: ( (lv_sourceFolder_2_0= ruleSourceFolder ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDataRetrieval.g:103:4: (lv_sourceFolder_2_0= ruleSourceFolder )
                    {
                    // InternalDataRetrieval.g:103:4: (lv_sourceFolder_2_0= ruleSourceFolder )
                    // InternalDataRetrieval.g:104:5: lv_sourceFolder_2_0= ruleSourceFolder
                    {

                    					newCompositeNode(grammarAccess.getRetrieveAccess().getSourceFolderSourceFolderParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_sourceFolder_2_0=ruleSourceFolder();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRetrieveRule());
                    					}
                    					set(
                    						current,
                    						"sourceFolder",
                    						lv_sourceFolder_2_0,
                    						"org.xtext.example.dr.DataRetrieval.SourceFolder");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getRetrieveAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDataRetrieval.g:125:3: ( (lv_configList_4_0= ruleConfigList ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDataRetrieval.g:126:4: (lv_configList_4_0= ruleConfigList )
            	    {
            	    // InternalDataRetrieval.g:126:4: (lv_configList_4_0= ruleConfigList )
            	    // InternalDataRetrieval.g:127:5: lv_configList_4_0= ruleConfigList
            	    {

            	    					newCompositeNode(grammarAccess.getRetrieveAccess().getConfigListConfigListParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_configList_4_0=ruleConfigList();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRetrieveRule());
            	    					}
            	    					add(
            	    						current,
            	    						"configList",
            	    						lv_configList_4_0,
            	    						"org.xtext.example.dr.DataRetrieval.ConfigList");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // InternalDataRetrieval.g:144:3: ( (lv_opList_5_0= ruleOpList ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDataRetrieval.g:145:4: (lv_opList_5_0= ruleOpList )
            	    {
            	    // InternalDataRetrieval.g:145:4: (lv_opList_5_0= ruleOpList )
            	    // InternalDataRetrieval.g:146:5: lv_opList_5_0= ruleOpList
            	    {

            	    					newCompositeNode(grammarAccess.getRetrieveAccess().getOpListOpListParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_opList_5_0=ruleOpList();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRetrieveRule());
            	    					}
            	    					add(
            	    						current,
            	    						"opList",
            	    						lv_opList_5_0,
            	    						"org.xtext.example.dr.DataRetrieval.OpList");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRetrieveAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRetrieve"


    // $ANTLR start "entryRuleDest"
    // InternalDataRetrieval.g:171:1: entryRuleDest returns [EObject current=null] : iv_ruleDest= ruleDest EOF ;
    public final EObject entryRuleDest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDest = null;


        try {
            // InternalDataRetrieval.g:171:45: (iv_ruleDest= ruleDest EOF )
            // InternalDataRetrieval.g:172:2: iv_ruleDest= ruleDest EOF
            {
             newCompositeNode(grammarAccess.getDestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDest=ruleDest();

            state._fsp--;

             current =iv_ruleDest; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDest"


    // $ANTLR start "ruleDest"
    // InternalDataRetrieval.g:178:1: ruleDest returns [EObject current=null] : (otherlv_0= 'destination=' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDataRetrieval.g:184:2: ( (otherlv_0= 'destination=' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalDataRetrieval.g:185:2: (otherlv_0= 'destination=' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalDataRetrieval.g:185:2: (otherlv_0= 'destination=' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalDataRetrieval.g:186:3: otherlv_0= 'destination=' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDestAccess().getDestinationKeyword_0());
            		
            // InternalDataRetrieval.g:190:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDataRetrieval.g:191:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDataRetrieval.g:191:4: (lv_name_1_0= RULE_STRING )
            // InternalDataRetrieval.g:192:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDestAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDest"


    // $ANTLR start "entryRuleSourceFolder"
    // InternalDataRetrieval.g:212:1: entryRuleSourceFolder returns [EObject current=null] : iv_ruleSourceFolder= ruleSourceFolder EOF ;
    public final EObject entryRuleSourceFolder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceFolder = null;


        try {
            // InternalDataRetrieval.g:212:53: (iv_ruleSourceFolder= ruleSourceFolder EOF )
            // InternalDataRetrieval.g:213:2: iv_ruleSourceFolder= ruleSourceFolder EOF
            {
             newCompositeNode(grammarAccess.getSourceFolderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSourceFolder=ruleSourceFolder();

            state._fsp--;

             current =iv_ruleSourceFolder; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSourceFolder"


    // $ANTLR start "ruleSourceFolder"
    // InternalDataRetrieval.g:219:1: ruleSourceFolder returns [EObject current=null] : (otherlv_0= 'folder=' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleSourceFolder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDataRetrieval.g:225:2: ( (otherlv_0= 'folder=' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalDataRetrieval.g:226:2: (otherlv_0= 'folder=' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalDataRetrieval.g:226:2: (otherlv_0= 'folder=' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalDataRetrieval.g:227:3: otherlv_0= 'folder=' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSourceFolderAccess().getFolderKeyword_0());
            		
            // InternalDataRetrieval.g:231:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDataRetrieval.g:232:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDataRetrieval.g:232:4: (lv_name_1_0= RULE_STRING )
            // InternalDataRetrieval.g:233:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSourceFolderAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSourceFolderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSourceFolder"


    // $ANTLR start "entryRuleConfigList"
    // InternalDataRetrieval.g:253:1: entryRuleConfigList returns [EObject current=null] : iv_ruleConfigList= ruleConfigList EOF ;
    public final EObject entryRuleConfigList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigList = null;


        try {
            // InternalDataRetrieval.g:253:51: (iv_ruleConfigList= ruleConfigList EOF )
            // InternalDataRetrieval.g:254:2: iv_ruleConfigList= ruleConfigList EOF
            {
             newCompositeNode(grammarAccess.getConfigListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfigList=ruleConfigList();

            state._fsp--;

             current =iv_ruleConfigList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfigList"


    // $ANTLR start "ruleConfigList"
    // InternalDataRetrieval.g:260:1: ruleConfigList returns [EObject current=null] : (otherlv_0= 'extraction' otherlv_1= '{' ( (lv_source_2_0= ruleSource ) ) ( (lv_path_3_0= rulePath ) )? ( (lv_keysToExtract_4_0= ruleKeysToExtract ) )? ( (lv_renameAll_5_0= ruleRenameAll ) )? ( ( (lv_filter_6_0= ruleFilter ) ) ( (lv_threshold_7_0= ruleThreshold ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleConfigList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_8=null;
        EObject lv_source_2_0 = null;

        EObject lv_path_3_0 = null;

        EObject lv_keysToExtract_4_0 = null;

        EObject lv_renameAll_5_0 = null;

        EObject lv_filter_6_0 = null;

        EObject lv_threshold_7_0 = null;



        	enterRule();

        try {
            // InternalDataRetrieval.g:266:2: ( (otherlv_0= 'extraction' otherlv_1= '{' ( (lv_source_2_0= ruleSource ) ) ( (lv_path_3_0= rulePath ) )? ( (lv_keysToExtract_4_0= ruleKeysToExtract ) )? ( (lv_renameAll_5_0= ruleRenameAll ) )? ( ( (lv_filter_6_0= ruleFilter ) ) ( (lv_threshold_7_0= ruleThreshold ) ) )? otherlv_8= '}' ) )
            // InternalDataRetrieval.g:267:2: (otherlv_0= 'extraction' otherlv_1= '{' ( (lv_source_2_0= ruleSource ) ) ( (lv_path_3_0= rulePath ) )? ( (lv_keysToExtract_4_0= ruleKeysToExtract ) )? ( (lv_renameAll_5_0= ruleRenameAll ) )? ( ( (lv_filter_6_0= ruleFilter ) ) ( (lv_threshold_7_0= ruleThreshold ) ) )? otherlv_8= '}' )
            {
            // InternalDataRetrieval.g:267:2: (otherlv_0= 'extraction' otherlv_1= '{' ( (lv_source_2_0= ruleSource ) ) ( (lv_path_3_0= rulePath ) )? ( (lv_keysToExtract_4_0= ruleKeysToExtract ) )? ( (lv_renameAll_5_0= ruleRenameAll ) )? ( ( (lv_filter_6_0= ruleFilter ) ) ( (lv_threshold_7_0= ruleThreshold ) ) )? otherlv_8= '}' )
            // InternalDataRetrieval.g:268:3: otherlv_0= 'extraction' otherlv_1= '{' ( (lv_source_2_0= ruleSource ) ) ( (lv_path_3_0= rulePath ) )? ( (lv_keysToExtract_4_0= ruleKeysToExtract ) )? ( (lv_renameAll_5_0= ruleRenameAll ) )? ( ( (lv_filter_6_0= ruleFilter ) ) ( (lv_threshold_7_0= ruleThreshold ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigListAccess().getExtractionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getConfigListAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDataRetrieval.g:276:3: ( (lv_source_2_0= ruleSource ) )
            // InternalDataRetrieval.g:277:4: (lv_source_2_0= ruleSource )
            {
            // InternalDataRetrieval.g:277:4: (lv_source_2_0= ruleSource )
            // InternalDataRetrieval.g:278:5: lv_source_2_0= ruleSource
            {

            					newCompositeNode(grammarAccess.getConfigListAccess().getSourceSourceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_source_2_0=ruleSource();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfigListRule());
            					}
            					set(
            						current,
            						"source",
            						lv_source_2_0,
            						"org.xtext.example.dr.DataRetrieval.Source");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDataRetrieval.g:295:3: ( (lv_path_3_0= rulePath ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDataRetrieval.g:296:4: (lv_path_3_0= rulePath )
                    {
                    // InternalDataRetrieval.g:296:4: (lv_path_3_0= rulePath )
                    // InternalDataRetrieval.g:297:5: lv_path_3_0= rulePath
                    {

                    					newCompositeNode(grammarAccess.getConfigListAccess().getPathPathParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_path_3_0=rulePath();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConfigListRule());
                    					}
                    					set(
                    						current,
                    						"path",
                    						lv_path_3_0,
                    						"org.xtext.example.dr.DataRetrieval.Path");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDataRetrieval.g:314:3: ( (lv_keysToExtract_4_0= ruleKeysToExtract ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDataRetrieval.g:315:4: (lv_keysToExtract_4_0= ruleKeysToExtract )
                    {
                    // InternalDataRetrieval.g:315:4: (lv_keysToExtract_4_0= ruleKeysToExtract )
                    // InternalDataRetrieval.g:316:5: lv_keysToExtract_4_0= ruleKeysToExtract
                    {

                    					newCompositeNode(grammarAccess.getConfigListAccess().getKeysToExtractKeysToExtractParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_keysToExtract_4_0=ruleKeysToExtract();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConfigListRule());
                    					}
                    					set(
                    						current,
                    						"keysToExtract",
                    						lv_keysToExtract_4_0,
                    						"org.xtext.example.dr.DataRetrieval.KeysToExtract");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDataRetrieval.g:333:3: ( (lv_renameAll_5_0= ruleRenameAll ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=26 && LA6_0<=27)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDataRetrieval.g:334:4: (lv_renameAll_5_0= ruleRenameAll )
                    {
                    // InternalDataRetrieval.g:334:4: (lv_renameAll_5_0= ruleRenameAll )
                    // InternalDataRetrieval.g:335:5: lv_renameAll_5_0= ruleRenameAll
                    {

                    					newCompositeNode(grammarAccess.getConfigListAccess().getRenameAllRenameAllParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_renameAll_5_0=ruleRenameAll();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConfigListRule());
                    					}
                    					set(
                    						current,
                    						"renameAll",
                    						lv_renameAll_5_0,
                    						"org.xtext.example.dr.DataRetrieval.RenameAll");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDataRetrieval.g:352:3: ( ( (lv_filter_6_0= ruleFilter ) ) ( (lv_threshold_7_0= ruleThreshold ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDataRetrieval.g:353:4: ( (lv_filter_6_0= ruleFilter ) ) ( (lv_threshold_7_0= ruleThreshold ) )
                    {
                    // InternalDataRetrieval.g:353:4: ( (lv_filter_6_0= ruleFilter ) )
                    // InternalDataRetrieval.g:354:5: (lv_filter_6_0= ruleFilter )
                    {
                    // InternalDataRetrieval.g:354:5: (lv_filter_6_0= ruleFilter )
                    // InternalDataRetrieval.g:355:6: lv_filter_6_0= ruleFilter
                    {

                    						newCompositeNode(grammarAccess.getConfigListAccess().getFilterFilterParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_filter_6_0=ruleFilter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConfigListRule());
                    						}
                    						set(
                    							current,
                    							"filter",
                    							lv_filter_6_0,
                    							"org.xtext.example.dr.DataRetrieval.Filter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataRetrieval.g:372:4: ( (lv_threshold_7_0= ruleThreshold ) )
                    // InternalDataRetrieval.g:373:5: (lv_threshold_7_0= ruleThreshold )
                    {
                    // InternalDataRetrieval.g:373:5: (lv_threshold_7_0= ruleThreshold )
                    // InternalDataRetrieval.g:374:6: lv_threshold_7_0= ruleThreshold
                    {

                    						newCompositeNode(grammarAccess.getConfigListAccess().getThresholdThresholdParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_threshold_7_0=ruleThreshold();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConfigListRule());
                    						}
                    						set(
                    							current,
                    							"threshold",
                    							lv_threshold_7_0,
                    							"org.xtext.example.dr.DataRetrieval.Threshold");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getConfigListAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfigList"


    // $ANTLR start "entryRuleOpList"
    // InternalDataRetrieval.g:400:1: entryRuleOpList returns [EObject current=null] : iv_ruleOpList= ruleOpList EOF ;
    public final EObject entryRuleOpList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpList = null;


        try {
            // InternalDataRetrieval.g:400:47: (iv_ruleOpList= ruleOpList EOF )
            // InternalDataRetrieval.g:401:2: iv_ruleOpList= ruleOpList EOF
            {
             newCompositeNode(grammarAccess.getOpListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpList=ruleOpList();

            state._fsp--;

             current =iv_ruleOpList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpList"


    // $ANTLR start "ruleOpList"
    // InternalDataRetrieval.g:407:1: ruleOpList returns [EObject current=null] : (otherlv_0= 'operation' otherlv_1= '{' ( (lv_opType_2_0= ruleOpType ) ) otherlv_3= '}' ) ;
    public final EObject ruleOpList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_opType_2_0 = null;



        	enterRule();

        try {
            // InternalDataRetrieval.g:413:2: ( (otherlv_0= 'operation' otherlv_1= '{' ( (lv_opType_2_0= ruleOpType ) ) otherlv_3= '}' ) )
            // InternalDataRetrieval.g:414:2: (otherlv_0= 'operation' otherlv_1= '{' ( (lv_opType_2_0= ruleOpType ) ) otherlv_3= '}' )
            {
            // InternalDataRetrieval.g:414:2: (otherlv_0= 'operation' otherlv_1= '{' ( (lv_opType_2_0= ruleOpType ) ) otherlv_3= '}' )
            // InternalDataRetrieval.g:415:3: otherlv_0= 'operation' otherlv_1= '{' ( (lv_opType_2_0= ruleOpType ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getOpListAccess().getOperationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getOpListAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDataRetrieval.g:423:3: ( (lv_opType_2_0= ruleOpType ) )
            // InternalDataRetrieval.g:424:4: (lv_opType_2_0= ruleOpType )
            {
            // InternalDataRetrieval.g:424:4: (lv_opType_2_0= ruleOpType )
            // InternalDataRetrieval.g:425:5: lv_opType_2_0= ruleOpType
            {

            					newCompositeNode(grammarAccess.getOpListAccess().getOpTypeOpTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_opType_2_0=ruleOpType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOpListRule());
            					}
            					set(
            						current,
            						"opType",
            						lv_opType_2_0,
            						"org.xtext.example.dr.DataRetrieval.OpType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getOpListAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpList"


    // $ANTLR start "entryRuleSource"
    // InternalDataRetrieval.g:450:1: entryRuleSource returns [EObject current=null] : iv_ruleSource= ruleSource EOF ;
    public final EObject entryRuleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSource = null;


        try {
            // InternalDataRetrieval.g:450:47: (iv_ruleSource= ruleSource EOF )
            // InternalDataRetrieval.g:451:2: iv_ruleSource= ruleSource EOF
            {
             newCompositeNode(grammarAccess.getSourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSource=ruleSource();

            state._fsp--;

             current =iv_ruleSource; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSource"


    // $ANTLR start "ruleSource"
    // InternalDataRetrieval.g:457:1: ruleSource returns [EObject current=null] : (otherlv_0= 'source=' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDataRetrieval.g:463:2: ( (otherlv_0= 'source=' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalDataRetrieval.g:464:2: (otherlv_0= 'source=' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalDataRetrieval.g:464:2: (otherlv_0= 'source=' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalDataRetrieval.g:465:3: otherlv_0= 'source=' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSourceAccess().getSourceKeyword_0());
            		
            // InternalDataRetrieval.g:469:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDataRetrieval.g:470:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDataRetrieval.g:470:4: (lv_name_1_0= RULE_STRING )
            // InternalDataRetrieval.g:471:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSourceAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSource"


    // $ANTLR start "entryRulePath"
    // InternalDataRetrieval.g:491:1: entryRulePath returns [EObject current=null] : iv_rulePath= rulePath EOF ;
    public final EObject entryRulePath() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePath = null;


        try {
            // InternalDataRetrieval.g:491:45: (iv_rulePath= rulePath EOF )
            // InternalDataRetrieval.g:492:2: iv_rulePath= rulePath EOF
            {
             newCompositeNode(grammarAccess.getPathRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePath=rulePath();

            state._fsp--;

             current =iv_rulePath; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePath"


    // $ANTLR start "rulePath"
    // InternalDataRetrieval.g:498:1: rulePath returns [EObject current=null] : (otherlv_0= 'path=' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject rulePath() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDataRetrieval.g:504:2: ( (otherlv_0= 'path=' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalDataRetrieval.g:505:2: (otherlv_0= 'path=' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalDataRetrieval.g:505:2: (otherlv_0= 'path=' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalDataRetrieval.g:506:3: otherlv_0= 'path=' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPathAccess().getPathKeyword_0());
            		
            // InternalDataRetrieval.g:510:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDataRetrieval.g:511:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDataRetrieval.g:511:4: (lv_name_1_0= RULE_STRING )
            // InternalDataRetrieval.g:512:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPathAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPathRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePath"


    // $ANTLR start "entryRuleKeysToExtract"
    // InternalDataRetrieval.g:532:1: entryRuleKeysToExtract returns [EObject current=null] : iv_ruleKeysToExtract= ruleKeysToExtract EOF ;
    public final EObject entryRuleKeysToExtract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeysToExtract = null;


        try {
            // InternalDataRetrieval.g:532:54: (iv_ruleKeysToExtract= ruleKeysToExtract EOF )
            // InternalDataRetrieval.g:533:2: iv_ruleKeysToExtract= ruleKeysToExtract EOF
            {
             newCompositeNode(grammarAccess.getKeysToExtractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKeysToExtract=ruleKeysToExtract();

            state._fsp--;

             current =iv_ruleKeysToExtract; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeysToExtract"


    // $ANTLR start "ruleKeysToExtract"
    // InternalDataRetrieval.g:539:1: ruleKeysToExtract returns [EObject current=null] : ( () otherlv_1= 'get=[' ( (lv_key1_2_0= ruleKey ) ) (otherlv_3= ',' ( (lv_key1_4_0= ruleKey ) ) )* otherlv_5= ']' ) ;
    public final EObject ruleKeysToExtract() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_key1_2_0 = null;

        EObject lv_key1_4_0 = null;



        	enterRule();

        try {
            // InternalDataRetrieval.g:545:2: ( ( () otherlv_1= 'get=[' ( (lv_key1_2_0= ruleKey ) ) (otherlv_3= ',' ( (lv_key1_4_0= ruleKey ) ) )* otherlv_5= ']' ) )
            // InternalDataRetrieval.g:546:2: ( () otherlv_1= 'get=[' ( (lv_key1_2_0= ruleKey ) ) (otherlv_3= ',' ( (lv_key1_4_0= ruleKey ) ) )* otherlv_5= ']' )
            {
            // InternalDataRetrieval.g:546:2: ( () otherlv_1= 'get=[' ( (lv_key1_2_0= ruleKey ) ) (otherlv_3= ',' ( (lv_key1_4_0= ruleKey ) ) )* otherlv_5= ']' )
            // InternalDataRetrieval.g:547:3: () otherlv_1= 'get=[' ( (lv_key1_2_0= ruleKey ) ) (otherlv_3= ',' ( (lv_key1_4_0= ruleKey ) ) )* otherlv_5= ']'
            {
            // InternalDataRetrieval.g:547:3: ()
            // InternalDataRetrieval.g:548:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getKeysToExtractAccess().getKeysToExtractAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getKeysToExtractAccess().getGetKeyword_1());
            		
            // InternalDataRetrieval.g:558:3: ( (lv_key1_2_0= ruleKey ) )
            // InternalDataRetrieval.g:559:4: (lv_key1_2_0= ruleKey )
            {
            // InternalDataRetrieval.g:559:4: (lv_key1_2_0= ruleKey )
            // InternalDataRetrieval.g:560:5: lv_key1_2_0= ruleKey
            {

            					newCompositeNode(grammarAccess.getKeysToExtractAccess().getKey1KeyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_key1_2_0=ruleKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKeysToExtractRule());
            					}
            					add(
            						current,
            						"key1",
            						lv_key1_2_0,
            						"org.xtext.example.dr.DataRetrieval.Key");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDataRetrieval.g:577:3: (otherlv_3= ',' ( (lv_key1_4_0= ruleKey ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDataRetrieval.g:578:4: otherlv_3= ',' ( (lv_key1_4_0= ruleKey ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_9); 

            	    				newLeafNode(otherlv_3, grammarAccess.getKeysToExtractAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalDataRetrieval.g:582:4: ( (lv_key1_4_0= ruleKey ) )
            	    // InternalDataRetrieval.g:583:5: (lv_key1_4_0= ruleKey )
            	    {
            	    // InternalDataRetrieval.g:583:5: (lv_key1_4_0= ruleKey )
            	    // InternalDataRetrieval.g:584:6: lv_key1_4_0= ruleKey
            	    {

            	    						newCompositeNode(grammarAccess.getKeysToExtractAccess().getKey1KeyParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_key1_4_0=ruleKey();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getKeysToExtractRule());
            	    						}
            	    						add(
            	    							current,
            	    							"key1",
            	    							lv_key1_4_0,
            	    							"org.xtext.example.dr.DataRetrieval.Key");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getKeysToExtractAccess().getRightSquareBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKeysToExtract"


    // $ANTLR start "entryRuleKey"
    // InternalDataRetrieval.g:610:1: entryRuleKey returns [EObject current=null] : iv_ruleKey= ruleKey EOF ;
    public final EObject entryRuleKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKey = null;


        try {
            // InternalDataRetrieval.g:610:44: (iv_ruleKey= ruleKey EOF )
            // InternalDataRetrieval.g:611:2: iv_ruleKey= ruleKey EOF
            {
             newCompositeNode(grammarAccess.getKeyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKey=ruleKey();

            state._fsp--;

             current =iv_ruleKey; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKey"


    // $ANTLR start "ruleKey"
    // InternalDataRetrieval.g:617:1: ruleKey returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) (otherlv_1= '->' ( (lv_rename_2_0= ruleRename ) ) )? ) ;
    public final EObject ruleKey() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_rename_2_0 = null;



        	enterRule();

        try {
            // InternalDataRetrieval.g:623:2: ( ( ( (lv_name_0_0= RULE_STRING ) ) (otherlv_1= '->' ( (lv_rename_2_0= ruleRename ) ) )? ) )
            // InternalDataRetrieval.g:624:2: ( ( (lv_name_0_0= RULE_STRING ) ) (otherlv_1= '->' ( (lv_rename_2_0= ruleRename ) ) )? )
            {
            // InternalDataRetrieval.g:624:2: ( ( (lv_name_0_0= RULE_STRING ) ) (otherlv_1= '->' ( (lv_rename_2_0= ruleRename ) ) )? )
            // InternalDataRetrieval.g:625:3: ( (lv_name_0_0= RULE_STRING ) ) (otherlv_1= '->' ( (lv_rename_2_0= ruleRename ) ) )?
            {
            // InternalDataRetrieval.g:625:3: ( (lv_name_0_0= RULE_STRING ) )
            // InternalDataRetrieval.g:626:4: (lv_name_0_0= RULE_STRING )
            {
            // InternalDataRetrieval.g:626:4: (lv_name_0_0= RULE_STRING )
            // InternalDataRetrieval.g:627:5: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_name_0_0, grammarAccess.getKeyAccess().getNameSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKeyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDataRetrieval.g:643:3: (otherlv_1= '->' ( (lv_rename_2_0= ruleRename ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDataRetrieval.g:644:4: otherlv_1= '->' ( (lv_rename_2_0= ruleRename ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_20); 

                    				newLeafNode(otherlv_1, grammarAccess.getKeyAccess().getHyphenMinusGreaterThanSignKeyword_1_0());
                    			
                    // InternalDataRetrieval.g:648:4: ( (lv_rename_2_0= ruleRename ) )
                    // InternalDataRetrieval.g:649:5: (lv_rename_2_0= ruleRename )
                    {
                    // InternalDataRetrieval.g:649:5: (lv_rename_2_0= ruleRename )
                    // InternalDataRetrieval.g:650:6: lv_rename_2_0= ruleRename
                    {

                    						newCompositeNode(grammarAccess.getKeyAccess().getRenameRenameParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rename_2_0=ruleRename();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getKeyRule());
                    						}
                    						set(
                    							current,
                    							"rename",
                    							lv_rename_2_0,
                    							"org.xtext.example.dr.DataRetrieval.Rename");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKey"


    // $ANTLR start "entryRuleRename"
    // InternalDataRetrieval.g:672:1: entryRuleRename returns [EObject current=null] : iv_ruleRename= ruleRename EOF ;
    public final EObject entryRuleRename() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRename = null;


        try {
            // InternalDataRetrieval.g:672:47: (iv_ruleRename= ruleRename EOF )
            // InternalDataRetrieval.g:673:2: iv_ruleRename= ruleRename EOF
            {
             newCompositeNode(grammarAccess.getRenameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRename=ruleRename();

            state._fsp--;

             current =iv_ruleRename; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRename"


    // $ANTLR start "ruleRename"
    // InternalDataRetrieval.g:679:1: ruleRename returns [EObject current=null] : (this_FullRename_0= ruleFullRename | this_AddPrefix_1= ruleAddPrefix | this_AddSuffix_2= ruleAddSuffix ) ;
    public final EObject ruleRename() throws RecognitionException {
        EObject current = null;

        EObject this_FullRename_0 = null;

        EObject this_AddPrefix_1 = null;

        EObject this_AddSuffix_2 = null;



        	enterRule();

        try {
            // InternalDataRetrieval.g:685:2: ( (this_FullRename_0= ruleFullRename | this_AddPrefix_1= ruleAddPrefix | this_AddSuffix_2= ruleAddSuffix ) )
            // InternalDataRetrieval.g:686:2: (this_FullRename_0= ruleFullRename | this_AddPrefix_1= ruleAddPrefix | this_AddSuffix_2= ruleAddSuffix )
            {
            // InternalDataRetrieval.g:686:2: (this_FullRename_0= ruleFullRename | this_AddPrefix_1= ruleAddPrefix | this_AddSuffix_2= ruleAddSuffix )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt10=1;
                }
                break;
            case 26:
                {
                alt10=2;
                }
                break;
            case 27:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalDataRetrieval.g:687:3: this_FullRename_0= ruleFullRename
                    {

                    			newCompositeNode(grammarAccess.getRenameAccess().getFullRenameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FullRename_0=ruleFullRename();

                    state._fsp--;


                    			current = this_FullRename_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDataRetrieval.g:696:3: this_AddPrefix_1= ruleAddPrefix
                    {

                    			newCompositeNode(grammarAccess.getRenameAccess().getAddPrefixParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddPrefix_1=ruleAddPrefix();

                    state._fsp--;


                    			current = this_AddPrefix_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDataRetrieval.g:705:3: this_AddSuffix_2= ruleAddSuffix
                    {

                    			newCompositeNode(grammarAccess.getRenameAccess().getAddSuffixParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddSuffix_2=ruleAddSuffix();

                    state._fsp--;


                    			current = this_AddSuffix_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRename"


    // $ANTLR start "entryRuleRenameAll"
    // InternalDataRetrieval.g:717:1: entryRuleRenameAll returns [EObject current=null] : iv_ruleRenameAll= ruleRenameAll EOF ;
    public final EObject entryRuleRenameAll() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameAll = null;


        try {
            // InternalDataRetrieval.g:717:50: (iv_ruleRenameAll= ruleRenameAll EOF )
            // InternalDataRetrieval.g:718:2: iv_ruleRenameAll= ruleRenameAll EOF
            {
             newCompositeNode(grammarAccess.getRenameAllRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRenameAll=ruleRenameAll();

            state._fsp--;

             current =iv_ruleRenameAll; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRenameAll"


    // $ANTLR start "ruleRenameAll"
    // InternalDataRetrieval.g:724:1: ruleRenameAll returns [EObject current=null] : (this_AddPrefix_0= ruleAddPrefix | this_AddSuffix_1= ruleAddSuffix ) ;
    public final EObject ruleRenameAll() throws RecognitionException {
        EObject current = null;

        EObject this_AddPrefix_0 = null;

        EObject this_AddSuffix_1 = null;



        	enterRule();

        try {
            // InternalDataRetrieval.g:730:2: ( (this_AddPrefix_0= ruleAddPrefix | this_AddSuffix_1= ruleAddSuffix ) )
            // InternalDataRetrieval.g:731:2: (this_AddPrefix_0= ruleAddPrefix | this_AddSuffix_1= ruleAddSuffix )
            {
            // InternalDataRetrieval.g:731:2: (this_AddPrefix_0= ruleAddPrefix | this_AddSuffix_1= ruleAddSuffix )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            else if ( (LA11_0==27) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalDataRetrieval.g:732:3: this_AddPrefix_0= ruleAddPrefix
                    {

                    			newCompositeNode(grammarAccess.getRenameAllAccess().getAddPrefixParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddPrefix_0=ruleAddPrefix();

                    state._fsp--;


                    			current = this_AddPrefix_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDataRetrieval.g:741:3: this_AddSuffix_1= ruleAddSuffix
                    {

                    			newCompositeNode(grammarAccess.getRenameAllAccess().getAddSuffixParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddSuffix_1=ruleAddSuffix();

                    state._fsp--;


                    			current = this_AddSuffix_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRenameAll"


    // $ANTLR start "entryRuleFullRename"
    // InternalDataRetrieval.g:753:1: entryRuleFullRename returns [EObject current=null] : iv_ruleFullRename= ruleFullRename EOF ;
    public final EObject entryRuleFullRename() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullRename = null;


        try {
            // InternalDataRetrieval.g:753:51: (iv_ruleFullRename= ruleFullRename EOF )
            // InternalDataRetrieval.g:754:2: iv_ruleFullRename= ruleFullRename EOF
            {
             newCompositeNode(grammarAccess.getFullRenameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFullRename=ruleFullRename();

            state._fsp--;

             current =iv_ruleFullRename; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFullRename"


    // $ANTLR start "ruleFullRename"
    // InternalDataRetrieval.g:760:1: ruleFullRename returns [EObject current=null] : (otherlv_0= 'rename=' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_n_2_0= 'N' ) )? ) ;
    public final EObject ruleFullRename() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_n_2_0=null;


        	enterRule();

        try {
            // InternalDataRetrieval.g:766:2: ( (otherlv_0= 'rename=' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_n_2_0= 'N' ) )? ) )
            // InternalDataRetrieval.g:767:2: (otherlv_0= 'rename=' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_n_2_0= 'N' ) )? )
            {
            // InternalDataRetrieval.g:767:2: (otherlv_0= 'rename=' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_n_2_0= 'N' ) )? )
            // InternalDataRetrieval.g:768:3: otherlv_0= 'rename=' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_n_2_0= 'N' ) )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getFullRenameAccess().getRenameKeyword_0());
            		
            // InternalDataRetrieval.g:772:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDataRetrieval.g:773:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDataRetrieval.g:773:4: (lv_name_1_0= RULE_STRING )
            // InternalDataRetrieval.g:774:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFullRenameAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFullRenameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDataRetrieval.g:790:3: ( (lv_n_2_0= 'N' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDataRetrieval.g:791:4: (lv_n_2_0= 'N' )
                    {
                    // InternalDataRetrieval.g:791:4: (lv_n_2_0= 'N' )
                    // InternalDataRetrieval.g:792:5: lv_n_2_0= 'N'
                    {
                    lv_n_2_0=(Token)match(input,25,FOLLOW_2); 

                    					newLeafNode(lv_n_2_0, grammarAccess.getFullRenameAccess().getNNKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFullRenameRule());
                    					}
                    					setWithLastConsumed(current, "n", lv_n_2_0, "N");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFullRename"


    // $ANTLR start "entryRuleAddPrefix"
    // InternalDataRetrieval.g:808:1: entryRuleAddPrefix returns [EObject current=null] : iv_ruleAddPrefix= ruleAddPrefix EOF ;
    public final EObject entryRuleAddPrefix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddPrefix = null;


        try {
            // InternalDataRetrieval.g:808:50: (iv_ruleAddPrefix= ruleAddPrefix EOF )
            // InternalDataRetrieval.g:809:2: iv_ruleAddPrefix= ruleAddPrefix EOF
            {
             newCompositeNode(grammarAccess.getAddPrefixRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddPrefix=ruleAddPrefix();

            state._fsp--;

             current =iv_ruleAddPrefix; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddPrefix"


    // $ANTLR start "ruleAddPrefix"
    // InternalDataRetrieval.g:815:1: ruleAddPrefix returns [EObject current=null] : (otherlv_0= 'prepend=' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleAddPrefix() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDataRetrieval.g:821:2: ( (otherlv_0= 'prepend=' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalDataRetrieval.g:822:2: (otherlv_0= 'prepend=' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalDataRetrieval.g:822:2: (otherlv_0= 'prepend=' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalDataRetrieval.g:823:3: otherlv_0= 'prepend=' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAddPrefixAccess().getPrependKeyword_0());
            		
            // InternalDataRetrieval.g:827:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDataRetrieval.g:828:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDataRetrieval.g:828:4: (lv_name_1_0= RULE_STRING )
            // InternalDataRetrieval.g:829:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAddPrefixAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddPrefixRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddPrefix"


    // $ANTLR start "entryRuleAddSuffix"
    // InternalDataRetrieval.g:849:1: entryRuleAddSuffix returns [EObject current=null] : iv_ruleAddSuffix= ruleAddSuffix EOF ;
    public final EObject entryRuleAddSuffix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddSuffix = null;


        try {
            // InternalDataRetrieval.g:849:50: (iv_ruleAddSuffix= ruleAddSuffix EOF )
            // InternalDataRetrieval.g:850:2: iv_ruleAddSuffix= ruleAddSuffix EOF
            {
             newCompositeNode(grammarAccess.getAddSuffixRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddSuffix=ruleAddSuffix();

            state._fsp--;

             current =iv_ruleAddSuffix; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddSuffix"


    // $ANTLR start "ruleAddSuffix"
    // InternalDataRetrieval.g:856:1: ruleAddSuffix returns [EObject current=null] : (otherlv_0= 'append=' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleAddSuffix() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDataRetrieval.g:862:2: ( (otherlv_0= 'append=' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalDataRetrieval.g:863:2: (otherlv_0= 'append=' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalDataRetrieval.g:863:2: (otherlv_0= 'append=' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalDataRetrieval.g:864:3: otherlv_0= 'append=' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAddSuffixAccess().getAppendKeyword_0());
            		
            // InternalDataRetrieval.g:868:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDataRetrieval.g:869:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDataRetrieval.g:869:4: (lv_name_1_0= RULE_STRING )
            // InternalDataRetrieval.g:870:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAddSuffixAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddSuffixRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddSuffix"


    // $ANTLR start "entryRuleFilter"
    // InternalDataRetrieval.g:890:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalDataRetrieval.g:890:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalDataRetrieval.g:891:2: iv_ruleFilter= ruleFilter EOF
            {
             newCompositeNode(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilter=ruleFilter();

            state._fsp--;

             current =iv_ruleFilter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalDataRetrieval.g:897:1: ruleFilter returns [EObject current=null] : (otherlv_0= 'filter=' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDataRetrieval.g:903:2: ( (otherlv_0= 'filter=' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalDataRetrieval.g:904:2: (otherlv_0= 'filter=' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalDataRetrieval.g:904:2: (otherlv_0= 'filter=' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalDataRetrieval.g:905:3: otherlv_0= 'filter=' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getFilterAccess().getFilterKeyword_0());
            		
            // InternalDataRetrieval.g:909:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDataRetrieval.g:910:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDataRetrieval.g:910:4: (lv_name_1_0= RULE_STRING )
            // InternalDataRetrieval.g:911:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFilterAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFilterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleThreshold"
    // InternalDataRetrieval.g:931:1: entryRuleThreshold returns [EObject current=null] : iv_ruleThreshold= ruleThreshold EOF ;
    public final EObject entryRuleThreshold() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThreshold = null;


        try {
            // InternalDataRetrieval.g:931:50: (iv_ruleThreshold= ruleThreshold EOF )
            // InternalDataRetrieval.g:932:2: iv_ruleThreshold= ruleThreshold EOF
            {
             newCompositeNode(grammarAccess.getThresholdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThreshold=ruleThreshold();

            state._fsp--;

             current =iv_ruleThreshold; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleThreshold"


    // $ANTLR start "ruleThreshold"
    // InternalDataRetrieval.g:938:1: ruleThreshold returns [EObject current=null] : (this_TopN_0= ruleTopN | this_BottomN_1= ruleBottomN ) ;
    public final EObject ruleThreshold() throws RecognitionException {
        EObject current = null;

        EObject this_TopN_0 = null;

        EObject this_BottomN_1 = null;



        	enterRule();

        try {
            // InternalDataRetrieval.g:944:2: ( (this_TopN_0= ruleTopN | this_BottomN_1= ruleBottomN ) )
            // InternalDataRetrieval.g:945:2: (this_TopN_0= ruleTopN | this_BottomN_1= ruleBottomN )
            {
            // InternalDataRetrieval.g:945:2: (this_TopN_0= ruleTopN | this_BottomN_1= ruleBottomN )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            else if ( (LA13_0==30) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalDataRetrieval.g:946:3: this_TopN_0= ruleTopN
                    {

                    			newCompositeNode(grammarAccess.getThresholdAccess().getTopNParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TopN_0=ruleTopN();

                    state._fsp--;


                    			current = this_TopN_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDataRetrieval.g:955:3: this_BottomN_1= ruleBottomN
                    {

                    			newCompositeNode(grammarAccess.getThresholdAccess().getBottomNParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BottomN_1=ruleBottomN();

                    state._fsp--;


                    			current = this_BottomN_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleThreshold"


    // $ANTLR start "entryRuleTopN"
    // InternalDataRetrieval.g:967:1: entryRuleTopN returns [EObject current=null] : iv_ruleTopN= ruleTopN EOF ;
    public final EObject entryRuleTopN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopN = null;


        try {
            // InternalDataRetrieval.g:967:45: (iv_ruleTopN= ruleTopN EOF )
            // InternalDataRetrieval.g:968:2: iv_ruleTopN= ruleTopN EOF
            {
             newCompositeNode(grammarAccess.getTopNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTopN=ruleTopN();

            state._fsp--;

             current =iv_ruleTopN; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTopN"


    // $ANTLR start "ruleTopN"
    // InternalDataRetrieval.g:974:1: ruleTopN returns [EObject current=null] : (otherlv_0= 'top=' ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleTopN() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDataRetrieval.g:980:2: ( (otherlv_0= 'top=' ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalDataRetrieval.g:981:2: (otherlv_0= 'top=' ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalDataRetrieval.g:981:2: (otherlv_0= 'top=' ( (lv_value_1_0= RULE_INT ) ) )
            // InternalDataRetrieval.g:982:3: otherlv_0= 'top=' ( (lv_value_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getTopNAccess().getTopKeyword_0());
            		
            // InternalDataRetrieval.g:986:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalDataRetrieval.g:987:4: (lv_value_1_0= RULE_INT )
            {
            // InternalDataRetrieval.g:987:4: (lv_value_1_0= RULE_INT )
            // InternalDataRetrieval.g:988:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getTopNAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTopNRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTopN"


    // $ANTLR start "entryRuleBottomN"
    // InternalDataRetrieval.g:1008:1: entryRuleBottomN returns [EObject current=null] : iv_ruleBottomN= ruleBottomN EOF ;
    public final EObject entryRuleBottomN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBottomN = null;


        try {
            // InternalDataRetrieval.g:1008:48: (iv_ruleBottomN= ruleBottomN EOF )
            // InternalDataRetrieval.g:1009:2: iv_ruleBottomN= ruleBottomN EOF
            {
             newCompositeNode(grammarAccess.getBottomNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBottomN=ruleBottomN();

            state._fsp--;

             current =iv_ruleBottomN; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBottomN"


    // $ANTLR start "ruleBottomN"
    // InternalDataRetrieval.g:1015:1: ruleBottomN returns [EObject current=null] : (otherlv_0= 'bottom=' ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleBottomN() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDataRetrieval.g:1021:2: ( (otherlv_0= 'bottom=' ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalDataRetrieval.g:1022:2: (otherlv_0= 'bottom=' ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalDataRetrieval.g:1022:2: (otherlv_0= 'bottom=' ( (lv_value_1_0= RULE_INT ) ) )
            // InternalDataRetrieval.g:1023:3: otherlv_0= 'bottom=' ( (lv_value_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getBottomNAccess().getBottomKeyword_0());
            		
            // InternalDataRetrieval.g:1027:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalDataRetrieval.g:1028:4: (lv_value_1_0= RULE_INT )
            {
            // InternalDataRetrieval.g:1028:4: (lv_value_1_0= RULE_INT )
            // InternalDataRetrieval.g:1029:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getBottomNAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBottomNRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBottomN"


    // $ANTLR start "entryRuleOpType"
    // InternalDataRetrieval.g:1049:1: entryRuleOpType returns [EObject current=null] : iv_ruleOpType= ruleOpType EOF ;
    public final EObject entryRuleOpType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpType = null;


        try {
            // InternalDataRetrieval.g:1049:47: (iv_ruleOpType= ruleOpType EOF )
            // InternalDataRetrieval.g:1050:2: iv_ruleOpType= ruleOpType EOF
            {
             newCompositeNode(grammarAccess.getOpTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpType=ruleOpType();

            state._fsp--;

             current =iv_ruleOpType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpType"


    // $ANTLR start "ruleOpType"
    // InternalDataRetrieval.g:1056:1: ruleOpType returns [EObject current=null] : ( ( ( (lv_average_0_0= 'average=' ) ) | ( (lv_sum_1_0= 'sum=' ) ) ) ( ( (lv_all_2_0= 'all' ) ) | (otherlv_3= '[' ( (lv_key1_4_0= ruleKey ) ) (otherlv_5= ',' ( (lv_key1_6_0= ruleKey ) ) )* otherlv_7= ']' ) ) ) ;
    public final EObject ruleOpType() throws RecognitionException {
        EObject current = null;

        Token lv_average_0_0=null;
        Token lv_sum_1_0=null;
        Token lv_all_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_key1_4_0 = null;

        EObject lv_key1_6_0 = null;



        	enterRule();

        try {
            // InternalDataRetrieval.g:1062:2: ( ( ( ( (lv_average_0_0= 'average=' ) ) | ( (lv_sum_1_0= 'sum=' ) ) ) ( ( (lv_all_2_0= 'all' ) ) | (otherlv_3= '[' ( (lv_key1_4_0= ruleKey ) ) (otherlv_5= ',' ( (lv_key1_6_0= ruleKey ) ) )* otherlv_7= ']' ) ) ) )
            // InternalDataRetrieval.g:1063:2: ( ( ( (lv_average_0_0= 'average=' ) ) | ( (lv_sum_1_0= 'sum=' ) ) ) ( ( (lv_all_2_0= 'all' ) ) | (otherlv_3= '[' ( (lv_key1_4_0= ruleKey ) ) (otherlv_5= ',' ( (lv_key1_6_0= ruleKey ) ) )* otherlv_7= ']' ) ) )
            {
            // InternalDataRetrieval.g:1063:2: ( ( ( (lv_average_0_0= 'average=' ) ) | ( (lv_sum_1_0= 'sum=' ) ) ) ( ( (lv_all_2_0= 'all' ) ) | (otherlv_3= '[' ( (lv_key1_4_0= ruleKey ) ) (otherlv_5= ',' ( (lv_key1_6_0= ruleKey ) ) )* otherlv_7= ']' ) ) )
            // InternalDataRetrieval.g:1064:3: ( ( (lv_average_0_0= 'average=' ) ) | ( (lv_sum_1_0= 'sum=' ) ) ) ( ( (lv_all_2_0= 'all' ) ) | (otherlv_3= '[' ( (lv_key1_4_0= ruleKey ) ) (otherlv_5= ',' ( (lv_key1_6_0= ruleKey ) ) )* otherlv_7= ']' ) )
            {
            // InternalDataRetrieval.g:1064:3: ( ( (lv_average_0_0= 'average=' ) ) | ( (lv_sum_1_0= 'sum=' ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            else if ( (LA14_0==32) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalDataRetrieval.g:1065:4: ( (lv_average_0_0= 'average=' ) )
                    {
                    // InternalDataRetrieval.g:1065:4: ( (lv_average_0_0= 'average=' ) )
                    // InternalDataRetrieval.g:1066:5: (lv_average_0_0= 'average=' )
                    {
                    // InternalDataRetrieval.g:1066:5: (lv_average_0_0= 'average=' )
                    // InternalDataRetrieval.g:1067:6: lv_average_0_0= 'average='
                    {
                    lv_average_0_0=(Token)match(input,31,FOLLOW_23); 

                    						newLeafNode(lv_average_0_0, grammarAccess.getOpTypeAccess().getAverageAverageKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOpTypeRule());
                    						}
                    						setWithLastConsumed(current, "average", lv_average_0_0, "average=");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDataRetrieval.g:1080:4: ( (lv_sum_1_0= 'sum=' ) )
                    {
                    // InternalDataRetrieval.g:1080:4: ( (lv_sum_1_0= 'sum=' ) )
                    // InternalDataRetrieval.g:1081:5: (lv_sum_1_0= 'sum=' )
                    {
                    // InternalDataRetrieval.g:1081:5: (lv_sum_1_0= 'sum=' )
                    // InternalDataRetrieval.g:1082:6: lv_sum_1_0= 'sum='
                    {
                    lv_sum_1_0=(Token)match(input,32,FOLLOW_23); 

                    						newLeafNode(lv_sum_1_0, grammarAccess.getOpTypeAccess().getSumSumKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOpTypeRule());
                    						}
                    						setWithLastConsumed(current, "sum", lv_sum_1_0, "sum=");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataRetrieval.g:1095:3: ( ( (lv_all_2_0= 'all' ) ) | (otherlv_3= '[' ( (lv_key1_4_0= ruleKey ) ) (otherlv_5= ',' ( (lv_key1_6_0= ruleKey ) ) )* otherlv_7= ']' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            else if ( (LA16_0==34) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalDataRetrieval.g:1096:4: ( (lv_all_2_0= 'all' ) )
                    {
                    // InternalDataRetrieval.g:1096:4: ( (lv_all_2_0= 'all' ) )
                    // InternalDataRetrieval.g:1097:5: (lv_all_2_0= 'all' )
                    {
                    // InternalDataRetrieval.g:1097:5: (lv_all_2_0= 'all' )
                    // InternalDataRetrieval.g:1098:6: lv_all_2_0= 'all'
                    {
                    lv_all_2_0=(Token)match(input,33,FOLLOW_2); 

                    						newLeafNode(lv_all_2_0, grammarAccess.getOpTypeAccess().getAllAllKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOpTypeRule());
                    						}
                    						setWithLastConsumed(current, "all", lv_all_2_0, "all");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDataRetrieval.g:1111:4: (otherlv_3= '[' ( (lv_key1_4_0= ruleKey ) ) (otherlv_5= ',' ( (lv_key1_6_0= ruleKey ) ) )* otherlv_7= ']' )
                    {
                    // InternalDataRetrieval.g:1111:4: (otherlv_3= '[' ( (lv_key1_4_0= ruleKey ) ) (otherlv_5= ',' ( (lv_key1_6_0= ruleKey ) ) )* otherlv_7= ']' )
                    // InternalDataRetrieval.g:1112:5: otherlv_3= '[' ( (lv_key1_4_0= ruleKey ) ) (otherlv_5= ',' ( (lv_key1_6_0= ruleKey ) ) )* otherlv_7= ']'
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_9); 

                    					newLeafNode(otherlv_3, grammarAccess.getOpTypeAccess().getLeftSquareBracketKeyword_1_1_0());
                    				
                    // InternalDataRetrieval.g:1116:5: ( (lv_key1_4_0= ruleKey ) )
                    // InternalDataRetrieval.g:1117:6: (lv_key1_4_0= ruleKey )
                    {
                    // InternalDataRetrieval.g:1117:6: (lv_key1_4_0= ruleKey )
                    // InternalDataRetrieval.g:1118:7: lv_key1_4_0= ruleKey
                    {

                    							newCompositeNode(grammarAccess.getOpTypeAccess().getKey1KeyParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_18);
                    lv_key1_4_0=ruleKey();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getOpTypeRule());
                    							}
                    							add(
                    								current,
                    								"key1",
                    								lv_key1_4_0,
                    								"org.xtext.example.dr.DataRetrieval.Key");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalDataRetrieval.g:1135:5: (otherlv_5= ',' ( (lv_key1_6_0= ruleKey ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==21) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalDataRetrieval.g:1136:6: otherlv_5= ',' ( (lv_key1_6_0= ruleKey ) )
                    	    {
                    	    otherlv_5=(Token)match(input,21,FOLLOW_9); 

                    	    						newLeafNode(otherlv_5, grammarAccess.getOpTypeAccess().getCommaKeyword_1_1_2_0());
                    	    					
                    	    // InternalDataRetrieval.g:1140:6: ( (lv_key1_6_0= ruleKey ) )
                    	    // InternalDataRetrieval.g:1141:7: (lv_key1_6_0= ruleKey )
                    	    {
                    	    // InternalDataRetrieval.g:1141:7: (lv_key1_6_0= ruleKey )
                    	    // InternalDataRetrieval.g:1142:8: lv_key1_6_0= ruleKey
                    	    {

                    	    								newCompositeNode(grammarAccess.getOpTypeAccess().getKey1KeyParserRuleCall_1_1_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_18);
                    	    lv_key1_6_0=ruleKey();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getOpTypeRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"key1",
                    	    									lv_key1_6_0,
                    	    									"org.xtext.example.dr.DataRetrieval.Key");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(otherlv_7, grammarAccess.getOpTypeAccess().getRightSquareBracketKeyword_1_1_3());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000032000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000001C182000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000001C102000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000001C002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000D000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000600000000L});

}