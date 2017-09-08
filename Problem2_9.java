import java.util.Scanner;


public class Problem2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter V0, V1, and T: ");
		
		double startingVelocity = input.nextDouble();
		
		double endingVelocity = input.nextDouble();
		
		double time = input.nextDouble();
		double average = (endingVelocity - startingVelocity)/ time;
		
		System.out.println("The average acceleration is " + (int)(average * 10000) / 10000.0);


		    }


	}

