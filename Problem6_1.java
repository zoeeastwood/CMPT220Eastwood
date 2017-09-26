//Class
public class Problem6_1 {
  
  //Main Method 
  public static void main(String[] args) {
    int number;

    for(int n = 1; n < 100; n++) { 
      number = getPentagonalNumber(n);
      System.out.print(number + " "); 
      if(n % 10 == 0){
        System.out.println();
        }
      }
    }
  
 
    public static int getPentagonalNumber(int n) {
      return n * (3 * n -1) / 2; 
    }
  }