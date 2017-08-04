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
public class bankrecord {

    private String TheFirstName;
    private String TheLastName;
    private String ThePhoneNumber;
    private double balance;

    /**
     *
     * @param firstName this is the string being intialized in the method
     * @param lastName this is the last name string being initialized
     * @param phoneNumber this is the string for the phone number being intialized
     * @param balance this is the balance being created in the method.
     * This method is going to create all four of our variables and declare throughout our program. As you can clearly see these are all being 
     * implemented so that they can be used in our bankrecordclient class. The methods within that class all have descriptions as well.
     * This constructor is merely assigning values to these strings and double so that the client can use them for reference.
     */
    public bankrecord(String TheFirstName, String TheLastName, String ThePhoneNumber, double balance) {
        this.TheFirstName = TheFirstName;
        this.TheLastName = TheLastName;
        this.ThePhoneNumber = ThePhoneNumber;
        this.balance = balance;
    }
    public void setFirstName(String TheFirstName) {
        this.TheFirstName = TheFirstName;
    }
    public void setLastName(String TheLastName) {
        this.TheLastName = TheLastName;
    }
    public void setThePhoneNumber(String ThePhoneNumber) {
        this.ThePhoneNumber = ThePhoneNumber;
    }
    public void setbalance(double balance) {
        this.balance = balance;
    }
    public String getTheFirstName() {
        return TheFirstName;
    }
    public String getTheLastName() {
        return TheLastName;
    }
    public String getThePhoneNumber() {
        return ThePhoneNumber;
    }
   public double getbalance() {
        return balance;
    }
}