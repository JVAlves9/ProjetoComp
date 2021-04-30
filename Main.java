import java.io.*;
import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.NoSuchFileException;


class Main {
  public static void main(String[] args) throws Exception {
    
    HashMap<String,? extends Object> arquivoLido = salvaIni("from config.ini in device_3 device_1");
    
		System.out.println("Key type\t\t\t\t\tValue Type"+"\n"+arquivoLido.keySet().toArray()[0].getClass()+"\t\t\t"+arquivoLido.values().toArray()[0].getClass()+"\n");
    System.out.println("arquivoLido = "+arquivoLido);
    
  }

  public static HashMap<String,? extends Object> salvaIni(String coman){
    CharStream src = CharStreams.fromString(coman);
    DSLLexer lexer = new DSLLexer(src);
    TokenStream tkStream = new CommonTokenStream(lexer);
    DSLParser parser = new DSLParser(tkStream);
    DSLParser.StartContext result = parser.start();
    DSLParser.LoadfileContext lf = result.loadfile();
    if(parser.getNumberOfSyntaxErrors()>0) {
      System.out.println("entrada errada");
      return null;
	  }
// Na linha de baixo ele cria o hashmap pra armazenar e chama a função pra armazenar de acordo com o comando
    HashMap<String,? extends Object> arqui = avalieDsl(lf);
    return arqui;
  }


  static HashMap<String,? extends Object> avalieDsl(DSLParser.LoadfileContext exp){
    HashMap<String,? extends Object> r = new HashMap<>();
    if (exp.load() instanceof DSLParser.LoadConfigContext) {
      ParseTree com = ConfigParser.getParser(exp.getChild(2).getText());
      r = ConfigParser.avalie(com);
      return r;
    }
    if (exp.load() instanceof DSLParser.LoadWithOptionsContext) {
      
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
    if (exp.load() instanceof DSLParser.LoadSpecificConfigsContext) {
      
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