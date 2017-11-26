import java.util.Scanner;

// JA: Where are the Triangle and IllegalTriangleEception classes?
public class Problem_12_5 {

  public static void main(String[] args) throws IllegalTriangleEception {
   
    //Scanner 
    Scanner scanner = new Scanner(System.in);
   
    System.out.print("Enter Side 1 of the triangle: ");
    double side1 = scanner.nextDouble();
    System.out.print("Enter Side 2 of the triangle: ");
    double side2 = scanner.nextDouble();
    System.out.print("Enter Side 3 of the triangle: ");
    double side3 = scanner.nextDouble();
    

      System.out.print("Enter the color of the triangle: ");
      String color = scanner.next();
 
      System.out.print("Is it true that the triangle filled in? ");
      boolean filled = scanner.nextBoolean();

      Triangle triangle = new Triangle(side1, side2, side3);
      triangle.setColor(color);
      triangle.setFilled(filled);

      System.out.println("\nThe area is: " + triangle.getArea());
      System.out.println("The perimeter is: " + triangle.getPerimeter());
      System.out.println("The color is: " + triangle.getColor());
      System.out.println("It is " + triangle.isFilled() + " that the triangle is filled in");
    }
  }
