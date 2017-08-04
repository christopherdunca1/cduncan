import java.util.*;

public class TelDirectoryClient {
	public static void main(String[] args){
//array list below
ArrayList<TelDirectory> list1 = new ArrayList<TelDirectory>();

list1.add(new TelDirectory("Jason ", "555-341-3531"));
list1.add(new TelDirectory("Brittney ", "555-342-3532"));
list1.add(new TelDirectory("Jake ", "555-343-3533"));
list1.add(new TelDirectory("Josh ", "555-344-3534"));
list1.add(new TelDirectory("Mason ", "555-345-3535"));
list1.add(new TelDirectory("Chris ", "555-346-3536"));
list1.add(new TelDirectory("Kyle ", "555-347-3537"));
list1.add(new TelDirectory("Mike ", "555-348-3538"));
list1.add(new TelDirectory("Susan ", "555-349-3539"));
list1.add(new TelDirectory("Joe ", "555-340-3530"));
System.out.println(list1);
Collections.sort(list1);

}
}
