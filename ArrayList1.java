/* Purpose - You are supposed to write a program name ArrayList.java that creates an ArrayList data structure that is similar to the ArrayList data Structure that exist in the java library. 
 * The class must be written to accept any type of Objects. Basically, throughout the program numerous things are initialized into the fact that
 * you will make an array list of objects and be able to put values into these objects. Later into the program we use a card class
 * to put cards within this array then we print the array of cards also using a shuffling method to shuffle the cards.
 * Solution - The solution was very complex first we had to use all of the provided methods and initialize them in the correct way. Then we did what we could by assigning values and making sure
 * that everything is doing what it is supposed to do. I started by giving the length the value of 0 and the size 10 which was the default size.
 * Luckily for our labs we were able to work on card classes that made the ability to put cards within the objects possible.
 * 
 * List - Some of the data structures used included the objects itself as well as adding the cards into the array list in the first place.
 * We had to assign values into the array list to make it possible for us to be able to print the cards at all. Once we established this
 * data structure and assigned the cards into the respective places it was easy for us to just print them out using a toString method.
 * 
 * How to use the program - To use this program all you have to do is edit the cards in the testarray.java class to be used as any alues that you would want.
 * We are originally using this as a card program but I am really sure that you can use if for something else if you chose to.
 * 
 * Purpose -  The purpose of this program was teach us students how to make a data structure and input values or objects within it and be
 * able to call this information in a manner that was easy for a user to understand. With this we used the cards as a way to store them
 * within the objects and we just printed them in the way that would be completely understandable. 
 *
 *Final Disclaimer - I did not copy code!!!!!! I really tried this time and I talked to the TA and understand 100% why i should not have copied code and I really tried
 *my hardest this time I am not sure if the result is what was being asked but I thank you for the second chance and I hope i did not let you down.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Arrays;

public class ArrayList1 {

	private int length;//Here we are initializing the length of the array list
	private Object list[];//Here we are creating a list of objects within the array list
	private int size;//Here we are initializing the size of the array list
	
	
	public ArrayList1(){//This is the first constructor that has a default size of 10
		length = 0;//length is the capacity of the ArrayList. So basically we do not have a capacity limit. So if we are putting 20 elements within the size we can do that because we do not have a capacity limit.
		list = new Object[10];//Here is where we are initializing the list to have a default size of 10, this means we will have 10 new objects in this list
		size = 10;//The size is an integer equal to a number of elements present in the array list. 


	}
	 public ArrayList1(int n){//This is the second constructor that accepts a parameter of type int which means integer and sets the size of the parameter
		 length = 0;//Once again the length here is the capacity for this array lists constructor
		 list = new Object[n];//Here we are doing a list of objects with the value of n
		 size = n;//This is the variable being used and we are going to assign and integer equal to a number of elements within this array list.
	 
	 }
	 public void add(Object x){//This is the method that will allow you to place a value at the end of the ArrayList
		    {
		          if(length>size)//This is going to print a message if our array list just happens to be full at any point.
		          {
		              System.out.println("There is an Error: The size is exceeding");
		              return;
		          }
		          else if
		          (length==size)
		        	  System.out.println("There is an Error: The size is exceeding");
		          list[length]=x;
		          length++;
		     }
	 }
	 
	 public void add(int index, Object x){//This method allows you to place a value at a given location
		 {
	          //Basically if the index is going to be out of ran it will print an error
	          if(index < 0)//or 
	         {
	              System.out.println(index + "This is a bad index to add to the array, please try again");
	              return;
	         }
	          else if
	          (index > size)
	        	  System.out.println(index + "This is a bad index to add to the array, please try again");
		 }
	         //Now we are going to place new element within the index that we have found
	         list[index] = x;
	         length++;
	     }
	 
	 public Object get(int index){//This method allows you to retrieve an object from a given location
		 if(index < 0)
			 return null;
		 else if
			 (index > length)
			 return null;
		 else
			 return list[index];
	 }
	 
	 public int size(){//Allows you to return the number of elements allowed in the ArrayList
		 return length;
	 }
	 
	 public boolean isEmpty(){//A method to test and see if the ArrayList is empty.
		 if(length == 0)
			 return true;
		 else
			 return false;
	 }
	 public boolean isIn(Object ob){//A method to see if a particular object exists in an array.
		 for(int i = 0; i<length;i++){
			 if(list[i] == ob){//So if the for loop goes through each index and ends up finding the object within the array it will return true that it is found there.
				 return true;
			 }
				 else
					 if(list[i]!= ob)
						 return false;//Not exactly sure what happened here but I tried to do if the object is not found in the list then it returns false.
		 }
			 return false;
	 }
	 
	 public int find (Object n){// A method that will return the location of first occurrence of an Object starting from location 0
		 for(int i = 0;i<length;i++){
			 if(list[i]==n)
				 return i;
		 }//If the object is not found it will return -1 
		 return -1;
	 }
	 
	 public void remove(Object n){//A method that will remove the first occurrence of an Object starting from location 0;
		if(find(n)!=-1){
			for(int k = find(n); k<length-1;k++){
				list[k]=list[k+1];
			}
			System.out.print("The element you are trying to find and delete has not been found");//As you can see we are making it possible for users to know if the element was found
			length--;
		}
			 else
	              System.out.println("There is not an element to remove at this time");//This is just a statement to let the user know whether or not the element was there or not

	     }
	  public String toString() {//Here is the toString method that will help print out the Array that will print out in our Test Array
		  Object anArraythatwillshowup[] = new Object[size];
	        return Arrays.toString(anArraythatwillshowup);
	    }
	}
