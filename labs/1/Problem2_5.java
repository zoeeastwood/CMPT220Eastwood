import java.util.Scanner;


public class Problem2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the subtotal and gratuity rate: ");
		
		// Scanner
		Scanner input = new Scanner(System.in);
		
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();
		
		double gratuity = subtotal * (gratuityRate / 100);
		double total = subtotal + gratuity;
		
		System.out.println("The gratuity is $" + gratuity + " and the total is $"
				+ total);
		

	}

}
