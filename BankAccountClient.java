
public class BankAccountClient {
	public static void main(String[] args){ //just added this i forgot to add it, it is the method for this class
	BankAccount b1 = new BankAccount("John", 1000); // here is the bankaccount object
		b1.deposit(500);
		System.out.println("John's balance is:"+b1);
		b1.withdraw(300);
		System.out.println("John's balance is:"+b1);
	BankAccount b2 = new BankAccount();
		System.out.println(b2);
	}
}
