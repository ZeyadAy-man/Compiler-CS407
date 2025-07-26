// $ANTLR 3.4 C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g 2025-07-23 14:51:57

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ValuesParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ArithmaticOperators", "AssignmentAutoOperators", "AssignmentOperators", "CharValue", "ComparisonOperators", "DoubleValue", "ID", "IntValue", "LogicalOperators", "StringValue", "WS", "'('", "')'", "','", "';'", "'='", "'boolean'", "'do'", "'double'", "'else'", "'false'", "'for'", "'if'", "'int'", "'private'", "'protected'", "'public'", "'static'", "'true'", "'void'", "'while'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
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
    public static final int ArithmaticOperators=4;
    public static final int AssignmentAutoOperators=5;
    public static final int AssignmentOperators=6;
    public static final int CharValue=7;
    public static final int ComparisonOperators=8;
    public static final int DoubleValue=9;
    public static final int ID=10;
    public static final int IntValue=11;
    public static final int LogicalOperators=12;
    public static final int StringValue=13;
    public static final int WS=14;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public ValuesParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ValuesParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return ValuesParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g"; }



    // $ANTLR start "run"
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:3:1: run : stmts ;
    public final void run() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:3:5: ( stmts )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:3:7: stmts
            {
            pushFollow(FOLLOW_stmts_in_run10);
            stmts();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "run"



    // $ANTLR start "stmts"
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:5:1: stmts : ( ifStmt | numberDeclarations | whileStmt | dowhileStmt | forStmt | assignmentStmt | booleanDeclarations );
    public final void stmts() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:5:7: ( ifStmt | numberDeclarations | whileStmt | dowhileStmt | forStmt | assignmentStmt | booleanDeclarations )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt1=1;
                }
                break;
            case 22:
            case 27:
                {
                alt1=2;
                }
                break;
            case 34:
                {
                alt1=3;
                }
                break;
            case 21:
                {
                alt1=4;
                }
                break;
            case 25:
                {
                alt1=5;
                }
                break;
            case ID:
                {
                alt1=6;
                }
                break;
            case 20:
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:5:9: ifStmt
                    {
                    pushFollow(FOLLOW_ifStmt_in_stmts18);
                    ifStmt();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:5:18: numberDeclarations
                    {
                    pushFollow(FOLLOW_numberDeclarations_in_stmts22);
                    numberDeclarations();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:5:39: whileStmt
                    {
                    pushFollow(FOLLOW_whileStmt_in_stmts26);
                    whileStmt();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:5:51: dowhileStmt
                    {
                    pushFollow(FOLLOW_dowhileStmt_in_stmts30);
                    dowhileStmt();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:5:65: forStmt
                    {
                    pushFollow(FOLLOW_forStmt_in_stmts34);
                    forStmt();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:5:75: assignmentStmt
                    {
                    pushFollow(FOLLOW_assignmentStmt_in_stmts38);
                    assignmentStmt();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:5:92: booleanDeclarations
                    {
                    pushFollow(FOLLOW_booleanDeclarations_in_stmts42);
                    booleanDeclarations();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "stmts"



    // $ANTLR start "body"
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:7:1: body : '{' ( stmts )* '}' ;
    public final void body() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:7:6: ( '{' ( stmts )* '}' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:7:8: '{' ( stmts )* '}'
            {
            match(input,35,FOLLOW_35_in_body50); 

            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:7:12: ( stmts )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ID||(LA2_0 >= 20 && LA2_0 <= 22)||(LA2_0 >= 25 && LA2_0 <= 27)||LA2_0==34) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:7:13: stmts
            	    {
            	    pushFollow(FOLLOW_stmts_in_body53);
            	    stmts();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match(input,36,FOLLOW_36_in_body57); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "body"



    // $ANTLR start "functionDeclaration"
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:11:1: functionDeclaration : ( modifiers )? ( 'static' )? functionReturnType ID '(' ')' ;
    public final void functionDeclaration() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:11:20: ( ( modifiers )? ( 'static' )? functionReturnType ID '(' ')' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:11:22: ( modifiers )? ( 'static' )? functionReturnType ID '(' ')'
            {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:11:22: ( modifiers )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0 >= 28 && LA3_0 <= 30)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:11:22: modifiers
                    {
                    pushFollow(FOLLOW_modifiers_in_functionDeclaration66);
                    modifiers();

                    state._fsp--;


                    }
                    break;

            }


            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:11:33: ( 'static' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==31) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:11:33: 'static'
                    {
                    match(input,31,FOLLOW_31_in_functionDeclaration69); 

                    }
                    break;

            }


            pushFollow(FOLLOW_functionReturnType_in_functionDeclaration72);
            functionReturnType();

            state._fsp--;


            match(input,ID,FOLLOW_ID_in_functionDeclaration74); 

            match(input,15,FOLLOW_15_in_functionDeclaration76); 

            match(input,16,FOLLOW_16_in_functionDeclaration78); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "functionDeclaration"



    // $ANTLR start "forStmt"
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:13:1: forStmt : 'for' '(' numberDeclarations fullBooleanExpressions ';' assignmentStmt ( ',' assignmentStmt )* ')' body ;
    public final void forStmt() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:13:9: ( 'for' '(' numberDeclarations fullBooleanExpressions ';' assignmentStmt ( ',' assignmentStmt )* ')' body )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:13:11: 'for' '(' numberDeclarations fullBooleanExpressions ';' assignmentStmt ( ',' assignmentStmt )* ')' body
            {
            match(input,25,FOLLOW_25_in_forStmt87); 

            match(input,15,FOLLOW_15_in_forStmt89); 

            pushFollow(FOLLOW_numberDeclarations_in_forStmt91);
            numberDeclarations();

            state._fsp--;


            pushFollow(FOLLOW_fullBooleanExpressions_in_forStmt95);
            fullBooleanExpressions();

            state._fsp--;


            match(input,18,FOLLOW_18_in_forStmt97); 

            pushFollow(FOLLOW_assignmentStmt_in_forStmt99);
            assignmentStmt();

            state._fsp--;


            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:13:84: ( ',' assignmentStmt )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:13:85: ',' assignmentStmt
            	    {
            	    match(input,17,FOLLOW_17_in_forStmt102); 

            	    pushFollow(FOLLOW_assignmentStmt_in_forStmt104);
            	    assignmentStmt();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            match(input,16,FOLLOW_16_in_forStmt108); 

            pushFollow(FOLLOW_body_in_forStmt110);
            body();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "forStmt"



    // $ANTLR start "dowhileStmt"
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:15:1: dowhileStmt : 'do' body 'while' '(' fullBooleanExpressions ')' ';' ;
    public final void dowhileStmt() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:15:12: ( 'do' body 'while' '(' fullBooleanExpressions ')' ';' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:15:14: 'do' body 'while' '(' fullBooleanExpressions ')' ';'
            {
            match(input,21,FOLLOW_21_in_dowhileStmt117); 

            pushFollow(FOLLOW_body_in_dowhileStmt119);
            body();

            state._fsp--;


            match(input,34,FOLLOW_34_in_dowhileStmt121); 

            match(input,15,FOLLOW_15_in_dowhileStmt123); 

            pushFollow(FOLLOW_fullBooleanExpressions_in_dowhileStmt125);
            fullBooleanExpressions();

            state._fsp--;


            match(input,16,FOLLOW_16_in_dowhileStmt127); 

            match(input,18,FOLLOW_18_in_dowhileStmt129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "dowhileStmt"



    // $ANTLR start "whileStmt"
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:17:1: whileStmt : 'while' '(' fullBooleanExpressions ')' body ;
    public final void whileStmt() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:17:10: ( 'while' '(' fullBooleanExpressions ')' body )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:17:12: 'while' '(' fullBooleanExpressions ')' body
            {
            match(input,34,FOLLOW_34_in_whileStmt136); 

            match(input,15,FOLLOW_15_in_whileStmt138); 

            pushFollow(FOLLOW_fullBooleanExpressions_in_whileStmt140);
            fullBooleanExpressions();

            state._fsp--;


            match(input,16,FOLLOW_16_in_whileStmt142); 

            pushFollow(FOLLOW_body_in_whileStmt144);
            body();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "whileStmt"



    // $ANTLR start "ifStmt"
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:19:1: ifStmt : ( if body ) ( elseIf body )* ( else body )? ;
    public final void ifStmt() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:19:8: ( ( if body ) ( elseIf body )* ( else body )? )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:19:10: ( if body ) ( elseIf body )* ( else body )?
            {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:19:10: ( if body )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:19:11: if body
            {
            pushFollow(FOLLOW_if_in_ifStmt153);
            if();

            state._fsp--;


            pushFollow(FOLLOW_body_in_ifStmt155);
            body();

            state._fsp--;


            }


            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:19:20: ( elseIf body )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==26) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:19:21: elseIf body
            	    {
            	    pushFollow(FOLLOW_elseIf_in_ifStmt159);
            	    elseIf();

            	    state._fsp--;


            	    pushFollow(FOLLOW_body_in_ifStmt161);
            	    body();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:19:35: ( else body )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:19:36: else body
                    {
                    pushFollow(FOLLOW_else_in_ifStmt166);
                    else();

                    state._fsp--;


                    pushFollow(FOLLOW_body_in_ifStmt168);
                    body();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "ifStmt"



    // $ANTLR start "elseIf"
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:21:1: elseIf : 'else' 'if' '(' fullBooleanExpressions ')' ;
    public final void elseIf() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:21:8: ( 'else' 'if' '(' fullBooleanExpressions ')' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:21:10: 'else' 'if' '(' fullBooleanExpressions ')'
            {
            match(input,23,FOLLOW_23_in_elseIf178); 

            match(input,26,FOLLOW_26_in_elseIf180); 

            match(input,15,FOLLOW_15_in_elseIf182); 

            pushFollow(FOLLOW_fullBooleanExpressions_in_elseIf184);
            fullBooleanExpressions();

            state._fsp--;


            match(input,16,FOLLOW_16_in_elseIf186); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "elseIf"



    // $ANTLR start "else"
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:23:1: else : 'else' ;
    public final void else() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:23:6: ( 'else' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:23:8: 'else'
            {
            match(input,23,FOLLOW_23_in_else194); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "else"



    // $ANTLR start "if"
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:25:1: if : 'if' '(' fullBooleanExpressions ')' ;
    public final void if() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:25:4: ( 'if' '(' fullBooleanExpressions ')' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:25:6: 'if' '(' fullBooleanExpressions ')'
            {
            match(input,26,FOLLOW_26_in_if202); 

            match(input,15,FOLLOW_15_in_if204); 

            pushFollow(FOLLOW_fullBooleanExpressions_in_if206);
            fullBooleanExpressions();

            state._fsp--;


            match(input,16,FOLLOW_16_in_if208); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "if"



    // $ANTLR start "fullBooleanExpressions"
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:27:1: fullBooleanExpressions : ( booleanExpressions ( LogicalOperators booleanExpressions )* ) ;
    public final void fullBooleanExpressions() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:27:23: ( ( booleanExpressions ( LogicalOperators booleanExpressions )* ) )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:27:27: ( booleanExpressions ( LogicalOperators booleanExpressions )* )
            {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:27:27: ( booleanExpressions ( LogicalOperators booleanExpressions )* )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:27:28: booleanExpressions ( LogicalOperators booleanExpressions )*
            {
            pushFollow(FOLLOW_booleanExpressions_in_fullBooleanExpressions218);
            booleanExpressions();

            state._fsp--;


            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:27:47: ( LogicalOperators booleanExpressions )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==LogicalOperators) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:27:48: LogicalOperators booleanExpressions
            	    {
            	    match(input,LogicalOperators,FOLLOW_LogicalOperators_in_fullBooleanExpressions221); 

            	    pushFollow(FOLLOW_booleanExpressions_in_fullBooleanExpressions223);
            	    booleanExpressions();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "fullBooleanExpressions"



    // $ANTLR start "booleanExpressions"
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:29:1: booleanExpressions : ( ( numberExpression ComparisonOperators numberExpression ) | booleanValue );
    public final void booleanExpressions() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:29:19: ( ( numberExpression ComparisonOperators numberExpression ) | booleanValue )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0 >= DoubleValue && LA9_0 <= IntValue)) ) {
                alt9=1;
            }
            else if ( (LA9_0==24||LA9_0==32) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:29:21: ( numberExpression ComparisonOperators numberExpression )
                    {
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:29:21: ( numberExpression ComparisonOperators numberExpression )
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:29:22: numberExpression ComparisonOperators numberExpression
                    {
                    pushFollow(FOLLOW_numberExpression_in_booleanExpressions234);
                    numberExpression();

                    state._fsp--;


                    match(input,ComparisonOperators,FOLLOW_ComparisonOperators_in_booleanExpressions236); 

                    pushFollow(FOLLOW_numberExpression_in_booleanExpressions238);
                    numberExpression();

                    state._fsp--;


                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:29:79: booleanValue
                    {
                    pushFollow(FOLLOW_booleanValue_in_booleanExpressions243);
                    booleanValue();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "booleanExpressions"



    // $ANTLR start "numberDeclarations"
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:31:1: numberDeclarations : ( 'int' | 'double' ) ID '=' numberExpression ( ArithmaticOperators numberExpression )* ';' ;
    public final void numberDeclarations() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:31:19: ( ( 'int' | 'double' ) ID '=' numberExpression ( ArithmaticOperators numberExpression )* ';' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:31:21: ( 'int' | 'double' ) ID '=' numberExpression ( ArithmaticOperators numberExpression )* ';'
            {
            if ( input.LA(1)==22||input.LA(1)==27 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,ID,FOLLOW_ID_in_numberDeclarations258); 

            match(input,19,FOLLOW_19_in_numberDeclarations260); 

            pushFollow(FOLLOW_numberExpression_in_numberDeclarations264);
            numberExpression();

            state._fsp--;


            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:31:67: ( ArithmaticOperators numberExpression )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==ArithmaticOperators) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:31:68: ArithmaticOperators numberExpression
            	    {
            	    match(input,ArithmaticOperators,FOLLOW_ArithmaticOperators_in_numberDeclarations268); 

            	    pushFollow(FOLLOW_numberExpression_in_numberDeclarations271);
            	    numberExpression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            match(input,18,FOLLOW_18_in_numberDeclarations276); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "numberDeclarations"



    // $ANTLR start "booleanDeclarations"
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:33:1: booleanDeclarations : 'boolean' ID '=' fullBooleanExpressions ';' ;
    public final void booleanDeclarations() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:33:20: ( 'boolean' ID '=' fullBooleanExpressions ';' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:33:22: 'boolean' ID '=' fullBooleanExpressions ';'
            {
            match(input,20,FOLLOW_20_in_booleanDeclarations283); 

            match(input,ID,FOLLOW_ID_in_booleanDeclarations285); 

            match(input,19,FOLLOW_19_in_booleanDeclarations287); 

            pushFollow(FOLLOW_fullBooleanExpressions_in_booleanDeclarations289);
            fullBooleanExpressions();

            state._fsp--;


            match(input,18,FOLLOW_18_in_booleanDeclarations291); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "booleanDeclarations"



    // $ANTLR start "numberExpression"
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:35:1: numberExpression : ( number ( ArithmaticOperators numberExpression )? ) ;
    public final void numberExpression() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:35:17: ( ( number ( ArithmaticOperators numberExpression )? ) )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:35:19: ( number ( ArithmaticOperators numberExpression )? )
            {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:35:19: ( number ( ArithmaticOperators numberExpression )? )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:35:20: number ( ArithmaticOperators numberExpression )?
            {
            pushFollow(FOLLOW_number_in_numberExpression299);
            number();

            state._fsp--;


            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:35:27: ( ArithmaticOperators numberExpression )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ArithmaticOperators) ) {
                int LA11_1 = input.LA(2);

                if ( ((LA11_1 >= DoubleValue && LA11_1 <= IntValue)) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:35:28: ArithmaticOperators numberExpression
                    {
                    match(input,ArithmaticOperators,FOLLOW_ArithmaticOperators_in_numberExpression302); 

                    pushFollow(FOLLOW_numberExpression_in_numberExpression304);
                    numberExpression();

                    state._fsp--;


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "numberExpression"



    // $ANTLR start "number"
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:37:1: number : ( IntValue | DoubleValue | ID );
    public final void number() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:37:8: ( IntValue | DoubleValue | ID )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:
            {
            if ( (input.LA(1) >= DoubleValue && input.LA(1) <= IntValue) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "number"



    // $ANTLR start "assignmentStmt"
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:39:1: assignmentStmt : ID ( AssignmentAutoOperators | ( AssignmentOperators number ) ) ;
    public final void assignmentStmt() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:39:15: ( ID ( AssignmentAutoOperators | ( AssignmentOperators number ) ) )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:39:18: ID ( AssignmentAutoOperators | ( AssignmentOperators number ) )
            {
            match(input,ID,FOLLOW_ID_in_assignmentStmt334); 

            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:39:21: ( AssignmentAutoOperators | ( AssignmentOperators number ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==AssignmentAutoOperators) ) {
                alt12=1;
            }
            else if ( (LA12_0==AssignmentOperators) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:39:22: AssignmentAutoOperators
                    {
                    match(input,AssignmentAutoOperators,FOLLOW_AssignmentAutoOperators_in_assignmentStmt337); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:39:48: ( AssignmentOperators number )
                    {
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:39:48: ( AssignmentOperators number )
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:39:49: AssignmentOperators number
                    {
                    match(input,AssignmentOperators,FOLLOW_AssignmentOperators_in_assignmentStmt342); 

                    pushFollow(FOLLOW_number_in_assignmentStmt344);
                    number();

                    state._fsp--;


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "assignmentStmt"



    // $ANTLR start "booleanValue"
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:48:1: booleanValue : ( 'true' | 'false' );
    public final void booleanValue() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:48:13: ( 'true' | 'false' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:
            {
            if ( input.LA(1)==24||input.LA(1)==32 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "booleanValue"



    // $ANTLR start "modifiers"
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:56:1: modifiers : ( 'public' | 'private' | 'protected' );
    public final void modifiers() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:56:10: ( 'public' | 'private' | 'protected' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:
            {
            if ( (input.LA(1) >= 28 && input.LA(1) <= 30) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "modifiers"



    // $ANTLR start "functionReturnType"
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:57:1: functionReturnType : ( 'void' | 'int' | 'double' | 'boolean' );
    public final void functionReturnType() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:57:19: ( 'void' | 'int' | 'double' | 'boolean' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:
            {
            if ( input.LA(1)==20||input.LA(1)==22||input.LA(1)==27||input.LA(1)==33 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "functionReturnType"

    // Delegated rules


 

    public static final BitSet FOLLOW_stmts_in_run10 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStmt_in_stmts18 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numberDeclarations_in_stmts22 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStmt_in_stmts26 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dowhileStmt_in_stmts30 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStmt_in_stmts34 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentStmt_in_stmts38 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanDeclarations_in_stmts42 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_body50 = new BitSet(new long[]{0x000000140E700400L});
    public static final BitSet FOLLOW_stmts_in_body53 = new BitSet(new long[]{0x000000140E700400L});
    public static final BitSet FOLLOW_36_in_body57 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_functionDeclaration66 = new BitSet(new long[]{0x0000000288500000L});
    public static final BitSet FOLLOW_31_in_functionDeclaration69 = new BitSet(new long[]{0x0000000208500000L});
    public static final BitSet FOLLOW_functionReturnType_in_functionDeclaration72 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_functionDeclaration74 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_functionDeclaration76 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_functionDeclaration78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_forStmt87 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_forStmt89 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_numberDeclarations_in_forStmt91 = new BitSet(new long[]{0x0000000101000E00L});
    public static final BitSet FOLLOW_fullBooleanExpressions_in_forStmt95 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_forStmt97 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_assignmentStmt_in_forStmt99 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_forStmt102 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_assignmentStmt_in_forStmt104 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_forStmt108 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_body_in_forStmt110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_dowhileStmt117 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_body_in_dowhileStmt119 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_dowhileStmt121 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_dowhileStmt123 = new BitSet(new long[]{0x0000000101000E00L});
    public static final BitSet FOLLOW_fullBooleanExpressions_in_dowhileStmt125 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_dowhileStmt127 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_dowhileStmt129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_whileStmt136 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_whileStmt138 = new BitSet(new long[]{0x0000000101000E00L});
    public static final BitSet FOLLOW_fullBooleanExpressions_in_whileStmt140 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_whileStmt142 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_body_in_whileStmt144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_in_ifStmt153 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_body_in_ifStmt155 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_elseIf_in_ifStmt159 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_body_in_ifStmt161 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_else_in_ifStmt166 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_body_in_ifStmt168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_elseIf178 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_elseIf180 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_elseIf182 = new BitSet(new long[]{0x0000000101000E00L});
    public static final BitSet FOLLOW_fullBooleanExpressions_in_elseIf184 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_elseIf186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_else194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_if202 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_if204 = new BitSet(new long[]{0x0000000101000E00L});
    public static final BitSet FOLLOW_fullBooleanExpressions_in_if206 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_if208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanExpressions_in_fullBooleanExpressions218 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_LogicalOperators_in_fullBooleanExpressions221 = new BitSet(new long[]{0x0000000101000E00L});
    public static final BitSet FOLLOW_booleanExpressions_in_fullBooleanExpressions223 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_numberExpression_in_booleanExpressions234 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ComparisonOperators_in_booleanExpressions236 = new BitSet(new long[]{0x0000000000000E00L});
    public static final BitSet FOLLOW_numberExpression_in_booleanExpressions238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanValue_in_booleanExpressions243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numberDeclarations250 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_numberDeclarations258 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_numberDeclarations260 = new BitSet(new long[]{0x0000000000000E00L});
    public static final BitSet FOLLOW_numberExpression_in_numberDeclarations264 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ArithmaticOperators_in_numberDeclarations268 = new BitSet(new long[]{0x0000000000000E00L});
    public static final BitSet FOLLOW_numberExpression_in_numberDeclarations271 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18_in_numberDeclarations276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_booleanDeclarations283 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_booleanDeclarations285 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_booleanDeclarations287 = new BitSet(new long[]{0x0000000101000E00L});
    public static final BitSet FOLLOW_fullBooleanExpressions_in_booleanDeclarations289 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_booleanDeclarations291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_numberExpression299 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ArithmaticOperators_in_numberExpression302 = new BitSet(new long[]{0x0000000000000E00L});
    public static final BitSet FOLLOW_numberExpression_in_numberExpression304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignmentStmt334 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_AssignmentAutoOperators_in_assignmentStmt337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AssignmentOperators_in_assignmentStmt342 = new BitSet(new long[]{0x0000000000000E00L});
    public static final BitSet FOLLOW_number_in_assignmentStmt344 = new BitSet(new long[]{0x0000000000000002L});

}