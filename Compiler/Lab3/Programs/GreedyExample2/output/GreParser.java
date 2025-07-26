// $ANTLR 3.4 C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\GreedyExample2\\Gre.g 2025-03-26 21:56:10

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class GreParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "ML_COMMENT", "WS", "'#'"
    };

    public static final int EOF=-1;
    public static final int T__7=7;
    public static final int ID=4;
    public static final int ML_COMMENT=5;
    public static final int WS=6;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public GreParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public GreParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return GreParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\GreedyExample2\\Gre.g"; }


    String s = $ID.text;



    // $ANTLR start "r"
    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\GreedyExample2\\Gre.g:10:1: r : ID '#' ;
    public final void r() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\GreedyExample2\\Gre.g:10:3: ( ID '#' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\GreedyExample2\\Gre.g:10:5: ID '#'
            {
            match(input,ID,FOLLOW_ID_in_r25); 

            match(input,7,FOLLOW_7_in_r27); 

            System.out.println("found "+ s + "lol");

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
    // $ANTLR end "r"

    // Delegated rules


 

    public static final BitSet FOLLOW_ID_in_r25 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_r27 = new BitSet(new long[]{0x0000000000000002L});

}