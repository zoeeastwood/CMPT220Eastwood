import java.util.Scanner;

public class Problem8_11 {
	//* Not sure */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] binaryArray = new char[9];
        for (int i = 0; i < binaryArray.length; i++)
            binaryArray[i] = '0';

        System.out.print("Enter an integer between 0 and 511: ");
        char[] userBinaryCharArray = (Integer.toBinaryString(in.nextInt())).toCharArray();

        for (int i = 0; i < userBinaryCharArray.length; i++) {
            binaryArray[binaryArray.length - i - 1] = userBinaryCharArray[i]; 
        }

        for (int j = 0; j < binaryArray.length; j++) {
            if (j % 3 == 0) System.out.println();
            System.out.printf("%s ", binaryArray[j] == '0' ? 'H' : 'T');
        }
    }
}