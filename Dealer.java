public class Dealer extends Person {

    public Dealer(Card c, Card c0) {
        super(c, c0);
    }

    public void printCards() {
        for (int i = 2;i < hand.size(); i++) {
            System.out.println(hand.get(i).toString());

        }
        System.out.printf("Visible Sum = %d\n", visibleSum);
    }
}