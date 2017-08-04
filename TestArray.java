import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;
//I did not copy code!!! I listened and I tried my best please enjoy! And thank you for the second chance I hope i did it the best I could.
public class TestArray {

    public static void main(String args[]) throws Exception{
    	
        ArrayList<ThisistheDeck> NewDeckofCards = new ArrayList<>(52);//Right here we are creating my array list of 52 cards
        
        NewDeckofCards.add(new ThisistheDeck(0, "The Ace", "Clubs"));
        for (int i = 2; i <= 10; i++) {//This is just a for loop that prints out the cards so it starts at 2 so when it prints it will
        	//be like 2 of clubs then 3 of clubs. There is no 1 of clubs thats why you see it starts at 2
        NewDeckofCards.add(new ThisistheDeck(i, null, "Clubs"));}
        NewDeckofCards.add(new ThisistheDeck(0, "The Jack", "Clubs"));
        NewDeckofCards.add(new ThisistheDeck(0, "The Queen", "Clubs"));
        NewDeckofCards.add(new ThisistheDeck(0, "The King", "Clubs"));
  
        NewDeckofCards.add(new ThisistheDeck(0, "Ace", "Spades"));
        for (int i = 2; i <= 10; i++) {
        NewDeckofCards.add(new ThisistheDeck(i, null, "Spade"));}
        NewDeckofCards.add(new ThisistheDeck(0, "The Jack", "Spade"));
        NewDeckofCards.add(new ThisistheDeck(0, "The Queen", "Spade"));
        NewDeckofCards.add(new ThisistheDeck(0, "The King", "Spade"));


        NewDeckofCards.add(new ThisistheDeck(0, "The Ace", "Diamond"));
        for (int i = 2; i <= 10; i++) {
        NewDeckofCards.add(new ThisistheDeck(i, null, "Diamond"));}
        NewDeckofCards.add(new ThisistheDeck(0, "The Jack", "Diamond"));
        NewDeckofCards.add(new ThisistheDeck(0, "The Queen", "Diamond"));
        NewDeckofCards.add(new ThisistheDeck(0, "The King", "Diamond"));
        
        NewDeckofCards.add(new ThisistheDeck(0, "The King", "Hearts"));
        NewDeckofCards.add(new ThisistheDeck(0, "The Ace", "Hearts"));
        for (int i = 2; i <= 10; i++) {
        NewDeckofCards.add(new ThisistheDeck(i, null, "Hearts"));}
        NewDeckofCards.add(new ThisistheDeck(0, "The Jack", "Hearts"));
        NewDeckofCards.add(new ThisistheDeck(0, "The Queen", "Hearts"));

        System.out.println("Here is the the regular deck:"+NewDeckofCards.toString());//This is printing the deck first
        shuffleDeck(NewDeckofCards);
        System.out.println("The next step is the shuffling");
        System.out.println("Here is the shuffled deck: " + NewDeckofCards.toString());//This prints out our shuffled deck

    }

    private static void shuffleDeck(ArrayList<ThisistheDeck> NewDeckofCards) throws Exception {
        Random random = ThreadLocalRandom.current();
        
        for (int i = NewDeckofCards.size() - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            
            ThisistheDeck First = (ThisistheDeck) NewDeckofCards.get(index);
            NewDeckofCards.add(index, NewDeckofCards.get(i));
            NewDeckofCards.add(i, First);
        }
    }
}