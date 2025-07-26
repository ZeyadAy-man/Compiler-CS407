// $ANTLR 3.4 C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g 2025-03-26 20:50:24

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Grammar2Lexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int COMMENT=4;
    public static final int DOUBLE=5;
    public static final int ID=6;
    public static final int INT=7;
    public static final int WS=8;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public Grammar2Lexer() {} 
    public Grammar2Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Grammar2Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:2:6: ( ';' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:2:8: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:3:7: ( '=' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:3:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:4:7: ( 'double' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:4:9: 'double'
            {
            match("double"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:5:7: ( 'int' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:5:9: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:12:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' )+ ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' | '0' .. '9' )* )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:12:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' )+ ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' | '0' .. '9' )*
            {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:12:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='$'||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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


            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:12:34: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='$'||(LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "DOUBLE"
    public final void mDOUBLE() throws RecognitionException {
        try {
            int _type = DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:13:8: ( '0' .. '9' '.' '0' .. '9' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:13:10: '0' .. '9' '.' '0' .. '9'
            {
            matchRange('0','9'); 

            match('.'); 

            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLE"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:14:5: ( '0' .. '9' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:15:9: ( '//' ( options {greedy=false; } : . )* '\\n' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:15:11: '//' ( options {greedy=false; } : . )* '\\n'
            {
            match("//"); 



            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:15:16: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\n') ) {
                    alt3=2;
                }
                else if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:15:44: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:17:4: ( ( '\\r' | '\\n' | ' ' )+ )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:17:6: ( '\\r' | '\\n' | ' ' )+
            {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:17:6: ( '\\r' | '\\n' | ' ' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\n'||LA4_0=='\r'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:
            	    {
            	    if ( input.LA(1)=='\n'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:1:8: ( T__9 | T__10 | T__11 | T__12 | ID | DOUBLE | INT | COMMENT | WS )
        int alt5=9;
        switch ( input.LA(1) ) {
        case ';':
            {
            alt5=1;
            }
            break;
        case '=':
            {
            alt5=2;
            }
            break;
        case 'd':
            {
            int LA5_3 = input.LA(2);

            if ( (LA5_3=='o') ) {
                int LA5_9 = input.LA(3);

                if ( (LA5_9=='u') ) {
                    int LA5_13 = input.LA(4);

                    if ( (LA5_13=='b') ) {
                        int LA5_15 = input.LA(5);

                        if ( (LA5_15=='l') ) {
                            int LA5_17 = input.LA(6);

                            if ( (LA5_17=='e') ) {
                                int LA5_18 = input.LA(7);

                                if ( (LA5_18=='$'||(LA5_18 >= '0' && LA5_18 <= '9')||(LA5_18 >= 'A' && LA5_18 <= 'Z')||LA5_18=='_'||(LA5_18 >= 'a' && LA5_18 <= 'z')) ) {
                                    alt5=5;
                                }
                                else {
                                    alt5=3;
                                }
                            }
                            else {
                                alt5=5;
                            }
                        }
                        else {
                            alt5=5;
                        }
                    }
                    else {
                        alt5=5;
                    }
                }
                else {
                    alt5=5;
                }
            }
            else {
                alt5=5;
            }
            }
            break;
        case 'i':
            {
            int LA5_4 = input.LA(2);

            if ( (LA5_4=='n') ) {
                int LA5_10 = input.LA(3);

                if ( (LA5_10=='t') ) {
                    int LA5_14 = input.LA(4);

                    if ( (LA5_14=='$'||(LA5_14 >= '0' && LA5_14 <= '9')||(LA5_14 >= 'A' && LA5_14 <= 'Z')||LA5_14=='_'||(LA5_14 >= 'a' && LA5_14 <= 'z')) ) {
                        alt5=5;
                    }
                    else {
                        alt5=4;
                    }
                }
                else {
                    alt5=5;
                }
            }
            else {
                alt5=5;
            }
            }
            break;
        case '$':
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case '_':
        case 'a':
        case 'b':
        case 'c':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt5=5;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            int LA5_6 = input.LA(2);

            if ( (LA5_6=='.') ) {
                alt5=6;
            }
            else {
                alt5=7;
            }
            }
            break;
        case '/':
            {
            alt5=8;
            }
            break;
        case '\n':
        case '\r':
        case ' ':
            {
            alt5=9;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 5, 0, input);

            throw nvae;

        }

        switch (alt5) {
            case 1 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:1:10: T__9
                {
                mT__9(); 


                }
                break;
            case 2 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:1:15: T__10
                {
                mT__10(); 


                }
                break;
            case 3 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:1:21: T__11
                {
                mT__11(); 


                }
                break;
            case 4 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:1:27: T__12
                {
                mT__12(); 


                }
                break;
            case 5 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:1:33: ID
                {
                mID(); 


                }
                break;
            case 6 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:1:36: DOUBLE
                {
                mDOUBLE(); 


                }
                break;
            case 7 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:1:43: INT
                {
                mINT(); 


                }
                break;
            case 8 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:1:47: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 9 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:1:55: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}