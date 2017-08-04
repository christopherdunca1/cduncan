import java.util.ArrayList; 
import java.util.Collections; 
import java.util.List; 
public class BankClient { 
	public static void main(String args[]) { 
		
		Bank citibank = new Bank("Citibank", 1); 
		Bank icici = new Bank("ICICI", 5); 
		Bank bankOfAmerica = new Bank("BankOfAmerica", 2); 
		Bank dbs = new Bank("DBS", 6); 
		Bank hsbc = new Bank("HSBC", 3); 
		Bank scb = new Bank("Standard Charted", 4); 
		
		List<Bank> banks = new ArrayList<Bank>(); 
		banks.add(citibank); 
		banks.add(icici); 
		banks.add(bankOfAmerica); 
		banks.add(dbs); 
		banks.add(hsbc); 
		banks.add(scb); 
		
		System.out.println("List of Banks in unsorted order" + banks);
		Collections.sort(banks); 
		System.out.println("List of Banks in sorted order" + banks);
		
		
	}
	
}