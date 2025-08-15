// $ANTLR 3.4 C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g 2025-07-30 15:33:41

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Question1Lexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__7=7;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int ID=4;
    public static final int IntValue=5;
    public static final int WS=6;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public Question1Lexer() {} 
    public Question1Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Question1Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g"; }

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:2:6: ( '+' )
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:2:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__7"

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:3:6: ( ':' )
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:3:8: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:4:6: ( '@' )
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:4:8: '@'
            {
            match('@'); 

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
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:5:7: ( 'email' )
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:5:9: 'email'
            {
            match("email"); 



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
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:6:7: ( 'gmail.com' )
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:6:9: 'gmail.com'
            {
            match("gmail.com"); 



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
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:7:7: ( 'phone' )
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:7:9: 'phone'
            {
            match("phone"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "IntValue"
    public final void mIntValue() throws RecognitionException {
        try {
            int _type = IntValue;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:3:9: ( ( '0' .. '9' )+ )
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:3:11: ( '0' .. '9' )+
            {
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:3:11: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IntValue"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:11:3: ( ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( '0' .. '9' )* )+ )
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:11:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( '0' .. '9' )* )+
            {
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:11:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( '0' .. '9' )* )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='$'||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:11:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( '0' .. '9' )*
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:11:33: ( '0' .. '9' )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:
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
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:12:3: ( ( ' ' | '\\n' | '\\r' | '\\t' )+ )
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:12:5: ( ' ' | '\\n' | '\\r' | '\\t' )+
            {
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:12:5: ( ' ' | '\\n' | '\\r' | '\\t' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '\t' && LA4_0 <= '\n')||LA4_0=='\r'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
        // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:1:8: ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | IntValue | ID | WS )
        int alt5=9;
        switch ( input.LA(1) ) {
        case '+':
            {
            alt5=1;
            }
            break;
        case ':':
            {
            alt5=2;
            }
            break;
        case '@':
            {
            alt5=3;
            }
            break;
        case 'e':
            {
            int LA5_4 = input.LA(2);

            if ( (LA5_4=='m') ) {
                int LA5_10 = input.LA(3);

                if ( (LA5_10=='a') ) {
                    int LA5_13 = input.LA(4);

                    if ( (LA5_13=='i') ) {
                        int LA5_16 = input.LA(5);

                        if ( (LA5_16=='l') ) {
                            int LA5_19 = input.LA(6);

                            if ( (LA5_19=='$'||(LA5_19 >= '0' && LA5_19 <= '9')||(LA5_19 >= 'A' && LA5_19 <= 'Z')||LA5_19=='_'||(LA5_19 >= 'a' && LA5_19 <= 'z')) ) {
                                alt5=8;
                            }
                            else {
                                alt5=4;
                            }
                        }
                        else {
                            alt5=8;
                        }
                    }
                    else {
                        alt5=8;
                    }
                }
                else {
                    alt5=8;
                }
            }
            else {
                alt5=8;
            }
            }
            break;
        case 'g':
            {
            int LA5_5 = input.LA(2);

            if ( (LA5_5=='m') ) {
                int LA5_11 = input.LA(3);

                if ( (LA5_11=='a') ) {
                    int LA5_14 = input.LA(4);

                    if ( (LA5_14=='i') ) {
                        int LA5_17 = input.LA(5);

                        if ( (LA5_17=='l') ) {
                            int LA5_20 = input.LA(6);

                            if ( (LA5_20=='.') ) {
                                alt5=5;
                            }
                            else {
                                alt5=8;
                            }
                        }
                        else {
                            alt5=8;
                        }
                    }
                    else {
                        alt5=8;
                    }
                }
                else {
                    alt5=8;
                }
            }
            else {
                alt5=8;
            }
            }
            break;
        case 'p':
            {
            int LA5_6 = input.LA(2);

            if ( (LA5_6=='h') ) {
                int LA5_12 = input.LA(3);

                if ( (LA5_12=='o') ) {
                    int LA5_15 = input.LA(4);

                    if ( (LA5_15=='n') ) {
                        int LA5_18 = input.LA(5);

                        if ( (LA5_18=='e') ) {
                            int LA5_21 = input.LA(6);

                            if ( (LA5_21=='$'||(LA5_21 >= '0' && LA5_21 <= '9')||(LA5_21 >= 'A' && LA5_21 <= 'Z')||LA5_21=='_'||(LA5_21 >= 'a' && LA5_21 <= 'z')) ) {
                                alt5=8;
                            }
                            else {
                                alt5=6;
                            }
                        }
                        else {
                            alt5=8;
                        }
                    }
                    else {
                        alt5=8;
                    }
                }
                else {
                    alt5=8;
                }
            }
            else {
                alt5=8;
            }
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
            alt5=7;
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
        case 'd':
        case 'f':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
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
            alt5=8;
            }
            break;
        case '\t':
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
                // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:1:10: T__7
                {
                mT__7(); 


                }
                break;
            case 2 :
                // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:1:15: T__8
                {
                mT__8(); 


                }
                break;
            case 3 :
                // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:1:20: T__9
                {
                mT__9(); 


                }
                break;
            case 4 :
                // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:1:25: T__10
                {
                mT__10(); 


                }
                break;
            case 5 :
                // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:1:31: T__11
                {
                mT__11(); 


                }
                break;
            case 6 :
                // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:1:37: T__12
                {
                mT__12(); 


                }
                break;
            case 7 :
                // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:1:43: IntValue
                {
                mIntValue(); 


                }
                break;
            case 8 :
                // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:1:52: ID
                {
                mID(); 


                }
                break;
            case 9 :
                // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:1:55: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}