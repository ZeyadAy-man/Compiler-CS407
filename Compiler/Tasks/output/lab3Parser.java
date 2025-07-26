// $ANTLR 3.4 C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g 2025-05-14 12:46:32

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class lab3Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ArithmaticOperators", "AssignmentAutoOperators", "AssignmentOperators", "CharValue", "Decl", "DoubleNum", "GeneralArithExpr", "ID", "IntNum", "LogicalOperators", "Operators", "SignedNumber", "StartgeneralArithExpr", "Stmt", "StringValue", "TrigonometricFunctions", "WS", "'&'", "'('", "')'", "'*'", "'+'", "','", "';'", "'<<'", "'='", "'String'", "'['", "']'", "'auto'", "'bool'", "'cerr'", "'char'", "'cin'", "'clog'", "'cout'", "'double'", "'else'", "'false'", "'float'", "'for'", "'if'", "'int'", "'new'", "'true'", "'while'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int ArithmaticOperators=4;
    public static final int AssignmentAutoOperators=5;
    public static final int AssignmentOperators=6;
    public static final int CharValue=7;
    public static final int Decl=8;
    public static final int DoubleNum=9;
    public static final int GeneralArithExpr=10;
    public static final int ID=11;
    public static final int IntNum=12;
    public static final int LogicalOperators=13;
    public static final int Operators=14;
    public static final int SignedNumber=15;
    public static final int StartgeneralArithExpr=16;
    public static final int Stmt=17;
    public static final int StringValue=18;
    public static final int TrigonometricFunctions=19;
    public static final int WS=20;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public lab3Parser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public lab3Parser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return lab3Parser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g"; }


    String s="";


    public static class run_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "run"
    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:13:1: run : ( stmt | mathmaticalExpression );
    public final lab3Parser.run_return run() throws RecognitionException {
        lab3Parser.run_return retval = new lab3Parser.run_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        lab3Parser.stmt_return stmt1 =null;

        lab3Parser.mathmaticalExpression_return mathmaticalExpression2 =null;



        try {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:13:6: ( stmt | mathmaticalExpression )
            int alt1=2;
            switch ( input.LA(1) ) {
            case AssignmentAutoOperators:
            case 30:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 43:
            case 44:
            case 45:
            case 46:
            case 49:
                {
                alt1=1;
                }
                break;
            case ID:
                {
                int LA1_2 = input.LA(2);

                if ( ((LA1_2 >= AssignmentAutoOperators && LA1_2 <= AssignmentOperators)||LA1_2==ID||LA1_2==24||LA1_2==29) ) {
                    alt1=1;
                }
                else if ( (LA1_2==EOF||LA1_2==Operators) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;

                }
                }
                break;
            case DoubleNum:
            case IntNum:
            case SignedNumber:
            case TrigonometricFunctions:
            case 22:
                {
                alt1=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:13:8: stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_stmt_in_run41);
                    stmt1=stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, stmt1.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:13:15: mathmaticalExpression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_mathmaticalExpression_in_run45);
                    mathmaticalExpression2=mathmaticalExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, mathmaticalExpression2.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "run"


    public static class stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmt"
    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:16:1: stmt : ( for_loop | if_stmt | decl | while_loop | assigningVariable | printings_statements );
    public final lab3Parser.stmt_return stmt() throws RecognitionException {
        lab3Parser.stmt_return retval = new lab3Parser.stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        lab3Parser.for_loop_return for_loop3 =null;

        lab3Parser.if_stmt_return if_stmt4 =null;

        lab3Parser.decl_return decl5 =null;

        lab3Parser.while_loop_return while_loop6 =null;

        lab3Parser.assigningVariable_return assigningVariable7 =null;

        lab3Parser.printings_statements_return printings_statements8 =null;



        try {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:16:6: ( for_loop | if_stmt | decl | while_loop | assigningVariable | printings_statements )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt2=1;
                }
                break;
            case 45:
                {
                alt2=2;
                }
                break;
            case 30:
            case 33:
            case 34:
            case 36:
            case 40:
            case 43:
            case 46:
                {
                alt2=3;
                }
                break;
            case ID:
                {
                int LA2_4 = input.LA(2);

                if ( (LA2_4==ID||LA2_4==24) ) {
                    alt2=3;
                }
                else if ( ((LA2_4 >= AssignmentAutoOperators && LA2_4 <= AssignmentOperators)||LA2_4==29) ) {
                    alt2=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 4, input);

                    throw nvae;

                }
                }
                break;
            case 49:
                {
                alt2=4;
                }
                break;
            case AssignmentAutoOperators:
                {
                alt2=5;
                }
                break;
            case 35:
            case 37:
            case 38:
            case 39:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:16:8: for_loop
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_for_loop_in_stmt54);
                    for_loop3=for_loop();

                    state._fsp--;

                    adaptor.addChild(root_0, for_loop3.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:17:3: if_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_if_stmt_in_stmt59);
                    if_stmt4=if_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, if_stmt4.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:18:3: decl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_decl_in_stmt65);
                    decl5=decl();

                    state._fsp--;

                    adaptor.addChild(root_0, decl5.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:19:3: while_loop
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_while_loop_in_stmt71);
                    while_loop6=while_loop();

                    state._fsp--;

                    adaptor.addChild(root_0, while_loop6.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:20:3: assigningVariable
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assigningVariable_in_stmt77);
                    assigningVariable7=assigningVariable();

                    state._fsp--;

                    adaptor.addChild(root_0, assigningVariable7.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:21:3: printings_statements
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_printings_statements_in_stmt82);
                    printings_statements8=printings_statements();

                    state._fsp--;

                    adaptor.addChild(root_0, printings_statements8.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stmt"


    public static class decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "decl"
    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:38:1: decl : ( declOfInteger ';' | declOfDoubleAndFloat ';' | declOfBool ';' | declOfString ';' | declOfChar ';' | declOfAuto ';' | declOfPointer ';' | declOfObjects ';' | declOfArrays ';' );
    public final lab3Parser.decl_return decl() throws RecognitionException {
        lab3Parser.decl_return retval = new lab3Parser.decl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal10=null;
        Token char_literal12=null;
        Token char_literal14=null;
        Token char_literal16=null;
        Token char_literal18=null;
        Token char_literal20=null;
        Token char_literal22=null;
        Token char_literal24=null;
        Token char_literal26=null;
        lab3Parser.declOfInteger_return declOfInteger9 =null;

        lab3Parser.declOfDoubleAndFloat_return declOfDoubleAndFloat11 =null;

        lab3Parser.declOfBool_return declOfBool13 =null;

        lab3Parser.declOfString_return declOfString15 =null;

        lab3Parser.declOfChar_return declOfChar17 =null;

        lab3Parser.declOfAuto_return declOfAuto19 =null;

        lab3Parser.declOfPointer_return declOfPointer21 =null;

        lab3Parser.declOfObjects_return declOfObjects23 =null;

        lab3Parser.declOfArrays_return declOfArrays25 =null;


        Object char_literal10_tree=null;
        Object char_literal12_tree=null;
        Object char_literal14_tree=null;
        Object char_literal16_tree=null;
        Object char_literal18_tree=null;
        Object char_literal20_tree=null;
        Object char_literal22_tree=null;
        Object char_literal24_tree=null;
        Object char_literal26_tree=null;

        try {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:38:6: ( declOfInteger ';' | declOfDoubleAndFloat ';' | declOfBool ';' | declOfString ';' | declOfChar ';' | declOfAuto ';' | declOfPointer ';' | declOfObjects ';' | declOfArrays ';' )
            int alt3=9;
            switch ( input.LA(1) ) {
            case 46:
                {
                switch ( input.LA(2) ) {
                case ID:
                    {
                    alt3=1;
                    }
                    break;
                case 24:
                    {
                    alt3=7;
                    }
                    break;
                case 31:
                    {
                    alt3=9;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;

                }

                }
                break;
            case 40:
            case 43:
                {
                switch ( input.LA(2) ) {
                case ID:
                    {
                    alt3=2;
                    }
                    break;
                case 24:
                    {
                    alt3=7;
                    }
                    break;
                case 31:
                    {
                    alt3=9;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;

                }

                }
                break;
            case 34:
                {
                alt3=3;
                }
                break;
            case 30:
                {
                switch ( input.LA(2) ) {
                case ID:
                    {
                    alt3=4;
                    }
                    break;
                case 24:
                    {
                    alt3=7;
                    }
                    break;
                case 31:
                    {
                    alt3=9;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 4, input);

                    throw nvae;

                }

                }
                break;
            case 36:
                {
                switch ( input.LA(2) ) {
                case ID:
                    {
                    alt3=5;
                    }
                    break;
                case 24:
                    {
                    alt3=7;
                    }
                    break;
                case 31:
                    {
                    alt3=9;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 5, input);

                    throw nvae;

                }

                }
                break;
            case 33:
                {
                alt3=6;
                }
                break;
            case ID:
                {
                int LA3_7 = input.LA(2);

                if ( (LA3_7==24) ) {
                    alt3=7;
                }
                else if ( (LA3_7==ID) ) {
                    alt3=8;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 7, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:38:8: declOfInteger ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declOfInteger_in_decl105);
                    declOfInteger9=declOfInteger();

                    state._fsp--;

                    adaptor.addChild(root_0, declOfInteger9.getTree());

                    char_literal10=(Token)match(input,27,FOLLOW_27_in_decl107); 
                    char_literal10_tree = 
                    (Object)adaptor.create(char_literal10)
                    ;
                    adaptor.addChild(root_0, char_literal10_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:39:3: declOfDoubleAndFloat ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declOfDoubleAndFloat_in_decl112);
                    declOfDoubleAndFloat11=declOfDoubleAndFloat();

                    state._fsp--;

                    adaptor.addChild(root_0, declOfDoubleAndFloat11.getTree());

                    char_literal12=(Token)match(input,27,FOLLOW_27_in_decl114); 
                    char_literal12_tree = 
                    (Object)adaptor.create(char_literal12)
                    ;
                    adaptor.addChild(root_0, char_literal12_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:40:3: declOfBool ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declOfBool_in_decl119);
                    declOfBool13=declOfBool();

                    state._fsp--;

                    adaptor.addChild(root_0, declOfBool13.getTree());

                    char_literal14=(Token)match(input,27,FOLLOW_27_in_decl121); 
                    char_literal14_tree = 
                    (Object)adaptor.create(char_literal14)
                    ;
                    adaptor.addChild(root_0, char_literal14_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:41:3: declOfString ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declOfString_in_decl126);
                    declOfString15=declOfString();

                    state._fsp--;

                    adaptor.addChild(root_0, declOfString15.getTree());

                    char_literal16=(Token)match(input,27,FOLLOW_27_in_decl128); 
                    char_literal16_tree = 
                    (Object)adaptor.create(char_literal16)
                    ;
                    adaptor.addChild(root_0, char_literal16_tree);


                    }
                    break;
                case 5 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:42:3: declOfChar ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declOfChar_in_decl133);
                    declOfChar17=declOfChar();

                    state._fsp--;

                    adaptor.addChild(root_0, declOfChar17.getTree());

                    char_literal18=(Token)match(input,27,FOLLOW_27_in_decl135); 
                    char_literal18_tree = 
                    (Object)adaptor.create(char_literal18)
                    ;
                    adaptor.addChild(root_0, char_literal18_tree);


                    }
                    break;
                case 6 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:43:3: declOfAuto ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declOfAuto_in_decl140);
                    declOfAuto19=declOfAuto();

                    state._fsp--;

                    adaptor.addChild(root_0, declOfAuto19.getTree());

                    char_literal20=(Token)match(input,27,FOLLOW_27_in_decl142); 
                    char_literal20_tree = 
                    (Object)adaptor.create(char_literal20)
                    ;
                    adaptor.addChild(root_0, char_literal20_tree);


                    }
                    break;
                case 7 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:44:3: declOfPointer ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declOfPointer_in_decl147);
                    declOfPointer21=declOfPointer();

                    state._fsp--;

                    adaptor.addChild(root_0, declOfPointer21.getTree());

                    char_literal22=(Token)match(input,27,FOLLOW_27_in_decl149); 
                    char_literal22_tree = 
                    (Object)adaptor.create(char_literal22)
                    ;
                    adaptor.addChild(root_0, char_literal22_tree);


                    }
                    break;
                case 8 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:45:3: declOfObjects ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declOfObjects_in_decl154);
                    declOfObjects23=declOfObjects();

                    state._fsp--;

                    adaptor.addChild(root_0, declOfObjects23.getTree());

                    char_literal24=(Token)match(input,27,FOLLOW_27_in_decl156); 
                    char_literal24_tree = 
                    (Object)adaptor.create(char_literal24)
                    ;
                    adaptor.addChild(root_0, char_literal24_tree);


                    }
                    break;
                case 9 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:46:3: declOfArrays ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declOfArrays_in_decl161);
                    declOfArrays25=declOfArrays();

                    state._fsp--;

                    adaptor.addChild(root_0, declOfArrays25.getTree());

                    char_literal26=(Token)match(input,27,FOLLOW_27_in_decl163); 
                    char_literal26_tree = 
                    (Object)adaptor.create(char_literal26)
                    ;
                    adaptor.addChild(root_0, char_literal26_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "decl"


    public static class declOfBool_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declOfBool"
    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:51:1: declOfBool : 'bool' ID ( '=' ( ID | 'true' | 'false' | expression ) )? ( ',' ( ID ( '=' ( ID | 'true' | 'false' | expression ) )? ) )* ;
    public final lab3Parser.declOfBool_return declOfBool() throws RecognitionException {
        lab3Parser.declOfBool_return retval = new lab3Parser.declOfBool_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal27=null;
        Token ID28=null;
        Token char_literal29=null;
        Token ID30=null;
        Token string_literal31=null;
        Token string_literal32=null;
        Token char_literal34=null;
        Token ID35=null;
        Token char_literal36=null;
        Token ID37=null;
        Token string_literal38=null;
        Token string_literal39=null;
        lab3Parser.expression_return expression33 =null;

        lab3Parser.expression_return expression40 =null;


        Object string_literal27_tree=null;
        Object ID28_tree=null;
        Object char_literal29_tree=null;
        Object ID30_tree=null;
        Object string_literal31_tree=null;
        Object string_literal32_tree=null;
        Object char_literal34_tree=null;
        Object ID35_tree=null;
        Object char_literal36_tree=null;
        Object ID37_tree=null;
        Object string_literal38_tree=null;
        Object string_literal39_tree=null;

        try {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:51:11: ( 'bool' ID ( '=' ( ID | 'true' | 'false' | expression ) )? ( ',' ( ID ( '=' ( ID | 'true' | 'false' | expression ) )? ) )* )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:51:13: 'bool' ID ( '=' ( ID | 'true' | 'false' | expression ) )? ( ',' ( ID ( '=' ( ID | 'true' | 'false' | expression ) )? ) )*
            {
            root_0 = (Object)adaptor.nil();


            string_literal27=(Token)match(input,34,FOLLOW_34_in_declOfBool173); 
            string_literal27_tree = 
            (Object)adaptor.create(string_literal27)
            ;
            adaptor.addChild(root_0, string_literal27_tree);


            ID28=(Token)match(input,ID,FOLLOW_ID_in_declOfBool175); 
            ID28_tree = 
            (Object)adaptor.create(ID28)
            ;
            adaptor.addChild(root_0, ID28_tree);


            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:51:23: ( '=' ( ID | 'true' | 'false' | expression ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==29) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:51:24: '=' ( ID | 'true' | 'false' | expression )
                    {
                    char_literal29=(Token)match(input,29,FOLLOW_29_in_declOfBool178); 
                    char_literal29_tree = 
                    (Object)adaptor.create(char_literal29)
                    ;
                    adaptor.addChild(root_0, char_literal29_tree);


                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:51:28: ( ID | 'true' | 'false' | expression )
                    int alt4=4;
                    switch ( input.LA(1) ) {
                    case ID:
                        {
                        int LA4_1 = input.LA(2);

                        if ( (LA4_1==ArithmaticOperators) ) {
                            alt4=4;
                        }
                        else if ( ((LA4_1 >= 26 && LA4_1 <= 27)) ) {
                            alt4=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 1, input);

                            throw nvae;

                        }
                        }
                        break;
                    case 48:
                        {
                        alt4=2;
                        }
                        break;
                    case 42:
                        {
                        alt4=3;
                        }
                        break;
                    case DoubleNum:
                    case IntNum:
                        {
                        alt4=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;

                    }

                    switch (alt4) {
                        case 1 :
                            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:51:29: ID
                            {
                            ID30=(Token)match(input,ID,FOLLOW_ID_in_declOfBool181); 
                            ID30_tree = 
                            (Object)adaptor.create(ID30)
                            ;
                            adaptor.addChild(root_0, ID30_tree);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:51:34: 'true'
                            {
                            string_literal31=(Token)match(input,48,FOLLOW_48_in_declOfBool185); 
                            string_literal31_tree = 
                            (Object)adaptor.create(string_literal31)
                            ;
                            adaptor.addChild(root_0, string_literal31_tree);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:51:43: 'false'
                            {
                            string_literal32=(Token)match(input,42,FOLLOW_42_in_declOfBool189); 
                            string_literal32_tree = 
                            (Object)adaptor.create(string_literal32)
                            ;
                            adaptor.addChild(root_0, string_literal32_tree);


                            }
                            break;
                        case 4 :
                            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:51:53: expression
                            {
                            pushFollow(FOLLOW_expression_in_declOfBool193);
                            expression33=expression();

                            state._fsp--;

                            adaptor.addChild(root_0, expression33.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }


            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:51:67: ( ',' ( ID ( '=' ( ID | 'true' | 'false' | expression ) )? ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:51:68: ',' ( ID ( '=' ( ID | 'true' | 'false' | expression ) )? )
            	    {
            	    char_literal34=(Token)match(input,26,FOLLOW_26_in_declOfBool199); 
            	    char_literal34_tree = 
            	    (Object)adaptor.create(char_literal34)
            	    ;
            	    adaptor.addChild(root_0, char_literal34_tree);


            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:51:72: ( ID ( '=' ( ID | 'true' | 'false' | expression ) )? )
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:51:73: ID ( '=' ( ID | 'true' | 'false' | expression ) )?
            	    {
            	    ID35=(Token)match(input,ID,FOLLOW_ID_in_declOfBool202); 
            	    ID35_tree = 
            	    (Object)adaptor.create(ID35)
            	    ;
            	    adaptor.addChild(root_0, ID35_tree);


            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:51:76: ( '=' ( ID | 'true' | 'false' | expression ) )?
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==29) ) {
            	        alt7=1;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:51:77: '=' ( ID | 'true' | 'false' | expression )
            	            {
            	            char_literal36=(Token)match(input,29,FOLLOW_29_in_declOfBool205); 
            	            char_literal36_tree = 
            	            (Object)adaptor.create(char_literal36)
            	            ;
            	            adaptor.addChild(root_0, char_literal36_tree);


            	            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:51:81: ( ID | 'true' | 'false' | expression )
            	            int alt6=4;
            	            switch ( input.LA(1) ) {
            	            case ID:
            	                {
            	                int LA6_1 = input.LA(2);

            	                if ( (LA6_1==ArithmaticOperators) ) {
            	                    alt6=4;
            	                }
            	                else if ( ((LA6_1 >= 26 && LA6_1 <= 27)) ) {
            	                    alt6=1;
            	                }
            	                else {
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("", 6, 1, input);

            	                    throw nvae;

            	                }
            	                }
            	                break;
            	            case 48:
            	                {
            	                alt6=2;
            	                }
            	                break;
            	            case 42:
            	                {
            	                alt6=3;
            	                }
            	                break;
            	            case DoubleNum:
            	            case IntNum:
            	                {
            	                alt6=4;
            	                }
            	                break;
            	            default:
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 6, 0, input);

            	                throw nvae;

            	            }

            	            switch (alt6) {
            	                case 1 :
            	                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:51:82: ID
            	                    {
            	                    ID37=(Token)match(input,ID,FOLLOW_ID_in_declOfBool208); 
            	                    ID37_tree = 
            	                    (Object)adaptor.create(ID37)
            	                    ;
            	                    adaptor.addChild(root_0, ID37_tree);


            	                    }
            	                    break;
            	                case 2 :
            	                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:51:87: 'true'
            	                    {
            	                    string_literal38=(Token)match(input,48,FOLLOW_48_in_declOfBool212); 
            	                    string_literal38_tree = 
            	                    (Object)adaptor.create(string_literal38)
            	                    ;
            	                    adaptor.addChild(root_0, string_literal38_tree);


            	                    }
            	                    break;
            	                case 3 :
            	                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:51:96: 'false'
            	                    {
            	                    string_literal39=(Token)match(input,42,FOLLOW_42_in_declOfBool216); 
            	                    string_literal39_tree = 
            	                    (Object)adaptor.create(string_literal39)
            	                    ;
            	                    adaptor.addChild(root_0, string_literal39_tree);


            	                    }
            	                    break;
            	                case 4 :
            	                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:51:106: expression
            	                    {
            	                    pushFollow(FOLLOW_expression_in_declOfBool220);
            	                    expression40=expression();

            	                    state._fsp--;

            	                    adaptor.addChild(root_0, expression40.getTree());

            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declOfBool"


    public static class declOfDoubleAndFloat_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declOfDoubleAndFloat"
    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:53:1: declOfDoubleAndFloat : ( 'double' | 'float' ) ID ( '=' ( ID | DoubleNum ) )? ( ',' ( ID ( '=' ( DoubleNum | ID ) )? ) )* ;
    public final lab3Parser.declOfDoubleAndFloat_return declOfDoubleAndFloat() throws RecognitionException {
        lab3Parser.declOfDoubleAndFloat_return retval = new lab3Parser.declOfDoubleAndFloat_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set41=null;
        Token ID42=null;
        Token char_literal43=null;
        Token set44=null;
        Token char_literal45=null;
        Token ID46=null;
        Token char_literal47=null;
        Token set48=null;

        Object set41_tree=null;
        Object ID42_tree=null;
        Object char_literal43_tree=null;
        Object set44_tree=null;
        Object char_literal45_tree=null;
        Object ID46_tree=null;
        Object char_literal47_tree=null;
        Object set48_tree=null;

        try {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:53:21: ( ( 'double' | 'float' ) ID ( '=' ( ID | DoubleNum ) )? ( ',' ( ID ( '=' ( DoubleNum | ID ) )? ) )* )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:53:23: ( 'double' | 'float' ) ID ( '=' ( ID | DoubleNum ) )? ( ',' ( ID ( '=' ( DoubleNum | ID ) )? ) )*
            {
            root_0 = (Object)adaptor.nil();


            set41=(Token)input.LT(1);

            if ( input.LA(1)==40||input.LA(1)==43 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set41)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            ID42=(Token)match(input,ID,FOLLOW_ID_in_declOfDoubleAndFloat241); 
            ID42_tree = 
            (Object)adaptor.create(ID42)
            ;
            adaptor.addChild(root_0, ID42_tree);


            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:53:47: ( '=' ( ID | DoubleNum ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:53:48: '=' ( ID | DoubleNum )
                    {
                    char_literal43=(Token)match(input,29,FOLLOW_29_in_declOfDoubleAndFloat244); 
                    char_literal43_tree = 
                    (Object)adaptor.create(char_literal43)
                    ;
                    adaptor.addChild(root_0, char_literal43_tree);


                    set44=(Token)input.LT(1);

                    if ( input.LA(1)==DoubleNum||input.LA(1)==ID ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set44)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:53:71: ( ',' ( ID ( '=' ( DoubleNum | ID ) )? ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:53:72: ',' ( ID ( '=' ( DoubleNum | ID ) )? )
            	    {
            	    char_literal45=(Token)match(input,26,FOLLOW_26_in_declOfDoubleAndFloat257); 
            	    char_literal45_tree = 
            	    (Object)adaptor.create(char_literal45)
            	    ;
            	    adaptor.addChild(root_0, char_literal45_tree);


            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:53:76: ( ID ( '=' ( DoubleNum | ID ) )? )
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:53:77: ID ( '=' ( DoubleNum | ID ) )?
            	    {
            	    ID46=(Token)match(input,ID,FOLLOW_ID_in_declOfDoubleAndFloat260); 
            	    ID46_tree = 
            	    (Object)adaptor.create(ID46)
            	    ;
            	    adaptor.addChild(root_0, ID46_tree);


            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:53:80: ( '=' ( DoubleNum | ID ) )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==29) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:53:81: '=' ( DoubleNum | ID )
            	            {
            	            char_literal47=(Token)match(input,29,FOLLOW_29_in_declOfDoubleAndFloat263); 
            	            char_literal47_tree = 
            	            (Object)adaptor.create(char_literal47)
            	            ;
            	            adaptor.addChild(root_0, char_literal47_tree);


            	            set48=(Token)input.LT(1);

            	            if ( input.LA(1)==DoubleNum||input.LA(1)==ID ) {
            	                input.consume();
            	                adaptor.addChild(root_0, 
            	                (Object)adaptor.create(set48)
            	                );
            	                state.errorRecovery=false;
            	            }
            	            else {
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                throw mse;
            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declOfDoubleAndFloat"


    public static class declOfInteger_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declOfInteger"
    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:55:1: declOfInteger : 'int' ID ( '=' ( ID | IntNum ) )? ( ',' ( ID ( '=' ( IntNum | ID ) )? ) )* ;
    public final lab3Parser.declOfInteger_return declOfInteger() throws RecognitionException {
        lab3Parser.declOfInteger_return retval = new lab3Parser.declOfInteger_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal49=null;
        Token ID50=null;
        Token char_literal51=null;
        Token set52=null;
        Token char_literal53=null;
        Token ID54=null;
        Token char_literal55=null;
        Token set56=null;

        Object string_literal49_tree=null;
        Object ID50_tree=null;
        Object char_literal51_tree=null;
        Object set52_tree=null;
        Object char_literal53_tree=null;
        Object ID54_tree=null;
        Object char_literal55_tree=null;
        Object set56_tree=null;

        try {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:55:14: ( 'int' ID ( '=' ( ID | IntNum ) )? ( ',' ( ID ( '=' ( IntNum | ID ) )? ) )* )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:55:17: 'int' ID ( '=' ( ID | IntNum ) )? ( ',' ( ID ( '=' ( IntNum | ID ) )? ) )*
            {
            root_0 = (Object)adaptor.nil();


            string_literal49=(Token)match(input,46,FOLLOW_46_in_declOfInteger284); 
            string_literal49_tree = 
            (Object)adaptor.create(string_literal49)
            ;
            adaptor.addChild(root_0, string_literal49_tree);


            ID50=(Token)match(input,ID,FOLLOW_ID_in_declOfInteger286); 
            ID50_tree = 
            (Object)adaptor.create(ID50)
            ;
            adaptor.addChild(root_0, ID50_tree);


            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:55:26: ( '=' ( ID | IntNum ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:55:27: '=' ( ID | IntNum )
                    {
                    char_literal51=(Token)match(input,29,FOLLOW_29_in_declOfInteger289); 
                    char_literal51_tree = 
                    (Object)adaptor.create(char_literal51)
                    ;
                    adaptor.addChild(root_0, char_literal51_tree);


                    set52=(Token)input.LT(1);

                    if ( (input.LA(1) >= ID && input.LA(1) <= IntNum) ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set52)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:55:47: ( ',' ( ID ( '=' ( IntNum | ID ) )? ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:55:48: ',' ( ID ( '=' ( IntNum | ID ) )? )
            	    {
            	    char_literal53=(Token)match(input,26,FOLLOW_26_in_declOfInteger302); 
            	    char_literal53_tree = 
            	    (Object)adaptor.create(char_literal53)
            	    ;
            	    adaptor.addChild(root_0, char_literal53_tree);


            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:55:52: ( ID ( '=' ( IntNum | ID ) )? )
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:55:53: ID ( '=' ( IntNum | ID ) )?
            	    {
            	    ID54=(Token)match(input,ID,FOLLOW_ID_in_declOfInteger305); 
            	    ID54_tree = 
            	    (Object)adaptor.create(ID54)
            	    ;
            	    adaptor.addChild(root_0, ID54_tree);


            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:55:56: ( '=' ( IntNum | ID ) )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==29) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:55:57: '=' ( IntNum | ID )
            	            {
            	            char_literal55=(Token)match(input,29,FOLLOW_29_in_declOfInteger308); 
            	            char_literal55_tree = 
            	            (Object)adaptor.create(char_literal55)
            	            ;
            	            adaptor.addChild(root_0, char_literal55_tree);


            	            set56=(Token)input.LT(1);

            	            if ( (input.LA(1) >= ID && input.LA(1) <= IntNum) ) {
            	                input.consume();
            	                adaptor.addChild(root_0, 
            	                (Object)adaptor.create(set56)
            	                );
            	                state.errorRecovery=false;
            	            }
            	            else {
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                throw mse;
            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declOfInteger"


    public static class declOfString_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declOfString"
    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:57:1: declOfString : 'String' ID ( '=' ( ID | StringValue ) )? ( ',' ( ID ( '=' ( StringValue | ID ) )? ) )* ;
    public final lab3Parser.declOfString_return declOfString() throws RecognitionException {
        lab3Parser.declOfString_return retval = new lab3Parser.declOfString_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal57=null;
        Token ID58=null;
        Token char_literal59=null;
        Token set60=null;
        Token char_literal61=null;
        Token ID62=null;
        Token char_literal63=null;
        Token set64=null;

        Object string_literal57_tree=null;
        Object ID58_tree=null;
        Object char_literal59_tree=null;
        Object set60_tree=null;
        Object char_literal61_tree=null;
        Object ID62_tree=null;
        Object char_literal63_tree=null;
        Object set64_tree=null;

        try {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:57:13: ( 'String' ID ( '=' ( ID | StringValue ) )? ( ',' ( ID ( '=' ( StringValue | ID ) )? ) )* )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:57:15: 'String' ID ( '=' ( ID | StringValue ) )? ( ',' ( ID ( '=' ( StringValue | ID ) )? ) )*
            {
            root_0 = (Object)adaptor.nil();


            string_literal57=(Token)match(input,30,FOLLOW_30_in_declOfString328); 
            string_literal57_tree = 
            (Object)adaptor.create(string_literal57)
            ;
            adaptor.addChild(root_0, string_literal57_tree);


            ID58=(Token)match(input,ID,FOLLOW_ID_in_declOfString330); 
            ID58_tree = 
            (Object)adaptor.create(ID58)
            ;
            adaptor.addChild(root_0, ID58_tree);


            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:57:27: ( '=' ( ID | StringValue ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:57:28: '=' ( ID | StringValue )
                    {
                    char_literal59=(Token)match(input,29,FOLLOW_29_in_declOfString333); 
                    char_literal59_tree = 
                    (Object)adaptor.create(char_literal59)
                    ;
                    adaptor.addChild(root_0, char_literal59_tree);


                    set60=(Token)input.LT(1);

                    if ( input.LA(1)==ID||input.LA(1)==StringValue ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set60)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:57:53: ( ',' ( ID ( '=' ( StringValue | ID ) )? ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==26) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:57:54: ',' ( ID ( '=' ( StringValue | ID ) )? )
            	    {
            	    char_literal61=(Token)match(input,26,FOLLOW_26_in_declOfString346); 
            	    char_literal61_tree = 
            	    (Object)adaptor.create(char_literal61)
            	    ;
            	    adaptor.addChild(root_0, char_literal61_tree);


            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:57:58: ( ID ( '=' ( StringValue | ID ) )? )
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:57:59: ID ( '=' ( StringValue | ID ) )?
            	    {
            	    ID62=(Token)match(input,ID,FOLLOW_ID_in_declOfString349); 
            	    ID62_tree = 
            	    (Object)adaptor.create(ID62)
            	    ;
            	    adaptor.addChild(root_0, ID62_tree);


            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:57:62: ( '=' ( StringValue | ID ) )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==29) ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:57:63: '=' ( StringValue | ID )
            	            {
            	            char_literal63=(Token)match(input,29,FOLLOW_29_in_declOfString352); 
            	            char_literal63_tree = 
            	            (Object)adaptor.create(char_literal63)
            	            ;
            	            adaptor.addChild(root_0, char_literal63_tree);


            	            set64=(Token)input.LT(1);

            	            if ( input.LA(1)==ID||input.LA(1)==StringValue ) {
            	                input.consume();
            	                adaptor.addChild(root_0, 
            	                (Object)adaptor.create(set64)
            	                );
            	                state.errorRecovery=false;
            	            }
            	            else {
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                throw mse;
            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declOfString"


    public static class declOfChar_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declOfChar"
    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:59:1: declOfChar : 'char' ID ( '=' ( ID | CharValue ) )? ( ',' ( ID ( '=' ( CharValue | ID ) )? ) )* ;
    public final lab3Parser.declOfChar_return declOfChar() throws RecognitionException {
        lab3Parser.declOfChar_return retval = new lab3Parser.declOfChar_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal65=null;
        Token ID66=null;
        Token char_literal67=null;
        Token set68=null;
        Token char_literal69=null;
        Token ID70=null;
        Token char_literal71=null;
        Token set72=null;

        Object string_literal65_tree=null;
        Object ID66_tree=null;
        Object char_literal67_tree=null;
        Object set68_tree=null;
        Object char_literal69_tree=null;
        Object ID70_tree=null;
        Object char_literal71_tree=null;
        Object set72_tree=null;

        try {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:59:11: ( 'char' ID ( '=' ( ID | CharValue ) )? ( ',' ( ID ( '=' ( CharValue | ID ) )? ) )* )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:59:13: 'char' ID ( '=' ( ID | CharValue ) )? ( ',' ( ID ( '=' ( CharValue | ID ) )? ) )*
            {
            root_0 = (Object)adaptor.nil();


            string_literal65=(Token)match(input,36,FOLLOW_36_in_declOfChar374); 
            string_literal65_tree = 
            (Object)adaptor.create(string_literal65)
            ;
            adaptor.addChild(root_0, string_literal65_tree);


            ID66=(Token)match(input,ID,FOLLOW_ID_in_declOfChar376); 
            ID66_tree = 
            (Object)adaptor.create(ID66)
            ;
            adaptor.addChild(root_0, ID66_tree);


            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:59:23: ( '=' ( ID | CharValue ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:59:24: '=' ( ID | CharValue )
                    {
                    char_literal67=(Token)match(input,29,FOLLOW_29_in_declOfChar379); 
                    char_literal67_tree = 
                    (Object)adaptor.create(char_literal67)
                    ;
                    adaptor.addChild(root_0, char_literal67_tree);


                    set68=(Token)input.LT(1);

                    if ( input.LA(1)==CharValue||input.LA(1)==ID ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set68)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:59:47: ( ',' ( ID ( '=' ( CharValue | ID ) )? ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==26) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:59:48: ',' ( ID ( '=' ( CharValue | ID ) )? )
            	    {
            	    char_literal69=(Token)match(input,26,FOLLOW_26_in_declOfChar392); 
            	    char_literal69_tree = 
            	    (Object)adaptor.create(char_literal69)
            	    ;
            	    adaptor.addChild(root_0, char_literal69_tree);


            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:59:52: ( ID ( '=' ( CharValue | ID ) )? )
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:59:53: ID ( '=' ( CharValue | ID ) )?
            	    {
            	    ID70=(Token)match(input,ID,FOLLOW_ID_in_declOfChar395); 
            	    ID70_tree = 
            	    (Object)adaptor.create(ID70)
            	    ;
            	    adaptor.addChild(root_0, ID70_tree);


            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:59:56: ( '=' ( CharValue | ID ) )?
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==29) ) {
            	        alt19=1;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:59:57: '=' ( CharValue | ID )
            	            {
            	            char_literal71=(Token)match(input,29,FOLLOW_29_in_declOfChar398); 
            	            char_literal71_tree = 
            	            (Object)adaptor.create(char_literal71)
            	            ;
            	            adaptor.addChild(root_0, char_literal71_tree);


            	            set72=(Token)input.LT(1);

            	            if ( input.LA(1)==CharValue||input.LA(1)==ID ) {
            	                input.consume();
            	                adaptor.addChild(root_0, 
            	                (Object)adaptor.create(set72)
            	                );
            	                state.errorRecovery=false;
            	            }
            	            else {
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                throw mse;
            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declOfChar"


    public static class declOfAuto_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declOfAuto"
    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:61:1: declOfAuto : 'auto' ID ( '=' ( ID | CharValue | StringValue | IntNum | DoubleNum | 'true' | 'false' | expression ) )? ( ',' ( ID ( '=' ( ID | CharValue | StringValue | IntNum | DoubleNum | 'true' | 'false' | expression ) )? ) )* ;
    public final lab3Parser.declOfAuto_return declOfAuto() throws RecognitionException {
        lab3Parser.declOfAuto_return retval = new lab3Parser.declOfAuto_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal73=null;
        Token ID74=null;
        Token char_literal75=null;
        Token ID76=null;
        Token CharValue77=null;
        Token StringValue78=null;
        Token IntNum79=null;
        Token DoubleNum80=null;
        Token string_literal81=null;
        Token string_literal82=null;
        Token char_literal84=null;
        Token ID85=null;
        Token char_literal86=null;
        Token ID87=null;
        Token CharValue88=null;
        Token StringValue89=null;
        Token IntNum90=null;
        Token DoubleNum91=null;
        Token string_literal92=null;
        Token string_literal93=null;
        lab3Parser.expression_return expression83 =null;

        lab3Parser.expression_return expression94 =null;


        Object string_literal73_tree=null;
        Object ID74_tree=null;
        Object char_literal75_tree=null;
        Object ID76_tree=null;
        Object CharValue77_tree=null;
        Object StringValue78_tree=null;
        Object IntNum79_tree=null;
        Object DoubleNum80_tree=null;
        Object string_literal81_tree=null;
        Object string_literal82_tree=null;
        Object char_literal84_tree=null;
        Object ID85_tree=null;
        Object char_literal86_tree=null;
        Object ID87_tree=null;
        Object CharValue88_tree=null;
        Object StringValue89_tree=null;
        Object IntNum90_tree=null;
        Object DoubleNum91_tree=null;
        Object string_literal92_tree=null;
        Object string_literal93_tree=null;

        try {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:61:11: ( 'auto' ID ( '=' ( ID | CharValue | StringValue | IntNum | DoubleNum | 'true' | 'false' | expression ) )? ( ',' ( ID ( '=' ( ID | CharValue | StringValue | IntNum | DoubleNum | 'true' | 'false' | expression ) )? ) )* )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:61:13: 'auto' ID ( '=' ( ID | CharValue | StringValue | IntNum | DoubleNum | 'true' | 'false' | expression ) )? ( ',' ( ID ( '=' ( ID | CharValue | StringValue | IntNum | DoubleNum | 'true' | 'false' | expression ) )? ) )*
            {
            root_0 = (Object)adaptor.nil();


            string_literal73=(Token)match(input,33,FOLLOW_33_in_declOfAuto418); 
            string_literal73_tree = 
            (Object)adaptor.create(string_literal73)
            ;
            adaptor.addChild(root_0, string_literal73_tree);


            ID74=(Token)match(input,ID,FOLLOW_ID_in_declOfAuto420); 
            ID74_tree = 
            (Object)adaptor.create(ID74)
            ;
            adaptor.addChild(root_0, ID74_tree);


            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:61:23: ( '=' ( ID | CharValue | StringValue | IntNum | DoubleNum | 'true' | 'false' | expression ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:61:24: '=' ( ID | CharValue | StringValue | IntNum | DoubleNum | 'true' | 'false' | expression )
                    {
                    char_literal75=(Token)match(input,29,FOLLOW_29_in_declOfAuto423); 
                    char_literal75_tree = 
                    (Object)adaptor.create(char_literal75)
                    ;
                    adaptor.addChild(root_0, char_literal75_tree);


                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:61:28: ( ID | CharValue | StringValue | IntNum | DoubleNum | 'true' | 'false' | expression )
                    int alt21=8;
                    switch ( input.LA(1) ) {
                    case ID:
                        {
                        int LA21_1 = input.LA(2);

                        if ( (LA21_1==ArithmaticOperators) ) {
                            alt21=8;
                        }
                        else if ( ((LA21_1 >= 26 && LA21_1 <= 27)) ) {
                            alt21=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 21, 1, input);

                            throw nvae;

                        }
                        }
                        break;
                    case CharValue:
                        {
                        alt21=2;
                        }
                        break;
                    case StringValue:
                        {
                        alt21=3;
                        }
                        break;
                    case IntNum:
                        {
                        int LA21_4 = input.LA(2);

                        if ( (LA21_4==ArithmaticOperators) ) {
                            alt21=8;
                        }
                        else if ( ((LA21_4 >= 26 && LA21_4 <= 27)) ) {
                            alt21=4;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 21, 4, input);

                            throw nvae;

                        }
                        }
                        break;
                    case DoubleNum:
                        {
                        int LA21_5 = input.LA(2);

                        if ( (LA21_5==ArithmaticOperators) ) {
                            alt21=8;
                        }
                        else if ( ((LA21_5 >= 26 && LA21_5 <= 27)) ) {
                            alt21=5;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 21, 5, input);

                            throw nvae;

                        }
                        }
                        break;
                    case 48:
                        {
                        alt21=6;
                        }
                        break;
                    case 42:
                        {
                        alt21=7;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;

                    }

                    switch (alt21) {
                        case 1 :
                            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:61:29: ID
                            {
                            ID76=(Token)match(input,ID,FOLLOW_ID_in_declOfAuto426); 
                            ID76_tree = 
                            (Object)adaptor.create(ID76)
                            ;
                            adaptor.addChild(root_0, ID76_tree);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:61:34: CharValue
                            {
                            CharValue77=(Token)match(input,CharValue,FOLLOW_CharValue_in_declOfAuto430); 
                            CharValue77_tree = 
                            (Object)adaptor.create(CharValue77)
                            ;
                            adaptor.addChild(root_0, CharValue77_tree);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:61:46: StringValue
                            {
                            StringValue78=(Token)match(input,StringValue,FOLLOW_StringValue_in_declOfAuto434); 
                            StringValue78_tree = 
                            (Object)adaptor.create(StringValue78)
                            ;
                            adaptor.addChild(root_0, StringValue78_tree);


                            }
                            break;
                        case 4 :
                            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:61:60: IntNum
                            {
                            IntNum79=(Token)match(input,IntNum,FOLLOW_IntNum_in_declOfAuto438); 
                            IntNum79_tree = 
                            (Object)adaptor.create(IntNum79)
                            ;
                            adaptor.addChild(root_0, IntNum79_tree);


                            }
                            break;
                        case 5 :
                            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:61:69: DoubleNum
                            {
                            DoubleNum80=(Token)match(input,DoubleNum,FOLLOW_DoubleNum_in_declOfAuto442); 
                            DoubleNum80_tree = 
                            (Object)adaptor.create(DoubleNum80)
                            ;
                            adaptor.addChild(root_0, DoubleNum80_tree);


                            }
                            break;
                        case 6 :
                            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:61:81: 'true'
                            {
                            string_literal81=(Token)match(input,48,FOLLOW_48_in_declOfAuto446); 
                            string_literal81_tree = 
                            (Object)adaptor.create(string_literal81)
                            ;
                            adaptor.addChild(root_0, string_literal81_tree);


                            }
                            break;
                        case 7 :
                            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:61:90: 'false'
                            {
                            string_literal82=(Token)match(input,42,FOLLOW_42_in_declOfAuto450); 
                            string_literal82_tree = 
                            (Object)adaptor.create(string_literal82)
                            ;
                            adaptor.addChild(root_0, string_literal82_tree);


                            }
                            break;
                        case 8 :
                            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:61:100: expression
                            {
                            pushFollow(FOLLOW_expression_in_declOfAuto454);
                            expression83=expression();

                            state._fsp--;

                            adaptor.addChild(root_0, expression83.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }


            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:61:114: ( ',' ( ID ( '=' ( ID | CharValue | StringValue | IntNum | DoubleNum | 'true' | 'false' | expression ) )? ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==26) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:61:115: ',' ( ID ( '=' ( ID | CharValue | StringValue | IntNum | DoubleNum | 'true' | 'false' | expression ) )? )
            	    {
            	    char_literal84=(Token)match(input,26,FOLLOW_26_in_declOfAuto460); 
            	    char_literal84_tree = 
            	    (Object)adaptor.create(char_literal84)
            	    ;
            	    adaptor.addChild(root_0, char_literal84_tree);


            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:61:119: ( ID ( '=' ( ID | CharValue | StringValue | IntNum | DoubleNum | 'true' | 'false' | expression ) )? )
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:61:120: ID ( '=' ( ID | CharValue | StringValue | IntNum | DoubleNum | 'true' | 'false' | expression ) )?
            	    {
            	    ID85=(Token)match(input,ID,FOLLOW_ID_in_declOfAuto463); 
            	    ID85_tree = 
            	    (Object)adaptor.create(ID85)
            	    ;
            	    adaptor.addChild(root_0, ID85_tree);


            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:61:123: ( '=' ( ID | CharValue | StringValue | IntNum | DoubleNum | 'true' | 'false' | expression ) )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==29) ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:61:124: '=' ( ID | CharValue | StringValue | IntNum | DoubleNum | 'true' | 'false' | expression )
            	            {
            	            char_literal86=(Token)match(input,29,FOLLOW_29_in_declOfAuto466); 
            	            char_literal86_tree = 
            	            (Object)adaptor.create(char_literal86)
            	            ;
            	            adaptor.addChild(root_0, char_literal86_tree);


            	            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:61:128: ( ID | CharValue | StringValue | IntNum | DoubleNum | 'true' | 'false' | expression )
            	            int alt23=8;
            	            switch ( input.LA(1) ) {
            	            case ID:
            	                {
            	                int LA23_1 = input.LA(2);

            	                if ( (LA23_1==ArithmaticOperators) ) {
            	                    alt23=8;
            	                }
            	                else if ( ((LA23_1 >= 26 && LA23_1 <= 27)) ) {
            	                    alt23=1;
            	                }
            	                else {
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("", 23, 1, input);

            	                    throw nvae;

            	                }
            	                }
            	                break;
            	            case CharValue:
            	                {
            	                alt23=2;
            	                }
            	                break;
            	            case StringValue:
            	                {
            	                alt23=3;
            	                }
            	                break;
            	            case IntNum:
            	                {
            	                int LA23_4 = input.LA(2);

            	                if ( (LA23_4==ArithmaticOperators) ) {
            	                    alt23=8;
            	                }
            	                else if ( ((LA23_4 >= 26 && LA23_4 <= 27)) ) {
            	                    alt23=4;
            	                }
            	                else {
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("", 23, 4, input);

            	                    throw nvae;

            	                }
            	                }
            	                break;
            	            case DoubleNum:
            	                {
            	                int LA23_5 = input.LA(2);

            	                if ( (LA23_5==ArithmaticOperators) ) {
            	                    alt23=8;
            	                }
            	                else if ( ((LA23_5 >= 26 && LA23_5 <= 27)) ) {
            	                    alt23=5;
            	                }
            	                else {
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("", 23, 5, input);

            	                    throw nvae;

            	                }
            	                }
            	                break;
            	            case 48:
            	                {
            	                alt23=6;
            	                }
            	                break;
            	            case 42:
            	                {
            	                alt23=7;
            	                }
            	                break;
            	            default:
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 23, 0, input);

            	                throw nvae;

            	            }

            	            switch (alt23) {
            	                case 1 :
            	                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:61:129: ID
            	                    {
            	                    ID87=(Token)match(input,ID,FOLLOW_ID_in_declOfAuto469); 
            	                    ID87_tree = 
            	                    (Object)adaptor.create(ID87)
            	                    ;
            	                    adaptor.addChild(root_0, ID87_tree);


            	                    }
            	                    break;
            	                case 2 :
            	                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:61:134: CharValue
            	                    {
            	                    CharValue88=(Token)match(input,CharValue,FOLLOW_CharValue_in_declOfAuto473); 
            	                    CharValue88_tree = 
            	                    (Object)adaptor.create(CharValue88)
            	                    ;
            	                    adaptor.addChild(root_0, CharValue88_tree);


            	                    }
            	                    break;
            	                case 3 :
            	                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:61:146: StringValue
            	                    {
            	                    StringValue89=(Token)match(input,StringValue,FOLLOW_StringValue_in_declOfAuto477); 
            	                    StringValue89_tree = 
            	                    (Object)adaptor.create(StringValue89)
            	                    ;
            	                    adaptor.addChild(root_0, StringValue89_tree);


            	                    }
            	                    break;
            	                case 4 :
            	                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:61:160: IntNum
            	                    {
            	                    IntNum90=(Token)match(input,IntNum,FOLLOW_IntNum_in_declOfAuto481); 
            	                    IntNum90_tree = 
            	                    (Object)adaptor.create(IntNum90)
            	                    ;
            	                    adaptor.addChild(root_0, IntNum90_tree);


            	                    }
            	                    break;
            	                case 5 :
            	                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:61:169: DoubleNum
            	                    {
            	                    DoubleNum91=(Token)match(input,DoubleNum,FOLLOW_DoubleNum_in_declOfAuto485); 
            	                    DoubleNum91_tree = 
            	                    (Object)adaptor.create(DoubleNum91)
            	                    ;
            	                    adaptor.addChild(root_0, DoubleNum91_tree);


            	                    }
            	                    break;
            	                case 6 :
            	                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:61:181: 'true'
            	                    {
            	                    string_literal92=(Token)match(input,48,FOLLOW_48_in_declOfAuto489); 
            	                    string_literal92_tree = 
            	                    (Object)adaptor.create(string_literal92)
            	                    ;
            	                    adaptor.addChild(root_0, string_literal92_tree);


            	                    }
            	                    break;
            	                case 7 :
            	                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:61:190: 'false'
            	                    {
            	                    string_literal93=(Token)match(input,42,FOLLOW_42_in_declOfAuto493); 
            	                    string_literal93_tree = 
            	                    (Object)adaptor.create(string_literal93)
            	                    ;
            	                    adaptor.addChild(root_0, string_literal93_tree);


            	                    }
            	                    break;
            	                case 8 :
            	                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:61:200: expression
            	                    {
            	                    pushFollow(FOLLOW_expression_in_declOfAuto497);
            	                    expression94=expression();

            	                    state._fsp--;

            	                    adaptor.addChild(root_0, expression94.getTree());

            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declOfAuto"


    public static class declOfPointer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declOfPointer"
    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:63:1: declOfPointer : ( 'int' | 'double' | 'char' | 'String' | 'float' | ID ) '*' ID ( '=' '&' ID )? ( ',' '*' ID ( '=' '&' ID )? )* ;
    public final lab3Parser.declOfPointer_return declOfPointer() throws RecognitionException {
        lab3Parser.declOfPointer_return retval = new lab3Parser.declOfPointer_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set95=null;
        Token char_literal96=null;
        Token ID97=null;
        Token char_literal98=null;
        Token char_literal99=null;
        Token ID100=null;
        Token char_literal101=null;
        Token char_literal102=null;
        Token ID103=null;
        Token char_literal104=null;
        Token char_literal105=null;
        Token ID106=null;

        Object set95_tree=null;
        Object char_literal96_tree=null;
        Object ID97_tree=null;
        Object char_literal98_tree=null;
        Object char_literal99_tree=null;
        Object ID100_tree=null;
        Object char_literal101_tree=null;
        Object char_literal102_tree=null;
        Object ID103_tree=null;
        Object char_literal104_tree=null;
        Object char_literal105_tree=null;
        Object ID106_tree=null;

        try {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:63:14: ( ( 'int' | 'double' | 'char' | 'String' | 'float' | ID ) '*' ID ( '=' '&' ID )? ( ',' '*' ID ( '=' '&' ID )? )* )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:63:16: ( 'int' | 'double' | 'char' | 'String' | 'float' | ID ) '*' ID ( '=' '&' ID )? ( ',' '*' ID ( '=' '&' ID )? )*
            {
            root_0 = (Object)adaptor.nil();


            set95=(Token)input.LT(1);

            if ( input.LA(1)==ID||input.LA(1)==30||input.LA(1)==36||input.LA(1)==40||input.LA(1)==43||input.LA(1)==46 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set95)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            char_literal96=(Token)match(input,24,FOLLOW_24_in_declOfPointer534); 
            char_literal96_tree = 
            (Object)adaptor.create(char_literal96)
            ;
            adaptor.addChild(root_0, char_literal96_tree);


            ID97=(Token)match(input,ID,FOLLOW_ID_in_declOfPointer535); 
            ID97_tree = 
            (Object)adaptor.create(ID97)
            ;
            adaptor.addChild(root_0, ID97_tree);


            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:63:76: ( '=' '&' ID )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==29) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:63:77: '=' '&' ID
                    {
                    char_literal98=(Token)match(input,29,FOLLOW_29_in_declOfPointer538); 
                    char_literal98_tree = 
                    (Object)adaptor.create(char_literal98)
                    ;
                    adaptor.addChild(root_0, char_literal98_tree);


                    char_literal99=(Token)match(input,21,FOLLOW_21_in_declOfPointer540); 
                    char_literal99_tree = 
                    (Object)adaptor.create(char_literal99)
                    ;
                    adaptor.addChild(root_0, char_literal99_tree);


                    ID100=(Token)match(input,ID,FOLLOW_ID_in_declOfPointer541); 
                    ID100_tree = 
                    (Object)adaptor.create(ID100)
                    ;
                    adaptor.addChild(root_0, ID100_tree);


                    }
                    break;

            }


            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:63:89: ( ',' '*' ID ( '=' '&' ID )? )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==26) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:63:90: ',' '*' ID ( '=' '&' ID )?
            	    {
            	    char_literal101=(Token)match(input,26,FOLLOW_26_in_declOfPointer546); 
            	    char_literal101_tree = 
            	    (Object)adaptor.create(char_literal101)
            	    ;
            	    adaptor.addChild(root_0, char_literal101_tree);


            	    char_literal102=(Token)match(input,24,FOLLOW_24_in_declOfPointer548); 
            	    char_literal102_tree = 
            	    (Object)adaptor.create(char_literal102)
            	    ;
            	    adaptor.addChild(root_0, char_literal102_tree);


            	    ID103=(Token)match(input,ID,FOLLOW_ID_in_declOfPointer549); 
            	    ID103_tree = 
            	    (Object)adaptor.create(ID103)
            	    ;
            	    adaptor.addChild(root_0, ID103_tree);


            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:63:100: ( '=' '&' ID )?
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==29) ) {
            	        alt27=1;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:63:101: '=' '&' ID
            	            {
            	            char_literal104=(Token)match(input,29,FOLLOW_29_in_declOfPointer552); 
            	            char_literal104_tree = 
            	            (Object)adaptor.create(char_literal104)
            	            ;
            	            adaptor.addChild(root_0, char_literal104_tree);


            	            char_literal105=(Token)match(input,21,FOLLOW_21_in_declOfPointer554); 
            	            char_literal105_tree = 
            	            (Object)adaptor.create(char_literal105)
            	            ;
            	            adaptor.addChild(root_0, char_literal105_tree);


            	            ID106=(Token)match(input,ID,FOLLOW_ID_in_declOfPointer555); 
            	            ID106_tree = 
            	            (Object)adaptor.create(ID106)
            	            ;
            	            adaptor.addChild(root_0, ID106_tree);


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declOfPointer"


    public static class declOfObjects_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declOfObjects"
    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:65:1: declOfObjects : ID ID ( '=' 'new' ID '(' ')' )? ( ',' ( ID ( '=' 'new' ID '(' ')' )? ) )* ;
    public final lab3Parser.declOfObjects_return declOfObjects() throws RecognitionException {
        lab3Parser.declOfObjects_return retval = new lab3Parser.declOfObjects_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID107=null;
        Token ID108=null;
        Token char_literal109=null;
        Token string_literal110=null;
        Token ID111=null;
        Token char_literal112=null;
        Token char_literal113=null;
        Token char_literal114=null;
        Token ID115=null;
        Token char_literal116=null;
        Token string_literal117=null;
        Token ID118=null;
        Token char_literal119=null;
        Token char_literal120=null;

        Object ID107_tree=null;
        Object ID108_tree=null;
        Object char_literal109_tree=null;
        Object string_literal110_tree=null;
        Object ID111_tree=null;
        Object char_literal112_tree=null;
        Object char_literal113_tree=null;
        Object char_literal114_tree=null;
        Object ID115_tree=null;
        Object char_literal116_tree=null;
        Object string_literal117_tree=null;
        Object ID118_tree=null;
        Object char_literal119_tree=null;
        Object char_literal120_tree=null;

        try {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:65:14: ( ID ID ( '=' 'new' ID '(' ')' )? ( ',' ( ID ( '=' 'new' ID '(' ')' )? ) )* )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:65:16: ID ID ( '=' 'new' ID '(' ')' )? ( ',' ( ID ( '=' 'new' ID '(' ')' )? ) )*
            {
            root_0 = (Object)adaptor.nil();


            ID107=(Token)match(input,ID,FOLLOW_ID_in_declOfObjects566); 
            ID107_tree = 
            (Object)adaptor.create(ID107)
            ;
            adaptor.addChild(root_0, ID107_tree);


            ID108=(Token)match(input,ID,FOLLOW_ID_in_declOfObjects568); 
            ID108_tree = 
            (Object)adaptor.create(ID108)
            ;
            adaptor.addChild(root_0, ID108_tree);


            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:65:22: ( '=' 'new' ID '(' ')' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==29) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:65:23: '=' 'new' ID '(' ')'
                    {
                    char_literal109=(Token)match(input,29,FOLLOW_29_in_declOfObjects571); 
                    char_literal109_tree = 
                    (Object)adaptor.create(char_literal109)
                    ;
                    adaptor.addChild(root_0, char_literal109_tree);


                    string_literal110=(Token)match(input,47,FOLLOW_47_in_declOfObjects573); 
                    string_literal110_tree = 
                    (Object)adaptor.create(string_literal110)
                    ;
                    adaptor.addChild(root_0, string_literal110_tree);


                    ID111=(Token)match(input,ID,FOLLOW_ID_in_declOfObjects575); 
                    ID111_tree = 
                    (Object)adaptor.create(ID111)
                    ;
                    adaptor.addChild(root_0, ID111_tree);


                    char_literal112=(Token)match(input,22,FOLLOW_22_in_declOfObjects577); 
                    char_literal112_tree = 
                    (Object)adaptor.create(char_literal112)
                    ;
                    adaptor.addChild(root_0, char_literal112_tree);


                    char_literal113=(Token)match(input,23,FOLLOW_23_in_declOfObjects580); 
                    char_literal113_tree = 
                    (Object)adaptor.create(char_literal113)
                    ;
                    adaptor.addChild(root_0, char_literal113_tree);


                    }
                    break;

            }


            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:65:47: ( ',' ( ID ( '=' 'new' ID '(' ')' )? ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==26) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:65:48: ',' ( ID ( '=' 'new' ID '(' ')' )? )
            	    {
            	    char_literal114=(Token)match(input,26,FOLLOW_26_in_declOfObjects585); 
            	    char_literal114_tree = 
            	    (Object)adaptor.create(char_literal114)
            	    ;
            	    adaptor.addChild(root_0, char_literal114_tree);


            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:65:52: ( ID ( '=' 'new' ID '(' ')' )? )
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:65:53: ID ( '=' 'new' ID '(' ')' )?
            	    {
            	    ID115=(Token)match(input,ID,FOLLOW_ID_in_declOfObjects588); 
            	    ID115_tree = 
            	    (Object)adaptor.create(ID115)
            	    ;
            	    adaptor.addChild(root_0, ID115_tree);


            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:65:56: ( '=' 'new' ID '(' ')' )?
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==29) ) {
            	        alt30=1;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:65:57: '=' 'new' ID '(' ')'
            	            {
            	            char_literal116=(Token)match(input,29,FOLLOW_29_in_declOfObjects591); 
            	            char_literal116_tree = 
            	            (Object)adaptor.create(char_literal116)
            	            ;
            	            adaptor.addChild(root_0, char_literal116_tree);


            	            string_literal117=(Token)match(input,47,FOLLOW_47_in_declOfObjects593); 
            	            string_literal117_tree = 
            	            (Object)adaptor.create(string_literal117)
            	            ;
            	            adaptor.addChild(root_0, string_literal117_tree);


            	            ID118=(Token)match(input,ID,FOLLOW_ID_in_declOfObjects595); 
            	            ID118_tree = 
            	            (Object)adaptor.create(ID118)
            	            ;
            	            adaptor.addChild(root_0, ID118_tree);


            	            char_literal119=(Token)match(input,22,FOLLOW_22_in_declOfObjects597); 
            	            char_literal119_tree = 
            	            (Object)adaptor.create(char_literal119)
            	            ;
            	            adaptor.addChild(root_0, char_literal119_tree);


            	            char_literal120=(Token)match(input,23,FOLLOW_23_in_declOfObjects600); 
            	            char_literal120_tree = 
            	            (Object)adaptor.create(char_literal120)
            	            ;
            	            adaptor.addChild(root_0, char_literal120_tree);


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declOfObjects"


    public static class declOfArrays_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declOfArrays"
    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:67:1: declOfArrays : ( 'int' | 'double' | 'char' | 'String' | 'float' ) '[' ']' ID '=' 'new' ID '[' IntNum ']' ;
    public final lab3Parser.declOfArrays_return declOfArrays() throws RecognitionException {
        lab3Parser.declOfArrays_return retval = new lab3Parser.declOfArrays_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set121=null;
        Token char_literal122=null;
        Token char_literal123=null;
        Token ID124=null;
        Token char_literal125=null;
        Token string_literal126=null;
        Token ID127=null;
        Token char_literal128=null;
        Token IntNum129=null;
        Token char_literal130=null;

        Object set121_tree=null;
        Object char_literal122_tree=null;
        Object char_literal123_tree=null;
        Object ID124_tree=null;
        Object char_literal125_tree=null;
        Object string_literal126_tree=null;
        Object ID127_tree=null;
        Object char_literal128_tree=null;
        Object IntNum129_tree=null;
        Object char_literal130_tree=null;

        try {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:67:13: ( ( 'int' | 'double' | 'char' | 'String' | 'float' ) '[' ']' ID '=' 'new' ID '[' IntNum ']' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:67:15: ( 'int' | 'double' | 'char' | 'String' | 'float' ) '[' ']' ID '=' 'new' ID '[' IntNum ']'
            {
            root_0 = (Object)adaptor.nil();


            set121=(Token)input.LT(1);

            if ( input.LA(1)==30||input.LA(1)==36||input.LA(1)==40||input.LA(1)==43||input.LA(1)==46 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set121)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            char_literal122=(Token)match(input,31,FOLLOW_31_in_declOfArrays631); 
            char_literal122_tree = 
            (Object)adaptor.create(char_literal122)
            ;
            adaptor.addChild(root_0, char_literal122_tree);


            char_literal123=(Token)match(input,32,FOLLOW_32_in_declOfArrays632); 
            char_literal123_tree = 
            (Object)adaptor.create(char_literal123)
            ;
            adaptor.addChild(root_0, char_literal123_tree);


            ID124=(Token)match(input,ID,FOLLOW_ID_in_declOfArrays634); 
            ID124_tree = 
            (Object)adaptor.create(ID124)
            ;
            adaptor.addChild(root_0, ID124_tree);


            char_literal125=(Token)match(input,29,FOLLOW_29_in_declOfArrays636); 
            char_literal125_tree = 
            (Object)adaptor.create(char_literal125)
            ;
            adaptor.addChild(root_0, char_literal125_tree);


            string_literal126=(Token)match(input,47,FOLLOW_47_in_declOfArrays638); 
            string_literal126_tree = 
            (Object)adaptor.create(string_literal126)
            ;
            adaptor.addChild(root_0, string_literal126_tree);


            ID127=(Token)match(input,ID,FOLLOW_ID_in_declOfArrays640); 
            ID127_tree = 
            (Object)adaptor.create(ID127)
            ;
            adaptor.addChild(root_0, ID127_tree);


            char_literal128=(Token)match(input,31,FOLLOW_31_in_declOfArrays642); 
            char_literal128_tree = 
            (Object)adaptor.create(char_literal128)
            ;
            adaptor.addChild(root_0, char_literal128_tree);


            IntNum129=(Token)match(input,IntNum,FOLLOW_IntNum_in_declOfArrays643); 
            IntNum129_tree = 
            (Object)adaptor.create(IntNum129)
            ;
            adaptor.addChild(root_0, IntNum129_tree);


            char_literal130=(Token)match(input,32,FOLLOW_32_in_declOfArrays644); 
            char_literal130_tree = 
            (Object)adaptor.create(char_literal130)
            ;
            adaptor.addChild(root_0, char_literal130_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declOfArrays"


    public static class if_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_stmt"
    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:69:1: if_stmt : 'if' '(' expression ( LogicalOperators expression )* ')' '{' ( stmt )* '}' ( 'else' '{' ( stmt )* '}' )? ;
    public final lab3Parser.if_stmt_return if_stmt() throws RecognitionException {
        lab3Parser.if_stmt_return retval = new lab3Parser.if_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal131=null;
        Token char_literal132=null;
        Token LogicalOperators134=null;
        Token char_literal136=null;
        Token char_literal137=null;
        Token char_literal139=null;
        Token string_literal140=null;
        Token char_literal141=null;
        Token char_literal143=null;
        lab3Parser.expression_return expression133 =null;

        lab3Parser.expression_return expression135 =null;

        lab3Parser.stmt_return stmt138 =null;

        lab3Parser.stmt_return stmt142 =null;


        Object string_literal131_tree=null;
        Object char_literal132_tree=null;
        Object LogicalOperators134_tree=null;
        Object char_literal136_tree=null;
        Object char_literal137_tree=null;
        Object char_literal139_tree=null;
        Object string_literal140_tree=null;
        Object char_literal141_tree=null;
        Object char_literal143_tree=null;

        try {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:69:9: ( 'if' '(' expression ( LogicalOperators expression )* ')' '{' ( stmt )* '}' ( 'else' '{' ( stmt )* '}' )? )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:69:11: 'if' '(' expression ( LogicalOperators expression )* ')' '{' ( stmt )* '}' ( 'else' '{' ( stmt )* '}' )?
            {
            root_0 = (Object)adaptor.nil();


            string_literal131=(Token)match(input,45,FOLLOW_45_in_if_stmt652); 
            string_literal131_tree = 
            (Object)adaptor.create(string_literal131)
            ;
            adaptor.addChild(root_0, string_literal131_tree);


            char_literal132=(Token)match(input,22,FOLLOW_22_in_if_stmt653); 
            char_literal132_tree = 
            (Object)adaptor.create(char_literal132)
            ;
            adaptor.addChild(root_0, char_literal132_tree);


            pushFollow(FOLLOW_expression_in_if_stmt654);
            expression133=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression133.getTree());

            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:69:29: ( LogicalOperators expression )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==LogicalOperators) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:69:30: LogicalOperators expression
            	    {
            	    LogicalOperators134=(Token)match(input,LogicalOperators,FOLLOW_LogicalOperators_in_if_stmt657); 
            	    LogicalOperators134_tree = 
            	    (Object)adaptor.create(LogicalOperators134)
            	    ;
            	    adaptor.addChild(root_0, LogicalOperators134_tree);


            	    pushFollow(FOLLOW_expression_in_if_stmt659);
            	    expression135=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression135.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            char_literal136=(Token)match(input,23,FOLLOW_23_in_if_stmt662); 
            char_literal136_tree = 
            (Object)adaptor.create(char_literal136)
            ;
            adaptor.addChild(root_0, char_literal136_tree);


            char_literal137=(Token)match(input,50,FOLLOW_50_in_if_stmt663); 
            char_literal137_tree = 
            (Object)adaptor.create(char_literal137)
            ;
            adaptor.addChild(root_0, char_literal137_tree);


            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:69:66: ( stmt )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==AssignmentAutoOperators||LA33_0==ID||LA33_0==30||(LA33_0 >= 33 && LA33_0 <= 40)||(LA33_0 >= 43 && LA33_0 <= 46)||LA33_0==49) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:69:66: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_if_stmt665);
            	    stmt138=stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stmt138.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            char_literal139=(Token)match(input,51,FOLLOW_51_in_if_stmt668); 
            char_literal139_tree = 
            (Object)adaptor.create(char_literal139)
            ;
            adaptor.addChild(root_0, char_literal139_tree);


            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:69:76: ( 'else' '{' ( stmt )* '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==41) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:69:77: 'else' '{' ( stmt )* '}'
                    {
                    string_literal140=(Token)match(input,41,FOLLOW_41_in_if_stmt671); 
                    string_literal140_tree = 
                    (Object)adaptor.create(string_literal140)
                    ;
                    adaptor.addChild(root_0, string_literal140_tree);


                    char_literal141=(Token)match(input,50,FOLLOW_50_in_if_stmt672); 
                    char_literal141_tree = 
                    (Object)adaptor.create(char_literal141)
                    ;
                    adaptor.addChild(root_0, char_literal141_tree);


                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:69:87: ( stmt )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==AssignmentAutoOperators||LA34_0==ID||LA34_0==30||(LA34_0 >= 33 && LA34_0 <= 40)||(LA34_0 >= 43 && LA34_0 <= 46)||LA34_0==49) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:69:87: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_if_stmt674);
                    	    stmt142=stmt();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, stmt142.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    char_literal143=(Token)match(input,51,FOLLOW_51_in_if_stmt677); 
                    char_literal143_tree = 
                    (Object)adaptor.create(char_literal143)
                    ;
                    adaptor.addChild(root_0, char_literal143_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "if_stmt"


    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:73:1: expression : ( ( ID ArithmaticOperators ID ) | ( ID ArithmaticOperators ( IntNum | DoubleNum ) ) | ( ( IntNum | DoubleNum ) ArithmaticOperators ID ) | ( ( IntNum | DoubleNum ) ArithmaticOperators ( IntNum | DoubleNum ) ) );
    public final lab3Parser.expression_return expression() throws RecognitionException {
        lab3Parser.expression_return retval = new lab3Parser.expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID144=null;
        Token ArithmaticOperators145=null;
        Token ID146=null;
        Token ID147=null;
        Token ArithmaticOperators148=null;
        Token set149=null;
        Token set150=null;
        Token ArithmaticOperators151=null;
        Token ID152=null;
        Token set153=null;
        Token ArithmaticOperators154=null;
        Token set155=null;

        Object ID144_tree=null;
        Object ArithmaticOperators145_tree=null;
        Object ID146_tree=null;
        Object ID147_tree=null;
        Object ArithmaticOperators148_tree=null;
        Object set149_tree=null;
        Object set150_tree=null;
        Object ArithmaticOperators151_tree=null;
        Object ID152_tree=null;
        Object set153_tree=null;
        Object ArithmaticOperators154_tree=null;
        Object set155_tree=null;

        try {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:73:11: ( ( ID ArithmaticOperators ID ) | ( ID ArithmaticOperators ( IntNum | DoubleNum ) ) | ( ( IntNum | DoubleNum ) ArithmaticOperators ID ) | ( ( IntNum | DoubleNum ) ArithmaticOperators ( IntNum | DoubleNum ) ) )
            int alt36=4;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==ID) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==ArithmaticOperators) ) {
                    int LA36_3 = input.LA(3);

                    if ( (LA36_3==ID) ) {
                        alt36=1;
                    }
                    else if ( (LA36_3==DoubleNum||LA36_3==IntNum) ) {
                        alt36=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 3, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA36_0==DoubleNum||LA36_0==IntNum) ) {
                int LA36_2 = input.LA(2);

                if ( (LA36_2==ArithmaticOperators) ) {
                    int LA36_4 = input.LA(3);

                    if ( (LA36_4==ID) ) {
                        alt36=3;
                    }
                    else if ( (LA36_4==DoubleNum||LA36_4==IntNum) ) {
                        alt36=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 4, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }
            switch (alt36) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:73:13: ( ID ArithmaticOperators ID )
                    {
                    root_0 = (Object)adaptor.nil();


                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:73:13: ( ID ArithmaticOperators ID )
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:73:14: ID ArithmaticOperators ID
                    {
                    ID144=(Token)match(input,ID,FOLLOW_ID_in_expression689); 
                    ID144_tree = 
                    (Object)adaptor.create(ID144)
                    ;
                    adaptor.addChild(root_0, ID144_tree);


                    ArithmaticOperators145=(Token)match(input,ArithmaticOperators,FOLLOW_ArithmaticOperators_in_expression691); 
                    ArithmaticOperators145_tree = 
                    (Object)adaptor.create(ArithmaticOperators145)
                    ;
                    adaptor.addChild(root_0, ArithmaticOperators145_tree);


                    ID146=(Token)match(input,ID,FOLLOW_ID_in_expression693); 
                    ID146_tree = 
                    (Object)adaptor.create(ID146)
                    ;
                    adaptor.addChild(root_0, ID146_tree);


                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:74:3: ( ID ArithmaticOperators ( IntNum | DoubleNum ) )
                    {
                    root_0 = (Object)adaptor.nil();


                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:74:3: ( ID ArithmaticOperators ( IntNum | DoubleNum ) )
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:74:4: ID ArithmaticOperators ( IntNum | DoubleNum )
                    {
                    ID147=(Token)match(input,ID,FOLLOW_ID_in_expression707); 
                    ID147_tree = 
                    (Object)adaptor.create(ID147)
                    ;
                    adaptor.addChild(root_0, ID147_tree);


                    ArithmaticOperators148=(Token)match(input,ArithmaticOperators,FOLLOW_ArithmaticOperators_in_expression709); 
                    ArithmaticOperators148_tree = 
                    (Object)adaptor.create(ArithmaticOperators148)
                    ;
                    adaptor.addChild(root_0, ArithmaticOperators148_tree);


                    set149=(Token)input.LT(1);

                    if ( input.LA(1)==DoubleNum||input.LA(1)==IntNum ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set149)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:75:3: ( ( IntNum | DoubleNum ) ArithmaticOperators ID )
                    {
                    root_0 = (Object)adaptor.nil();


                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:75:3: ( ( IntNum | DoubleNum ) ArithmaticOperators ID )
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:75:4: ( IntNum | DoubleNum ) ArithmaticOperators ID
                    {
                    set150=(Token)input.LT(1);

                    if ( input.LA(1)==DoubleNum||input.LA(1)==IntNum ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set150)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    ArithmaticOperators151=(Token)match(input,ArithmaticOperators,FOLLOW_ArithmaticOperators_in_expression735); 
                    ArithmaticOperators151_tree = 
                    (Object)adaptor.create(ArithmaticOperators151)
                    ;
                    adaptor.addChild(root_0, ArithmaticOperators151_tree);


                    ID152=(Token)match(input,ID,FOLLOW_ID_in_expression737); 
                    ID152_tree = 
                    (Object)adaptor.create(ID152)
                    ;
                    adaptor.addChild(root_0, ID152_tree);


                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:76:3: ( ( IntNum | DoubleNum ) ArithmaticOperators ( IntNum | DoubleNum ) )
                    {
                    root_0 = (Object)adaptor.nil();


                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:76:3: ( ( IntNum | DoubleNum ) ArithmaticOperators ( IntNum | DoubleNum ) )
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:76:4: ( IntNum | DoubleNum ) ArithmaticOperators ( IntNum | DoubleNum )
                    {
                    set153=(Token)input.LT(1);

                    if ( input.LA(1)==DoubleNum||input.LA(1)==IntNum ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set153)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    ArithmaticOperators154=(Token)match(input,ArithmaticOperators,FOLLOW_ArithmaticOperators_in_expression756); 
                    ArithmaticOperators154_tree = 
                    (Object)adaptor.create(ArithmaticOperators154)
                    ;
                    adaptor.addChild(root_0, ArithmaticOperators154_tree);


                    set155=(Token)input.LT(1);

                    if ( input.LA(1)==DoubleNum||input.LA(1)==IntNum ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set155)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression"


    public static class assignment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment"
    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:80:1: assignment : ( ID AssignmentAutoOperators | AssignmentAutoOperators ID | ID AssignmentOperators ( ( IntNum | DoubleNum ) | ID ) );
    public final lab3Parser.assignment_return assignment() throws RecognitionException {
        lab3Parser.assignment_return retval = new lab3Parser.assignment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID156=null;
        Token AssignmentAutoOperators157=null;
        Token AssignmentAutoOperators158=null;
        Token ID159=null;
        Token ID160=null;
        Token AssignmentOperators161=null;
        Token set162=null;

        Object ID156_tree=null;
        Object AssignmentAutoOperators157_tree=null;
        Object AssignmentAutoOperators158_tree=null;
        Object ID159_tree=null;
        Object ID160_tree=null;
        Object AssignmentOperators161_tree=null;
        Object set162_tree=null;

        try {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:80:11: ( ID AssignmentAutoOperators | AssignmentAutoOperators ID | ID AssignmentOperators ( ( IntNum | DoubleNum ) | ID ) )
            int alt37=3;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==ID) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==AssignmentAutoOperators) ) {
                    alt37=1;
                }
                else if ( (LA37_1==AssignmentOperators) ) {
                    alt37=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA37_0==AssignmentAutoOperators) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }
            switch (alt37) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:80:13: ID AssignmentAutoOperators
                    {
                    root_0 = (Object)adaptor.nil();


                    ID156=(Token)match(input,ID,FOLLOW_ID_in_assignment777); 
                    ID156_tree = 
                    (Object)adaptor.create(ID156)
                    ;
                    adaptor.addChild(root_0, ID156_tree);


                    AssignmentAutoOperators157=(Token)match(input,AssignmentAutoOperators,FOLLOW_AssignmentAutoOperators_in_assignment779); 
                    AssignmentAutoOperators157_tree = 
                    (Object)adaptor.create(AssignmentAutoOperators157)
                    ;
                    adaptor.addChild(root_0, AssignmentAutoOperators157_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:81:3: AssignmentAutoOperators ID
                    {
                    root_0 = (Object)adaptor.nil();


                    AssignmentAutoOperators158=(Token)match(input,AssignmentAutoOperators,FOLLOW_AssignmentAutoOperators_in_assignment791); 
                    AssignmentAutoOperators158_tree = 
                    (Object)adaptor.create(AssignmentAutoOperators158)
                    ;
                    adaptor.addChild(root_0, AssignmentAutoOperators158_tree);


                    ID159=(Token)match(input,ID,FOLLOW_ID_in_assignment793); 
                    ID159_tree = 
                    (Object)adaptor.create(ID159)
                    ;
                    adaptor.addChild(root_0, ID159_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:82:3: ID AssignmentOperators ( ( IntNum | DoubleNum ) | ID )
                    {
                    root_0 = (Object)adaptor.nil();


                    ID160=(Token)match(input,ID,FOLLOW_ID_in_assignment805); 
                    ID160_tree = 
                    (Object)adaptor.create(ID160)
                    ;
                    adaptor.addChild(root_0, ID160_tree);


                    AssignmentOperators161=(Token)match(input,AssignmentOperators,FOLLOW_AssignmentOperators_in_assignment807); 
                    AssignmentOperators161_tree = 
                    (Object)adaptor.create(AssignmentOperators161)
                    ;
                    adaptor.addChild(root_0, AssignmentOperators161_tree);


                    set162=(Token)input.LT(1);

                    if ( input.LA(1)==DoubleNum||(input.LA(1) >= ID && input.LA(1) <= IntNum) ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set162)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignment"


    public static class assigningVariable_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assigningVariable"
    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:84:1: assigningVariable : ( ID '=' ( ( ID | IntNum | DoubleNum ) ( Operators ( ID | IntNum | DoubleNum ) )* ) ';' | assignment ';' );
    public final lab3Parser.assigningVariable_return assigningVariable() throws RecognitionException {
        lab3Parser.assigningVariable_return retval = new lab3Parser.assigningVariable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID163=null;
        Token char_literal164=null;
        Token set165=null;
        Token Operators166=null;
        Token set167=null;
        Token char_literal168=null;
        Token char_literal170=null;
        lab3Parser.assignment_return assignment169 =null;


        Object ID163_tree=null;
        Object char_literal164_tree=null;
        Object set165_tree=null;
        Object Operators166_tree=null;
        Object set167_tree=null;
        Object char_literal168_tree=null;
        Object char_literal170_tree=null;

        try {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:84:18: ( ID '=' ( ( ID | IntNum | DoubleNum ) ( Operators ( ID | IntNum | DoubleNum ) )* ) ';' | assignment ';' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==ID) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==29) ) {
                    alt39=1;
                }
                else if ( ((LA39_1 >= AssignmentAutoOperators && LA39_1 <= AssignmentOperators)) ) {
                    alt39=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA39_0==AssignmentAutoOperators) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }
            switch (alt39) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:84:20: ID '=' ( ( ID | IntNum | DoubleNum ) ( Operators ( ID | IntNum | DoubleNum ) )* ) ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    ID163=(Token)match(input,ID,FOLLOW_ID_in_assigningVariable828); 
                    ID163_tree = 
                    (Object)adaptor.create(ID163)
                    ;
                    adaptor.addChild(root_0, ID163_tree);


                    char_literal164=(Token)match(input,29,FOLLOW_29_in_assigningVariable830); 
                    char_literal164_tree = 
                    (Object)adaptor.create(char_literal164)
                    ;
                    adaptor.addChild(root_0, char_literal164_tree);


                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:84:27: ( ( ID | IntNum | DoubleNum ) ( Operators ( ID | IntNum | DoubleNum ) )* )
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:84:28: ( ID | IntNum | DoubleNum ) ( Operators ( ID | IntNum | DoubleNum ) )*
                    {
                    set165=(Token)input.LT(1);

                    if ( input.LA(1)==DoubleNum||(input.LA(1) >= ID && input.LA(1) <= IntNum) ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set165)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:84:54: ( Operators ( ID | IntNum | DoubleNum ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==Operators) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:84:55: Operators ( ID | IntNum | DoubleNum )
                    	    {
                    	    Operators166=(Token)match(input,Operators,FOLLOW_Operators_in_assigningVariable846); 
                    	    Operators166_tree = 
                    	    (Object)adaptor.create(Operators166)
                    	    ;
                    	    adaptor.addChild(root_0, Operators166_tree);


                    	    set167=(Token)input.LT(1);

                    	    if ( input.LA(1)==DoubleNum||(input.LA(1) >= ID && input.LA(1) <= IntNum) ) {
                    	        input.consume();
                    	        adaptor.addChild(root_0, 
                    	        (Object)adaptor.create(set167)
                    	        );
                    	        state.errorRecovery=false;
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }


                    char_literal168=(Token)match(input,27,FOLLOW_27_in_assigningVariable863); 
                    char_literal168_tree = 
                    (Object)adaptor.create(char_literal168)
                    ;
                    adaptor.addChild(root_0, char_literal168_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:84:100: assignment ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignment_in_assigningVariable867);
                    assignment169=assignment();

                    state._fsp--;

                    adaptor.addChild(root_0, assignment169.getTree());

                    char_literal170=(Token)match(input,27,FOLLOW_27_in_assigningVariable869); 
                    char_literal170_tree = 
                    (Object)adaptor.create(char_literal170)
                    ;
                    adaptor.addChild(root_0, char_literal170_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assigningVariable"


    public static class for_loop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "for_loop"
    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:88:1: for_loop : 'for' '(' ( declOfInteger )* ';' ( expression ( LogicalOperators expression )* )* ';' ( assignment )* ')' '{' ( stmt )* '}' ;
    public final lab3Parser.for_loop_return for_loop() throws RecognitionException {
        lab3Parser.for_loop_return retval = new lab3Parser.for_loop_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal171=null;
        Token char_literal172=null;
        Token char_literal174=null;
        Token LogicalOperators176=null;
        Token char_literal178=null;
        Token char_literal180=null;
        Token char_literal181=null;
        Token char_literal183=null;
        lab3Parser.declOfInteger_return declOfInteger173 =null;

        lab3Parser.expression_return expression175 =null;

        lab3Parser.expression_return expression177 =null;

        lab3Parser.assignment_return assignment179 =null;

        lab3Parser.stmt_return stmt182 =null;


        Object string_literal171_tree=null;
        Object char_literal172_tree=null;
        Object char_literal174_tree=null;
        Object LogicalOperators176_tree=null;
        Object char_literal178_tree=null;
        Object char_literal180_tree=null;
        Object char_literal181_tree=null;
        Object char_literal183_tree=null;

        try {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:88:9: ( 'for' '(' ( declOfInteger )* ';' ( expression ( LogicalOperators expression )* )* ';' ( assignment )* ')' '{' ( stmt )* '}' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:88:11: 'for' '(' ( declOfInteger )* ';' ( expression ( LogicalOperators expression )* )* ';' ( assignment )* ')' '{' ( stmt )* '}'
            {
            root_0 = (Object)adaptor.nil();


            string_literal171=(Token)match(input,44,FOLLOW_44_in_for_loop880); 
            string_literal171_tree = 
            (Object)adaptor.create(string_literal171)
            ;
            adaptor.addChild(root_0, string_literal171_tree);


            char_literal172=(Token)match(input,22,FOLLOW_22_in_for_loop881); 
            char_literal172_tree = 
            (Object)adaptor.create(char_literal172)
            ;
            adaptor.addChild(root_0, char_literal172_tree);


            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:88:19: ( declOfInteger )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==46) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:88:19: declOfInteger
            	    {
            	    pushFollow(FOLLOW_declOfInteger_in_for_loop882);
            	    declOfInteger173=declOfInteger();

            	    state._fsp--;

            	    adaptor.addChild(root_0, declOfInteger173.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            char_literal174=(Token)match(input,27,FOLLOW_27_in_for_loop885); 
            char_literal174_tree = 
            (Object)adaptor.create(char_literal174)
            ;
            adaptor.addChild(root_0, char_literal174_tree);


            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:88:38: ( expression ( LogicalOperators expression )* )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==DoubleNum||(LA42_0 >= ID && LA42_0 <= IntNum)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:88:39: expression ( LogicalOperators expression )*
            	    {
            	    pushFollow(FOLLOW_expression_in_for_loop888);
            	    expression175=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression175.getTree());

            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:88:50: ( LogicalOperators expression )*
            	    loop41:
            	    do {
            	        int alt41=2;
            	        int LA41_0 = input.LA(1);

            	        if ( (LA41_0==LogicalOperators) ) {
            	            alt41=1;
            	        }


            	        switch (alt41) {
            	    	case 1 :
            	    	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:88:51: LogicalOperators expression
            	    	    {
            	    	    LogicalOperators176=(Token)match(input,LogicalOperators,FOLLOW_LogicalOperators_in_for_loop891); 
            	    	    LogicalOperators176_tree = 
            	    	    (Object)adaptor.create(LogicalOperators176)
            	    	    ;
            	    	    adaptor.addChild(root_0, LogicalOperators176_tree);


            	    	    pushFollow(FOLLOW_expression_in_for_loop893);
            	    	    expression177=expression();

            	    	    state._fsp--;

            	    	    adaptor.addChild(root_0, expression177.getTree());

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop41;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            char_literal178=(Token)match(input,27,FOLLOW_27_in_for_loop899); 
            char_literal178_tree = 
            (Object)adaptor.create(char_literal178)
            ;
            adaptor.addChild(root_0, char_literal178_tree);


            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:88:87: ( assignment )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==AssignmentAutoOperators||LA43_0==ID) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:88:87: assignment
            	    {
            	    pushFollow(FOLLOW_assignment_in_for_loop901);
            	    assignment179=assignment();

            	    state._fsp--;

            	    adaptor.addChild(root_0, assignment179.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            char_literal180=(Token)match(input,23,FOLLOW_23_in_for_loop903); 
            char_literal180_tree = 
            (Object)adaptor.create(char_literal180)
            ;
            adaptor.addChild(root_0, char_literal180_tree);


            char_literal181=(Token)match(input,50,FOLLOW_50_in_for_loop904); 
            char_literal181_tree = 
            (Object)adaptor.create(char_literal181)
            ;
            adaptor.addChild(root_0, char_literal181_tree);


            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:88:105: ( stmt )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==AssignmentAutoOperators||LA44_0==ID||LA44_0==30||(LA44_0 >= 33 && LA44_0 <= 40)||(LA44_0 >= 43 && LA44_0 <= 46)||LA44_0==49) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:88:105: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_for_loop906);
            	    stmt182=stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stmt182.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            char_literal183=(Token)match(input,51,FOLLOW_51_in_for_loop909); 
            char_literal183_tree = 
            (Object)adaptor.create(char_literal183)
            ;
            adaptor.addChild(root_0, char_literal183_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "for_loop"


    public static class while_loop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_loop"
    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:90:1: while_loop : 'while' '(' expression ( LogicalOperators expression )* ')' '{' ( stmt )* '}' ;
    public final lab3Parser.while_loop_return while_loop() throws RecognitionException {
        lab3Parser.while_loop_return retval = new lab3Parser.while_loop_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal184=null;
        Token char_literal185=null;
        Token LogicalOperators187=null;
        Token char_literal189=null;
        Token char_literal190=null;
        Token char_literal192=null;
        lab3Parser.expression_return expression186 =null;

        lab3Parser.expression_return expression188 =null;

        lab3Parser.stmt_return stmt191 =null;


        Object string_literal184_tree=null;
        Object char_literal185_tree=null;
        Object LogicalOperators187_tree=null;
        Object char_literal189_tree=null;
        Object char_literal190_tree=null;
        Object char_literal192_tree=null;

        try {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:90:11: ( 'while' '(' expression ( LogicalOperators expression )* ')' '{' ( stmt )* '}' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:90:13: 'while' '(' expression ( LogicalOperators expression )* ')' '{' ( stmt )* '}'
            {
            root_0 = (Object)adaptor.nil();


            string_literal184=(Token)match(input,49,FOLLOW_49_in_while_loop916); 
            string_literal184_tree = 
            (Object)adaptor.create(string_literal184)
            ;
            adaptor.addChild(root_0, string_literal184_tree);


            char_literal185=(Token)match(input,22,FOLLOW_22_in_while_loop917); 
            char_literal185_tree = 
            (Object)adaptor.create(char_literal185)
            ;
            adaptor.addChild(root_0, char_literal185_tree);


            pushFollow(FOLLOW_expression_in_while_loop918);
            expression186=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression186.getTree());

            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:90:34: ( LogicalOperators expression )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==LogicalOperators) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:90:35: LogicalOperators expression
            	    {
            	    LogicalOperators187=(Token)match(input,LogicalOperators,FOLLOW_LogicalOperators_in_while_loop921); 
            	    LogicalOperators187_tree = 
            	    (Object)adaptor.create(LogicalOperators187)
            	    ;
            	    adaptor.addChild(root_0, LogicalOperators187_tree);


            	    pushFollow(FOLLOW_expression_in_while_loop923);
            	    expression188=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression188.getTree());

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            char_literal189=(Token)match(input,23,FOLLOW_23_in_while_loop926); 
            char_literal189_tree = 
            (Object)adaptor.create(char_literal189)
            ;
            adaptor.addChild(root_0, char_literal189_tree);


            char_literal190=(Token)match(input,50,FOLLOW_50_in_while_loop927); 
            char_literal190_tree = 
            (Object)adaptor.create(char_literal190)
            ;
            adaptor.addChild(root_0, char_literal190_tree);


            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:90:71: ( stmt )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==AssignmentAutoOperators||LA46_0==ID||LA46_0==30||(LA46_0 >= 33 && LA46_0 <= 40)||(LA46_0 >= 43 && LA46_0 <= 46)||LA46_0==49) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:90:71: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_while_loop929);
            	    stmt191=stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stmt191.getTree());

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            char_literal192=(Token)match(input,51,FOLLOW_51_in_while_loop932); 
            char_literal192_tree = 
            (Object)adaptor.create(char_literal192)
            ;
            adaptor.addChild(root_0, char_literal192_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "while_loop"


    public static class mathmaticalExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mathmaticalExpression"
    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:92:1: mathmaticalExpression : ( ID | SignedNumber | IntNum | DoubleNum | '(' mathmaticalExpression ')' | TrigonometricFunctions '(' mathmaticalExpression ')' ) ( Operators ( ID | IntNum | DoubleNum | TrigonometricFunctions '(' mathmaticalExpression ')' | '(' mathmaticalExpression ')' ) )* ;
    public final lab3Parser.mathmaticalExpression_return mathmaticalExpression() throws RecognitionException {
        lab3Parser.mathmaticalExpression_return retval = new lab3Parser.mathmaticalExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID193=null;
        Token SignedNumber194=null;
        Token IntNum195=null;
        Token DoubleNum196=null;
        Token char_literal197=null;
        Token char_literal199=null;
        Token TrigonometricFunctions200=null;
        Token char_literal201=null;
        Token char_literal203=null;
        Token Operators204=null;
        Token ID205=null;
        Token IntNum206=null;
        Token DoubleNum207=null;
        Token TrigonometricFunctions208=null;
        Token char_literal209=null;
        Token char_literal211=null;
        Token char_literal212=null;
        Token char_literal214=null;
        lab3Parser.mathmaticalExpression_return mathmaticalExpression198 =null;

        lab3Parser.mathmaticalExpression_return mathmaticalExpression202 =null;

        lab3Parser.mathmaticalExpression_return mathmaticalExpression210 =null;

        lab3Parser.mathmaticalExpression_return mathmaticalExpression213 =null;


        Object ID193_tree=null;
        Object SignedNumber194_tree=null;
        Object IntNum195_tree=null;
        Object DoubleNum196_tree=null;
        Object char_literal197_tree=null;
        Object char_literal199_tree=null;
        Object TrigonometricFunctions200_tree=null;
        Object char_literal201_tree=null;
        Object char_literal203_tree=null;
        Object Operators204_tree=null;
        Object ID205_tree=null;
        Object IntNum206_tree=null;
        Object DoubleNum207_tree=null;
        Object TrigonometricFunctions208_tree=null;
        Object char_literal209_tree=null;
        Object char_literal211_tree=null;
        Object char_literal212_tree=null;
        Object char_literal214_tree=null;

        try {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:92:22: ( ( ID | SignedNumber | IntNum | DoubleNum | '(' mathmaticalExpression ')' | TrigonometricFunctions '(' mathmaticalExpression ')' ) ( Operators ( ID | IntNum | DoubleNum | TrigonometricFunctions '(' mathmaticalExpression ')' | '(' mathmaticalExpression ')' ) )* )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:92:24: ( ID | SignedNumber | IntNum | DoubleNum | '(' mathmaticalExpression ')' | TrigonometricFunctions '(' mathmaticalExpression ')' ) ( Operators ( ID | IntNum | DoubleNum | TrigonometricFunctions '(' mathmaticalExpression ')' | '(' mathmaticalExpression ')' ) )*
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:92:24: ( ID | SignedNumber | IntNum | DoubleNum | '(' mathmaticalExpression ')' | TrigonometricFunctions '(' mathmaticalExpression ')' )
            int alt47=6;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt47=1;
                }
                break;
            case SignedNumber:
                {
                alt47=2;
                }
                break;
            case IntNum:
                {
                alt47=3;
                }
                break;
            case DoubleNum:
                {
                alt47=4;
                }
                break;
            case 22:
                {
                alt47=5;
                }
                break;
            case TrigonometricFunctions:
                {
                alt47=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;

            }

            switch (alt47) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:92:25: ID
                    {
                    ID193=(Token)match(input,ID,FOLLOW_ID_in_mathmaticalExpression940); 
                    ID193_tree = 
                    (Object)adaptor.create(ID193)
                    ;
                    adaptor.addChild(root_0, ID193_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:92:30: SignedNumber
                    {
                    SignedNumber194=(Token)match(input,SignedNumber,FOLLOW_SignedNumber_in_mathmaticalExpression944); 
                    SignedNumber194_tree = 
                    (Object)adaptor.create(SignedNumber194)
                    ;
                    adaptor.addChild(root_0, SignedNumber194_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:92:45: IntNum
                    {
                    IntNum195=(Token)match(input,IntNum,FOLLOW_IntNum_in_mathmaticalExpression948); 
                    IntNum195_tree = 
                    (Object)adaptor.create(IntNum195)
                    ;
                    adaptor.addChild(root_0, IntNum195_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:92:54: DoubleNum
                    {
                    DoubleNum196=(Token)match(input,DoubleNum,FOLLOW_DoubleNum_in_mathmaticalExpression952); 
                    DoubleNum196_tree = 
                    (Object)adaptor.create(DoubleNum196)
                    ;
                    adaptor.addChild(root_0, DoubleNum196_tree);


                    }
                    break;
                case 5 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:92:66: '(' mathmaticalExpression ')'
                    {
                    char_literal197=(Token)match(input,22,FOLLOW_22_in_mathmaticalExpression956); 
                    char_literal197_tree = 
                    (Object)adaptor.create(char_literal197)
                    ;
                    adaptor.addChild(root_0, char_literal197_tree);


                    pushFollow(FOLLOW_mathmaticalExpression_in_mathmaticalExpression957);
                    mathmaticalExpression198=mathmaticalExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, mathmaticalExpression198.getTree());

                    char_literal199=(Token)match(input,23,FOLLOW_23_in_mathmaticalExpression958); 
                    char_literal199_tree = 
                    (Object)adaptor.create(char_literal199)
                    ;
                    adaptor.addChild(root_0, char_literal199_tree);


                    }
                    break;
                case 6 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:92:96: TrigonometricFunctions '(' mathmaticalExpression ')'
                    {
                    TrigonometricFunctions200=(Token)match(input,TrigonometricFunctions,FOLLOW_TrigonometricFunctions_in_mathmaticalExpression962); 
                    TrigonometricFunctions200_tree = 
                    (Object)adaptor.create(TrigonometricFunctions200)
                    ;
                    adaptor.addChild(root_0, TrigonometricFunctions200_tree);


                    char_literal201=(Token)match(input,22,FOLLOW_22_in_mathmaticalExpression963); 
                    char_literal201_tree = 
                    (Object)adaptor.create(char_literal201)
                    ;
                    adaptor.addChild(root_0, char_literal201_tree);


                    pushFollow(FOLLOW_mathmaticalExpression_in_mathmaticalExpression964);
                    mathmaticalExpression202=mathmaticalExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, mathmaticalExpression202.getTree());

                    char_literal203=(Token)match(input,23,FOLLOW_23_in_mathmaticalExpression965); 
                    char_literal203_tree = 
                    (Object)adaptor.create(char_literal203)
                    ;
                    adaptor.addChild(root_0, char_literal203_tree);


                    }
                    break;

            }


            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:93:4: ( Operators ( ID | IntNum | DoubleNum | TrigonometricFunctions '(' mathmaticalExpression ')' | '(' mathmaticalExpression ')' ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==Operators) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:93:5: Operators ( ID | IntNum | DoubleNum | TrigonometricFunctions '(' mathmaticalExpression ')' | '(' mathmaticalExpression ')' )
            	    {
            	    Operators204=(Token)match(input,Operators,FOLLOW_Operators_in_mathmaticalExpression972); 
            	    Operators204_tree = 
            	    (Object)adaptor.create(Operators204)
            	    ;
            	    adaptor.addChild(root_0, Operators204_tree);


            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:93:15: ( ID | IntNum | DoubleNum | TrigonometricFunctions '(' mathmaticalExpression ')' | '(' mathmaticalExpression ')' )
            	    int alt48=5;
            	    switch ( input.LA(1) ) {
            	    case ID:
            	        {
            	        alt48=1;
            	        }
            	        break;
            	    case IntNum:
            	        {
            	        alt48=2;
            	        }
            	        break;
            	    case DoubleNum:
            	        {
            	        alt48=3;
            	        }
            	        break;
            	    case TrigonometricFunctions:
            	        {
            	        alt48=4;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt48=5;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 48, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt48) {
            	        case 1 :
            	            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:93:16: ID
            	            {
            	            ID205=(Token)match(input,ID,FOLLOW_ID_in_mathmaticalExpression975); 
            	            ID205_tree = 
            	            (Object)adaptor.create(ID205)
            	            ;
            	            adaptor.addChild(root_0, ID205_tree);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:93:21: IntNum
            	            {
            	            IntNum206=(Token)match(input,IntNum,FOLLOW_IntNum_in_mathmaticalExpression979); 
            	            IntNum206_tree = 
            	            (Object)adaptor.create(IntNum206)
            	            ;
            	            adaptor.addChild(root_0, IntNum206_tree);


            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:93:30: DoubleNum
            	            {
            	            DoubleNum207=(Token)match(input,DoubleNum,FOLLOW_DoubleNum_in_mathmaticalExpression983); 
            	            DoubleNum207_tree = 
            	            (Object)adaptor.create(DoubleNum207)
            	            ;
            	            adaptor.addChild(root_0, DoubleNum207_tree);


            	            }
            	            break;
            	        case 4 :
            	            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:93:42: TrigonometricFunctions '(' mathmaticalExpression ')'
            	            {
            	            TrigonometricFunctions208=(Token)match(input,TrigonometricFunctions,FOLLOW_TrigonometricFunctions_in_mathmaticalExpression987); 
            	            TrigonometricFunctions208_tree = 
            	            (Object)adaptor.create(TrigonometricFunctions208)
            	            ;
            	            adaptor.addChild(root_0, TrigonometricFunctions208_tree);


            	            char_literal209=(Token)match(input,22,FOLLOW_22_in_mathmaticalExpression988); 
            	            char_literal209_tree = 
            	            (Object)adaptor.create(char_literal209)
            	            ;
            	            adaptor.addChild(root_0, char_literal209_tree);


            	            pushFollow(FOLLOW_mathmaticalExpression_in_mathmaticalExpression989);
            	            mathmaticalExpression210=mathmaticalExpression();

            	            state._fsp--;

            	            adaptor.addChild(root_0, mathmaticalExpression210.getTree());

            	            char_literal211=(Token)match(input,23,FOLLOW_23_in_mathmaticalExpression990); 
            	            char_literal211_tree = 
            	            (Object)adaptor.create(char_literal211)
            	            ;
            	            adaptor.addChild(root_0, char_literal211_tree);


            	            }
            	            break;
            	        case 5 :
            	            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:93:94: '(' mathmaticalExpression ')'
            	            {
            	            char_literal212=(Token)match(input,22,FOLLOW_22_in_mathmaticalExpression994); 
            	            char_literal212_tree = 
            	            (Object)adaptor.create(char_literal212)
            	            ;
            	            adaptor.addChild(root_0, char_literal212_tree);


            	            pushFollow(FOLLOW_mathmaticalExpression_in_mathmaticalExpression995);
            	            mathmaticalExpression213=mathmaticalExpression();

            	            state._fsp--;

            	            adaptor.addChild(root_0, mathmaticalExpression213.getTree());

            	            char_literal214=(Token)match(input,23,FOLLOW_23_in_mathmaticalExpression996); 
            	            char_literal214_tree = 
            	            (Object)adaptor.create(char_literal214)
            	            ;
            	            adaptor.addChild(root_0, char_literal214_tree);


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "mathmaticalExpression"


    public static class printings_statements_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "printings_statements"
    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:95:1: printings_statements : ( 'cout' | 'cin' | 'cerr' | 'clog' ) '<<' ( ID | StringValue | ( ( StringValue | ID ) ( '+' ( StringValue | ID ) )+ ) ) ( '<<' ( StringValue | ID | ( ( StringValue | ID ) ( '+' ( StringValue | ID ) )+ ) ) )* ';' ;
    public final lab3Parser.printings_statements_return printings_statements() throws RecognitionException {
        lab3Parser.printings_statements_return retval = new lab3Parser.printings_statements_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set215=null;
        Token string_literal216=null;
        Token ID217=null;
        Token StringValue218=null;
        Token set219=null;
        Token char_literal220=null;
        Token set221=null;
        Token string_literal222=null;
        Token StringValue223=null;
        Token ID224=null;
        Token set225=null;
        Token char_literal226=null;
        Token set227=null;
        Token char_literal228=null;

        Object set215_tree=null;
        Object string_literal216_tree=null;
        Object ID217_tree=null;
        Object StringValue218_tree=null;
        Object set219_tree=null;
        Object char_literal220_tree=null;
        Object set221_tree=null;
        Object string_literal222_tree=null;
        Object StringValue223_tree=null;
        Object ID224_tree=null;
        Object set225_tree=null;
        Object char_literal226_tree=null;
        Object set227_tree=null;
        Object char_literal228_tree=null;

        try {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:95:21: ( ( 'cout' | 'cin' | 'cerr' | 'clog' ) '<<' ( ID | StringValue | ( ( StringValue | ID ) ( '+' ( StringValue | ID ) )+ ) ) ( '<<' ( StringValue | ID | ( ( StringValue | ID ) ( '+' ( StringValue | ID ) )+ ) ) )* ';' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:95:23: ( 'cout' | 'cin' | 'cerr' | 'clog' ) '<<' ( ID | StringValue | ( ( StringValue | ID ) ( '+' ( StringValue | ID ) )+ ) ) ( '<<' ( StringValue | ID | ( ( StringValue | ID ) ( '+' ( StringValue | ID ) )+ ) ) )* ';'
            {
            root_0 = (Object)adaptor.nil();


            set215=(Token)input.LT(1);

            if ( input.LA(1)==35||(input.LA(1) >= 37 && input.LA(1) <= 39) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set215)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            string_literal216=(Token)match(input,28,FOLLOW_28_in_printings_statements1022); 
            string_literal216_tree = 
            (Object)adaptor.create(string_literal216)
            ;
            adaptor.addChild(root_0, string_literal216_tree);


            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:95:63: ( ID | StringValue | ( ( StringValue | ID ) ( '+' ( StringValue | ID ) )+ ) )
            int alt51=3;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==ID) ) {
                int LA51_1 = input.LA(2);

                if ( ((LA51_1 >= 27 && LA51_1 <= 28)) ) {
                    alt51=1;
                }
                else if ( (LA51_1==25) ) {
                    alt51=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA51_0==StringValue) ) {
                int LA51_2 = input.LA(2);

                if ( ((LA51_2 >= 27 && LA51_2 <= 28)) ) {
                    alt51=2;
                }
                else if ( (LA51_2==25) ) {
                    alt51=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;

            }
            switch (alt51) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:95:64: ID
                    {
                    ID217=(Token)match(input,ID,FOLLOW_ID_in_printings_statements1025); 
                    ID217_tree = 
                    (Object)adaptor.create(ID217)
                    ;
                    adaptor.addChild(root_0, ID217_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:95:69: StringValue
                    {
                    StringValue218=(Token)match(input,StringValue,FOLLOW_StringValue_in_printings_statements1029); 
                    StringValue218_tree = 
                    (Object)adaptor.create(StringValue218)
                    ;
                    adaptor.addChild(root_0, StringValue218_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:95:83: ( ( StringValue | ID ) ( '+' ( StringValue | ID ) )+ )
                    {
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:95:83: ( ( StringValue | ID ) ( '+' ( StringValue | ID ) )+ )
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:95:84: ( StringValue | ID ) ( '+' ( StringValue | ID ) )+
                    {
                    set219=(Token)input.LT(1);

                    if ( input.LA(1)==ID||input.LA(1)==StringValue ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set219)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:95:103: ( '+' ( StringValue | ID ) )+
                    int cnt50=0;
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==25) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:95:104: '+' ( StringValue | ID )
                    	    {
                    	    char_literal220=(Token)match(input,25,FOLLOW_25_in_printings_statements1043); 
                    	    char_literal220_tree = 
                    	    (Object)adaptor.create(char_literal220)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal220_tree);


                    	    set221=(Token)input.LT(1);

                    	    if ( input.LA(1)==ID||input.LA(1)==StringValue ) {
                    	        input.consume();
                    	        adaptor.addChild(root_0, 
                    	        (Object)adaptor.create(set221)
                    	        );
                    	        state.errorRecovery=false;
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt50 >= 1 ) break loop50;
                                EarlyExitException eee =
                                    new EarlyExitException(50, input);
                                throw eee;
                        }
                        cnt50++;
                    } while (true);


                    }


                    }
                    break;

            }


            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:95:131: ( '<<' ( StringValue | ID | ( ( StringValue | ID ) ( '+' ( StringValue | ID ) )+ ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==28) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:95:132: '<<' ( StringValue | ID | ( ( StringValue | ID ) ( '+' ( StringValue | ID ) )+ ) )
            	    {
            	    string_literal222=(Token)match(input,28,FOLLOW_28_in_printings_statements1058); 
            	    string_literal222_tree = 
            	    (Object)adaptor.create(string_literal222)
            	    ;
            	    adaptor.addChild(root_0, string_literal222_tree);


            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:95:137: ( StringValue | ID | ( ( StringValue | ID ) ( '+' ( StringValue | ID ) )+ ) )
            	    int alt53=3;
            	    int LA53_0 = input.LA(1);

            	    if ( (LA53_0==StringValue) ) {
            	        int LA53_1 = input.LA(2);

            	        if ( ((LA53_1 >= 27 && LA53_1 <= 28)) ) {
            	            alt53=1;
            	        }
            	        else if ( (LA53_1==25) ) {
            	            alt53=3;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 53, 1, input);

            	            throw nvae;

            	        }
            	    }
            	    else if ( (LA53_0==ID) ) {
            	        int LA53_2 = input.LA(2);

            	        if ( ((LA53_2 >= 27 && LA53_2 <= 28)) ) {
            	            alt53=2;
            	        }
            	        else if ( (LA53_2==25) ) {
            	            alt53=3;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 53, 2, input);

            	            throw nvae;

            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 53, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:95:138: StringValue
            	            {
            	            StringValue223=(Token)match(input,StringValue,FOLLOW_StringValue_in_printings_statements1061); 
            	            StringValue223_tree = 
            	            (Object)adaptor.create(StringValue223)
            	            ;
            	            adaptor.addChild(root_0, StringValue223_tree);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:95:152: ID
            	            {
            	            ID224=(Token)match(input,ID,FOLLOW_ID_in_printings_statements1065); 
            	            ID224_tree = 
            	            (Object)adaptor.create(ID224)
            	            ;
            	            adaptor.addChild(root_0, ID224_tree);


            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:95:157: ( ( StringValue | ID ) ( '+' ( StringValue | ID ) )+ )
            	            {
            	            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:95:157: ( ( StringValue | ID ) ( '+' ( StringValue | ID ) )+ )
            	            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:95:158: ( StringValue | ID ) ( '+' ( StringValue | ID ) )+
            	            {
            	            set225=(Token)input.LT(1);

            	            if ( input.LA(1)==ID||input.LA(1)==StringValue ) {
            	                input.consume();
            	                adaptor.addChild(root_0, 
            	                (Object)adaptor.create(set225)
            	                );
            	                state.errorRecovery=false;
            	            }
            	            else {
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                throw mse;
            	            }


            	            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:95:177: ( '+' ( StringValue | ID ) )+
            	            int cnt52=0;
            	            loop52:
            	            do {
            	                int alt52=2;
            	                int LA52_0 = input.LA(1);

            	                if ( (LA52_0==25) ) {
            	                    alt52=1;
            	                }


            	                switch (alt52) {
            	            	case 1 :
            	            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:95:178: '+' ( StringValue | ID )
            	            	    {
            	            	    char_literal226=(Token)match(input,25,FOLLOW_25_in_printings_statements1079); 
            	            	    char_literal226_tree = 
            	            	    (Object)adaptor.create(char_literal226)
            	            	    ;
            	            	    adaptor.addChild(root_0, char_literal226_tree);


            	            	    set227=(Token)input.LT(1);

            	            	    if ( input.LA(1)==ID||input.LA(1)==StringValue ) {
            	            	        input.consume();
            	            	        adaptor.addChild(root_0, 
            	            	        (Object)adaptor.create(set227)
            	            	        );
            	            	        state.errorRecovery=false;
            	            	    }
            	            	    else {
            	            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	            	        throw mse;
            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt52 >= 1 ) break loop52;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(52, input);
            	                        throw eee;
            	                }
            	                cnt52++;
            	            } while (true);


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            char_literal228=(Token)match(input,27,FOLLOW_27_in_printings_statements1095); 
            char_literal228_tree = 
            (Object)adaptor.create(char_literal228)
            ;
            adaptor.addChild(root_0, char_literal228_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "printings_statements"

    // Delegated rules


 

    public static final BitSet FOLLOW_stmt_in_run41 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mathmaticalExpression_in_run45 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_loop_in_stmt54 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stmt_in_stmt59 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_stmt65 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_loop_in_stmt71 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assigningVariable_in_stmt77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printings_statements_in_stmt82 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declOfInteger_in_decl105 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_decl107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declOfDoubleAndFloat_in_decl112 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_decl114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declOfBool_in_decl119 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_decl121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declOfString_in_decl126 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_decl128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declOfChar_in_decl133 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_decl135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declOfAuto_in_decl140 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_decl142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declOfPointer_in_decl147 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_decl149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declOfObjects_in_decl154 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_decl156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declOfArrays_in_decl161 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_decl163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_declOfBool173 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_declOfBool175 = new BitSet(new long[]{0x0000000024000002L});
    public static final BitSet FOLLOW_29_in_declOfBool178 = new BitSet(new long[]{0x0001040000001A00L});
    public static final BitSet FOLLOW_ID_in_declOfBool181 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_48_in_declOfBool185 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_42_in_declOfBool189 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_expression_in_declOfBool193 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_declOfBool199 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_declOfBool202 = new BitSet(new long[]{0x0000000024000002L});
    public static final BitSet FOLLOW_29_in_declOfBool205 = new BitSet(new long[]{0x0001040000001A00L});
    public static final BitSet FOLLOW_ID_in_declOfBool208 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_48_in_declOfBool212 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_42_in_declOfBool216 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_expression_in_declOfBool220 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_set_in_declOfDoubleAndFloat233 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_declOfDoubleAndFloat241 = new BitSet(new long[]{0x0000000024000002L});
    public static final BitSet FOLLOW_29_in_declOfDoubleAndFloat244 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_set_in_declOfDoubleAndFloat246 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_declOfDoubleAndFloat257 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_declOfDoubleAndFloat260 = new BitSet(new long[]{0x0000000024000002L});
    public static final BitSet FOLLOW_29_in_declOfDoubleAndFloat263 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_set_in_declOfDoubleAndFloat265 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_46_in_declOfInteger284 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_declOfInteger286 = new BitSet(new long[]{0x0000000024000002L});
    public static final BitSet FOLLOW_29_in_declOfInteger289 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_set_in_declOfInteger291 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_declOfInteger302 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_declOfInteger305 = new BitSet(new long[]{0x0000000024000002L});
    public static final BitSet FOLLOW_29_in_declOfInteger308 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_set_in_declOfInteger310 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_30_in_declOfString328 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_declOfString330 = new BitSet(new long[]{0x0000000024000002L});
    public static final BitSet FOLLOW_29_in_declOfString333 = new BitSet(new long[]{0x0000000000040800L});
    public static final BitSet FOLLOW_set_in_declOfString335 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_declOfString346 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_declOfString349 = new BitSet(new long[]{0x0000000024000002L});
    public static final BitSet FOLLOW_29_in_declOfString352 = new BitSet(new long[]{0x0000000000040800L});
    public static final BitSet FOLLOW_set_in_declOfString354 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_36_in_declOfChar374 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_declOfChar376 = new BitSet(new long[]{0x0000000024000002L});
    public static final BitSet FOLLOW_29_in_declOfChar379 = new BitSet(new long[]{0x0000000000000880L});
    public static final BitSet FOLLOW_set_in_declOfChar381 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_declOfChar392 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_declOfChar395 = new BitSet(new long[]{0x0000000024000002L});
    public static final BitSet FOLLOW_29_in_declOfChar398 = new BitSet(new long[]{0x0000000000000880L});
    public static final BitSet FOLLOW_set_in_declOfChar400 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_33_in_declOfAuto418 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_declOfAuto420 = new BitSet(new long[]{0x0000000024000002L});
    public static final BitSet FOLLOW_29_in_declOfAuto423 = new BitSet(new long[]{0x0001040000041A80L});
    public static final BitSet FOLLOW_ID_in_declOfAuto426 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_CharValue_in_declOfAuto430 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_StringValue_in_declOfAuto434 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_IntNum_in_declOfAuto438 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_DoubleNum_in_declOfAuto442 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_48_in_declOfAuto446 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_42_in_declOfAuto450 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_expression_in_declOfAuto454 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_declOfAuto460 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_declOfAuto463 = new BitSet(new long[]{0x0000000024000002L});
    public static final BitSet FOLLOW_29_in_declOfAuto466 = new BitSet(new long[]{0x0001040000041A80L});
    public static final BitSet FOLLOW_ID_in_declOfAuto469 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_CharValue_in_declOfAuto473 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_StringValue_in_declOfAuto477 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_IntNum_in_declOfAuto481 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_DoubleNum_in_declOfAuto485 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_48_in_declOfAuto489 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_42_in_declOfAuto493 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_expression_in_declOfAuto497 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_set_in_declOfPointer510 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_declOfPointer534 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_declOfPointer535 = new BitSet(new long[]{0x0000000024000002L});
    public static final BitSet FOLLOW_29_in_declOfPointer538 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_declOfPointer540 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_declOfPointer541 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_declOfPointer546 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_declOfPointer548 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_declOfPointer549 = new BitSet(new long[]{0x0000000024000002L});
    public static final BitSet FOLLOW_29_in_declOfPointer552 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_declOfPointer554 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_declOfPointer555 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ID_in_declOfObjects566 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_declOfObjects568 = new BitSet(new long[]{0x0000000024000002L});
    public static final BitSet FOLLOW_29_in_declOfObjects571 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_declOfObjects573 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_declOfObjects575 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_declOfObjects577 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_declOfObjects580 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_declOfObjects585 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_declOfObjects588 = new BitSet(new long[]{0x0000000024000002L});
    public static final BitSet FOLLOW_29_in_declOfObjects591 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_declOfObjects593 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_declOfObjects595 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_declOfObjects597 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_declOfObjects600 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_set_in_declOfArrays612 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_declOfArrays631 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_declOfArrays632 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_declOfArrays634 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_declOfArrays636 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_declOfArrays638 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_declOfArrays640 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_declOfArrays642 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_IntNum_in_declOfArrays643 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_declOfArrays644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_if_stmt652 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_if_stmt653 = new BitSet(new long[]{0x0000000000001A00L});
    public static final BitSet FOLLOW_expression_in_if_stmt654 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_LogicalOperators_in_if_stmt657 = new BitSet(new long[]{0x0000000000001A00L});
    public static final BitSet FOLLOW_expression_in_if_stmt659 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_23_in_if_stmt662 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_if_stmt663 = new BitSet(new long[]{0x000A79FE40000820L});
    public static final BitSet FOLLOW_stmt_in_if_stmt665 = new BitSet(new long[]{0x000A79FE40000820L});
    public static final BitSet FOLLOW_51_in_if_stmt668 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_if_stmt671 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_if_stmt672 = new BitSet(new long[]{0x000A79FE40000820L});
    public static final BitSet FOLLOW_stmt_in_if_stmt674 = new BitSet(new long[]{0x000A79FE40000820L});
    public static final BitSet FOLLOW_51_in_if_stmt677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expression689 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ArithmaticOperators_in_expression691 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_expression693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expression707 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ArithmaticOperators_in_expression709 = new BitSet(new long[]{0x0000000000001200L});
    public static final BitSet FOLLOW_set_in_expression711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_expression728 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ArithmaticOperators_in_expression735 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_expression737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_expression749 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ArithmaticOperators_in_expression756 = new BitSet(new long[]{0x0000000000001200L});
    public static final BitSet FOLLOW_set_in_expression758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment777 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_AssignmentAutoOperators_in_assignment779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AssignmentAutoOperators_in_assignment791 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_assignment793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment805 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AssignmentOperators_in_assignment807 = new BitSet(new long[]{0x0000000000001A00L});
    public static final BitSet FOLLOW_set_in_assignment809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assigningVariable828 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_assigningVariable830 = new BitSet(new long[]{0x0000000000001A00L});
    public static final BitSet FOLLOW_set_in_assigningVariable833 = new BitSet(new long[]{0x0000000008004000L});
    public static final BitSet FOLLOW_Operators_in_assigningVariable846 = new BitSet(new long[]{0x0000000000001A00L});
    public static final BitSet FOLLOW_set_in_assigningVariable848 = new BitSet(new long[]{0x0000000008004000L});
    public static final BitSet FOLLOW_27_in_assigningVariable863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_assigningVariable867 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_assigningVariable869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_for_loop880 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_for_loop881 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_declOfInteger_in_for_loop882 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_27_in_for_loop885 = new BitSet(new long[]{0x0000000008001A00L});
    public static final BitSet FOLLOW_expression_in_for_loop888 = new BitSet(new long[]{0x0000000008003A00L});
    public static final BitSet FOLLOW_LogicalOperators_in_for_loop891 = new BitSet(new long[]{0x0000000000001A00L});
    public static final BitSet FOLLOW_expression_in_for_loop893 = new BitSet(new long[]{0x0000000008003A00L});
    public static final BitSet FOLLOW_27_in_for_loop899 = new BitSet(new long[]{0x0000000000800820L});
    public static final BitSet FOLLOW_assignment_in_for_loop901 = new BitSet(new long[]{0x0000000000800820L});
    public static final BitSet FOLLOW_23_in_for_loop903 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_for_loop904 = new BitSet(new long[]{0x000A79FE40000820L});
    public static final BitSet FOLLOW_stmt_in_for_loop906 = new BitSet(new long[]{0x000A79FE40000820L});
    public static final BitSet FOLLOW_51_in_for_loop909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_while_loop916 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_while_loop917 = new BitSet(new long[]{0x0000000000001A00L});
    public static final BitSet FOLLOW_expression_in_while_loop918 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_LogicalOperators_in_while_loop921 = new BitSet(new long[]{0x0000000000001A00L});
    public static final BitSet FOLLOW_expression_in_while_loop923 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_23_in_while_loop926 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_while_loop927 = new BitSet(new long[]{0x000A79FE40000820L});
    public static final BitSet FOLLOW_stmt_in_while_loop929 = new BitSet(new long[]{0x000A79FE40000820L});
    public static final BitSet FOLLOW_51_in_while_loop932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_mathmaticalExpression940 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_SignedNumber_in_mathmaticalExpression944 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_IntNum_in_mathmaticalExpression948 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_DoubleNum_in_mathmaticalExpression952 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_22_in_mathmaticalExpression956 = new BitSet(new long[]{0x0000000000489A00L});
    public static final BitSet FOLLOW_mathmaticalExpression_in_mathmaticalExpression957 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_mathmaticalExpression958 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_TrigonometricFunctions_in_mathmaticalExpression962 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_mathmaticalExpression963 = new BitSet(new long[]{0x0000000000489A00L});
    public static final BitSet FOLLOW_mathmaticalExpression_in_mathmaticalExpression964 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_mathmaticalExpression965 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_Operators_in_mathmaticalExpression972 = new BitSet(new long[]{0x0000000000481A00L});
    public static final BitSet FOLLOW_ID_in_mathmaticalExpression975 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_IntNum_in_mathmaticalExpression979 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_DoubleNum_in_mathmaticalExpression983 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_TrigonometricFunctions_in_mathmaticalExpression987 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_mathmaticalExpression988 = new BitSet(new long[]{0x0000000000489A00L});
    public static final BitSet FOLLOW_mathmaticalExpression_in_mathmaticalExpression989 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_mathmaticalExpression990 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_22_in_mathmaticalExpression994 = new BitSet(new long[]{0x0000000000489A00L});
    public static final BitSet FOLLOW_mathmaticalExpression_in_mathmaticalExpression995 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_mathmaticalExpression996 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_set_in_printings_statements1006 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_printings_statements1022 = new BitSet(new long[]{0x0000000000040800L});
    public static final BitSet FOLLOW_ID_in_printings_statements1025 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_StringValue_in_printings_statements1029 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_set_in_printings_statements1034 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_printings_statements1043 = new BitSet(new long[]{0x0000000000040800L});
    public static final BitSet FOLLOW_set_in_printings_statements1045 = new BitSet(new long[]{0x000000001A000000L});
    public static final BitSet FOLLOW_28_in_printings_statements1058 = new BitSet(new long[]{0x0000000000040800L});
    public static final BitSet FOLLOW_StringValue_in_printings_statements1061 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_ID_in_printings_statements1065 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_set_in_printings_statements1070 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_printings_statements1079 = new BitSet(new long[]{0x0000000000040800L});
    public static final BitSet FOLLOW_set_in_printings_statements1081 = new BitSet(new long[]{0x000000001A000000L});
    public static final BitSet FOLLOW_27_in_printings_statements1095 = new BitSet(new long[]{0x0000000000000002L});

}