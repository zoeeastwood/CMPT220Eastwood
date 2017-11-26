
public class Problem11_3 {
		  public static final int OVERDRAFT = -20; 
		  
		  public void withdraw(int withdraw){
		    if(getBalance() - withdraw > OVERDRAFT) {
		      double balance = (getBalance() - withdraw); // JA: where is this method defined?
		    }else{
		      System.out.println("Amount exceeds overdraft limit.");
		    }
		    
		  }

		  @Override
		  public String toString() {
		    return "CheckingAccount [toString()=" + super.toString() + "]";
		  }
		  }
