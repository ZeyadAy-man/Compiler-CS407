// $ANTLR 3.4 C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\ActionsEmbeddedExample\\Acts.g 2025-03-26 23:42:27

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ActsParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "WS", "'#'", "'a'", "'b'", "'c'", "'d'"
    };

    public static final int EOF=-1;
    public static final int T__6=6;
    public static final int T__7=7;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int ID=4;
    public static final int WS=5;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public ActsParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ActsParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return ActsParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\ActionsEmbeddedExample\\Acts.g"; }





    public static class r_return extends ParserRuleReturnScope {
        public int n;
        public String s;
    };


    // $ANTLR start "r"
    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\ActionsEmbeddedExample\\Acts.g:12:1: r returns [int n, String s] : ( 'a' '#' | 'b' '#' | 'c' '#' | 'd' '#' );
    public final ActsParser.r_return r() throws RecognitionException {
        ActsParser.r_return retval = new ActsParser.r_return();
        retval.start = input.LT(1);



        retval.n =0; // init return value
        retval.s ="abc";

        try {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\ActionsEmbeddedExample\\Acts.g:24:3: ( 'a' '#' | 'b' '#' | 'c' '#' | 'd' '#' )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 7:
                {
                alt1=1;
                }
                break;
            case 8:
                {
                alt1=2;
                }
                break;
            case 9:
                {
                alt1=3;
                }
                break;
            case 10:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\ActionsEmbeddedExample\\Acts.g:24:3: 'a' '#'
                    {
                    match(input,7,FOLLOW_7_in_r45); 

                    match(input,6,FOLLOW_6_in_r47); 

                    retval.n =23;

                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\ActionsEmbeddedExample\\Acts.g:25:2: 'b' '#'
                    {
                    match(input,8,FOLLOW_8_in_r52); 

                    match(input,6,FOLLOW_6_in_r54); 

                    retval.n =9;

                    }
                    break;
                case 3 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\ActionsEmbeddedExample\\Acts.g:26:2: 'c' '#'
                    {
                    match(input,9,FOLLOW_9_in_r59); 

                    match(input,6,FOLLOW_6_in_r61); 

                    retval.n =1;

                    }
                    break;
                case 4 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\ActionsEmbeddedExample\\Acts.g:27:2: 'd' '#'
                    {
                    match(input,10,FOLLOW_10_in_r66); 

                    match(input,6,FOLLOW_6_in_r68); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);



            y = 3;
            System.out.println("returning value n="+retval.n + " " + retval.s + y);

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

    // Delegated rules


 

    public static final BitSet FOLLOW_7_in_r45 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6_in_r47 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_r52 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6_in_r54 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_r59 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6_in_r61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_r66 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6_in_r68 = new BitSet(new long[]{0x0000000000000002L});

}