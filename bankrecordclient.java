/**
 **
* <h1>BankRecordClient</h1>
* The bankrecord client class will be initializing a menu of choices, basically like a directory for a user to be able to create, delete,
* update, show, deposit, withdraw and input a phone number for a bank record. This program is initialized by variables and works in
* conjunction with the bankrecord.java class. This program will allow for user input and give the user the ability to make a working bank
* directory that can be minipulated in multiple ways.
* Algorithms - include a switch statement with cases and we have personally updated each case with specific information pertaining to each menu choice. 
* The program also has a method for each case so it makes it easier for the construction of this program. 1 case and 1 method for each menu item.
* Data Structures - The data structures to be used within this are going to be a directory form of implementation by using cases and methods to store
* the information within each case and call them to its corresponding method. This will allow a user to store information and be retrieved in the 
* programs specification.
* Pre - Condition - The pre conditions are entailed with initializing the variables for both classes that will be in conjunction with each other. Some
* of these conditions are user input, variable initialization, as well as making a sorting mechanism to sort all of this information in a timely manner.
* Post - Condition - The post condition is users being able to input information and recieve the results that are expected. This means users inputting
* appropriate information that inclues the first and last names of the bank record as well as the amount being put into the record and the phone number
* of the record being created. All of these conditions can be seen and met by using the Show all Records menu choice.
*Once again as I told the TA in the second homework I did not cheat for my CODE! I really tried hard on this code and I will be also emailing the TA about
*questions regarding my code just to make sure there was no form of plagarism. With this code I tried 3 different things and I actually started off with
*multiple objects but I unfortunately could not get my program to run the cases like the deposit one. Thank you
* @author  Christopher Duncan
* @since   2017-02-25
*/
import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;

public class bankrecordclient {
    static List<bankrecord> bankrecords = new LinkedList<>();
    /**
     * @param The only real parameter will be the if statement and for loop. This method is the whole centerpiece behind the whole program.
     * What you can see happening here is that we are going to use the if statement to talk about the bank record menu's size as a whole.
     * As you can see it says if the size is greater than 0 then we will be printing out the two print statements under it. The first statement
     * is going to print out our string format as you can see it says 18 because it is the amount of spaces that we want between each of the titles
     * next to it. So first name, last name and so on will have approximately 18 spaces(s) between each other. Finally the for loop is being used again as well
     * to do the same type of mechanism.
     * @else there will be an else statement that prints out that the list is empty if there are no records already inputted into it.
     */
    public static void ShowAllRecords() {
        if (bankrecords.size() > 0) {
            System.out.println(String.format("%-18s%-18s%-18s%-18s", "First Name", "Last Name", "Phone Number", "Balance"));
            System.out.println("-----------------------------------------------------------------------------------------");
            for (bankrecord bankrecord : bankrecords) {
                System.out.println(String.format("%-18s%-18s%-18s$%-18.2f", bankrecord.getTheFirstName(), bankrecord.getTheLastName(), bankrecord.getThePhoneNumber(), bankrecord.getbalance()));
            }
        } else {
            System.out.println(" The Record list is empty\n");
        }
    }
    /**
     * @param String firstName this will be used for the first name string.
     * @param String lastName this will be used for the last name string
     * @As you will see in this method we are Deleting a Selected Record, what this method does is
     * tells the user to input the first name and last name of the record he or she is trying to delete. This
     * will in turn find that record and delete it.
     * Here is out for loop for the bank record as you can see after the for loop it will go into the
        if statement and process it as if the the record gets the first name and it equals the first original name then
        remove that bank record the same goes for the last name.
     */
    public static void DeleteASelectedRecord(String TheFirstName, String TheLastName) {
        boolean flags = true;
        for (bankrecord bankrecord : bankrecords) {
            if (bankrecord.getTheFirstName().equals(TheFirstName) && bankrecord.getTheLastName().equals(TheLastName)) {
                bankrecords.remove(bankrecords);
                flags = false;
                break;
            }
        }
        if (flags) {
            System.out.println("No Record Currently Selected ");
        }
    }
    /**
     * @param firstName this is going to be the first name for the method
     * @param lastName this is going to be the last name for the method
     * @param TheUpdatedFirstName is going to be the new name made with this method.
     * @This method is going to change the first name of one of the exisiting records within this program. 
     * It will first prompt the user to input the name that he or she wants to change then it will ask for the
     * next new name to be added. After that it will ask for the last name again and then change the name according to
     * the program. There are flags so that we can make the print statement if there is no record selected then it will show that
     * statement for the user to see.
     */
    public static void ChangeTheFirstName(String firstName, String lastName, String TheUpdatedFirstName) {
        boolean flags = true;
        for (bankrecord bankrecord : bankrecords) {
            if (bankrecord.getTheFirstName().equals(firstName) && bankrecord.getTheLastName().equals(lastName)) {
                bankrecord.setFirstName(TheUpdatedFirstName);
                flags = false;
                break;
            }
        }
        if (flags) {
            System.out.println("No Record Currently Selected");
        }
    }
    
    /**
     * @param firstName
     * @param lastName
     * @param TheUpdatedLastName
     * This method is going to change the last name of an existing record within the program. This will first prompt 
     * the user to input the first name of the record he or she is looking for. This will then ask for the last name so that
     * it can find the record within the program. Lastly, it will prompt the user to input a new last name for the record if found.
     * We are using flags in this method to give an option of whether it returns false and what will the program say if there is no record.
     */
    public static void ChangeTheLastName(String firstName, String lastName, String TheUpdatedLastName) {

        boolean flags = true;
        for (bankrecord bankrecord : bankrecords) {
        	  if (bankrecord.getTheFirstName().equals(firstName) && bankrecord.getTheLastName().equals(lastName)) {
                bankrecord.setLastName(TheUpdatedLastName);
                flags = false;
                break;
            }
        }
        if (flags) {
            System.out.println("No Record Currently Being Selected");
        }
    }
    /**
     * @param firstName this is the string for the program being put as a parameter for the name.
     * @param lastName this is the string for the program being put as a paramater for the last name.
     * @param phoneNumber this is the parameter for the string phone number that will be input into the method.
     * @param balance this is the balance that will be determined when the user inputs it into the program.
     * This method is one of the main components of the program it will actually allow the user to add a new record
     * into the program for more usage. This will first start off by asking 4 of the paramters that have been intialized.
     * What will be the first name, last name, phone number and balance of the record.
     */
    public static void AddANewRecord(String firstName, String lastName, String phoneNumber, double balance) {

        bankrecords.add(new bankrecord(firstName, lastName, phoneNumber, balance));
    }

    /**
     * @param firstName is the parameter for this method that deals with the first name.
     * @param lastName is the parameter for this method that deals with the last name.
     * @param TheUpdatedPhoneNumber this is going to be the new updated phone number that the user inputs.
     * This method is going to actually allow the user to change the phone number of a selected record. This can be implemented
     * by typing the first and last name to find the record that he or she wants to change then you will input the new phone number.
     * There is a for loop being implemented as well as a boolean flag that will be for a situation where there is no record
     * to change a phone number for.
     */
    public static void ChangeThePhoneNumberofASelectedRecord(String firstName, String lastName, String TheUpdatedPhoneNumber) {

        boolean flags = true;
        for (bankrecord bankrecord : bankrecords) {
        	 if (bankrecord.getTheFirstName().equals(firstName) && bankrecord.getTheLastName().equals(lastName)) {
                bankrecord.setThePhoneNumber(TheUpdatedPhoneNumber);
                flags = false;
                break;
            }
        }
        if (flags) {
            System.out.println("No Record Currently Being Selected");
        }
    }
    /**
     *
     * @param firstName this is the string for the first name of the record.
     * @param lastName this is the string for the last name of the record.
     * @param amount this is the double amount that will be withdraw from the user.
     * This method will allow the user to withdraw an amount from a pre exisiting record that has
     * been implemented within this program. It will first prompt the user for the first and last name
     * so that the program can find th record then it will ask the user to input the amount he or she will withdraw.
     * The if statements have been implemented so that the record can be found with the help of user input.
     * The flags are also there just in case the user inputs an insufficient amount of funds.
     */
    public static void WithdrawAnAmount(String firstName, String lastName, double amount) {

        boolean flags = true;
        for (bankrecord bankrecord : bankrecords) {
            if (bankrecord.getTheFirstName().equals(firstName) && bankrecord.getTheLastName().equals(lastName)) {
                if (bankrecord.getbalance() > amount) {
                	bankrecord.setbalance(bankrecord.getbalance() - amount);
                    System.out.println("This record now has $" + bankrecord.getbalance());
                    flags = false;
                    break;
                } else {
                    System.out.println("The input is not sufficient");
                }
            }
        }
        if (flags) {
            System.out.println("No Record Currently Being Selected");
        }
    }
    /**
     *
     * @param firstName this is using the string first name making it possible for this method.
     * @param lastName this is using the string last name making it possible for this method.
     * @param amount this is using the amount parameter which will work with this method to determine and pull the amount.
     * This method is the deposit the amount method that will allow a user to deposit an amount to a pre existing record that has
     * already been created. It will first prompt the user to enter the first name of the record that he or she wishes to deposit an
     * amount into. Then it will confirm that record with the last name and finally prompt you to input a double amount for that 
     * record.
     */
    public static void DepositAnAmount(String firstName, String lastName, double amount) {
        boolean flags = true;
        for (bankrecord bankrecord : bankrecords) {
            if (bankrecord.getTheFirstName().equals(firstName) && bankrecord.getTheLastName().equals(lastName)) {
                if (bankrecord.getbalance() >= amount) {
                    bankrecord.setbalance(bankrecord.getbalance() + amount);
                    System.out.println("This record now has $" + bankrecord.getbalance());
                    flags = false;
                    break;
                } else {
                    System.out.println("These are Insufficient Funds");
                }
            }
        }
        if (flags) {
            System.out.println("No Record Currently Being Selected");
        }
    }
    public static void main(String[] args) {
        System.out.println("A Program for a Bank:");
        //Here we are initializing the scanner input for the user so when they enter in the information
        Scanner input = new Scanner(System.in);
        /**
         * Here we are declaring variables for the menu choices, as you can see it goes from the first name all the way to the instructions we are
         * using for the switch.
         * @param num1 This is the first variable intialization TheFirstName
         * @param num2 This is the second variable intialization TheLastName
         * @param num3 This is the third variable intialization TheUpdatedFirstName
         * @param num4 This is the fourth variable intialization TheUpdatedLastName
         * @param num5 This is the fifth variable intialization ThePhoneNumber
         * @param num6 This is the sixth variable intialization Instruction
         * @param num7 This is the seventh variable intialization TheAmount
         * @return Nothing.
         */
        String TheFirstName;
        String TheLastName;
        String TheUpdatedFirstName;
        String TheUpdatedLastName;
        String ThePhoneNumber;
        int Instruction;
        double TheAmount;
        /**
         * Here are the print statements for the menu choices for the program notice that we have structured them exactly how they look in the assignment.
         * Starting off the choices with do so that we can start to being our case statements.
         * @param num1 This is the first variable intialization TheFirstName
         * @param num2 This is the second variable intialization TheLastName
         * @param num3 This is the third variable intialization TheUpdatedFirstName
         * @param num4 This is the fourth variable intialization TheUpdatedLastName
         * @param num5 This is the fifth variable intialization ThePhoneNumber
         * @param num6 This is the sixth variable intialization Instruction
         * @param num7 This is the seventh variable intialization TheAmount
         * @return int This returns the print statements of all the menu choices
         */
        do { 
            System.out.println("1. Show all records.");
            System.out.println("2. Delete a selected record.");
            System.out.println("3. Change the first name of a selected record.");
            System.out.println("4. Change the last name of a selected record.");
            System.out.println("5. Add a new record.");
            System.out.println("6. Change the phone number of a selected record.");
            System.out.println("7. Withdraw an amount requested by the record.");
            System.out.println("8. Add a deposit for a selected record.");
            System.out.println("9. Quit");
            System.out.print("Enter a command from the list above (9 to quit):");
            //This is automatically telling the program to go to the next prompt when the user enters the specific information
            Instruction = input.nextInt();
            //This is telling the program to go to the next line of the program according to the input by the user.
            input.nextLine();
            /**
             * This is the switch that will start the cases with the different methods.
             * Each case is assigned a method that corresponds to it. There are approximately 9 cases
             * With the last case it is going to actually close out the menu.
             * @return int This returns sum of numA and numB.
             */
                switch (Instruction) {
                /**@case1 Case 1 is going to show all of the records that have been created. Mind you none have been created initially so when you try to show the records
                This will give you a prompt saying record list is empty which will be in our method for this case below.**/
                case 1:
                    ShowAllRecords();
                    break;
                    /**@case2 Here is case 2 which is going to delete a selected record by the user this will prompt the user to input the first and last name of the
                    record so that it can be found and deleted.**/    
                case 2:
                    ShowAllRecords();
                    System.out.print("Please enter the first name of the record that you want to delete:");
                    TheFirstName = input.nextLine();
                    System.out.print("Please enter the last name of the record that you want to delete :");
                    TheLastName = input.nextLine();
                    DeleteASelectedRecord(TheFirstName, TheLastName);
                    break;
                    /**@case3 This case is going to be calling the ChangeTheFirstName method that we have made lower in the program. This case is basically asking for 
                    *the user input for the first name the user wants to change. Then it will go on and ask you to enter the updated first name which will in turn change
                    *the first assigned name.**/  
                case 3:
                    ShowAllRecords();
                    System.out.print("Please enter the First Name of the record you want to change:");
                    TheFirstName = input.nextLine();
                    System.out.print("Please enter the First Name now:");
                    TheUpdatedFirstName = input.nextLine();
                    System.out.print("Please enter the Last Name now:");
                    TheLastName = input.nextLine();
                    ChangeTheFirstName(TheFirstName, TheLastName, TheUpdatedFirstName);
                    break;
                    /**@case4 Here is case 2 which is going to delete a selected record by the user this will prompt the user to input the first and last name of the
                    record so that it can be found and deleted.**/   
                case 4:
                    ShowAllRecords();
                    System.out.print("Please enter the Last Name of the record you want to change:");
                    TheFirstName = input.nextLine();
                    System.out.print("Please enter the First Name now:");
                    TheLastName = input.nextLine();
                    System.out.print("Please enter the Last Name now:");
                    TheUpdatedLastName = input.nextLine();
                    ChangeTheLastName(TheFirstName, TheLastName, TheUpdatedLastName);
                    break;
                    /**@case5 is going to work in accordance with the add record method this is one of the main components of the program
                     * so that all of the functions within this menu are possible to be able to access. This will first prompt the user to ask him
                     * or her what name should be on the record. Then it will prompt for a last name as well as a phone number and amount to put in the record.
                     * This will then store this information in the record and allow it to be used for later purposes.**/   
                case 5:
                    System.out.print("Please enter the First Name:");
                    TheFirstName = input.nextLine();
                    System.out.print("Please enter the Last Name:");
                    TheLastName = input.nextLine();
                    System.out.print("Please enter the Phone Number:");
                    ThePhoneNumber = input.nextLine();
                    System.out.print("Please enter the Amount:");
                    String amount = input.nextLine();
                    TheAmount = Double.parseDouble(amount.substring(1));
                    AddANewRecord(TheFirstName, TheLastName, ThePhoneNumber, TheAmount);
                    break;
                    /**@case6 is going to deal with the change a phone number method and this will allow the user to be able to find a pre exisitng record
                     * that already has a phone number assigned to it and allow the user to actually change that number. This will first prompt the user
                     * to enter the name of the record's number that he or she will want to change. Then it will ask for the last name as well as the new
                     * phone number to be implemented with the record.**/   
                case 6:
                    System.out.print("Enter the First name of the record you want to change the phone number of:");
                    TheFirstName = input.nextLine();
                    System.out.print("Now enter Last Name :");
                    TheLastName = input.nextLine();
                    System.out.print("Enter New Phone Number");
                    ThePhoneNumber = input.nextLine();
                    ChangeThePhoneNumberofASelectedRecord(TheFirstName, TheLastName, ThePhoneNumber);
                    break;
                    /**@case7 is going to work with the withdrawanamount method and it is going to basically prompt the user to enter the first and last name
                     * of the record the user is actually searching for. Once found the user will have the ability to withdraw a double amount from that record.**/   
                case 7:
                    ShowAllRecords();
                    System.out.print("Enter the First name of the record you want to withdraw from:");
                    TheFirstName = input.nextLine();
                    System.out.print("Now enter the last name:");
                    TheLastName = input.nextLine();
                    System.out.print("Enter amount to be withdrawn:");
                    TheAmount = input.nextDouble();
                    WithdrawAnAmount(TheFirstName, TheLastName, TheAmount);
                    break;
                    /**@case8 is going to actually deal with the depositanamount method that allows a user to deposit a double amount into
                     * a pre existing record. This case is basically prompting the user to enter the first name of the record so the program
                     * can in turn go and find which one it is. Then it will prompt for the last name and then proceed to ask for what amount to deposit.**/   
                case 8:
                    System.out.print("Enter the First name of the record you want to deposit to :");
                    TheFirstName = input.nextLine();
                    System.out.print("Now enter the last name:");
                    TheLastName = input.nextLine();
                    System.out.print("Enter amount to be deposit:");
                    TheAmount = input.nextDouble();
                    DepositAnAmount(TheFirstName, TheLastName, TheAmount);
                    break;
                    /**@case9 Here is case 9 basically just saying that there are 9 cases and that the last one deals with being able to quit out
                     * of the actual menu.**/   
                case 9:
                    Instruction = 9;
            }
        } while (Instruction != 9);
    }
}