import java.util.Random;

public class CardsGame {
public static void main(String[] args) {

    DeckOfCards TheDeck = new DeckOfCards();

    TheDeck.shuffle(); //This is going to shuffle the cards in the deck
//This is the for loop that is going to take a card from the deck as you can see there is 5 so it starts at 0 and gives it a random numbers
       for (int i = 0; i < 5; i++) {
           TheDeck.DealACard();//This is the object itself
           System.out.println("Time to deal a Card: " + TheDeck.DealACard()); //This is going to print out the statement and deal a card with the value of 0 and index 0 and give us a random number
           System.out.println();
           System.out.println("This is the second time:" +TheDeck.DealACard());
       }
   }
}

 
