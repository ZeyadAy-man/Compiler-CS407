// $ANTLR 3.4 C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\RuleExceptionExample\\RuleExceps.g 2025-03-26 18:54:14

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class RuleExcepsParser extends Parser {
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


    public RuleExcepsParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public RuleExcepsParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return RuleExcepsParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\RuleExceptionExample\\RuleExceps.g"; }






    // $ANTLR start "r"
    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\RuleExceptionExample\\RuleExceps.g:11:1: r : ID '#' ;
    public final void r() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\RuleExceptionExample\\RuleExceps.g:15:4: ( ID '#' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab3\\Programs\\RuleExceptionExample\\RuleExceps.g:15:4: ID '#'
            {
            match(input,ID,FOLLOW_ID_in_r33); 

            match(input,6,FOLLOW_6_in_r35); 

            }


            System.out.println("after: In after actions...");

        }
        catch (MismatchedTokenException me) {
             System.out.println("found MismatchedException"); 
        }
        catch (NoViableAltException ve) {
             System.out.println("found NoViableAltException"); 
        }
        catch (RecognitionException re) {
             System.out.println("found RecognitionException"); 
        }

        finally {
        	// do for sure before leaving
             System.out.println("finally: exit rule r"); 
        }
        return ;
    }
    // $ANTLR end "r"

    // Delegated rules


 

    public static final BitSet FOLLOW_ID_in_r33 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6_in_r35 = new BitSet(new long[]{0x0000000000000002L});

}