import java.util.Scanner;


public class Problem2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a degree in Celsius: ");
		
		double celsius = input.nextDouble();
		
		double farenheit = (9.0 / 5 ) * celsius + 32;
		System.out.println(celsius + " Celsius is " + farenheit + " in Farenheit ");
		
		

	}

}
