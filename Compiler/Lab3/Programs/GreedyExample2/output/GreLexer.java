// $ANTLR 3.4 C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\GreedyExample2\\Gre.g 2025-03-26 21:56:10

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class GreLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__7=7;
    public static final int ID=4;
    public static final int ML_COMMENT=5;
    public static final int WS=6;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public GreLexer() {} 
    public GreLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public GreLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\GreedyExample2\\Gre.g"; }

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\GreedyExample2\\Gre.g:7:6: ( '#' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\GreedyExample2\\Gre.g:7:8: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__7"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\GreedyExample2\\Gre.g:11:3: ( ( 'a' .. 'z' )+ )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\GreedyExample2\\Gre.g:11:5: ( 'a' .. 'z' )+
            {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\GreedyExample2\\Gre.g:11:5: ( 'a' .. 'z' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\GreedyExample2\\Gre.g:
            	    {
            	    if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
    // $ANTLR end "ID"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\GreedyExample2\\Gre.g:15:2: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\GreedyExample2\\Gre.g:15:4: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\GreedyExample2\\Gre.g:15:9: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='*') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='/') ) {
                        alt2=2;
                    }
                    else if ( ((LA2_1 >= '\u0000' && LA2_1 <= '.')||(LA2_1 >= '0' && LA2_1 <= '\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0 >= '\u0000' && LA2_0 <= ')')||(LA2_0 >= '+' && LA2_0 <= '\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\GreedyExample2\\Gre.g:15:37: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match("*/"); 



            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ML_COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\GreedyExample2\\Gre.g:19:3: ( ( ' ' | '\\n' | '\\r' )+ )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\GreedyExample2\\Gre.g:19:5: ( ' ' | '\\n' | '\\r' )+
            {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\GreedyExample2\\Gre.g:19:5: ( ' ' | '\\n' | '\\r' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\n'||LA3_0=='\r'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\GreedyExample2\\Gre.g:
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
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
        // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\GreedyExample2\\Gre.g:1:8: ( T__7 | ID | ML_COMMENT | WS )
        int alt4=4;
        switch ( input.LA(1) ) {
        case '#':
            {
            alt4=1;
            }
            break;
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
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
            alt4=2;
            }
            break;
        case '/':
            {
            alt4=3;
            }
            break;
        case '\n':
        case '\r':
        case ' ':
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
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\GreedyExample2\\Gre.g:1:10: T__7
                {
                mT__7(); 


                }
                break;
            case 2 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\GreedyExample2\\Gre.g:1:15: ID
                {
                mID(); 


                }
                break;
            case 3 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\GreedyExample2\\Gre.g:1:18: ML_COMMENT
                {
                mML_COMMENT(); 


                }
                break;
            case 4 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\GreedyExample2\\Gre.g:1:29: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}