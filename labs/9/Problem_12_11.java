import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem_12_11 {

  public static void main(String[] args) {

    if (args.length != 2) {
      System.out.println("Usage: java Chapter_12_11 John FileName.txt");
      System.exit(1);
    }

    File sourceFile = new File(args[1]);
    if (!sourceFile.exists()) {
      System.out.println("Source file " + args[1] + " does not exist.");
      System.out.println(2);
    }
     
    String s1 = "";
    try{
      //Scanner
      Scanner scanner = new Scanner(sourceFile);
      while (scanner.hasNext()){
        s1 += scanner.nextLine();
        }

      } catch(FileNotFoundException e){
        e.printStackTrace();
      }

        s1 = s1.replaceAll(args[0], " ");
      try {

        PrintWriter output = new PrintWriter(sourceFile);
 
        System.out.println(s1);
  
        output.write(s1);
 
        output.close();
  
      }catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    System.out.println("Done");
  }

}