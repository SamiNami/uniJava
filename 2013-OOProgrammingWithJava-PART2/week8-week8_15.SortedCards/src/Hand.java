
import java.util.ArrayList;
import java.util.*;

public class Hand implements Comparable<Hand> {

    private ArrayList<Card> hand = new ArrayList<Card>();

    public void add(Card card) {
        hand.add(card);
    }

    public void print() {

        for (Card card : hand) {
            System.out.println(card);
        }
    }

    public void sort() {
        Collections.sort(hand);
    }

    @Override
    public int compareTo(Hand other) {
        int thisSum = 0;
        int otherSum = 0;

        for (Card card : this.hand) {
            thisSum += card.getValue();
        }

        for (Card card : other.hand) {
            otherSum += card.getValue();
        }

        return thisSum - otherSum;

    }

    public void sortAgainstSuit() {

        SortAgainstSuitAndValue suitSorter = new SortAgainstSuitAndValue();
        Collections.sort(this.hand, suitSorter);

    }

}
