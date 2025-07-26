package com.company;// $ANTLR 3.4 E:\\Ramy\\Amira\\job\\CS407\\Dr.Hend\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g 2025-02-14 14:53:01

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Grammar2Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "WS", "','", "'float'", "'int'"
    };

    public static final int EOF=-1;
    public static final int T__6=6;
    public static final int T__7=7;
    public static final int T__8=8;
    public static final int ID=4;
    public static final int WS=5;

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
    public String getGrammarFileName() { return "E:\\Ramy\\Amira\\job\\CS407\\Dr.Hend\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g"; }



    // $ANTLR start "decl"
    // E:\\Ramy\\Amira\\job\\CS407\\Dr.Hend\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:7:1: decl : type ID ( ',' ID )* ;
    public final void decl() throws RecognitionException {
        type_return type1 =null;


        try {
            // E:\\Ramy\\Amira\\job\\CS407\\Dr.Hend\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:7:5: ( type ID ( ',' ID )* )
            // E:\\Ramy\\Amira\\job\\CS407\\Dr.Hend\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:7:7: type ID ( ',' ID )*
            {
            pushFollow(FOLLOW_type_in_decl11);
            type1=type();

            state._fsp--;


            match(input,ID,FOLLOW_ID_in_decl13); 

            // E:\\Ramy\\Amira\\job\\CS407\\Dr.Hend\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:7:15: ( ',' ID )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==6) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // E:\\Ramy\\Amira\\job\\CS407\\Dr.Hend\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:7:16: ',' ID
            	    {
            	    match(input,6,FOLLOW_6_in_decl16); 

            	    match(input,ID,FOLLOW_ID_in_decl18); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            String s=(type1!=null?input.toString(type1.start,type1.stop):null); System.out.println("found "+s);

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


    public static class type_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "type"
    // E:\\Ramy\\Amira\\job\\CS407\\Dr.Hend\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:8:1: type : ( 'int' | 'float' );
    public final type_return type() throws RecognitionException {
        type_return retval = new type_return();
        retval.start = input.LT(1);


        try {
            // E:\\Ramy\\Amira\\job\\CS407\\Dr.Hend\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:8:5: ( 'int' | 'float' )
            // E:\\Ramy\\Amira\\job\\CS407\\Dr.Hend\\Lab1\\Lab1\\Programs\\Grammar2\\Grammar2.g:
            {
            if ( (input.LA(1) >= 7 && input.LA(1) <= 8) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "type"

    // Delegated rules


 

    public static final BitSet FOLLOW_type_in_decl11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_decl13 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_6_in_decl16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_decl18 = new BitSet(new long[]{0x0000000000000042L});

}