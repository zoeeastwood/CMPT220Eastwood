import java.util.Scanner;

public class Problem3_5 {

  public static void main(String[] args) {
	String today;
    String future;
 
    Scanner input = new Scanner(System.in);
    System.out.print("Enter today's date: "); 
    int day = input.nextInt();
    System.out.print("Enter the number of days elapsed since today: ");
    int dayElapsed = input.nextInt();
    
      if (day == 0)
        today = "Sunday";
      else if (day == 1)
        today = "Monday";
      else if (day == 2)
        today = "Tuesday";
      else if (day == 3)
        today = "Wednesday";
      else if (day == 4)
        today = "Thursday";
      else if (day == 5)
        today = "Friday";
      else
        today = "Saturday";
      
      int futureDay = (day + dayElapsed) % 7;
            if (futureDay == 0)
        future = "Sunday";
      else if (futureDay == 1)
        future = "Monday";
      else if (futureDay == 2)
        future = "Tuesday";
      else if (futureDay == 3)
        future = "Wednesday";
      else if (futureDay == 4)
        future = "Thursday";
      else if (futureDay == 5)
        future = "Friday";
      else
        future = "Saturday";
      
      System.out.println("Today is " + today + " and the future day is " + future);
    
  }

}