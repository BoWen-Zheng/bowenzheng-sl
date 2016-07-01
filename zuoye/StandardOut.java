improt java.io.*;
public class StandardOut{
public static void main(String[] args) throws IOException{
     try(PrintStream printstream=new PrintStream(new FileOutputStream(args[0]))){
       System.setout(printStream);
      System.out.println("HelloWorld");



}



}




}