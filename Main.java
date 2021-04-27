import java.io.*;
import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.NoSuchFileException;


class Main {
  public static void main(String[] args) throws Exception {
    CharStream src = CharStreams.fromString("from config.ini in device_1 load ip");
    DLSLexer lexer = new DLSLexer(src);
    TokenStream tkStream = new CommonTokenStream(lexer);
    DLSParser parser = new DLSParser(tkStream);
    DLSParser.StartContext result = parser.start();

    if(parser.getNumberOfSyntaxErrors()>0) {
      System.out.println("entrada errada");
      return;
	  }


    ParseTree com = ConfigParser.getParser("config.ini");

    HashMap<String,HashMap> h = ConfigParser.avalie(com);
    System.out.println(h);
  }
}