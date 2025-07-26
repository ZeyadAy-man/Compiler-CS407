package com.company;
import java.io.*;
import org.antlr.runtime.*;
public class Main {

    public static void main(String[] args) throws Exception {
/*
        String in ="float a , b";
        ANTLRStringStream input = new ANTLRStringStream(in);
        Grammar2Lexer lexer = new Grammar2Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Grammar2Parser parser = new Grammar2Parser(tokens);
        parser.decl();
*/


        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(new File("input.txt")));
        Grammar2Lexer lexer = new Grammar2Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Grammar2Parser parser = new Grammar2Parser(tokens);
        parser.decl();


    }
}
