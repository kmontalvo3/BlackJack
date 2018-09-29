public class Card {
    private Rank rank;
    private Suit suit;

    public enum Rank {
        ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10),
        JACK(10), QUEEN(10), KING(10), ACE(11), ACEY(1);

        private int value;

        Rank(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum Suit {
        HEARTS("Hearts"), DIAMONDS("Diamonds"), CLUBS("Clubs"), SPADES("Spades");

        private String mySuit;

        Suit(String mySuit) {
            this.mySuit = mySuit;
        }

        public String getSuit() {
            return this.mySuit;
        }
    }


    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return this.rank;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public String toString() {
        return (this.rank).getValue() + " of " + (this.suit).getSuit() +"\n";
    }

}