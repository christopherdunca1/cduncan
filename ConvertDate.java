import java.util.*;

public class ConvertDate{
public static void main(String[] args){

System.out.print("Enter date to be converted: ");
Scanner in = new Scanner(System.in);
String date = in.nextLine();
String dte = date.trim(); 

int index1 = dte.indexOf(" "); 
int index2 = dte.lastIndexOf(" , ");


String firstLetter = dte.substring(0,1);
String otherLetters = dte.substring(10);
String dte0 = firstLetter.trim().toUpperCase() + otherLetters.trim().toLowerCase();


String dte1 = dte0.trim().substring(0, index1);
String dte2 = dte.trim().substring(index1 + 1, index1 + 5);
String dte3 = dte.trim().substring(index2 + 1);

System.out.println("Converted Date: " + dte2 + " " + dte1 + " " + dte3); 
}
} 