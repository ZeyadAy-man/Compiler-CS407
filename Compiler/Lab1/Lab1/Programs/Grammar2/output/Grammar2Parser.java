// $ANTLR 3.4 C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g 2025-03-26 20:50:24

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Grammar2Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "DOUBLE", "ID", "INT", "WS", "';'", "'='", "'double'", "'int'"
    };

    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int COMMENT=4;
    public static final int DOUBLE=5;
    public static final int ID=6;
    public static final int INT=7;
    public static final int WS=8;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public Grammar2Parser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public Grammar2Parser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return Grammar2Parser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g"; }


       String s1;
       String s2;
       String s3;
       String s4;
       String s5;



    // $ANTLR start "decl"
    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:11:1: decl : ( ( 'int' ID '=' INT ';' ) | ( 'double' ID '=' DOUBLE ';' ) ) ;
    public final void decl() throws RecognitionException {
        Token ID1=null;
        Token DOUBLE2=null;

        try {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:11:6: ( ( ( 'int' ID '=' INT ';' ) | ( 'double' ID '=' DOUBLE ';' ) ) )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:11:8: ( ( 'int' ID '=' INT ';' ) | ( 'double' ID '=' DOUBLE ';' ) )
            {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:11:8: ( ( 'int' ID '=' INT ';' ) | ( 'double' ID '=' DOUBLE ';' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==11) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:11:9: ( 'int' ID '=' INT ';' )
                    {
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:11:9: ( 'int' ID '=' INT ';' )
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:11:10: 'int' ID '=' INT ';'
                    {
                    match(input,12,FOLLOW_12_in_decl17); 

                    ID1=(Token)match(input,ID,FOLLOW_ID_in_decl19); 

                    match(input,10,FOLLOW_10_in_decl21); 

                    match(input,INT,FOLLOW_INT_in_decl23); 

                    match(input,9,FOLLOW_9_in_decl25); 

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:11:34: ( 'double' ID '=' DOUBLE ';' )
                    {
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:11:34: ( 'double' ID '=' DOUBLE ';' )
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:11:35: 'double' ID '=' DOUBLE ';'
                    {
                    match(input,11,FOLLOW_11_in_decl31); 

                    match(input,ID,FOLLOW_ID_in_decl33); 

                    match(input,10,FOLLOW_10_in_decl35); 

                    DOUBLE2=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_decl37); 

                    match(input,9,FOLLOW_9_in_decl39); 

                    }


                    }
                    break;

            }


            s1 = (ID1!=null?ID1.getText():null); s2 = (DOUBLE2!=null?DOUBLE2.getText():null); System.out.println(s1 + " lol " + s2 + " lol");

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
    // $ANTLR end "decl"

    // Delegated rules


 

    public static final BitSet FOLLOW_12_in_decl17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_decl19 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_decl21 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_INT_in_decl23 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_decl25 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_decl31 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_decl33 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_decl35 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_DOUBLE_in_decl37 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_decl39 = new BitSet(new long[]{0x0000000000000002L});

}