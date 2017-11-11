import java.util.Scanner;

public class Prorblem_12_3 {

  public static void main(String[] args) {

    int[] array = new int[100];

    for(int i = 0; i < array.length; i++) {
      array[i] =  (int)(Math.random() * 100) + 1;
    }

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the index of array: ");

    try {
      System.out.println("The corresponding element value is: " + array[scanner.nextInt()]);
    }catch(ArrayIndexOutOfBoundsException ex){
      System.out.println("This element is out of bounds");
    }
  }
 }

