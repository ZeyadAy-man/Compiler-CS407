// $ANTLR 3.4 C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g 2025-07-31 06:30:22

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ValuesParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ArithmaticOperators", "AssignmentAutoOperators", "AssignmentOperators", "CharValue", "Comment", "ComparisonOperators", "DoubleValue", "ID", "IntValue", "LogicalOperators", "StringValue", "WS", "'('", "')'", "','", "';'", "'='", "'boolean'", "'do'", "'double'", "'else'", "'false'", "'for'", "'if'", "'int'", "'private'", "'protected'", "'public'", "'return'", "'static'", "'true'", "'void'", "'while'", "'{'", "'}'"
    };

    public static final int EOF=-1;
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
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int ArithmaticOperators=4;
    public static final int AssignmentAutoOperators=5;
    public static final int AssignmentOperators=6;
    public static final int CharValue=7;
    public static final int Comment=8;
    public static final int ComparisonOperators=9;
    public static final int DoubleValue=10;
    public static final int ID=11;
    public static final int IntValue=12;
    public static final int LogicalOperators=13;
    public static final int StringValue=14;
    public static final int WS=15;

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
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:3:1: run : ( stmts )+ ;
    public final void run() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:3:5: ( ( stmts )+ )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:3:7: ( stmts )+
            {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:3:7: ( stmts )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Comment||LA1_0==ID||(LA1_0 >= 21 && LA1_0 <= 23)||(LA1_0 >= 26 && LA1_0 <= 28)||LA1_0==36) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:3:7: stmts
            	    {
            	    pushFollow(FOLLOW_stmts_in_run10);
            	    stmts();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


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
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:5:1: stmts : ( ifStmt | numberDeclarations | whileStmt | dowhileStmt | forStmt | assignmentStmt | booleanDeclarations | comment );
    public final void stmts() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:5:7: ( ifStmt | numberDeclarations | whileStmt | dowhileStmt | forStmt | assignmentStmt | booleanDeclarations | comment )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt2=1;
                }
                break;
            case 23:
            case 28:
                {
                alt2=2;
                }
                break;
            case 36:
                {
                alt2=3;
                }
                break;
            case 22:
                {
                alt2=4;
                }
                break;
            case 26:
                {
                alt2=5;
                }
                break;
            case ID:
                {
                alt2=6;
                }
                break;
            case 21:
                {
                alt2=7;
                }
                break;
            case Comment:
                {
                alt2=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:5:9: ifStmt
                    {
                    pushFollow(FOLLOW_ifStmt_in_stmts19);
                    ifStmt();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:5:18: numberDeclarations
                    {
                    pushFollow(FOLLOW_numberDeclarations_in_stmts23);
                    numberDeclarations();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:5:39: whileStmt
                    {
                    pushFollow(FOLLOW_whileStmt_in_stmts27);
                    whileStmt();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:5:51: dowhileStmt
                    {
                    pushFollow(FOLLOW_dowhileStmt_in_stmts31);
                    dowhileStmt();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:5:65: forStmt
                    {
                    pushFollow(FOLLOW_forStmt_in_stmts35);
                    forStmt();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:5:75: assignmentStmt
                    {
                    pushFollow(FOLLOW_assignmentStmt_in_stmts39);
                    assignmentStmt();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:5:92: booleanDeclarations
                    {
                    pushFollow(FOLLOW_booleanDeclarations_in_stmts43);
                    booleanDeclarations();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:5:114: comment
                    {
                    pushFollow(FOLLOW_comment_in_stmts47);
                    comment();

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
            match(input,37,FOLLOW_37_in_body55); 

            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:7:12: ( stmts )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==Comment||LA3_0==ID||(LA3_0 >= 21 && LA3_0 <= 23)||(LA3_0 >= 26 && LA3_0 <= 28)||LA3_0==36) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:7:13: stmts
            	    {
            	    pushFollow(FOLLOW_stmts_in_body58);
            	    stmts();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            match(input,38,FOLLOW_38_in_body62); 

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



    // $ANTLR start "functionStmt"
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:9:1: functionStmt : functionDeclaration functionBody ;
    public final void functionStmt() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:9:13: ( functionDeclaration functionBody )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:9:15: functionDeclaration functionBody
            {
            pushFollow(FOLLOW_functionDeclaration_in_functionStmt69);
            functionDeclaration();

            state._fsp--;


            pushFollow(FOLLOW_functionBody_in_functionStmt71);
            functionBody();

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
    // $ANTLR end "functionStmt"



    // $ANTLR start "functionBody"
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:11:1: functionBody : '{' ( stmts )* ( 'return' ( fullBooleanExpressions | numberExpression ) ';' )? '}' ;
    public final void functionBody() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:11:13: ( '{' ( stmts )* ( 'return' ( fullBooleanExpressions | numberExpression ) ';' )? '}' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:11:15: '{' ( stmts )* ( 'return' ( fullBooleanExpressions | numberExpression ) ';' )? '}'
            {
            match(input,37,FOLLOW_37_in_functionBody78); 

            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:11:19: ( stmts )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==Comment||LA4_0==ID||(LA4_0 >= 21 && LA4_0 <= 23)||(LA4_0 >= 26 && LA4_0 <= 28)||LA4_0==36) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:11:20: stmts
            	    {
            	    pushFollow(FOLLOW_stmts_in_functionBody81);
            	    stmts();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:11:28: ( 'return' ( fullBooleanExpressions | numberExpression ) ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==32) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:11:29: 'return' ( fullBooleanExpressions | numberExpression ) ';'
                    {
                    match(input,32,FOLLOW_32_in_functionBody86); 

                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:11:38: ( fullBooleanExpressions | numberExpression )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0 >= DoubleValue && LA5_0 <= IntValue)) ) {
                        int LA5_1 = input.LA(2);

                        if ( (LA5_1==ComparisonOperators) ) {
                            alt5=1;
                        }
                        else if ( (LA5_1==ArithmaticOperators||LA5_1==19) ) {
                            alt5=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 1, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA5_0==25||LA5_0==34) ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;

                    }
                    switch (alt5) {
                        case 1 :
                            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:11:39: fullBooleanExpressions
                            {
                            pushFollow(FOLLOW_fullBooleanExpressions_in_functionBody89);
                            fullBooleanExpressions();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:11:64: numberExpression
                            {
                            pushFollow(FOLLOW_numberExpression_in_functionBody93);
                            numberExpression();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input,19,FOLLOW_19_in_functionBody96); 

                    }
                    break;

            }


            match(input,38,FOLLOW_38_in_functionBody100); 

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
    // $ANTLR end "functionBody"



    // $ANTLR start "functionDeclaration"
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:13:1: functionDeclaration : ( modifiers )? ( 'static' )? functionReturnType ID '(' ')' ;
    public final void functionDeclaration() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:13:20: ( ( modifiers )? ( 'static' )? functionReturnType ID '(' ')' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:13:22: ( modifiers )? ( 'static' )? functionReturnType ID '(' ')'
            {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:13:22: ( modifiers )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0 >= 29 && LA7_0 <= 31)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:13:22: modifiers
                    {
                    pushFollow(FOLLOW_modifiers_in_functionDeclaration107);
                    modifiers();

                    state._fsp--;


                    }
                    break;

            }


            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:13:33: ( 'static' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==33) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:13:33: 'static'
                    {
                    match(input,33,FOLLOW_33_in_functionDeclaration110); 

                    }
                    break;

            }


            pushFollow(FOLLOW_functionReturnType_in_functionDeclaration113);
            functionReturnType();

            state._fsp--;


            match(input,ID,FOLLOW_ID_in_functionDeclaration115); 

            match(input,16,FOLLOW_16_in_functionDeclaration117); 

            match(input,17,FOLLOW_17_in_functionDeclaration119); 

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
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:15:1: forStmt : 'for' '(' numberDeclarations fullBooleanExpressions ';' assignmentStmt ( ',' assignmentStmt )* ')' body ;
    public final void forStmt() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:15:9: ( 'for' '(' numberDeclarations fullBooleanExpressions ';' assignmentStmt ( ',' assignmentStmt )* ')' body )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:15:11: 'for' '(' numberDeclarations fullBooleanExpressions ';' assignmentStmt ( ',' assignmentStmt )* ')' body
            {
            match(input,26,FOLLOW_26_in_forStmt128); 

            match(input,16,FOLLOW_16_in_forStmt130); 

            pushFollow(FOLLOW_numberDeclarations_in_forStmt132);
            numberDeclarations();

            state._fsp--;


            pushFollow(FOLLOW_fullBooleanExpressions_in_forStmt136);
            fullBooleanExpressions();

            state._fsp--;


            match(input,19,FOLLOW_19_in_forStmt138); 

            pushFollow(FOLLOW_assignmentStmt_in_forStmt140);
            assignmentStmt();

            state._fsp--;


            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:15:84: ( ',' assignmentStmt )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:15:85: ',' assignmentStmt
            	    {
            	    match(input,18,FOLLOW_18_in_forStmt143); 

            	    pushFollow(FOLLOW_assignmentStmt_in_forStmt145);
            	    assignmentStmt();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            match(input,17,FOLLOW_17_in_forStmt149); 

            pushFollow(FOLLOW_body_in_forStmt151);
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
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:17:1: dowhileStmt : 'do' body 'while' '(' fullBooleanExpressions ')' ';' ;
    public final void dowhileStmt() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:17:12: ( 'do' body 'while' '(' fullBooleanExpressions ')' ';' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:17:14: 'do' body 'while' '(' fullBooleanExpressions ')' ';'
            {
            match(input,22,FOLLOW_22_in_dowhileStmt158); 

            pushFollow(FOLLOW_body_in_dowhileStmt160);
            body();

            state._fsp--;


            match(input,36,FOLLOW_36_in_dowhileStmt162); 

            match(input,16,FOLLOW_16_in_dowhileStmt164); 

            pushFollow(FOLLOW_fullBooleanExpressions_in_dowhileStmt166);
            fullBooleanExpressions();

            state._fsp--;


            match(input,17,FOLLOW_17_in_dowhileStmt168); 

            match(input,19,FOLLOW_19_in_dowhileStmt170); 

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
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:19:1: whileStmt : 'while' '(' fullBooleanExpressions ')' body ;
    public final void whileStmt() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:19:10: ( 'while' '(' fullBooleanExpressions ')' body )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:19:12: 'while' '(' fullBooleanExpressions ')' body
            {
            match(input,36,FOLLOW_36_in_whileStmt177); 

            match(input,16,FOLLOW_16_in_whileStmt179); 

            pushFollow(FOLLOW_fullBooleanExpressions_in_whileStmt181);
            fullBooleanExpressions();

            state._fsp--;


            match(input,17,FOLLOW_17_in_whileStmt183); 

            pushFollow(FOLLOW_body_in_whileStmt185);
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
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:21:1: ifStmt : ( if body ) ( elseIf body )* ( else body )? ;
    public final void ifStmt() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:21:8: ( ( if body ) ( elseIf body )* ( else body )? )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:21:10: ( if body ) ( elseIf body )* ( else body )?
            {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:21:10: ( if body )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:21:11: if body
            {
            pushFollow(FOLLOW_if_in_ifStmt194);
            if();

            state._fsp--;


            pushFollow(FOLLOW_body_in_ifStmt196);
            body();

            state._fsp--;


            }


            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:21:20: ( elseIf body )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==27) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:21:21: elseIf body
            	    {
            	    pushFollow(FOLLOW_elseIf_in_ifStmt200);
            	    elseIf();

            	    state._fsp--;


            	    pushFollow(FOLLOW_body_in_ifStmt202);
            	    body();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:21:35: ( else body )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:21:36: else body
                    {
                    pushFollow(FOLLOW_else_in_ifStmt207);
                    else();

                    state._fsp--;


                    pushFollow(FOLLOW_body_in_ifStmt209);
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
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:23:1: elseIf : 'else' 'if' '(' fullBooleanExpressions ')' ;
    public final void elseIf() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:23:8: ( 'else' 'if' '(' fullBooleanExpressions ')' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:23:10: 'else' 'if' '(' fullBooleanExpressions ')'
            {
            match(input,24,FOLLOW_24_in_elseIf219); 

            match(input,27,FOLLOW_27_in_elseIf221); 

            match(input,16,FOLLOW_16_in_elseIf223); 

            pushFollow(FOLLOW_fullBooleanExpressions_in_elseIf225);
            fullBooleanExpressions();

            state._fsp--;


            match(input,17,FOLLOW_17_in_elseIf227); 

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
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:25:1: else : 'else' ;
    public final void else() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:25:6: ( 'else' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:25:8: 'else'
            {
            match(input,24,FOLLOW_24_in_else235); 

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
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:27:1: if : 'if' '(' fullBooleanExpressions ')' ;
    public final void if() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:27:4: ( 'if' '(' fullBooleanExpressions ')' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:27:6: 'if' '(' fullBooleanExpressions ')'
            {
            match(input,27,FOLLOW_27_in_if243); 

            match(input,16,FOLLOW_16_in_if245); 

            pushFollow(FOLLOW_fullBooleanExpressions_in_if247);
            fullBooleanExpressions();

            state._fsp--;


            match(input,17,FOLLOW_17_in_if249); 

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
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:29:1: fullBooleanExpressions : ( booleanExpressions ( LogicalOperators booleanExpressions )* ) ;
    public final void fullBooleanExpressions() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:29:23: ( ( booleanExpressions ( LogicalOperators booleanExpressions )* ) )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:29:27: ( booleanExpressions ( LogicalOperators booleanExpressions )* )
            {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:29:27: ( booleanExpressions ( LogicalOperators booleanExpressions )* )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:29:28: booleanExpressions ( LogicalOperators booleanExpressions )*
            {
            pushFollow(FOLLOW_booleanExpressions_in_fullBooleanExpressions259);
            booleanExpressions();

            state._fsp--;


            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:29:47: ( LogicalOperators booleanExpressions )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==LogicalOperators) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:29:48: LogicalOperators booleanExpressions
            	    {
            	    match(input,LogicalOperators,FOLLOW_LogicalOperators_in_fullBooleanExpressions262); 

            	    pushFollow(FOLLOW_booleanExpressions_in_fullBooleanExpressions264);
            	    booleanExpressions();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:31:1: booleanExpressions : ( ( number ComparisonOperators numberExpression ) | booleanValue );
    public final void booleanExpressions() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:31:19: ( ( number ComparisonOperators numberExpression ) | booleanValue )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0 >= DoubleValue && LA13_0 <= IntValue)) ) {
                alt13=1;
            }
            else if ( (LA13_0==25||LA13_0==34) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:31:21: ( number ComparisonOperators numberExpression )
                    {
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:31:21: ( number ComparisonOperators numberExpression )
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:31:22: number ComparisonOperators numberExpression
                    {
                    pushFollow(FOLLOW_number_in_booleanExpressions275);
                    number();

                    state._fsp--;


                    match(input,ComparisonOperators,FOLLOW_ComparisonOperators_in_booleanExpressions277); 

                    pushFollow(FOLLOW_numberExpression_in_booleanExpressions279);
                    numberExpression();

                    state._fsp--;


                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:31:69: booleanValue
                    {
                    pushFollow(FOLLOW_booleanValue_in_booleanExpressions284);
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
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:33:1: numberDeclarations : ( 'int' | 'double' ) ID ( ( '=' numberExpression ( ArithmaticOperators numberExpression )* ) | ( ',' ID )* ) ';' ;
    public final void numberDeclarations() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:33:19: ( ( 'int' | 'double' ) ID ( ( '=' numberExpression ( ArithmaticOperators numberExpression )* ) | ( ',' ID )* ) ';' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:33:21: ( 'int' | 'double' ) ID ( ( '=' numberExpression ( ArithmaticOperators numberExpression )* ) | ( ',' ID )* ) ';'
            {
            if ( input.LA(1)==23||input.LA(1)==28 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,ID,FOLLOW_ID_in_numberDeclarations299); 

            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:33:43: ( ( '=' numberExpression ( ArithmaticOperators numberExpression )* ) | ( ',' ID )* )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            else if ( ((LA16_0 >= 18 && LA16_0 <= 19)) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:33:44: ( '=' numberExpression ( ArithmaticOperators numberExpression )* )
                    {
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:33:44: ( '=' numberExpression ( ArithmaticOperators numberExpression )* )
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:33:45: '=' numberExpression ( ArithmaticOperators numberExpression )*
                    {
                    match(input,20,FOLLOW_20_in_numberDeclarations303); 

                    pushFollow(FOLLOW_numberExpression_in_numberDeclarations305);
                    numberExpression();

                    state._fsp--;


                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:33:67: ( ArithmaticOperators numberExpression )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==ArithmaticOperators) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:33:68: ArithmaticOperators numberExpression
                    	    {
                    	    match(input,ArithmaticOperators,FOLLOW_ArithmaticOperators_in_numberDeclarations309); 

                    	    pushFollow(FOLLOW_numberExpression_in_numberDeclarations312);
                    	    numberExpression();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:33:112: ( ',' ID )*
                    {
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:33:112: ( ',' ID )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==18) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:33:113: ',' ID
                    	    {
                    	    match(input,18,FOLLOW_18_in_numberDeclarations321); 

                    	    match(input,ID,FOLLOW_ID_in_numberDeclarations323); 

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,19,FOLLOW_19_in_numberDeclarations328); 

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
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:35:1: booleanDeclarations : 'boolean' ID '=' fullBooleanExpressions ';' ;
    public final void booleanDeclarations() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:35:20: ( 'boolean' ID '=' fullBooleanExpressions ';' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:35:22: 'boolean' ID '=' fullBooleanExpressions ';'
            {
            match(input,21,FOLLOW_21_in_booleanDeclarations335); 

            match(input,ID,FOLLOW_ID_in_booleanDeclarations337); 

            match(input,20,FOLLOW_20_in_booleanDeclarations339); 

            pushFollow(FOLLOW_fullBooleanExpressions_in_booleanDeclarations341);
            fullBooleanExpressions();

            state._fsp--;


            match(input,19,FOLLOW_19_in_booleanDeclarations343); 

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
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:37:1: numberExpression : ( number ( ArithmaticOperators numberExpression )? ) ;
    public final void numberExpression() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:37:17: ( ( number ( ArithmaticOperators numberExpression )? ) )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:37:19: ( number ( ArithmaticOperators numberExpression )? )
            {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:37:19: ( number ( ArithmaticOperators numberExpression )? )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:37:20: number ( ArithmaticOperators numberExpression )?
            {
            pushFollow(FOLLOW_number_in_numberExpression351);
            number();

            state._fsp--;


            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:37:27: ( ArithmaticOperators numberExpression )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ArithmaticOperators) ) {
                int LA17_1 = input.LA(2);

                if ( ((LA17_1 >= DoubleValue && LA17_1 <= IntValue)) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:37:28: ArithmaticOperators numberExpression
                    {
                    match(input,ArithmaticOperators,FOLLOW_ArithmaticOperators_in_numberExpression354); 

                    pushFollow(FOLLOW_numberExpression_in_numberExpression356);
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
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:39:1: number : ( IntValue | DoubleValue | ID );
    public final void number() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:39:8: ( IntValue | DoubleValue | ID )
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
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:41:1: assignmentStmt : ID ( AssignmentAutoOperators | ( AssignmentOperators number ) ) ;
    public final void assignmentStmt() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:41:15: ( ID ( AssignmentAutoOperators | ( AssignmentOperators number ) ) )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:41:18: ID ( AssignmentAutoOperators | ( AssignmentOperators number ) )
            {
            match(input,ID,FOLLOW_ID_in_assignmentStmt386); 

            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:41:21: ( AssignmentAutoOperators | ( AssignmentOperators number ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==AssignmentAutoOperators) ) {
                alt18=1;
            }
            else if ( (LA18_0==AssignmentOperators) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:41:22: AssignmentAutoOperators
                    {
                    match(input,AssignmentAutoOperators,FOLLOW_AssignmentAutoOperators_in_assignmentStmt389); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:41:48: ( AssignmentOperators number )
                    {
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:41:48: ( AssignmentOperators number )
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:41:49: AssignmentOperators number
                    {
                    match(input,AssignmentOperators,FOLLOW_AssignmentOperators_in_assignmentStmt394); 

                    pushFollow(FOLLOW_number_in_assignmentStmt396);
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



    // $ANTLR start "comment"
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:43:1: comment : Comment ;
    public final void comment() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:43:9: ( Comment )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:43:11: Comment
            {
            match(input,Comment,FOLLOW_Comment_in_comment407); 

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
    // $ANTLR end "comment"



    // $ANTLR start "booleanValue"
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:51:1: booleanValue : ( 'true' | 'false' );
    public final void booleanValue() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:51:13: ( 'true' | 'false' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:
            {
            if ( input.LA(1)==25||input.LA(1)==34 ) {
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
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:59:1: modifiers : ( 'public' | 'private' | 'protected' );
    public final void modifiers() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:59:10: ( 'public' | 'private' | 'protected' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:
            {
            if ( (input.LA(1) >= 29 && input.LA(1) <= 31) ) {
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
    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:60:1: functionReturnType : ( 'void' | 'int' | 'double' | 'boolean' );
    public final void functionReturnType() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:60:19: ( 'void' | 'int' | 'double' | 'boolean' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:
            {
            if ( input.LA(1)==21||input.LA(1)==23||input.LA(1)==28||input.LA(1)==35 ) {
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


 

    public static final BitSet FOLLOW_stmts_in_run10 = new BitSet(new long[]{0x000000101CE00902L});
    public static final BitSet FOLLOW_ifStmt_in_stmts19 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numberDeclarations_in_stmts23 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStmt_in_stmts27 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dowhileStmt_in_stmts31 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStmt_in_stmts35 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentStmt_in_stmts39 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanDeclarations_in_stmts43 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comment_in_stmts47 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_body55 = new BitSet(new long[]{0x000000501CE00900L});
    public static final BitSet FOLLOW_stmts_in_body58 = new BitSet(new long[]{0x000000501CE00900L});
    public static final BitSet FOLLOW_38_in_body62 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDeclaration_in_functionStmt69 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_functionBody_in_functionStmt71 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_functionBody78 = new BitSet(new long[]{0x000000511CE00900L});
    public static final BitSet FOLLOW_stmts_in_functionBody81 = new BitSet(new long[]{0x000000511CE00900L});
    public static final BitSet FOLLOW_32_in_functionBody86 = new BitSet(new long[]{0x0000000402001C00L});
    public static final BitSet FOLLOW_fullBooleanExpressions_in_functionBody89 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_numberExpression_in_functionBody93 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_functionBody96 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_functionBody100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_functionDeclaration107 = new BitSet(new long[]{0x0000000A10A00000L});
    public static final BitSet FOLLOW_33_in_functionDeclaration110 = new BitSet(new long[]{0x0000000810A00000L});
    public static final BitSet FOLLOW_functionReturnType_in_functionDeclaration113 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_functionDeclaration115 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_functionDeclaration117 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_functionDeclaration119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_forStmt128 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_forStmt130 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_numberDeclarations_in_forStmt132 = new BitSet(new long[]{0x0000000402001C00L});
    public static final BitSet FOLLOW_fullBooleanExpressions_in_forStmt136 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_forStmt138 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_assignmentStmt_in_forStmt140 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_forStmt143 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_assignmentStmt_in_forStmt145 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_forStmt149 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_body_in_forStmt151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_dowhileStmt158 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_body_in_dowhileStmt160 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_dowhileStmt162 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_dowhileStmt164 = new BitSet(new long[]{0x0000000402001C00L});
    public static final BitSet FOLLOW_fullBooleanExpressions_in_dowhileStmt166 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_dowhileStmt168 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_dowhileStmt170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_whileStmt177 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_whileStmt179 = new BitSet(new long[]{0x0000000402001C00L});
    public static final BitSet FOLLOW_fullBooleanExpressions_in_whileStmt181 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_whileStmt183 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_body_in_whileStmt185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_in_ifStmt194 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_body_in_ifStmt196 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_elseIf_in_ifStmt200 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_body_in_ifStmt202 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_else_in_ifStmt207 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_body_in_ifStmt209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_elseIf219 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_elseIf221 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_elseIf223 = new BitSet(new long[]{0x0000000402001C00L});
    public static final BitSet FOLLOW_fullBooleanExpressions_in_elseIf225 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_elseIf227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_else235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_if243 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_if245 = new BitSet(new long[]{0x0000000402001C00L});
    public static final BitSet FOLLOW_fullBooleanExpressions_in_if247 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_if249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanExpressions_in_fullBooleanExpressions259 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_LogicalOperators_in_fullBooleanExpressions262 = new BitSet(new long[]{0x0000000402001C00L});
    public static final BitSet FOLLOW_booleanExpressions_in_fullBooleanExpressions264 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_number_in_booleanExpressions275 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ComparisonOperators_in_booleanExpressions277 = new BitSet(new long[]{0x0000000000001C00L});
    public static final BitSet FOLLOW_numberExpression_in_booleanExpressions279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanValue_in_booleanExpressions284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numberDeclarations291 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_numberDeclarations299 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_20_in_numberDeclarations303 = new BitSet(new long[]{0x0000000000001C00L});
    public static final BitSet FOLLOW_numberExpression_in_numberDeclarations305 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ArithmaticOperators_in_numberDeclarations309 = new BitSet(new long[]{0x0000000000001C00L});
    public static final BitSet FOLLOW_numberExpression_in_numberDeclarations312 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_18_in_numberDeclarations321 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_numberDeclarations323 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_numberDeclarations328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_booleanDeclarations335 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_booleanDeclarations337 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_booleanDeclarations339 = new BitSet(new long[]{0x0000000402001C00L});
    public static final BitSet FOLLOW_fullBooleanExpressions_in_booleanDeclarations341 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_booleanDeclarations343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_numberExpression351 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ArithmaticOperators_in_numberExpression354 = new BitSet(new long[]{0x0000000000001C00L});
    public static final BitSet FOLLOW_numberExpression_in_numberExpression356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignmentStmt386 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_AssignmentAutoOperators_in_assignmentStmt389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AssignmentOperators_in_assignmentStmt394 = new BitSet(new long[]{0x0000000000001C00L});
    public static final BitSet FOLLOW_number_in_assignmentStmt396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comment_in_comment407 = new BitSet(new long[]{0x0000000000000002L});

}