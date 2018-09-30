
/**
 * The automated dealer (computer) that will be playing against the person
 * via terminal
 */
public class Dealer extends Person {
    /**
     * Dealer constructor that deals the dealer two cards
     * @param  c  [the first card dealt to the dealer]
     * @param  c0 [the second card dealt to the dealer]
     *
     */
    public Dealer(Card c, Card c0) {
        super(c, c0);
    }

    /**
     * prints all cards belonging to dealer except for the first two that were
     * dealt
     */
    public void printCards() {
        for (int i = 2;i < hand.size(); i++) {
            System.out.println(hand.get(i).toString());

        }
        System.out.printf("Dealer's Visible Sum = %d\n\n", visibleSum);
    }

    /**
     * Tells the dealer he bust and that the player won via dialog
     */
    public void Bust() {
        System.out.println("Dealer Bust!\n\n");
        System.out.println("You Won!\n");

    }
    /**
     * returns a decision on what the dealer wants to do
     * @param  playerSum [the player's {@code visibleSum} ]
     * @param  dealerSum [the delaer's sum that is not seen by player]
     * @return           [description]
     */
    public int decide(int playerSum, int dealerSum) {

        if (playerSum > dealerSum) {
            //the dealer has nothing to lose
            return 1;
        }
        if (playerSum == 21) {
            //go for it
            return 1;
        }
        //Common Strategies
        if (playerSum >= 7 && playerSum <= 11 && (dealerSum == 8 ||
            (dealerSum >= 12 && dealerSum <= 16))){
            status = 1;
            return 1;
        } else if (playerSum == 11 && dealerSum == 11) {
            status = 1;
            return 1;
        } else if (playerSum == 10 && dealerSum == 10) {
            status = 1;
            return 1;
        } else if (playerSum >= 8 && playerSum <= 9 && dealerSum == 9) {
            status = 1;
            return 1;
        } else if (dealerSum >= 17) {
            status = 0;
            return 0;

        } else if (playerSum <= 6 && dealerSum >= 13) {
            status = 0;
            return 0;

        } else if (dealerSum == 20) {
            status = 0;
            return 0;
        } else {
            status = 1;
            return 1;
        }
    }
}