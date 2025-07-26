// $ANTLR 3.4 C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g 2025-05-14 12:46:32

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class lab3Lexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public lab3Lexer() {} 
    public lab3Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public lab3Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g"; }

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:2:7: ( '&' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:2:9: '&'
            {
            match('&'); 

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
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:3:7: ( '(' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:3:9: '('
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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:4:7: ( ')' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:4:9: ')'
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
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:5:7: ( '*' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:5:9: '*'
            {
            match('*'); 

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
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:6:7: ( '+' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:6:9: '+'
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
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:7:7: ( ',' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:7:9: ','
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
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:8:7: ( ';' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:8:9: ';'
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
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:9:7: ( '<<' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:9:9: '<<'
            {
            match("<<"); 



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
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:10:7: ( '=' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:10:9: '='
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
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:11:7: ( 'String' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:11:9: 'String'
            {
            match("String"); 



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
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:12:7: ( '[' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:12:9: '['
            {
            match('['); 

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
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:13:7: ( ']' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:13:9: ']'
            {
            match(']'); 

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
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:14:7: ( 'auto' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:14:9: 'auto'
            {
            match("auto"); 



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
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:15:7: ( 'bool' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:15:9: 'bool'
            {
            match("bool"); 



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
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:16:7: ( 'cerr' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:16:9: 'cerr'
            {
            match("cerr"); 



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
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:17:7: ( 'char' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:17:9: 'char'
            {
            match("char"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:18:7: ( 'cin' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:18:9: 'cin'
            {
            match("cin"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:19:7: ( 'clog' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:19:9: 'clog'
            {
            match("clog"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:20:7: ( 'cout' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:20:9: 'cout'
            {
            match("cout"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:21:7: ( 'double' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:21:9: 'double'
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
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:22:7: ( 'else' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:22:9: 'else'
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
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:23:7: ( 'false' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:23:9: 'false'
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
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:24:7: ( 'float' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:24:9: 'float'
            {
            match("float"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:25:7: ( 'for' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:25:9: 'for'
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
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:26:7: ( 'if' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:26:9: 'if'
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
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:27:7: ( 'int' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:27:9: 'int'
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
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:28:7: ( 'new' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:28:9: 'new'
            {
            match("new"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:29:7: ( 'true' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:29:9: 'true'
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
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:30:7: ( 'while' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:30:9: 'while'
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
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:31:7: ( '{' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:31:9: '{'
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
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:32:7: ( '}' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:32:9: '}'
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
    // $ANTLR end "T__51"

    // $ANTLR start "SignedNumber"
    public final void mSignedNumber() throws RecognitionException {
        try {
            int _type = SignedNumber;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:100:13: ( '-' ( IntNum | DoubleNum | ID ) )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:100:15: '-' ( IntNum | DoubleNum | ID )
            {
            match('-'); 

            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:100:19: ( IntNum | DoubleNum | ID )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:100:20: IntNum
                    {
                    mIntNum(); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:100:29: DoubleNum
                    {
                    mDoubleNum(); 


                    }
                    break;
                case 3 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:100:41: ID
                    {
                    mID(); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SignedNumber"

    // $ANTLR start "TrigonometricFunctions"
    public final void mTrigonometricFunctions() throws RecognitionException {
        try {
            int _type = TrigonometricFunctions;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:101:23: ( 'sin' | 'cos' | 'tan' )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 's':
                {
                alt2=1;
                }
                break;
            case 'c':
                {
                alt2=2;
                }
                break;
            case 't':
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:101:26: 'sin'
                    {
                    match("sin"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:101:34: 'cos'
                    {
                    match("cos"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:101:42: 'tan'
                    {
                    match("tan"); 



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
    // $ANTLR end "TrigonometricFunctions"

    // $ANTLR start "IntNum"
    public final void mIntNum() throws RecognitionException {
        try {
            int _type = IntNum;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:102:7: ( ( '0' .. '9' )+ )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:102:10: ( '0' .. '9' )+
            {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:102:10: ( '0' .. '9' )+
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
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:
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
    // $ANTLR end "IntNum"

    // $ANTLR start "DoubleNum"
    public final void mDoubleNum() throws RecognitionException {
        try {
            int _type = DoubleNum;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:103:10: ( IntNum '.' IntNum )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:103:12: IntNum '.' IntNum
            {
            mIntNum(); 


            match('.'); 

            mIntNum(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DoubleNum"

    // $ANTLR start "StringValue"
    public final void mStringValue() throws RecognitionException {
        try {
            int _type = StringValue;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:104:12: ( '\\\"' ( . )* '\\\"' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:104:14: '\\\"' ( . )* '\\\"'
            {
            match('\"'); 

            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:104:18: ( . )*
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
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:104:18: .
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
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:105:10: ( '\\'' . '\\'' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:105:12: '\\'' . '\\''
            {
            match('\''); 

            matchAny(); 

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

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:106:3: ( ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( '0' .. '9' )* )+ )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:106:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( '0' .. '9' )* )+
            {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:106:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( '0' .. '9' )* )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='$'||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:106:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( '0' .. '9' )*
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:106:33: ( '0' .. '9' )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:
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
            	    	    break loop5;
            	        }
            	    } while (true);


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
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:107:3: ( ( ' ' | '\\n' | '\\r' | '\\t' )+ )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:107:5: ( ' ' | '\\n' | '\\r' | '\\t' )+
            {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:107:5: ( ' ' | '\\n' | '\\r' | '\\t' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '\t' && LA7_0 <= '\n')||LA7_0=='\r'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:
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
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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

    // $ANTLR start "Operators"
    public final void mOperators() throws RecognitionException {
        try {
            int _type = Operators;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:108:10: ( '-' | '+' | '*' | '/' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:
            {
            if ( (input.LA(1) >= '*' && input.LA(1) <= '+')||input.LA(1)=='-'||input.LA(1)=='/' ) {
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
    // $ANTLR end "Operators"

    // $ANTLR start "ArithmaticOperators"
    public final void mArithmaticOperators() throws RecognitionException {
        try {
            int _type = ArithmaticOperators;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:109:20: ( '==' | '<=' | '>=' | '!=' | '>' | '<' )
            int alt8=6;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt8=1;
                }
                break;
            case '<':
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2=='=') ) {
                    alt8=2;
                }
                else {
                    alt8=6;
                }
                }
                break;
            case '>':
                {
                int LA8_3 = input.LA(2);

                if ( (LA8_3=='=') ) {
                    alt8=3;
                }
                else {
                    alt8=5;
                }
                }
                break;
            case '!':
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:109:22: '=='
                    {
                    match("=="); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:109:29: '<='
                    {
                    match("<="); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:109:36: '>='
                    {
                    match(">="); 



                    }
                    break;
                case 4 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:109:43: '!='
                    {
                    match("!="); 



                    }
                    break;
                case 5 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:109:50: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:109:56: '<'
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
    // $ANTLR end "ArithmaticOperators"

    // $ANTLR start "LogicalOperators"
    public final void mLogicalOperators() throws RecognitionException {
        try {
            int _type = LogicalOperators;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:110:17: ( '&&' | '||' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='&') ) {
                alt9=1;
            }
            else if ( (LA9_0=='|') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:110:19: '&&'
                    {
                    match("&&"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:110:26: '||'
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
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:111:20: ( '+=' | '-=' | '*=' | '/=' )
            int alt10=4;
            switch ( input.LA(1) ) {
            case '+':
                {
                alt10=1;
                }
                break;
            case '-':
                {
                alt10=2;
                }
                break;
            case '*':
                {
                alt10=3;
                }
                break;
            case '/':
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:111:22: '+='
                    {
                    match("+="); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:111:29: '-='
                    {
                    match("-="); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:111:36: '*='
                    {
                    match("*="); 



                    }
                    break;
                case 4 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:111:43: '/='
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
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:112:24: ( '--' | '++' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='-') ) {
                alt11=1;
            }
            else if ( (LA11_0=='+') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:112:26: '--'
                    {
                    match("--"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:112:33: '++'
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
        // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:8: ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | SignedNumber | TrigonometricFunctions | IntNum | DoubleNum | StringValue | CharValue | ID | WS | Operators | ArithmaticOperators | LogicalOperators | AssignmentOperators | AssignmentAutoOperators )
        int alt12=44;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:10: T__21
                {
                mT__21(); 


                }
                break;
            case 2 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:16: T__22
                {
                mT__22(); 


                }
                break;
            case 3 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:22: T__23
                {
                mT__23(); 


                }
                break;
            case 4 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:28: T__24
                {
                mT__24(); 


                }
                break;
            case 5 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:34: T__25
                {
                mT__25(); 


                }
                break;
            case 6 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:40: T__26
                {
                mT__26(); 


                }
                break;
            case 7 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:46: T__27
                {
                mT__27(); 


                }
                break;
            case 8 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:52: T__28
                {
                mT__28(); 


                }
                break;
            case 9 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:58: T__29
                {
                mT__29(); 


                }
                break;
            case 10 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:64: T__30
                {
                mT__30(); 


                }
                break;
            case 11 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:70: T__31
                {
                mT__31(); 


                }
                break;
            case 12 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:76: T__32
                {
                mT__32(); 


                }
                break;
            case 13 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:82: T__33
                {
                mT__33(); 


                }
                break;
            case 14 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:88: T__34
                {
                mT__34(); 


                }
                break;
            case 15 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:94: T__35
                {
                mT__35(); 


                }
                break;
            case 16 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:100: T__36
                {
                mT__36(); 


                }
                break;
            case 17 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:106: T__37
                {
                mT__37(); 


                }
                break;
            case 18 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:112: T__38
                {
                mT__38(); 


                }
                break;
            case 19 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:118: T__39
                {
                mT__39(); 


                }
                break;
            case 20 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:124: T__40
                {
                mT__40(); 


                }
                break;
            case 21 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:130: T__41
                {
                mT__41(); 


                }
                break;
            case 22 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:136: T__42
                {
                mT__42(); 


                }
                break;
            case 23 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:142: T__43
                {
                mT__43(); 


                }
                break;
            case 24 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:148: T__44
                {
                mT__44(); 


                }
                break;
            case 25 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:154: T__45
                {
                mT__45(); 


                }
                break;
            case 26 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:160: T__46
                {
                mT__46(); 


                }
                break;
            case 27 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:166: T__47
                {
                mT__47(); 


                }
                break;
            case 28 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:172: T__48
                {
                mT__48(); 


                }
                break;
            case 29 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:178: T__49
                {
                mT__49(); 


                }
                break;
            case 30 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:184: T__50
                {
                mT__50(); 


                }
                break;
            case 31 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:190: T__51
                {
                mT__51(); 


                }
                break;
            case 32 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:196: SignedNumber
                {
                mSignedNumber(); 


                }
                break;
            case 33 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:209: TrigonometricFunctions
                {
                mTrigonometricFunctions(); 


                }
                break;
            case 34 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:232: IntNum
                {
                mIntNum(); 


                }
                break;
            case 35 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:239: DoubleNum
                {
                mDoubleNum(); 


                }
                break;
            case 36 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:249: StringValue
                {
                mStringValue(); 


                }
                break;
            case 37 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:261: CharValue
                {
                mCharValue(); 


                }
                break;
            case 38 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:271: ID
                {
                mID(); 


                }
                break;
            case 39 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:274: WS
                {
                mWS(); 


                }
                break;
            case 40 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:277: Operators
                {
                mOperators(); 


                }
                break;
            case 41 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:287: ArithmaticOperators
                {
                mArithmaticOperators(); 


                }
                break;
            case 42 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:307: LogicalOperators
                {
                mLogicalOperators(); 


                }
                break;
            case 43 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:324: AssignmentOperators
                {
                mAssignmentOperators(); 


                }
                break;
            case 44 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Tasks\\lab3.g:1:344: AssignmentAutoOperators
                {
                mAssignmentAutoOperators(); 


                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA1_eotS =
        "\1\uffff\1\3\3\uffff";
    static final String DFA1_eofS =
        "\5\uffff";
    static final String DFA1_minS =
        "\1\44\1\56\3\uffff";
    static final String DFA1_maxS =
        "\1\172\1\71\3\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\3\1\1\1\2";
    static final String DFA1_specialS =
        "\5\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\13\uffff\12\1\7\uffff\32\2\4\uffff\1\2\1\uffff\32\2",
            "\1\4\1\uffff\12\1",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "100:19: ( IntNum | DoubleNum | ID )";
        }
    }
    static final String DFA12_eotS =
        "\1\uffff\1\43\2\uffff\1\45\1\47\2\uffff\1\41\1\51\1\36\2\uffff\12"+
        "\36\2\uffff\1\76\1\36\1\100\4\uffff\1\76\11\uffff\15\36\1\120\5"+
        "\36\2\uffff\1\36\2\uffff\5\36\1\134\2\36\1\137\4\36\1\144\1\uffff"+
        "\1\145\1\146\1\36\1\137\1\36\1\137\1\36\1\152\1\153\1\154\1\155"+
        "\1\uffff\1\156\1\157\1\uffff\1\36\1\161\2\36\3\uffff\1\164\2\36"+
        "\6\uffff\1\36\1\uffff\1\170\1\171\1\uffff\1\172\1\173\1\174\5\uffff";
    static final String DFA12_eofS =
        "\175\uffff";
    static final String DFA12_minS =
        "\1\11\1\46\2\uffff\1\75\1\53\2\uffff\1\74\1\75\1\164\2\uffff\1\165"+
        "\1\157\1\145\1\157\1\154\1\141\1\146\1\145\1\141\1\150\2\uffff\1"+
        "\44\1\151\1\56\4\uffff\1\75\11\uffff\1\162\1\164\1\157\1\162\1\141"+
        "\1\156\1\157\1\163\1\165\1\163\1\154\1\157\1\162\1\44\1\164\1\167"+
        "\1\165\1\156\1\151\2\uffff\1\156\2\uffff\1\151\1\157\1\154\2\162"+
        "\1\44\1\147\1\164\1\44\1\142\1\145\1\163\1\141\1\44\1\uffff\2\44"+
        "\1\145\1\44\1\154\1\44\1\156\4\44\1\uffff\2\44\1\uffff\1\154\1\44"+
        "\1\145\1\164\3\uffff\1\44\1\145\1\147\6\uffff\1\145\1\uffff\2\44"+
        "\1\uffff\3\44\5\uffff";
    static final String DFA12_maxS =
        "\1\175\1\46\2\uffff\2\75\2\uffff\1\74\1\75\1\164\2\uffff\1\165\3"+
        "\157\1\154\1\157\1\156\1\145\1\162\1\150\2\uffff\1\172\1\151\1\71"+
        "\4\uffff\1\75\11\uffff\1\162\1\164\1\157\1\162\1\141\1\156\1\157"+
        "\2\165\1\163\1\154\1\157\1\162\1\172\1\164\1\167\1\165\1\156\1\151"+
        "\2\uffff\1\156\2\uffff\1\151\1\157\1\154\2\162\1\172\1\147\1\164"+
        "\1\172\1\142\1\145\1\163\1\141\1\172\1\uffff\2\172\1\145\1\172\1"+
        "\154\1\172\1\156\4\172\1\uffff\2\172\1\uffff\1\154\1\172\1\145\1"+
        "\164\3\uffff\1\172\1\145\1\147\6\uffff\1\145\1\uffff\2\172\1\uffff"+
        "\3\172\5\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\3\2\uffff\1\6\1\7\3\uffff\1\13\1\14\12\uffff\1\36"+
        "\1\37\3\uffff\1\44\1\45\1\46\1\47\1\uffff\1\51\1\52\1\1\1\53\1\4"+
        "\1\54\1\5\1\10\1\11\23\uffff\1\40\1\50\1\uffff\1\42\1\43\16\uffff"+
        "\1\31\13\uffff\1\21\2\uffff\1\41\4\uffff\1\30\1\32\1\33\3\uffff"+
        "\1\15\1\16\1\17\1\20\1\22\1\23\1\uffff\1\25\2\uffff\1\34\3\uffff"+
        "\1\26\1\27\1\35\1\12\1\24";
    static final String DFA12_specialS =
        "\175\uffff}>";
    static final String[] DFA12_transitionS = {
            "\2\37\2\uffff\1\37\22\uffff\1\37\1\41\1\34\1\uffff\1\36\1\uffff"+
            "\1\1\1\35\1\2\1\3\1\4\1\5\1\6\1\31\1\uffff\1\40\12\33\1\uffff"+
            "\1\7\1\10\1\11\1\41\2\uffff\22\36\1\12\7\36\1\13\1\uffff\1\14"+
            "\1\uffff\1\36\1\uffff\1\15\1\16\1\17\1\20\1\21\1\22\2\36\1\23"+
            "\4\36\1\24\4\36\1\32\1\25\2\36\1\26\3\36\1\27\1\42\1\30",
            "\1\42",
            "",
            "",
            "\1\44",
            "\1\46\21\uffff\1\44",
            "",
            "",
            "\1\50",
            "\1\41",
            "\1\52",
            "",
            "",
            "\1\53",
            "\1\54",
            "\1\55\2\uffff\1\56\1\57\2\uffff\1\60\2\uffff\1\61",
            "\1\62",
            "\1\63",
            "\1\64\12\uffff\1\65\2\uffff\1\66",
            "\1\67\7\uffff\1\70",
            "\1\71",
            "\1\73\20\uffff\1\72",
            "\1\74",
            "",
            "",
            "\1\75\10\uffff\1\46\2\uffff\12\75\3\uffff\1\44\3\uffff\32\75"+
            "\4\uffff\1\75\1\uffff\32\75",
            "\1\77",
            "\1\101\1\uffff\12\33",
            "",
            "",
            "",
            "",
            "\1\44",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\112\1\uffff\1\111",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "",
            "",
            "\1\126",
            "",
            "",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\135",
            "\1\136",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\147",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\150",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\151",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "",
            "\1\160",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\162",
            "\1\163",
            "",
            "",
            "",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\165",
            "\1\166",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\167",
            "",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | SignedNumber | TrigonometricFunctions | IntNum | DoubleNum | StringValue | CharValue | ID | WS | Operators | ArithmaticOperators | LogicalOperators | AssignmentOperators | AssignmentAutoOperators );";
        }
    }
 

}