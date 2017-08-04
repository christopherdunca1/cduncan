/**This program is going to Prompt the user to input a random number that will be put into the Big O notation and calculated through
 * the array list that was made. The input will in turn work with the array list that has been initialized to use a for loop that will put
 * random values within the array list. Finally, we will start the clock, and sort the array list. After this is done we will stop the clock and print
 * out the calculations for the user to see.
* @author  Christopher Duncan
* @since   2017-03-31
*/
import java.util.*;
public class Labquiz3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /**Here is the user input portion*/
        System.out.print("Please enter a Random Number : ");
        /**This is going to use the user input and ask for the next integer to be entered in unison with the scanner.*/
        int a = input.nextInt();
        Random RandomInput = new Random();
        /**Here we are creating the ArrayList*/
        ArrayList<Integer>list=new ArrayList<Integer>();
        /**Here is the for loop putting all the random values within the array*/
        for(int i =0; i < a; i++){
            int num = RandomInput.nextInt(a)+1;
            list.add(num);
        }
        for(int k: list)
            System.out.print(k+ ",");
        		System.out.println();
        /**This Is Going to Start The Clock*/
        long ThisIsGoingToStartTime = System.nanoTime();
        /**Here is the Collections.sort that will sort the ArrayList*/
        Collections.sort(list);
        /**This Is Going to Stop The Clock*/
        long ThisIsGoingToEndTime=System.nanoTime();
        /**Here is the print statement that the user will see after the calculations occur*/
        long elapsedtime = ThisIsGoingToEndTime - ThisIsGoingToStartTime;
        System.out.println("It took it approximately:  " + (ThisIsGoingToEndTime - ThisIsGoingToStartTime) + " Nano-seconds");
        double TimeSeconds = (double)elapsedtime/1000000000.0;
        System.out.println("It took it approximately:  " + TimeSeconds + " seconds");
    }
}
