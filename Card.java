/**
 * A Card that has a rank and suit
 */
public class Card {
    private Rank rank;
    private Suit suit;


    public enum Rank {
        ONE("1",1), TWO("2",2), THREE("3",3), FOUR("4",4), FIVE("5",5),
        SIX("6",6), SEVEN("7",7), EIGHT("8",8), NINE("9",9), TEN("10",10),
        JACK("Jack",10), QUEEN("Queen",10), KING("King",10), ACE("Ace",11),
        ACEY("Ace",1);

        private String value;
        private int choice;


        //for different values of Ace
        Rank(String value, int choice){
            this.value = value;
            this.choice = choice;
        }
        /**
         * gets the value of the rank
         * @return [the value of the rank]
         */
        public String getValue() {
            return this.value;
        }

        /**
         * gives you the numerical value of the card
         * @return [the numerical value of the card]
         */
        public int getChoice() {
            return this.choice;
        }
    }


    public enum Suit {
        HEARTS("Hearts"), DIAMONDS("Diamonds"), CLUBS("Clubs"), SPADES("Spades");

        private String mySuit;

        /**
         * Suit 1 arg constructor
         */
        Suit(String mySuit) {
            this.mySuit = mySuit;
        }

        /**
         * [getSuit gets the value of the suit]
         * @return [the String value of the suit]
         */
        public String getSuit() {
            return this.mySuit;
        }
    }

    /**
     * 2 arg constructor for Card
     * @param  rank [the rank of the card]
     * @param  suit [the suit of the card]
     * @return      [description]
     */
    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * returns the enum rank of the card
     * @return [the enum Rank]
     */
    public Rank getRank() {
        return this.rank;
    }

    /**
     * returns the enum Suit of the card
     * @return [the Suit of the card]
     */
    public Suit getSuit() {
        return this.suit;
    }

    /**
     * prints out the card rank and suit
     * @return String detainling card's rank and suit
     */
    public String toString() {

        return (this.rank).getValue() + " of " + (this.suit).getSuit() +"\n";
    }

}