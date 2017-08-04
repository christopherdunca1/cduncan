// AccountBankDemo.java
import java.util.Scanner;
import java.util.LinkedList;
public class AccountBankDemo
{
   static Scanner keyboard = new Scanner(System.in);
  
   public static void main(String[] args)
   {
       LinkedList<AccountBank> records = new LinkedList<AccountBank>();
       AccountBank currRec = null;
      
       System.out.println("A Program for a Bank:");
       char choice;
      
       do
       {
           choice = getMenuChoice();
          
           switch(choice)
           {
           case '1':
               showAllRecords(records);
               break;
              
           case '2':
               DeleteaSelectedRecord(records, currRec);
               sortRecords(records);
               break;
              
           case 'f':
               changeCurrentRecordFirstName(records, currRec);                  
               break;
              
           case 'l':
               changeCurrentRecordLastName(records, currRec);
               sortRecords(records);
               break;
              
           case 'n':
               insertNewRecord(records);
               currRec = records.get(records.size() - 1);
               printCurrentRecord(currRec);
               sortRecords(records);
               break;
              
           case 'd':
               depositToCurrentRecord(records, currRec);
               break;
              
           case 'w':
               withdrawToCurrentRecord(records, currRec);
               break;
              
           case 'q':
               System.out.println("Thank yout");
               break;
              
           case 's':
               selectCurrentRecord(records, currRec);              
               break;
              
           default:
               System.out.println("No Record Selected");
           }
       }while(choice != 'q');
   }

   public static void sortRecords(LinkedList<AccountBank> records)
   {
       for(int i = 0 ; i < records.size() - 1; i++)
       {
       int minPos = i;
         
       for (int j = i + 1 ; j < records.size() ; j++ )
       {
       if (records.get(j).getLastName().compareToIgnoreCase(records.get(minPos).getLastName()) < 0)
       minPos = j;
       }
      
       if(minPos != i)
       {
           AccountBank temp =records.get(i);
       records.set(i, records.get(minPos));
       records.set(minPos, temp);
       }
       }
      
   }

   public static void selectCurrentRecord(LinkedList<AccountBank> records, AccountBank currRec)
   {
       System.out.print("Enter first name: ");
       String first = keyboard.next();
       System.out.print("Enter last name: ");
       String last = keyboard.next();
       boolean found = false;
      
       for(int i = 0; i < records.size(); i++)
       {
           if(records.get(i).getFirstName().equalsIgnoreCase(first) && records.get(i).getLastName().equalsIgnoreCase(last))
           {
               found = true;
               currRec = records.get(i);
               System.out.println("Current record is: " + currRec.getFirstName() + " " + currRec.getLastName());
               break;
           }
       }
      
       if(!found)
       {
           System.out.println("No matching record found.");
       }
   }

   public static void withdrawToCurrentRecord(LinkedList<AccountBank> records, AccountBank currRec)
   {
       if(currRec == null)
           System.out.println("No current record exits!");
       else if(records.size() == 0)
           System.out.println("No records exist!!");
       else
       {
           for(int i = 0; i < records.size(); i++)
           {
               if(records.get(i).getFirstName().equalsIgnoreCase(currRec.getFirstName()) && records.get(i).getLastName().equalsIgnoreCase(currRec.getLastName()))
               {
                   System.out.print("Enter the withdrawn amount: ");
                   double amount = keyboard.nextDouble();
                   records.get(i).withdraw(amount);                  
                   System.out.println("Current record is: " + records.get(i).getFirstName() + " " + records.get(i).getLastName() + " with " + String.format("%.2f", amount) + " removed from deposit");  
                   break;
               }
           }
       }
   }

   public static void depositToCurrentRecord(LinkedList<AccountBank> records, AccountBank currRec)
   {
       if(currRec == null)
           System.out.println("No current record exits!");
       else if(records.size() == 0)
           System.out.println("No records exist!!");
       else
       {
           for(int i = 0; i < records.size(); i++)
           {
               if(records.get(i).getFirstName().equalsIgnoreCase(currRec.getFirstName()) && records.get(i).getLastName().equalsIgnoreCase(currRec.getLastName()))
               {
                   System.out.print("Enter the deposited amount: ");
                   double amount = keyboard.nextDouble();
                   records.get(i).deposit(amount);                  
                   System.out.println("Current record is: " + records.get(i).getFirstName() + " " + records.get(i).getLastName() + " with " + String.format("%.2f", amount) + " added to deposit");  
                   break;
               }
           }
       }
   }

   public static void changeCurrentRecordLastName(LinkedList<AccountBank> records, AccountBank currRec)
   {
       if(currRec == null)
           System.out.println("No current record exits!");
       else if(records.size() == 0)
           System.out.println("No records exist!!");
       else
       {
           for(int i = 0; i < records.size(); i++)
           {
               if(records.get(i).getFirstName().equalsIgnoreCase(currRec.getFirstName()) && records.get(i).getLastName().equalsIgnoreCase(currRec.getLastName()))
               {
                   System.out.print("Enter new last name: ");
                   String last = keyboard.next();
                   records.get(i).setLastName(last);                  
                   System.out.println("Current record is: " + records.get(i).getFirstName() + " " + records.get(i).getLastName());                  
                  
                   break;
               }
           }
       }      
   }

   public static void changeCurrentRecordFirstName(LinkedList<AccountBank> records, AccountBank currRec)
   {
       if(currRec == null)
           System.out.println("No current record exits!");
       else if(records.size() == 0)
           System.out.println("No records exist!!");
       else
       {
           for(int i = 0; i < records.size(); i++)
           {
               if(records.get(i).getFirstName().equalsIgnoreCase(currRec.getFirstName()) && records.get(i).getLastName().equalsIgnoreCase(currRec.getLastName()))
               {
                   System.out.print("Enter new first name: ");
                   String first = keyboard.next();
                   records.get(i).setFirstName(first);                  
                   System.out.println("Current record is: " + records.get(i).getFirstName() + " " + records.get(i).getLastName());                  
                  
                   break;
               }
           }
       }
   }

   public static void DeleteaSelectedRecord(LinkedList<AccountBank> records, AccountBank currRec)
   {
       if(currRec == null)
           System.out.println("No current record exits!");
       else if(records.size() == 0)
           System.out.println("No records exist!!");
       else
       {
           for(int i = 0; i < records.size(); i++)
           {
               if(records.get(i).getFirstName().equalsIgnoreCase(currRec.getFirstName()) && records.get(i).getLastName().equalsIgnoreCase(currRec.getLastName()))
               {                  
                   AccountBank deleted = records.remove(i);
                   System.out.println("Deleted: " + deleted.getFirstName() + " " + deleted.getLastName());                  
                   currRec = null;                  
                   break;
               }
           }
       }
   }

   public static void printCurrentRecord(AccountBank currRec)
   {
       System.out.println("Current record is: " + currRec.getFirstName() + " " + currRec.getLastName() + " " + String.format("$%.2f", currRec.getBalance()));
   }

   public static void insertNewRecord(LinkedList<AccountBank> records)
   {
       System.out.print("\nEnter first name: ");
       String first = keyboard.next();
       System.out.print("Enter last name: ");
       String last = keyboard.next();
       System.out.print("Enter the balance amount: ");
       double bal = keyboard.nextDouble();
      
       AccountBank account = new AccountBank(first, last, bal);
       records.add(account);      
   }

   public static void showAllRecords(LinkedList<AccountBank> records)
   {
       if(records.size() == 0)
           System.out.println("No records exist!!");
       else
       {
           System.out.println();
           System.out.printf("%-15s%-15s%15s\n", "First Name", "Last Name", "Current Balance");
           System.out.println("-----------------------------------------------");
           for(int i = 0; i < records.size(); i++)
           {
               System.out.println(records.get(i));
           }
       }
   }

   private static char getMenuChoice()
   {  
       System.out.println();
       System.out.println("1. Show all records");
       System.out.println("2. Delete a selected record");
       System.out.println("3. Change the first name of a selected record.");
       System.out.println("4. Change the last name of a selected record");
       System.out.println("5. Add a new record");
       System.out.println("6. Change the phone number of a selected record");
       System.out.println("7. Make a withdrawal from the current record");
       System.out.println("8. Add a deposit for a selected record");
       System.out.println("9. Quit.");
       System.out.print("Enter a command from the list above (9 to quit): ");
       char choice = keyboard.next().charAt(0);      

       return choice;
   }
}