import java.io.*;
import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.NoSuchFileException;


class Main {
  public static void main(String[] args) throws Exception {
    CharStream src = CharStreams.fromString("from config.ini in device_1");
    DLSLexer lexer = new DLSLexer(src);
    TokenStream tkStream = new CommonTokenStream(lexer);
    DLSParser parser = new DLSParser(tkStream);
    DLSParser.StartContext result = parser.start();
    DLSParser.LoadfileContext lf = result.loadfile();
    
    //ParseTree t1 = lf.load().getChild(2);
    //System.out.println("Arvore: "+ t1.getText());
   
   // Na linha de baixo ele cria o hashmap pra armazenar e chama a função pra armazenar de acordo com o comando
   HashMap<String,HashMap> arqui = avalieDls(lf);
    System.out.println(arqui);

    if(parser.getNumberOfSyntaxErrors()>0) {
      System.out.println("entrada errada");
      return;
	  }


    ParseTree com = ConfigParser.getParser("config.ini");

    HashMap<String,HashMap> h = ConfigParser.avalie(com);
    
    
    
  }

  static HashMap avalieDls(DLSParser.LoadfileContext exp){
    HashMap<String,HashMap> r = new HashMap<>();
    if (exp.load() instanceof DLSParser.LoadConfigContext) {
      ParseTree com = ConfigParser.getParser(exp.getChild(2).getText());
      r = ConfigParser.avalie(com);
      return r;
    }
    if (exp.load() instanceof DLSParser.LoadWithOptionsContext) {
      
     ParseTree com = ConfigParser.getParser(exp.getChild(2).getText());
      
      String configs[]={exp.load().getChild(6).getText()};
      r= ConfigParser.avalieConfig(ConfigParser.findSession(com, exp.load().getChild(2).getText()), configs); 
      return r;
    }
    if (exp.load() instanceof DLSParser.LoadSpecificConfigsContext) {
      System.out.println("DEU BOM");
      ParseTree com = ConfigParser.getParser(exp.getChild(2).getText());
      String sessions[] = {exp.load().getChild(2).getText()};
      r= ConfigParser.avalie(com, sessions);
      return r;
    }
    System.out.println("NÃO ESTÁ NA GRAMATICA");
  return r;
  }

}





