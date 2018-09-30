import java.util.ArrayList;
import java.util.Scanner;
public class Person {
    public ArrayList<Card> hand;
    public int sum;
    public int visibleSum;
    public int status;


    public Person(Card c1, Card c2) {
        hand = new ArrayList<>();
        hand.add(c1);
        hand.add(c2);
        sum = c1.getRank().getChoice() + c2.getRank().getChoice();
    }

    public void hit(Card c3) {
        hand.add(c3);
        sum += c3.getRank().getChoice();
        visibleSum += c3.getRank().getChoice();
        status = 1;

    }

    public void printCards() {
        for (Card card : hand) {
            if (card.getRank().equals(Card.Rank.ACE)) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Do you want ACE to equal 1 or 11?");
                String answer = sc.nextLine();
                if (answer.equals("1")) {
                    card = new Card(Card.Rank.ACEY, card.getSuit());
                    sum += 10;
                    visibleSum += 10;
                } else {
                    continue;
                }
            } else if (card.getRank().equals(Card.Rank.ACEY)){
                Scanner sc = new Scanner(System.in);
                System.out.println("Do you want ACE to equal 1 or 11?");
                String answer = sc.nextLine();
                if (answer.equals("11")) {
                    card = new Card(Card.Rank.ACE, card.getSuit());
                    sum -= 10;
                    visibleSum -= 10;
                } else {
                    continue;
                }
            }
            System.out.println(card.toString());


        }
        System.out.printf("Visible Sum = %d\n\n", visibleSum);
        System.out.printf("Real Sum = %d\n\n", sum);


    }

    public void Bust() {
        System.out.println("You Bust!\n\n");
        System.out.println("Dealer Won");

    }



}