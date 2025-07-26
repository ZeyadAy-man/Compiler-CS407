package com.company;
import java.io.*;
import org.antlr.runtime.*;
public class Main {

    public static void main(String[] args) throws Exception {
        String in ="a #";
        ANTLRStringStream input = new ANTLRStringStream(in);
        Grammar1Lexer lexer = new Grammar1Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Grammar1Parser parser = new Grammar1Parser(tokens);
        parser.r();
    }
}
