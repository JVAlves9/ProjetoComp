import java.io.*;
import org.antlr.v4.runtime.*;


class Main {
  public static void main(String[] args) throws Exception {
    CharStream src = CharStreams.fromFileName(args[0]);
     ProjetoLexer lexer = new ProjetoLexer(src);
     TokenStream tkStream = new CommonTokenStream(lexer);
     ProjetoParser parser = new ProjetoParser(tkStream);
     parser.start();
  }
}