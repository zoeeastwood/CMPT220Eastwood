import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem_12_13 {

  public static void main(String[] args) throws FileNotFoundException {

    if (args.length != 1) {
      System.out.println("Usage: Java Problem_12_13 <input file>");
      System.exit(1);
    }
     
    File file = new File(args[0]);
   
    int characterCount = 0;
    int wordCount = 0;
    int lineCount = 0;

    Scanner scanner = new Scanner(file);
 
   while(scanner.hasNextLine()){

     String line = scanner.nextLine();
 
     lineCount++;
     
     String str[] = line.split(" ");
     for (int i = 0; i < str.length; i++){
       if (str [i].length() > 0){
         wordCount++;
       }
     }

     characterCount += (line.length());
   }
    

    System.out.println("The file " + file.getName() + "contains the following attributes: \n");
    System.out.println("Characters: " + characterCount);
    System.out.println("Words: " + wordCount);
    System.out.println("Lines: " + lineCount);
  }

}