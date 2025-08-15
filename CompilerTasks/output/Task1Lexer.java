// $ANTLR 3.4 C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g 2025-07-30 15:11:52

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Task1Lexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int ArithmaticOperators=4;
    public static final int DoubleValue=5;
    public static final int ID=6;
    public static final int IntValue=7;
    public static final int WS=8;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public Task1Lexer() {} 
    public Task1Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Task1Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:2:6: ( '(' )
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:2:8: '('
            {
            match('('); 

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
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:3:7: ( ')' )
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:3:9: ')'
            {
            match(')'); 

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
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:4:7: ( '.com' )
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:4:9: '.com'
            {
            match(".com"); 



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
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:5:7: ( '0' )
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:5:9: '0'
            {
            match('0'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:6:7: ( '9' )
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:6:9: '9'
            {
            match('9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:7:7: ( ':' )
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:7:9: ':'
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:8:7: ( '@' )
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:8:9: '@'
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:9:7: ( 'cos' )
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:9:9: 'cos'
            {
            match("cos"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:10:7: ( 'phone' )
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:10:9: 'phone'
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:11:7: ( 'sin' )
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:11:9: 'sin'
            {
            match("sin"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:12:7: ( 'tan' )
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:12:9: 'tan'
            {
            match("tan"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:7:3: ( ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( '0' .. '9' )* )+ )
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:7:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( '0' .. '9' )* )+
            {
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:7:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( '0' .. '9' )* )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='$'||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:7:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( '0' .. '9' )*
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:7:33: ( '0' .. '9' )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:
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
            	    	    break loop1;
            	        }
            	    } while (true);


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "IntValue"
    public final void mIntValue() throws RecognitionException {
        try {
            int _type = IntValue;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:8:9: ( ( '+' | '-' )? ( '0' .. '9' )+ )
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:8:11: ( '+' | '-' )? ( '0' .. '9' )+
            {
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:8:11: ( '+' | '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='+'||LA3_0=='-') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:8:24: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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

    // $ANTLR start "DoubleValue"
    public final void mDoubleValue() throws RecognitionException {
        try {
            int _type = DoubleValue;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:9:12: ( ( '+' | '-' )? IntValue '.' IntValue )
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:9:14: ( '+' | '-' )? IntValue '.' IntValue
            {
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:9:14: ( '+' | '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='+'||LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            mIntValue(); 


            match('.'); 

            mIntValue(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DoubleValue"

    // $ANTLR start "ArithmaticOperators"
    public final void mArithmaticOperators() throws RecognitionException {
        try {
            int _type = ArithmaticOperators;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:11:20: ( '*' | '/' | '%' | '+' | '-' )
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:
            {
            if ( input.LA(1)=='%'||(input.LA(1) >= '*' && input.LA(1) <= '+')||input.LA(1)=='-'||input.LA(1)=='/' ) {
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
    // $ANTLR end "ArithmaticOperators"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:15:3: ( ( ' ' | '\\n' | '\\r' | '\\t' )+ )
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:15:5: ( ' ' | '\\n' | '\\r' | '\\t' )+
            {
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:15:5: ( ' ' | '\\n' | '\\r' | '\\t' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '\t' && LA6_0 <= '\n')||LA6_0=='\r'||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
        // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | ID | IntValue | DoubleValue | ArithmaticOperators | WS )
        int alt7=16;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:1:10: T__9
                {
                mT__9(); 


                }
                break;
            case 2 :
                // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:1:15: T__10
                {
                mT__10(); 


                }
                break;
            case 3 :
                // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:1:21: T__11
                {
                mT__11(); 


                }
                break;
            case 4 :
                // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:1:27: T__12
                {
                mT__12(); 


                }
                break;
            case 5 :
                // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:1:33: T__13
                {
                mT__13(); 


                }
                break;
            case 6 :
                // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:1:39: T__14
                {
                mT__14(); 


                }
                break;
            case 7 :
                // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:1:45: T__15
                {
                mT__15(); 


                }
                break;
            case 8 :
                // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:1:51: T__16
                {
                mT__16(); 


                }
                break;
            case 9 :
                // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:1:57: T__17
                {
                mT__17(); 


                }
                break;
            case 10 :
                // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:1:63: T__18
                {
                mT__18(); 


                }
                break;
            case 11 :
                // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:1:69: T__19
                {
                mT__19(); 


                }
                break;
            case 12 :
                // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:1:75: ID
                {
                mID(); 


                }
                break;
            case 13 :
                // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:1:78: IntValue
                {
                mIntValue(); 


                }
                break;
            case 14 :
                // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:1:87: DoubleValue
                {
                mDoubleValue(); 


                }
                break;
            case 15 :
                // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:1:99: ArithmaticOperators
                {
                mArithmaticOperators(); 


                }
                break;
            case 16 :
                // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:1:119: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\4\uffff\1\21\1\23\2\uffff\4\14\1\uffff\1\17\1\30\5\uffff\4\14\1"+
        "\uffff\1\35\1\14\1\37\1\40\1\uffff\1\14\2\uffff\1\42\1\uffff";
    static final String DFA7_eofS =
        "\43\uffff";
    static final String DFA7_minS =
        "\1\11\3\uffff\2\56\2\uffff\1\157\1\150\1\151\1\141\1\uffff\1\53"+
        "\1\56\5\uffff\1\163\1\157\2\156\1\uffff\1\44\1\156\2\44\1\uffff"+
        "\1\145\2\uffff\1\44\1\uffff";
    static final String DFA7_maxS =
        "\1\172\3\uffff\2\71\2\uffff\1\157\1\150\1\151\1\141\1\uffff\2\71"+
        "\5\uffff\1\163\1\157\2\156\1\uffff\1\172\1\156\2\172\1\uffff\1\145"+
        "\2\uffff\1\172\1\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\1\3\2\uffff\1\6\1\7\4\uffff\1\14\2\uffff\1\17\1"+
        "\20\1\4\1\16\1\5\4\uffff\1\15\4\uffff\1\10\1\uffff\1\12\1\13\1\uffff"+
        "\1\11";
    static final String DFA7_specialS =
        "\43\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\20\2\uffff\1\20\22\uffff\1\20\3\uffff\1\14\1\17\2\uffff\1"+
            "\1\1\2\1\17\1\15\1\uffff\1\15\1\3\1\17\1\4\10\16\1\5\1\6\5\uffff"+
            "\1\7\32\14\4\uffff\1\14\1\uffff\2\14\1\10\14\14\1\11\2\14\1"+
            "\12\1\13\6\14",
            "",
            "",
            "",
            "\1\22\1\uffff\12\16",
            "\1\22\1\uffff\12\16",
            "",
            "",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "",
            "\1\22\1\uffff\1\22\2\uffff\12\16",
            "\1\22\1\uffff\12\16",
            "",
            "",
            "",
            "",
            "",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "",
            "\1\14\13\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32"+
            "\14",
            "\1\36",
            "\1\14\13\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32"+
            "\14",
            "\1\14\13\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32"+
            "\14",
            "",
            "\1\41",
            "",
            "",
            "\1\14\13\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32"+
            "\14",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | ID | IntValue | DoubleValue | ArithmaticOperators | WS );";
        }
    }
 

}