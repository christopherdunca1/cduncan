import java.util.Random;

public class DeckOfCards {

    private Card deck []; //This is going to make the array of the cards
    private int currentCard;  //index of next card to be dealt.
    private int CardsInTheDeck = 52;  //Constant # of cards.
    private Random RandomNums;  //random # generator.


public DeckOfCards () {

    String rank [] = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};//This is the rank of the cards in the Array

    String suit [] = {"Clubs", "Hearts", "Diamond", "Spades"}; //The suit of the cards in the array
    deck = new Card[CardsInTheDeck];  //create an array of card objects.
    currentCard = 0;  //This is setting the first card in the deck to 0 at index 0
    RandomNums = new Random(); //This is creating a random number for the 2 people


    for (int count = 0; count < deck.length; count++) {//This for loop is being used to put objects within the array

        deck[count] = new Card(rank[count % 13], suit[count / 13]);//This is going to count each card in the for loop and divide and find the modulus of those cards
    }  
}

public void shuffle() {//This is the shuffle method
    currentCard = 0; //This is going to once again start the first number at 0.
    for (int firstcard = 0; firstcard < deck.length; firstcard++) {//For loop for the first card being dealt starts at 0, the card is less than the length of the array
    	//so it will continue to choose cards and assign random numbers between 0 and 51.

        int second = RandomNums.nextInt(CardsInTheDeck);//This is going to go to the next integer for the card
        Card temp = deck[firstcard];//This is going to swap the card that is pulled with a random card.
        deck[firstcard] = deck[second];
        deck[second] = temp;
    }   
}

public Card DealACard() {
    if (currentCard < deck.length) {
        return deck[currentCard++]; //return currentCard in array.
    } else {
        return null; //if all cards are dealt.
    }
  }
}
