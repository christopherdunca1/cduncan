public class Card {
private String rank;
private String suit;

public Card(String Rank, String Suit) {
    rank = Rank;
    suit = Suit;

}

public String toString() {
    return rank + " of " + suit;
}
}