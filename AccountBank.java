// AccountBank.java
public class AccountBank
{
   private String firstName;
   private String lastName;
   private double balance;
  
   public AccountBank()
   {
       firstName = "";
       lastName = "";
       balance = 0.0;
   }
  
   public AccountBank(String first, String last)
   {
       firstName = first;
       lastName = last;
       balance = 0;
   }
  
   public AccountBank(String first, String last, double bal)
   {
       firstName = first;
       lastName = last;
       balance = bal;
   }  
  
   public String getFirstName()
   {
       return firstName;
   }
  
   public String getLastName()
   {
       return lastName;
   }
  
   public double getBalance()
   {
       return balance;
   }
  
   public void setFirstName(String first)
   {
       firstName = first;
   }
  
   public void setLastName(String last)
   {
       lastName = last;
   }
  
   public void setBalance(double bal)
   {
       balance = bal;
   }
  
   public void deposit(double amount)
   {
       if(amount < 0)
           System.out.println("Nagative amount is not allowed!");
       else
           balance = balance + amount;      
   }
  
   public void withdraw(double amount)
   {
       if(amount < 0)
           System.out.println("Nagative amount is not allowed!");
       else if(balance - amount < 0)
           System.out.println("Insufficient balance!");
       else
           balance = balance - amount;
   }
  
   public String toString()
   {
       return String.format("%-15s%-15s%15s", firstName, lastName, String.format("$%.2f", balance));
   }
  
}