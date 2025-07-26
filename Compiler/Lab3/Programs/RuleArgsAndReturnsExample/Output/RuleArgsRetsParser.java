// $ANTLR 3.4 C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\RuleArgsAndReturnsExample\\RuleArgsRets.g 2025-03-27 03:09:53

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class RuleArgsRetsParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "WS", "'#'"
    };

    public static final int EOF=-1;
    public static final int T__6=6;
    public static final int ID=4;
    public static final int WS=5;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public RuleArgsRetsParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public RuleArgsRetsParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return RuleArgsRetsParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\RuleArgsAndReturnsExample\\RuleArgsRets.g"; }





    public static class r_return extends ParserRuleReturnScope {
        public int c;
        public String d;
    };


    // $ANTLR start "r"
    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\RuleArgsAndReturnsExample\\RuleArgsRets.g:11:1: r[int a, String b] returns [int c, String d] : ID '#' s ;
    public final RuleArgsRetsParser.r_return r(int a, String b) throws RecognitionException {
        RuleArgsRetsParser.r_return retval = new RuleArgsRetsParser.r_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\RuleArgsAndReturnsExample\\RuleArgsRets.g:11:47: ( ID '#' s )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\RuleArgsAndReturnsExample\\RuleArgsRets.g:11:50: ID '#' s
            {
            match(input,ID,FOLLOW_ID_in_r33); 

            match(input,6,FOLLOW_6_in_r35); 

            pushFollow(FOLLOW_s_in_r37);
            s();

            state._fsp--;


            retval.c =a; retval.d =b; System.out.println(retval.c + " " + retval.d);

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "r"



    // $ANTLR start "s"
    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\RuleArgsAndReturnsExample\\RuleArgsRets.g:15:1: s : ID '#' v= r[3,\"my grammar string\"] ;
    public final void s() throws RecognitionException {
        RuleArgsRetsParser.r_return v =null;


        try {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\RuleArgsAndReturnsExample\\RuleArgsRets.g:15:3: ( ID '#' v= r[3,\"my grammar string\"] )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\RuleArgsAndReturnsExample\\RuleArgsRets.g:15:5: ID '#' v= r[3,\"my grammar string\"]
            {
            match(input,ID,FOLLOW_ID_in_s59); 

            match(input,6,FOLLOW_6_in_s61); 

            pushFollow(FOLLOW_r_in_s65);
            v=r(3, "my grammar string");

            state._fsp--;


            System.out.println((v!=null?v.d:null));

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
    // $ANTLR end "s"

    // Delegated rules


 

    public static final BitSet FOLLOW_ID_in_r33 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6_in_r35 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_s_in_r37 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_s59 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6_in_s61 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_r_in_s65 = new BitSet(new long[]{0x0000000000000002L});

}