
public class BankAccount {
	private String name; // this is the initialized variables name and balance
	private double balance;
	
	public BankAccount(){ //this is the first constructor that makes the name = null and the balance = 0.0
		name = null;
		balance = 0.0;
	}
	public BankAccount(String n, double b){ //this is the constructor initializing the name and balance.
		name = n; // name and balance variable
		balance = b;
	}
	 public String getName(){  //this is the getName method
	       return name;
	   }
	 public double getBalance(){ //this is the getBalance method
		 return balance;   //I have a question whether or not I need to use double balance here.
	 }
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public void withdraw(double amount){
		balance = balance - amount;
	}
	public String toString(){
		 return "("+name+ "," +balance+")";
	}		
}