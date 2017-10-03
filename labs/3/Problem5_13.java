
public class Problem5_13 {
	public static void main(String[] args) {
		int n = 0; 


		while (Math.pow(n + 1, 3) < 12000) {
			n++; 
		}

		// Display result
		System.out.println(
			"Largest integer n so that n^3 is less than 12,000: " + n);
	}
}
