// $ANTLR 3.4 C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g 2025-07-30 15:33:41

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Question1Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "IntValue", "WS", "'+'", "':'", "'@'", "'email'", "'gmail.com'", "'phone'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public Question1Parser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public Question1Parser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return Question1Parser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g"; }



    // $ANTLR start "run"
    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:2:1: run : phoneAttr emailAttr ;
    public final void run() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:2:5: ( phoneAttr emailAttr )
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:2:7: phoneAttr emailAttr
            {
            pushFollow(FOLLOW_phoneAttr_in_run9);
            phoneAttr();

            state._fsp--;


            pushFollow(FOLLOW_emailAttr_in_run11);
            emailAttr();

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



    // $ANTLR start "phoneAttr"
    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:4:1: phoneAttr : phoneName phoneValue ;
    public final void phoneAttr() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:4:10: ( phoneName phoneValue )
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:4:12: phoneName phoneValue
            {
            pushFollow(FOLLOW_phoneName_in_phoneAttr28);
            phoneName();

            state._fsp--;


            pushFollow(FOLLOW_phoneValue_in_phoneAttr30);
            phoneValue();

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
    // $ANTLR end "phoneAttr"



    // $ANTLR start "emailAttr"
    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:5:1: emailAttr : emailName emailValue ;
    public final void emailAttr() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:5:10: ( emailName emailValue )
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:5:12: emailName emailValue
            {
            pushFollow(FOLLOW_emailName_in_emailAttr36);
            emailName();

            state._fsp--;


            pushFollow(FOLLOW_emailValue_in_emailAttr38);
            emailValue();

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
    // $ANTLR end "emailAttr"



    // $ANTLR start "phoneName"
    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:7:1: phoneName : 'phone' ':' ;
    public final void phoneName() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:7:10: ( 'phone' ':' )
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:7:12: 'phone' ':'
            {
            match(input,12,FOLLOW_12_in_phoneName45); 

            match(input,8,FOLLOW_8_in_phoneName47); 

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
    // $ANTLR end "phoneName"



    // $ANTLR start "phoneValue"
    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:8:1: phoneValue : '+' IntValue ;
    public final void phoneValue() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:8:11: ( '+' IntValue )
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:8:13: '+' IntValue
            {
            match(input,7,FOLLOW_7_in_phoneValue53); 

            match(input,IntValue,FOLLOW_IntValue_in_phoneValue55); 

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
    // $ANTLR end "phoneValue"



    // $ANTLR start "emailName"
    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:9:1: emailName : 'email' ':' ;
    public final void emailName() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:9:10: ( 'email' ':' )
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:9:12: 'email' ':'
            {
            match(input,10,FOLLOW_10_in_emailName61); 

            match(input,8,FOLLOW_8_in_emailName63); 

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
    // $ANTLR end "emailName"



    // $ANTLR start "emailValue"
    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:10:1: emailValue : ID '@' 'gmail.com' ;
    public final void emailValue() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:10:11: ( ID '@' 'gmail.com' )
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Question1.g:10:13: ID '@' 'gmail.com'
            {
            match(input,ID,FOLLOW_ID_in_emailValue69); 

            match(input,9,FOLLOW_9_in_emailValue71); 

            match(input,11,FOLLOW_11_in_emailValue73); 

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
    // $ANTLR end "emailValue"

    // Delegated rules


 

    public static final BitSet FOLLOW_phoneAttr_in_run9 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_emailAttr_in_run11 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_phoneName_in_phoneAttr28 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_phoneValue_in_phoneAttr30 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emailName_in_emailAttr36 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_emailValue_in_emailAttr38 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_phoneName45 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_phoneName47 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_phoneValue53 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IntValue_in_phoneValue55 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_emailName61 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_emailName63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_emailValue69 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_emailValue71 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_emailValue73 = new BitSet(new long[]{0x0000000000000002L});

}