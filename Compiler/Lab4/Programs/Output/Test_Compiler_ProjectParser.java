// $ANTLR 3.4 C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g 2025-04-14 13:11:47

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Test_Compiler_ProjectParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Bool_Literal", "Char_Literal", "Digit", "Letter", "Operator", "Return_Type", "String_Literal", "Visibility_Specifier", "WS"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public Test_Compiler_ProjectParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public Test_Compiler_ProjectParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return Test_Compiler_ProjectParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g"; }



    // $ANTLR start "main_method"
    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:3:1: main_method : String_Literal ;
    public final void main_method() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:3:13: ( String_Literal )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab4\\Programs\\Test_Compiler_Project.g:3:15: String_Literal
            {
            match(input,String_Literal,FOLLOW_String_Literal_in_main_method10); 

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
    // $ANTLR end "main_method"

    // Delegated rules


 

    public static final BitSet FOLLOW_String_Literal_in_main_method10 = new BitSet(new long[]{0x0000000000000002L});

}