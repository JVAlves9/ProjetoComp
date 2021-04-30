import java.io.*;
import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.NoSuchFileException;


class ConfigParser {
  public static ParseTree getParser(String fileName){  //gets the tree of the file read
    CharStream src;
    try{
      src = CharStreams.fromFileName(fileName);
    }catch( NoSuchFileException e){
      e.printStackTrace();
      return null;
    }catch(IOException e){
      e.printStackTrace();
      return null;
    }
    ProjetoLexer lexer = new ProjetoLexer(src);
    TokenStream tkStream = new CommonTokenStream(lexer);
    ProjetoParser parser = new ProjetoParser(tkStream);
    ProjetoParser.StartContext result = parser.start();

    if(parser.getNumberOfSyntaxErrors()>0) {
      System.out.println("entrada errada");
      return null;
	  }
    return result;
  }
  public static HashMap avalie(ParseTree start){ // gets all devices from .ini
    HashMap<String,HashMap> r = new HashMap<>();
    if(start instanceof ProjetoParser.StartContext){
      for(int i = 0; i <start.getChildCount()-1; i++){
        String name = start.getChild(i).getChild(1).getText();
        HashMap<String,ArrayList<String>> data = new HashMap<>();
        avalieConfigRec(start.getChild(i), data);
        r.put(name,data);
      }
    }
    return r;
  }
  public static HashMap avalie(ParseTree start, String[] args){ //gets the especified devices from .ini
    HashMap<String,HashMap> r = new HashMap<>();
    if(start instanceof ProjetoParser.StartContext){
      for(int i = 0; i <start.getChildCount()-1; i++){
        String name = start.getChild(i).getChild(1).getText();
        boolean contains = Arrays.stream(args).anyMatch(name::equals);
        if(contains){
          HashMap<String,ArrayList<String>> data = new HashMap<>();
          avalieConfigRec(start.getChild(i), data);
          r.put(name,data);
        }
      }
    }
    return r;
  }
  public static HashMap avalieConfig(ParseTree config){ //gets all configs from a device
    HashMap<String,ArrayList<String>> r = new HashMap<>();
    avalieConfigRec(config,r);
    return r;
  }
  public static HashMap avalieConfig(ParseTree config, String[] args){  //gets specified configs from a device
    HashMap<String,ArrayList<String>> r = new HashMap<>();
    avalieConfigRec(config,r,args);
    return r;
  }
  private static void avalieConfigRec(ParseTree config, HashMap<String,ArrayList<String>> data){

    if(config instanceof ProjetoParser.DeviceConfigContext){//passes all children of the config to be analyzed
      for(int i = 0; i <config.getChildCount(); i++){
        avalieConfigRec(config.getChild(i), data);
      }
    }
    if(config instanceof ProjetoParser.AtribuicaoContext){// loads the simple variable value
      String name   = config.getChild(0).getText();
      String value  = config.getChild(2).getText();
      ArrayList<String> d = new ArrayList<>();
      d.add(value);
      data.put(name,d);
    }
    if( config instanceof ProjetoParser.AtribuicaoListaContext){//loads a list of values associated with a variable
      String name   = config.getChild(0).getText();
      ArrayList<String> d = new ArrayList<>();
      for (int i = 2; i < config.getChildCount() ; i+=2){
        d.add(config.getChild(i).getText());
      }
      data.put(name,d);
    }
  }
  private static void avalieConfigRec(ParseTree config, HashMap<String,ArrayList<String>> data, String[] args){

    if(config instanceof ProjetoParser.DeviceConfigContext){
      for(int i = 0; i <config.getChildCount(); i++){
        avalieConfigRec(config.getChild(i), data, args);
      }
    }
    if(config instanceof ProjetoParser.AtribuicaoContext){
      String name   = config.getChild(0).getText();
      boolean contains = Arrays.stream(args).anyMatch(name::equals);
      if(contains){
        String value  = config.getChild(2).getText();
        ArrayList<String> d = new ArrayList<>();
        d.add(value);
        data.put(name,d);
      }
    }
    if( config instanceof ProjetoParser.AtribuicaoListaContext){
      String name   = config.getChild(0).getText();
      boolean contains = Arrays.stream(args).anyMatch(name::equals);
      if(contains){
        ArrayList<String> d = new ArrayList<>();
        for (int i = 2; i < config.getChildCount() ; i+=2){
          d.add(config.getChild(i).getText());
        }
        data.put(name,d);
      }
    }
  }
  public static ParseTree findSession(ParseTree start, String session){// finds a specified session and returns its tree
    for(int i=0; i < start.getChildCount()-1 ; i++){
      String name = start.getChild(i).getChild(1).getText();
      if( name.equals(session) ){
        return start.getChild(i);
      }
    }
    return null;
  }
}
