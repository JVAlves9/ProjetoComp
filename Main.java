import java.io.*;
import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.NoSuchFileException;


class Main {
  public static void main(String[] args) throws Exception {
    CharStream src = CharStreams.fromString("from config.ini in device_1 load ip pass");
    DLSLexer lexer = new DLSLexer(src);
    TokenStream tkStream = new CommonTokenStream(lexer);
    DLSParser parser = new DLSParser(tkStream);
    DLSParser.StartContext result = parser.start();
    DLSParser.LoadfileContext lf = result.loadfile();
    
   // Na linha de baixo ele cria o hashmap pra armazenar e chama a função pra armazenar de acordo com o comando
   

    if(parser.getNumberOfSyntaxErrors()>0) {
      System.out.println("entrada errada");
      return;
	  }
    HashMap<String,HashMap> arqui = avalieDls(lf);
    System.out.println(arqui);

    ParseTree com = ConfigParser.getParser("config.ini");

    HashMap<String,HashMap> h = ConfigParser.avalie(com);
    System.out.println(h);
    
    
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
      int nConfig = tamReal(exp.load().getChild(6).getChildCount());
      String configs[] = new String[nConfig];
      int k =0;
    for(int i = 0; i <= nConfig-1; i++){
      configs[i] = exp.load().getChild(6).getChild(i+k).getText();
      k=k+1;
        }

      r= ConfigParser.avalieConfig(ConfigParser.findSession(com, exp.load().getChild(2).getText()), configs); 
      return r;

    }
    if (exp.load() instanceof DLSParser.LoadSpecificConfigsContext) {
      
      ParseTree com = ConfigParser.getParser(exp.getChild(2).getText());
      int nSession = tamReal(exp.load().getChild(2).getChildCount());
      String sessions[] = new String[nSession];
    int k =0;
    for(int i = 0; i <= nSession-1; i++){
      sessions[i] = exp.load().getChild(2).getChild(i+k).getText();
      k=k+1;
        }
    r= ConfigParser.avalie(com, sessions);
      return r;
    }
    System.out.println("GRAMÁTICA ERRADA");
  return r;
  }

static int tamReal(int tamf){
  int k=0;
  int j=1;
  while(j<tamf){
    j=j+2;
    k=k+1;}
  return j-k;
  }

}





