public class ThisistheDeck {//This is the deck Class for the cards names and suits
	//Once again I did not copy code!! I am super grateful for a second chance thank you and I hope i did better than last time I am sorry for before.
	public String suit;
	public String name;
	public int ranks;
  
    public ThisistheDeck(int ranks, String name, String suit) {
        this.name = name;
        this.suit = suit;
        this.ranks = ranks;
    }
    public String toString() {
    	  if (name == null) {
              return this.ranks + " of  " + this.suit;
          } else if (ranks == 0) {
              return this.name + " of " + this.suit;
          }
		return name;
    }
}

