// $ANTLR 3.4 C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g 2025-07-23 14:51:57

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ValuesLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public ValuesLexer() {} 
    public ValuesLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ValuesLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:2:7: ( '(' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:2:9: '('
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:3:7: ( ')' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:3:9: ')'
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:4:7: ( ',' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:4:9: ','
            {
            match(','); 

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
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:5:7: ( ';' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:5:9: ';'
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:6:7: ( '=' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:6:9: '='
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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:7:7: ( 'boolean' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:7:9: 'boolean'
            {
            match("boolean"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:8:7: ( 'do' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:8:9: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:9:7: ( 'double' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:9:9: 'double'
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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:10:7: ( 'else' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:10:9: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:11:7: ( 'false' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:11:9: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:12:7: ( 'for' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:12:9: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:13:7: ( 'if' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:13:9: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:14:7: ( 'int' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:14:9: 'int'
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
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:15:7: ( 'private' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:15:9: 'private'
            {
            match("private"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:16:7: ( 'protected' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:16:9: 'protected'
            {
            match("protected"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:17:7: ( 'public' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:17:9: 'public'
            {
            match("public"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:18:7: ( 'static' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:18:9: 'static'
            {
            match("static"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:19:7: ( 'true' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:19:9: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:20:7: ( 'void' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:20:9: 'void'
            {
            match("void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:21:7: ( 'while' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:21:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:22:7: ( '{' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:22:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:23:7: ( '}' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:23:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:43:3: ( ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( '0' .. '9' )* )+ )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:43:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( '0' .. '9' )* )+
            {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:43:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( '0' .. '9' )* )+
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
            	    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:43:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( '0' .. '9' )*
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:43:33: ( '0' .. '9' )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:
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
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:44:9: ( ( '0' .. '9' )+ )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:44:11: ( '0' .. '9' )+
            {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:44:11: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:
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
    // $ANTLR end "IntValue"

    // $ANTLR start "DoubleValue"
    public final void mDoubleValue() throws RecognitionException {
        try {
            int _type = DoubleValue;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:45:12: ( IntValue '.' IntValue )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:45:14: IntValue '.' IntValue
            {
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

    // $ANTLR start "StringValue"
    public final void mStringValue() throws RecognitionException {
        try {
            int _type = StringValue;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:46:12: ( '\\\"' ( . )* '\\\"' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:46:14: '\\\"' ( . )* '\\\"'
            {
            match('\"'); 

            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:46:18: ( . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\"') ) {
                    alt4=2;
                }
                else if ( ((LA4_0 >= '\u0000' && LA4_0 <= '!')||(LA4_0 >= '#' && LA4_0 <= '\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:46:18: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "StringValue"

    // $ANTLR start "CharValue"
    public final void mCharValue() throws RecognitionException {
        try {
            int _type = CharValue;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:47:10: ( '\\'' ( . )? '\\'' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:47:12: '\\'' ( . )? '\\''
            {
            match('\''); 

            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:47:16: ( . )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\'') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='\'') ) {
                    alt5=1;
                }
            }
            else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '&')||(LA5_0 >= '(' && LA5_0 <= '\uFFFF')) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:47:16: .
                    {
                    matchAny(); 

                    }
                    break;

            }


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CharValue"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:50:3: ( ( ' ' | '\\n' | '\\r' | '\\t' )+ )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:50:5: ( ' ' | '\\n' | '\\r' | '\\t' )+
            {
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:50:5: ( ' ' | '\\n' | '\\r' | '\\t' )+
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
            	    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:
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

    // $ANTLR start "ArithmaticOperators"
    public final void mArithmaticOperators() throws RecognitionException {
        try {
            int _type = ArithmaticOperators;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:51:20: ( '+' | '-' | '*' | '/' | '%' )
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:
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

    // $ANTLR start "ComparisonOperators"
    public final void mComparisonOperators() throws RecognitionException {
        try {
            int _type = ComparisonOperators;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:52:20: ( '==' | '<=' | '>=' | '!=' | '>' | '<' )
            int alt7=6;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt7=1;
                }
                break;
            case '<':
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2=='=') ) {
                    alt7=2;
                }
                else {
                    alt7=6;
                }
                }
                break;
            case '>':
                {
                int LA7_3 = input.LA(2);

                if ( (LA7_3=='=') ) {
                    alt7=3;
                }
                else {
                    alt7=5;
                }
                }
                break;
            case '!':
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:52:22: '=='
                    {
                    match("=="); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:52:29: '<='
                    {
                    match("<="); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:52:36: '>='
                    {
                    match(">="); 



                    }
                    break;
                case 4 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:52:43: '!='
                    {
                    match("!="); 



                    }
                    break;
                case 5 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:52:50: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:52:56: '<'
                    {
                    match('<'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ComparisonOperators"

    // $ANTLR start "LogicalOperators"
    public final void mLogicalOperators() throws RecognitionException {
        try {
            int _type = LogicalOperators;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:53:17: ( '&&' | '||' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='&') ) {
                alt8=1;
            }
            else if ( (LA8_0=='|') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:53:19: '&&'
                    {
                    match("&&"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:53:26: '||'
                    {
                    match("||"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LogicalOperators"

    // $ANTLR start "AssignmentOperators"
    public final void mAssignmentOperators() throws RecognitionException {
        try {
            int _type = AssignmentOperators;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:54:20: ( '+=' | '-=' | '*=' | '/=' )
            int alt9=4;
            switch ( input.LA(1) ) {
            case '+':
                {
                alt9=1;
                }
                break;
            case '-':
                {
                alt9=2;
                }
                break;
            case '*':
                {
                alt9=3;
                }
                break;
            case '/':
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:54:22: '+='
                    {
                    match("+="); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:54:29: '-='
                    {
                    match("-="); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:54:36: '*='
                    {
                    match("*="); 



                    }
                    break;
                case 4 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:54:43: '/='
                    {
                    match("/="); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AssignmentOperators"

    // $ANTLR start "AssignmentAutoOperators"
    public final void mAssignmentAutoOperators() throws RecognitionException {
        try {
            int _type = AssignmentAutoOperators;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:55:24: ( '--' | '++' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='-') ) {
                alt10=1;
            }
            else if ( (LA10_0=='+') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:55:26: '--'
                    {
                    match("--"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:55:33: '++'
                    {
                    match("++"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AssignmentAutoOperators"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | ID | IntValue | DoubleValue | StringValue | CharValue | WS | ArithmaticOperators | ComparisonOperators | LogicalOperators | AssignmentOperators | AssignmentAutoOperators )
        int alt11=33;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:1:10: T__15
                {
                mT__15(); 


                }
                break;
            case 2 :
                // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:1:16: T__16
                {
                mT__16(); 


                }
                break;
            case 3 :
                // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:1:22: T__17
                {
                mT__17(); 


                }
                break;
            case 4 :
                // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:1:28: T__18
                {
                mT__18(); 


                }
                break;
            case 5 :
                // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:1:34: T__19
                {
                mT__19(); 


                }
                break;
            case 6 :
                // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:1:40: T__20
                {
                mT__20(); 


                }
                break;
            case 7 :
                // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:1:46: T__21
                {
                mT__21(); 


                }
                break;
            case 8 :
                // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:1:52: T__22
                {
                mT__22(); 


                }
                break;
            case 9 :
                // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:1:58: T__23
                {
                mT__23(); 


                }
                break;
            case 10 :
                // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:1:64: T__24
                {
                mT__24(); 


                }
                break;
            case 11 :
                // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:1:70: T__25
                {
                mT__25(); 


                }
                break;
            case 12 :
                // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:1:76: T__26
                {
                mT__26(); 


                }
                break;
            case 13 :
                // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:1:82: T__27
                {
                mT__27(); 


                }
                break;
            case 14 :
                // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:1:88: T__28
                {
                mT__28(); 


                }
                break;
            case 15 :
                // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:1:94: T__29
                {
                mT__29(); 


                }
                break;
            case 16 :
                // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:1:100: T__30
                {
                mT__30(); 


                }
                break;
            case 17 :
                // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:1:106: T__31
                {
                mT__31(); 


                }
                break;
            case 18 :
                // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:1:112: T__32
                {
                mT__32(); 


                }
                break;
            case 19 :
                // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:1:118: T__33
                {
                mT__33(); 


                }
                break;
            case 20 :
                // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:1:124: T__34
                {
                mT__34(); 


                }
                break;
            case 21 :
                // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:1:130: T__35
                {
                mT__35(); 


                }
                break;
            case 22 :
                // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:1:136: T__36
                {
                mT__36(); 


                }
                break;
            case 23 :
                // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:1:142: ID
                {
                mID(); 


                }
                break;
            case 24 :
                // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:1:145: IntValue
                {
                mIntValue(); 


                }
                break;
            case 25 :
                // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:1:154: DoubleValue
                {
                mDoubleValue(); 


                }
                break;
            case 26 :
                // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:1:166: StringValue
                {
                mStringValue(); 


                }
                break;
            case 27 :
                // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:1:178: CharValue
                {
                mCharValue(); 


                }
                break;
            case 28 :
                // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:1:188: WS
                {
                mWS(); 


                }
                break;
            case 29 :
                // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:1:191: ArithmaticOperators
                {
                mArithmaticOperators(); 


                }
                break;
            case 30 :
                // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:1:211: ComparisonOperators
                {
                mComparisonOperators(); 


                }
                break;
            case 31 :
                // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:1:231: LogicalOperators
                {
                mLogicalOperators(); 


                }
                break;
            case 32 :
                // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:1:248: AssignmentOperators
                {
                mAssignmentOperators(); 


                }
                break;
            case 33 :
                // C:\\Users\\zizoa\\Desktop\\100%Compiler\\Values.g:1:268: AssignmentAutoOperators
                {
                mAssignmentAutoOperators(); 


                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\5\uffff\1\36\12\22\3\uffff\1\54\3\uffff\1\35\2\uffff\3\35\2\uffff"+
        "\1\22\1\62\3\22\1\66\7\22\4\uffff\2\22\1\uffff\2\22\1\103\1\uffff"+
        "\1\104\11\22\1\116\1\22\2\uffff\4\22\1\124\1\125\3\22\1\uffff\1"+
        "\131\4\22\2\uffff\1\136\1\22\1\140\1\uffff\2\22\1\143\1\144\1\uffff"+
        "\1\145\1\uffff\1\146\1\22\4\uffff\1\22\1\151\1\uffff";
    static final String DFA11_eofS =
        "\152\uffff";
    static final String DFA11_minS =
        "\1\11\4\uffff\1\75\2\157\1\154\1\141\1\146\1\162\1\164\1\162\1\157"+
        "\1\150\3\uffff\1\56\3\uffff\1\53\2\uffff\1\55\2\75\2\uffff\1\157"+
        "\1\44\1\163\1\154\1\162\1\44\1\164\1\151\1\142\1\141\1\165\2\151"+
        "\4\uffff\1\154\1\142\1\uffff\1\145\1\163\1\44\1\uffff\1\44\1\166"+
        "\1\164\1\154\1\164\1\145\1\144\1\154\1\145\1\154\1\44\1\145\2\uffff"+
        "\1\141\1\145\2\151\2\44\1\145\1\141\1\145\1\uffff\1\44\1\164\3\143"+
        "\2\uffff\1\44\1\156\1\44\1\uffff\1\145\1\164\2\44\1\uffff\1\44\1"+
        "\uffff\1\44\1\145\4\uffff\1\144\1\44\1\uffff";
    static final String DFA11_maxS =
        "\1\175\4\uffff\1\75\2\157\1\154\1\157\1\156\1\165\1\164\1\162\1"+
        "\157\1\150\3\uffff\1\71\3\uffff\1\75\2\uffff\3\75\2\uffff\1\157"+
        "\1\172\1\163\1\154\1\162\1\172\1\164\1\157\1\142\1\141\1\165\2\151"+
        "\4\uffff\1\154\1\142\1\uffff\1\145\1\163\1\172\1\uffff\1\172\1\166"+
        "\1\164\1\154\1\164\1\145\1\144\1\154\1\145\1\154\1\172\1\145\2\uffff"+
        "\1\141\1\145\2\151\2\172\1\145\1\141\1\145\1\uffff\1\172\1\164\3"+
        "\143\2\uffff\1\172\1\156\1\172\1\uffff\1\145\1\164\2\172\1\uffff"+
        "\1\172\1\uffff\1\172\1\145\4\uffff\1\144\1\172\1\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\13\uffff\1\25\1\26\1\27\1\uffff\1\32\1"+
        "\33\1\34\1\uffff\1\36\1\37\3\uffff\1\35\1\5\15\uffff\1\30\1\31\1"+
        "\40\1\41\2\uffff\1\7\3\uffff\1\14\14\uffff\1\13\1\15\11\uffff\1"+
        "\11\5\uffff\1\22\1\23\3\uffff\1\12\4\uffff\1\24\1\uffff\1\10\2\uffff"+
        "\1\20\1\21\1\6\1\16\2\uffff\1\17";
    static final String DFA11_specialS =
        "\152\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\26\2\uffff\1\26\22\uffff\1\26\1\30\1\24\1\uffff\1\22\1\35"+
            "\1\31\1\25\1\1\1\2\1\33\1\27\1\3\1\32\1\uffff\1\34\12\23\1\uffff"+
            "\1\4\1\30\1\5\1\30\2\uffff\32\22\4\uffff\1\22\1\uffff\1\22\1"+
            "\6\1\22\1\7\1\10\1\11\2\22\1\12\6\22\1\13\2\22\1\14\1\15\1\22"+
            "\1\16\1\17\3\22\1\20\1\31\1\21",
            "",
            "",
            "",
            "",
            "\1\30",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42\15\uffff\1\43",
            "\1\44\7\uffff\1\45",
            "\1\46\2\uffff\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "",
            "",
            "",
            "\1\55\1\uffff\12\23",
            "",
            "",
            "",
            "\1\57\21\uffff\1\56",
            "",
            "",
            "\1\57\17\uffff\1\56",
            "\1\56",
            "\1\56",
            "",
            "",
            "\1\60",
            "\1\22\13\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\24"+
            "\22\1\61\5\22",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\22\13\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32"+
            "\22",
            "\1\67",
            "\1\70\5\uffff\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "",
            "",
            "",
            "",
            "\1\77",
            "\1\100",
            "",
            "\1\101",
            "\1\102",
            "\1\22\13\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32"+
            "\22",
            "",
            "\1\22\13\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32"+
            "\22",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\22\13\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32"+
            "\22",
            "\1\117",
            "",
            "",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\22\13\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32"+
            "\22",
            "\1\22\13\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32"+
            "\22",
            "\1\126",
            "\1\127",
            "\1\130",
            "",
            "\1\22\13\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32"+
            "\22",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "",
            "",
            "\1\22\13\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32"+
            "\22",
            "\1\137",
            "\1\22\13\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32"+
            "\22",
            "",
            "\1\141",
            "\1\142",
            "\1\22\13\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32"+
            "\22",
            "\1\22\13\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32"+
            "\22",
            "",
            "\1\22\13\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32"+
            "\22",
            "",
            "\1\22\13\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32"+
            "\22",
            "\1\147",
            "",
            "",
            "",
            "",
            "\1\150",
            "\1\22\13\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32"+
            "\22",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | ID | IntValue | DoubleValue | StringValue | CharValue | WS | ArithmaticOperators | ComparisonOperators | LogicalOperators | AssignmentOperators | AssignmentAutoOperators );";
        }
    }
 

}