/**
* <h1>LabQuiz2</h1>
* We were instructed to write a program that will use a non voided recursive function to count the number of
* element in a LinkedList of Integer and return the quantity. The function was required to accept one parameter
* of a LinkedList Integer. 
* */
import java.util.LinkedList;
import java.util.Random;

import javax.xml.soap.Node;

public class LabQuiz2 {
	 /**
     * @param Here I am starting off by making the random portion for the random integers that will be 
     * in this linked list. As requested we are to generate random numbers ranging from 1 to 99. The best
     * way to do this was to use a for loop and to go 
     */
public static void main (String[] args){
	Random Random = new Random();
	LinkedList<Integer> List = new LinkedList<>();
	int randomvalue = 1 + Random.nextInt(99);
	for (int i = 0; i <= randomvalue; i++){
		List.add(randomvalue);
	}
	 /**
     * @param As you can see here we are printing out the information for the user to see when he or she runs 
     * this program. 
     */
	System.out.println("This is the Quantity: " +CountTheNumberOfElements(List, null));
	System.out.println("The Quantity Of the List Shown in the Linked List is: " +List);
}
/**
 * @param Here is the method that is counting the number of elements in the linked list. As stated
 * we are not using a size function we are only initializing the size to 0. 
 */
public static int CountTheNumberOfElements(LinkedList<Integer> List, Node temp){
	int quantity = 0;
	if (temp != null)
		return 0;
	for (Integer elements : List){
		quantity++;
	}
	return quantity;
}
}
