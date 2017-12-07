
public class Problem11_3 {
		  public static final int OVERDRAFT = -20; 
		  
		  public void withdraw(int withdraw){
		    if(getBalance() - withdraw > OVERDRAFT) {
		      double balance = (getBalance() - withdraw);
		    }else{
		      System.out.println("Amount exceeds overdraft limit.");
		    }
		    
		  }
		  private int getBalance() {
			// TODO Auto-generated method stub
			return 0;
		}

		  public String toString() {
		    return "CheckingAccount [toString()=" + super.toString() + "]";
		  }
		  }
