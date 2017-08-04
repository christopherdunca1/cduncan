/**
* <h1>BSTree.java</h1>
* We were instructed to write a program that will generate a binary search tree. With this we were instructed to.
* Generate 100 random integer numbers ranging from 1 – 99. The program will then store these numbers in a data structure 
* of your choice and display the data on the screen. We were then instructed to insert the values into the tree starting from 
* the first element of the Data Structure and go sequentially. After all of this I made a infix recursive method to display
* this data on the screen. I do start off this program by creating my own linked list.
* Pre - Condition - The Pre conditions for this program was being able to make all of the appropriate methods needed to apply for each 
* possibility. This also entailed making the linked list and the array that would store the random value of numbers. As well as making
* sure to not use a sorting method to make the question easier.
* Post - Condition - The post condition entails the programs ability to print out two different lists. One which shows the values
* being sorted in the Array without being sorted and then we also decided to show the output with the recursive method we were required
* to make. This will in turn put these values in order from smallest to largest.
* Once again like in all of my programs I want to re emphasize that I did not cheat! I tried hard on this program and I made sure that
* I did not plagarize or cheat and I have taken the liberty of explaining everything that I did and I am taking a lot of time on all 
* of the java doc information. Thank You
* @author  Christopher Duncan
* @since   2017-03-31
*/
import java.util.Random;

public class BSTree
{
   public static void main(String[] args)
   {
	   /**
	     * @param First off we are starting by making the Output for LinkedList
	     * You will see that I a creating the Linked List itself then going on to make the Random Number Generator
	     * @param The NumberArray being created is declaring an integer size of about 100
	     * @param The for loop is going to fill the array with the 100 random values, You will noticed I put the +1 next to (99)
	     * because we are trying to generated 100 random values.
	     * @param The next for loop is going to print all of the values in the array in a sequence.
	     * @param The next for loop is going print the values sequentially 
	     * 
	     */
	   String StoredOutput;
       TheTreeLinkedList LinkedListTree = new TheTreeLinkedList();
       Random RandomNumberGenerator = new Random();
       int NumberArray[] = new int[100];
       for (int i = 0; i < 100; ++i)
           NumberArray[i] = RandomNumberGenerator.nextInt(99)+1;
       System.out.println("\nThese are the values that are stored in the NumberArray without being sorted: ");
       for (int i = 0; i < 100; ++i)
           System.out.print(NumberArray[i]+",");
       System.out.println("\n");
       /**
	     * @param This is the sequential loop
	     */
       for (int i = 0; i < 100; ++i)
           LinkedListTree.AddingToTree(NumberArray[i]);
       /**
	     *
	     * @param This portion will call the method in the TreeLinkedList an get the values from the
	     * binary search in the correct order.
	     * @There is a print statement that will show the user the values of the Tree when using that method
	     * @param Th next statement will indeed show the desired output
	     */
       StoredOutput = LinkedListTree.ThisWillShowTheInfix();
       System.out.println("\nThese are the Values of Tree when using the Recursive Method: ");
       System.out.println(StoredOutput);
   }
}