import java.util.Scanner;

public class Problem4_13 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a letter: ");

    String vowelString = input.nextLine();
    
    if (vowelString.length() !=1) {
      System.out.println("You must enter only one letter.");
      System.exit(1);
    }
 
    char ch = Character.toUpperCase(vowelString.charAt(0));
    if (ch < 'A' || ch > 'Z') {

    System.out.println(vowelString + " is an invalid input.");
    System.exit(1);
    }
    if (ch == 'A' || ch =='E' || ch =='I' || ch == 'O' || ch == 'U') { 
      System.out.println(vowelString + " is a vowel.");
      System.exit(1);  
    } else {
      System.out.println(vowelString + " is a consonant.");
      }
 

  }

}