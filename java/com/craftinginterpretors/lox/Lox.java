package lox;
//java/com/craftinginterpretors

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Lox {
    public static void main(String[] args) throws IOException{
        if (args.length >1){
            System.out.println("Usage: jlox [script]");
        }
//        elif(args.length==1){
//            runFile(args[0]);
//        }else{
//            runPrompt();
//        }
    }

    private static void runFile(String path) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get(path));
//        run(new String(bytes, Charset.defaultCharset()));
    }

    private static void runPrompt() throws IOException {
        
    }
}