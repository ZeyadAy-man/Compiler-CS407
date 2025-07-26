// $ANTLR 3.4 C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g 2025-04-14 13:11:47

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Test_Compiler_ProjectLexer extends Lexer {
    public static final int EOF=-1;
    public static final int Bool_Literal=4;
    public static final int Char_Literal=5;
    public static final int Digit=6;
    public static final int Letter=7;
    public static final int Operator=8;
    public static final int Return_Type=9;
    public static final int String_Literal=10;
    public static final int Visibility_Specifier=11;
    public static final int WS=12;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public Test_Compiler_ProjectLexer() {} 
    public Test_Compiler_ProjectLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Test_Compiler_ProjectLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g"; }

    // $ANTLR start "Char_Literal"
    public final void mChar_Literal() throws RecognitionException {
        try {
            int _type = Char_Literal;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:15:13: ( '\\'' ( . ) '\\'' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:15:15: '\\'' ( . ) '\\''
            {
            match('\''); 

            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:15:20: ( . )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:15:21: .
            {
            matchAny(); 

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
    // $ANTLR end "Char_Literal"

    // $ANTLR start "String_Literal"
    public final void mString_Literal() throws RecognitionException {
        try {
            int _type = String_Literal;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:16:15: ( '\\\"' ( . )* '\\\"' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:16:17: '\\\"' ( . )* '\\\"'
            {
            match('\"'); 

            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:16:22: ( . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\"') ) {
                    alt1=2;
                }
                else if ( ((LA1_0 >= '\u0000' && LA1_0 <= '!')||(LA1_0 >= '#' && LA1_0 <= '\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:16:22: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "String_Literal"

    // $ANTLR start "Bool_Literal"
    public final void mBool_Literal() throws RecognitionException {
        try {
            int _type = Bool_Literal;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:17:13: ( 'true' | 'false' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='t') ) {
                alt2=1;
            }
            else if ( (LA2_0=='f') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:17:15: 'true'
                    {
                    match("true"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:17:22: 'false'
                    {
                    match("false"); 



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
    // $ANTLR end "Bool_Literal"

    // $ANTLR start "Operator"
    public final void mOperator() throws RecognitionException {
        try {
            int _type = Operator;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:18:9: ( '+' | '-' | '/' | '*' | '%' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:
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
    // $ANTLR end "Operator"

    // $ANTLR start "Visibility_Specifier"
    public final void mVisibility_Specifier() throws RecognitionException {
        try {
            int _type = Visibility_Specifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:19:21: ( 'public' | 'protected' | 'private' )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='p') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='u') ) {
                    alt3=1;
                }
                else if ( (LA3_1=='r') ) {
                    int LA3_3 = input.LA(3);

                    if ( (LA3_3=='o') ) {
                        alt3=2;
                    }
                    else if ( (LA3_3=='i') ) {
                        alt3=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 3, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:19:23: 'public'
                    {
                    match("public"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:19:32: 'protected'
                    {
                    match("protected"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:19:44: 'private'
                    {
                    match("private"); 



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
    // $ANTLR end "Visibility_Specifier"

    // $ANTLR start "Return_Type"
    public final void mReturn_Type() throws RecognitionException {
        try {
            int _type = Return_Type;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:20:12: ( 'int' | 'double' | 'char' | 'bool' | 'void' )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 'i':
                {
                alt4=1;
                }
                break;
            case 'd':
                {
                alt4=2;
                }
                break;
            case 'c':
                {
                alt4=3;
                }
                break;
            case 'b':
                {
                alt4=4;
                }
                break;
            case 'v':
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:20:14: 'int'
                    {
                    match("int"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:20:20: 'double'
                    {
                    match("double"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:20:29: 'char'
                    {
                    match("char"); 



                    }
                    break;
                case 4 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:20:36: 'bool'
                    {
                    match("bool"); 



                    }
                    break;
                case 5 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:20:45: 'void'
                    {
                    match("void"); 



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
    // $ANTLR end "Return_Type"

    // $ANTLR start "Letter"
    public final void mLetter() throws RecognitionException {
        try {
            int _type = Letter;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:22:8: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Letter"

    // $ANTLR start "Digit"
    public final void mDigit() throws RecognitionException {
        try {
            int _type = Digit;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:23:7: ( '0' .. '9' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:
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
    // $ANTLR end "Digit"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:25:4: ( ( '\\n' | '\\r' | '\\t' | ' ' )+ )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:25:6: ( '\\n' | '\\r' | '\\t' | ' ' )+
            {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:25:6: ( '\\n' | '\\r' | '\\t' | ' ' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||LA5_0=='\r'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
        // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:1:8: ( Char_Literal | String_Literal | Bool_Literal | Operator | Visibility_Specifier | Return_Type | Letter | Digit | WS )
        int alt6=9;
        switch ( input.LA(1) ) {
        case '\'':
            {
            alt6=1;
            }
            break;
        case '\"':
            {
            alt6=2;
            }
            break;
        case 't':
            {
            int LA6_3 = input.LA(2);

            if ( (LA6_3=='r') ) {
                alt6=3;
            }
            else {
                alt6=7;
            }
            }
            break;
        case 'f':
            {
            int LA6_4 = input.LA(2);

            if ( (LA6_4=='a') ) {
                alt6=3;
            }
            else {
                alt6=7;
            }
            }
            break;
        case '%':
        case '*':
        case '+':
        case '-':
        case '/':
            {
            alt6=4;
            }
            break;
        case 'p':
            {
            int LA6_6 = input.LA(2);

            if ( (LA6_6=='r'||LA6_6=='u') ) {
                alt6=5;
            }
            else {
                alt6=7;
            }
            }
            break;
        case 'i':
            {
            int LA6_7 = input.LA(2);

            if ( (LA6_7=='n') ) {
                alt6=6;
            }
            else {
                alt6=7;
            }
            }
            break;
        case 'd':
            {
            int LA6_8 = input.LA(2);

            if ( (LA6_8=='o') ) {
                alt6=6;
            }
            else {
                alt6=7;
            }
            }
            break;
        case 'c':
            {
            int LA6_9 = input.LA(2);

            if ( (LA6_9=='h') ) {
                alt6=6;
            }
            else {
                alt6=7;
            }
            }
            break;
        case 'b':
            {
            int LA6_10 = input.LA(2);

            if ( (LA6_10=='o') ) {
                alt6=6;
            }
            else {
                alt6=7;
            }
            }
            break;
        case 'v':
            {
            int LA6_11 = input.LA(2);

            if ( (LA6_11=='o') ) {
                alt6=6;
            }
            else {
                alt6=7;
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
        case 'e':
        case 'g':
        case 'h':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'q':
        case 'r':
        case 's':
        case 'u':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt6=7;
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
            alt6=8;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt6=9;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 6, 0, input);

            throw nvae;

        }

        switch (alt6) {
            case 1 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:1:10: Char_Literal
                {
                mChar_Literal(); 


                }
                break;
            case 2 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:1:23: String_Literal
                {
                mString_Literal(); 


                }
                break;
            case 3 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:1:38: Bool_Literal
                {
                mBool_Literal(); 


                }
                break;
            case 4 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:1:51: Operator
                {
                mOperator(); 


                }
                break;
            case 5 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:1:60: Visibility_Specifier
                {
                mVisibility_Specifier(); 


                }
                break;
            case 6 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:1:81: Return_Type
                {
                mReturn_Type(); 


                }
                break;
            case 7 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:1:93: Letter
                {
                mLetter(); 


                }
                break;
            case 8 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:1:100: Digit
                {
                mDigit(); 


                }
                break;
            case 9 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:1:106: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}