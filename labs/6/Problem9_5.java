import java.util.GregorianCalendar;

public class Problem9_5 {

  public static void main(String[] args) {

    GregorianCalendar calendar = new GregorianCalendar();
 
    int month = calendar.get(calendar.MONTH) + 1; 
    int day = calendar.get(calendar.DAY_OF_MONTH); 
    int year =calendar.get(calendar.YEAR);
    System.out.println("The current date is: " + month + "/" + day + "/" + year);
    
    
    GregorianCalendar calendar1 = new GregorianCalendar();

    calendar1.setTimeInMillis(1234567898765L);
    

    int month1 = calendar1.get(calendar1.MONTH) + 1; 
    int day1 = calendar1.get(calendar1.DAY_OF_MONTH); 
    int year1 =calendar1.get(calendar1.YEAR);
    System.out.println("The new date is: " + month1 + "/" + day1 + "/" + year1);
    
  }
}
