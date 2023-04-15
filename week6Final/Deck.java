package week6Final;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    // Fields
    private List<Card> cards;

    // Constructor
    public Deck() {
        this.cards = new ArrayList<Card>();

        // Create cards and add them to the deck
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        for (String suit : suits) {
            for (int i = 2; i <= 14; i++) {
                String name = "";
                int value = i;
                if (i == 11) {
                    name = "Jack";
                } else if (i == 12) {
                    name = "Queen";
                } else if (i == 13) {
                    name = "King";
                } else if (i == 14) {
                    name = "Ace";
                    value = 11;
                } else {
                    name = Integer.toString(i);
                }
                Card card = new Card(name, suit, value);
                this.cards.add(card);
            }
        }
    }

    // Methods

    /**
     * Shuffles the cards in the deck.
     */
    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    /**
     * Removes and returns the top card of the deck.
     * @return The top card of the deck.
     */
    public Card draw() {
        return this.cards.remove(0);
    }

    /**
     * Returns the number of cards left in the deck.
     * @return The number of cards left in the deck.
     */
    public int cardsLeft() {
        return this.cards.size();
    }

    /**
     * Returns the list of cards in the deck.
     * @return The list of cards in the deck.
     */
    public List<Card> getCards() {
        return this.cards;
    }

}
