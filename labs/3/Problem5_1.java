import java.util.Scanner;

//Class
public class Problem5_1 {
	
  public static void main(String[] args) {
    //Scanner 
    Scanner input = new Scanner(System.in);
   
    int positive = 0;

    int negative = 0;

    int count = 0;

    double sum = 0;
 
    System.out.print("Enter an integer, the input ends if it is 0: ");
    int number = input.nextInt();
    
  
    if  (number == 0) {
      System.out.println("No Numbers are entered except 0");
      System.exit(1);
      
    }
    
  
    while (number != 0) { 
      if (number > 0) {

        positive++;
      } else { 

        negative++;
      }
       
        sum += number;

        count++; 
      
        number = input.nextInt();
      }

      double average = sum / count ; 
    
      System.out.println("The number of positives is " + positive);
      System.out.println("The number of negatives is " + negative);
      System.out.println("The total is " + count); // JA: The total should be sum, not count
      System.out.println("The average is " + average);

    }
  }