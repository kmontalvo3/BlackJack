import java.util.Random;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;


public class Main {


    final static Card h1 = new Card(Card.Rank.ONE, Card.Suit.HEARTS);
    final static Card h2 = new Card(Card.Rank.TWO, Card.Suit.HEARTS);
    final static Card h3 = new Card(Card.Rank.THREE, Card.Suit.HEARTS);
    final static Card h4 = new Card(Card.Rank.FOUR, Card.Suit.HEARTS);
    final static Card h5 = new Card(Card.Rank.FIVE, Card.Suit.HEARTS);
    final static Card h6 = new Card(Card.Rank.SIX, Card.Suit.HEARTS);
    final static Card h7 = new Card(Card.Rank.SEVEN, Card.Suit.HEARTS);
    final static Card h8 = new Card(Card.Rank.EIGHT, Card.Suit.HEARTS);
    final static Card h9 = new Card(Card.Rank.NINE, Card.Suit.HEARTS);
    final static Card h10 = new Card(Card.Rank.TEN, Card.Suit.HEARTS);
    final static Card h11 = new Card(Card.Rank.JACK, Card.Suit.HEARTS);
    final static Card h12 = new Card(Card.Rank.QUEEN, Card.Suit.HEARTS);
    final static Card h13 = new Card(Card.Rank.KING, Card.Suit.HEARTS);
    final static Card h14 = new Card(Card.Rank.ACE, Card.Suit.HEARTS);

    final static Card d1 = new Card(Card.Rank.ONE, Card.Suit.DIAMONDS);
    final static Card d2 = new Card(Card.Rank.TWO, Card.Suit.DIAMONDS);
    final static Card d3 = new Card(Card.Rank.THREE, Card.Suit.DIAMONDS);
    final static Card d4 = new Card(Card.Rank.FOUR, Card.Suit.DIAMONDS);
    final static Card d5 = new Card(Card.Rank.FIVE, Card.Suit.DIAMONDS);
    final static Card d6 = new Card(Card.Rank.SIX, Card.Suit.DIAMONDS);
    final static Card d7 = new Card(Card.Rank.SEVEN, Card.Suit.DIAMONDS);
    final static Card d8 = new Card(Card.Rank.EIGHT, Card.Suit.DIAMONDS);
    final static Card d9 = new Card(Card.Rank.NINE, Card.Suit.DIAMONDS);
    final static Card d10 = new Card(Card.Rank.TEN, Card.Suit.DIAMONDS);
    final static Card d11 = new Card(Card.Rank.JACK, Card.Suit.DIAMONDS);
    final static Card d12 = new Card(Card.Rank.QUEEN, Card.Suit.DIAMONDS);
    final static Card d13 = new Card(Card.Rank.KING, Card.Suit.DIAMONDS);
    final static Card d14 = new Card(Card.Rank.ACE, Card.Suit.DIAMONDS);

    final static Card c1 = new Card(Card.Rank.ONE, Card.Suit.CLUBS);
    final static Card c2 = new Card(Card.Rank.TWO, Card.Suit.CLUBS);
    final static Card c3 = new Card(Card.Rank.THREE, Card.Suit.CLUBS);
    final static Card c4 = new Card(Card.Rank.FOUR, Card.Suit.CLUBS);
    final static Card c5 = new Card(Card.Rank.FIVE, Card.Suit.CLUBS);
    final static Card c6 = new Card(Card.Rank.SIX, Card.Suit.CLUBS);
    final static Card c7 = new Card(Card.Rank.SEVEN, Card.Suit.CLUBS);
    final static Card c8 = new Card(Card.Rank.EIGHT, Card.Suit.CLUBS);
    final static Card c9 = new Card(Card.Rank.NINE, Card.Suit.CLUBS);
    final static Card c10 = new Card(Card.Rank.TEN, Card.Suit.CLUBS);
    final static Card c11 = new Card(Card.Rank.JACK, Card.Suit.CLUBS);
    final static Card c12 = new Card(Card.Rank.QUEEN, Card.Suit.CLUBS);
    final static Card c13 = new Card(Card.Rank.KING, Card.Suit.CLUBS);
    final static Card c14 = new Card(Card.Rank.ACE, Card.Suit.CLUBS);

    final static Card s1 = new Card(Card.Rank.ONE, Card.Suit.SPADES);
    final static Card s2 = new Card(Card.Rank.TWO, Card.Suit.SPADES);
    final static Card s3 = new Card(Card.Rank.THREE, Card.Suit.SPADES);
    final static Card s4 = new Card(Card.Rank.FOUR, Card.Suit.SPADES);
    final static Card s5 = new Card(Card.Rank.FIVE, Card.Suit.SPADES);
    final static Card s6 = new Card(Card.Rank.SIX, Card.Suit.SPADES);
    final static Card s7 = new Card(Card.Rank.SEVEN, Card.Suit.SPADES);
    final static Card s8 = new Card(Card.Rank.EIGHT, Card.Suit.SPADES);
    final static Card s9 = new Card(Card.Rank.NINE, Card.Suit.SPADES);
    final static Card s10 = new Card(Card.Rank.TEN, Card.Suit.SPADES);
    final static Card s11 = new Card(Card.Rank.JACK, Card.Suit.SPADES);
    final static Card s12 = new Card(Card.Rank.QUEEN, Card.Suit.SPADES);
    final static Card s13 = new Card(Card.Rank.KING, Card.Suit.SPADES);
    final static Card s14 = new Card(Card.Rank.ACE, Card.Suit.SPADES);

    public static void main(String[] args) {

        //Setup
        ArrayList<Card> deck = new ArrayList<>();
        Card[] deckOfCards = {h1, h2, h3, h4, h5, h6, h7, h8, h9, h10,
            h11, h12, h13, h14, d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11,
            d12, d13, d14, c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13,
            c14, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14};

        for (Card c : deckOfCards) {
            deck.add(c);
        }


        Scanner sc = new Scanner(System.in);
        System.out.println("Are you ready to play Black Jack? (Y/N)");
        String answer = sc.nextLine();
        if (answer == "N") {
            System.exit(0);
        }

        //start playing
        System.out.println("Your goal is to beat the dealer or hit 21");
        System.out.println("Dealing cards to Dealer...");
        Collections.shuffle(deck); // shuffling the deck
        //remove four cards from deck
        Card c1 = deck.remove(deck.size() - 1);
        Card c2 = deck.remove(deck.size() - 1);
        Card c3 = deck.remove(deck.size() - 1);
        Card c4 = deck.remove(deck.size() - 1);

        //pop from back (stack implemented by arraylist)
        Person dealer = new Dealer(c1, c2);
        Person player = new Person(c3, c4);

        System.out.println("Cards dealt\n\n");

        System.out.println("Your cards are:");
        player.printCards();
        System.out.println();
        System.out.println();

        System.out.println("The dealer's visible cards are:");
        dealer.printCards();
        System.out.println();
        System.out.println();

        while (player.sum <= 21 && dealer.sum <= 21) {

        }

    }

    public void hitOrStand() {
        System.out.println("Hit or Stand? (H/S)");

    }
}