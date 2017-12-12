import java.util.Scanner;//instance of scanner class for input from user

	public class Project2 {

	    public static void main(String[] args) {
	    

	        Scanner scanner = new Scanner(System.in);
	        
	        //Naming variable for calculating payment plan
	        double paymentPlan;
	        
	        //Naming variable in order to calculate remaining balance 
	        double remainingBalance;
	        
	        //Naming variable in order to calculate remaining balance after financial aid
	        double afterAid;
	        
	        //User Input
	        System.out.println("Please Enter Your Remaining Tuition Balance:");
	        double tuitionAmount = scanner.nextDouble();
	        
	        //User Input, Int instead of double
	        System.out.println("How Many Months Are You Going to School For?");
	        int months = scanner.nextInt();

	        //User Input
	        System.out.println("Please Enter The Cost Of Tuition Per Year:");
	        double costAmount = scanner.nextDouble();
	        
	        //User Input
	        System.out.println("Please Enter The Amount of Loans You Plan To Take Out Per Year:");
	        double aid = scanner.nextDouble();

	        //User Input
	        System.out.println("Please Enter The Annual Interest Rate (Ex. 7.5% = .075): ");
	        double annualInterestRate = scanner.nextDouble();

	        //User Input
	        System.out.println("Please Enter The Amount Of Your Loan.");
	        double loanTenure = scanner.nextInt();
	        
	        //User Input
	        System.out.println("Please Enter Any Financial Aid You Might Receieve Per Year (If Applicable)");
	        double financialHelp = scanner.nextInt();
	        
	        //Calculate 
	        costAmount = loanTenure * annualInterestRate;
	        
	        System.out.println("Your loan amount after intrest is " + costAmount + " per year");
	        
	        paymentPlan = aid * annualInterestRate / months; 
	        
	        System.out.println("You should be paying " + paymentPlan + " per month after intrest");
	        
	        remainingBalance = tuitionAmount - aid;
	        
	        System.out.println("The amount that is not covered by your loan is, " + remainingBalance + 
	        		" ,you must pay this on your own ");
	        
	        afterAid = costAmount - financialHelp;
	        
	        System.out.println("However, if you would not like to have any loans the cost after financial aid "
	        		+ "ONLY is " + afterAid + " per year");
	        
	     
	        
	        
	        
	        
	    
	    }

	      }
	   
	        
	    

	