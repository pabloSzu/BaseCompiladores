package compiladores;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

// Las diferentes entradas se explicaran oportunamente
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Compilador!!!");
        // create a CharStream that reads from file
        CharStream input = CharStreams.fromFileName("input/entrada.txt");

        // create a lexer that feeds off of input CharStream
        compiladoresLexer lexer = new compiladoresLexer(input);
        //Devuelve un compilador lexico --> entra un archivo todo en string y sale tipo token
        
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        //Devuelve un archivo tipo token
        
        // create a parser that feeds off the tokens buffer
        compiladoresParser parser = new compiladoresParser(tokens);
        //recibe la secuencia de tokens y nos devuelve un objeto tipo parser
                



        
        //compiladoresBaseListener escucha = new miListener();
        //parser.addParseListener(escucha);
 



        ParseTree tree =  parser.programa();
        System.out.println(tree);
        
    }
}
