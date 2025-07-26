package com.company;// $ANTLR 3.4 E:\\Ramy\\Amira\\job\\CS407\\Dr.Hend\\Lab1\\Lab1\\Programs\\Grammar1\\Grammar1.g 2025-02-14 14:58:56

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Grammar1Parser extends Parser {
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


    public Grammar1Parser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public Grammar1Parser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return Grammar1Parser.tokenNames; }
    public String getGrammarFileName() { return "E:\\Ramy\\Amira\\job\\CS407\\Dr.Hend\\Lab1\\Lab1\\Programs\\Grammar1\\Grammar1.g"; }


    String s;



    // $ANTLR start "r"
    // E:\\Ramy\\Amira\\job\\CS407\\Dr.Hend\\Lab1\\Lab1\\Programs\\Grammar1\\Grammar1.g:8:1: r : ID '#' ;
    public final void r() throws RecognitionException {
        Token ID1=null;

        try {
            // E:\\Ramy\\Amira\\job\\CS407\\Dr.Hend\\Lab1\\Lab1\\Programs\\Grammar1\\Grammar1.g:8:3: ( ID '#' )
            // E:\\Ramy\\Amira\\job\\CS407\\Dr.Hend\\Lab1\\Lab1\\Programs\\Grammar1\\Grammar1.g:8:5: ID '#'
            {
            ID1=(Token)match(input,ID,FOLLOW_ID_in_r23); 

            match(input,6,FOLLOW_6_in_r25); 

            s = (ID1!=null?ID1.getText():null); System.out.println("found "+s);

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


 

    public static final BitSet FOLLOW_ID_in_r23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6_in_r25 = new BitSet(new long[]{0x0000000000000002L});

}