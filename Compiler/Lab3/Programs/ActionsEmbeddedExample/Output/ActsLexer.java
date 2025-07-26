// $ANTLR 3.4 C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\ActionsEmbeddedExample\\Acts.g 2025-03-26 23:42:27

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ActsLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__6=6;
    public static final int T__7=7;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int ID=4;
    public static final int WS=5;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public ActsLexer() {} 
    public ActsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ActsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\ActionsEmbeddedExample\\Acts.g"; }

    // $ANTLR start "T__6"
    public final void mT__6() throws RecognitionException {
        try {
            int _type = T__6;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\ActionsEmbeddedExample\\Acts.g:7:6: ( '#' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\ActionsEmbeddedExample\\Acts.g:7:8: '#'
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
    // $ANTLR end "T__6"

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\ActionsEmbeddedExample\\Acts.g:8:6: ( 'a' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\ActionsEmbeddedExample\\Acts.g:8:8: 'a'
            {
            match('a'); 

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
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\ActionsEmbeddedExample\\Acts.g:9:6: ( 'b' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\ActionsEmbeddedExample\\Acts.g:9:8: 'b'
            {
            match('b'); 

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
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\ActionsEmbeddedExample\\Acts.g:10:6: ( 'c' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\ActionsEmbeddedExample\\Acts.g:10:8: 'c'
            {
            match('c'); 

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
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\ActionsEmbeddedExample\\Acts.g:11:7: ( 'd' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\ActionsEmbeddedExample\\Acts.g:11:9: 'd'
            {
            match('d'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\ActionsEmbeddedExample\\Acts.g:30:3: ( ( 'a' .. 'z' )+ )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\ActionsEmbeddedExample\\Acts.g:30:5: ( 'a' .. 'z' )+
            {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\ActionsEmbeddedExample\\Acts.g:30:5: ( 'a' .. 'z' )+
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
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\ActionsEmbeddedExample\\Acts.g:
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

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\ActionsEmbeddedExample\\Acts.g:32:3: ( ( ' ' | '\\n' | '\\r' )+ )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\ActionsEmbeddedExample\\Acts.g:32:5: ( ' ' | '\\n' | '\\r' )+
            {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\ActionsEmbeddedExample\\Acts.g:32:5: ( ' ' | '\\n' | '\\r' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\n'||LA2_0=='\r'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\ActionsEmbeddedExample\\Acts.g:
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
        // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\ActionsEmbeddedExample\\Acts.g:1:8: ( T__6 | T__7 | T__8 | T__9 | T__10 | ID | WS )
        int alt3=7;
        switch ( input.LA(1) ) {
        case '#':
            {
            alt3=1;
            }
            break;
        case 'a':
            {
            int LA3_2 = input.LA(2);

            if ( ((LA3_2 >= 'a' && LA3_2 <= 'z')) ) {
                alt3=6;
            }
            else {
                alt3=2;
            }
            }
            break;
        case 'b':
            {
            int LA3_3 = input.LA(2);

            if ( ((LA3_3 >= 'a' && LA3_3 <= 'z')) ) {
                alt3=6;
            }
            else {
                alt3=3;
            }
            }
            break;
        case 'c':
            {
            int LA3_4 = input.LA(2);

            if ( ((LA3_4 >= 'a' && LA3_4 <= 'z')) ) {
                alt3=6;
            }
            else {
                alt3=4;
            }
            }
            break;
        case 'd':
            {
            int LA3_5 = input.LA(2);

            if ( ((LA3_5 >= 'a' && LA3_5 <= 'z')) ) {
                alt3=6;
            }
            else {
                alt3=5;
            }
            }
            break;
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
            alt3=6;
            }
            break;
        case '\n':
        case '\r':
        case ' ':
            {
            alt3=7;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 3, 0, input);

            throw nvae;

        }

        switch (alt3) {
            case 1 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\ActionsEmbeddedExample\\Acts.g:1:10: T__6
                {
                mT__6(); 


                }
                break;
            case 2 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\ActionsEmbeddedExample\\Acts.g:1:15: T__7
                {
                mT__7(); 


                }
                break;
            case 3 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\ActionsEmbeddedExample\\Acts.g:1:20: T__8
                {
                mT__8(); 


                }
                break;
            case 4 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\ActionsEmbeddedExample\\Acts.g:1:25: T__9
                {
                mT__9(); 


                }
                break;
            case 5 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\ActionsEmbeddedExample\\Acts.g:1:30: T__10
                {
                mT__10(); 


                }
                break;
            case 6 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\ActionsEmbeddedExample\\Acts.g:1:36: ID
                {
                mID(); 


                }
                break;
            case 7 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\ActionsEmbeddedExample\\Acts.g:1:39: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}