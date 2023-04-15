package week6Final;

import java.util.ArrayList;
import java.util.List;

public class Player {
    
    // Fields
    private List<Card> hand;
    private int score;
    private String name;
    
    // Constructor
    public Player(String name) {
        this.hand = new ArrayList<Card>();
        this.score = 0;
        this.name = name;
    }
    
    // Methods
    
    /**
     * Prints out information about the player and calls the describe method for each card in the Hand List.
     */
    public void describe() {
        System.out.println("Player: " + this.name);
        System.out.println("Score: " + this.score);
        System.out.println("Hand:");
        for (Card card : this.hand) {
            card.describe();
        }
    }
    
    /**
     * Removes and returns the top card of the Hand.
     * @return The top card of the Hand.
     */
    public Card flip() {
        return this.hand.remove(0);
    }
    
    /**
     * Takes a Deck as an argument and calls the draw method on the deck, 
     * adding the returned Card to the hand field.
     * @param deck The deck from which the card will be drawn.
     */
    public void draw(Deck deck) {
        Card card = deck.draw();
        this.hand.add(card);
    }
    
    /**
     * Adds 1 to the Player’s score field.
     */
    public void incrementScore() {
        this.score++;
    }
    
    /*
     * Gets accumulated score
     */
	public int getScore() {
		// TODO Auto-generated method stub
		return score;
	}
	
	/*
	 * Grabs player names
	 */

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}