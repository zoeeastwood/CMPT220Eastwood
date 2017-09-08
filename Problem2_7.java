import java.util.Scanner;


public class Problem2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		   System.out.println("Enter the number of minutes:");
		    int minutes = input.nextInt();

		     // Number of minutes in a year
		    int year = minutes / 525600;
		    int day = minutes / 1440;
		    int remainingMinutes = day % 525600;


		    System.out.println(minutes + " minutes is " + year + " years and "  +  remainingMinutes + " days ");
	}

}
