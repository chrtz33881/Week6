package week6Final;

public class App {
    public static void main(String[] args) {
        // Instantiate a Deck and two Players
        Deck deck = new Deck();
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        // Call the shuffle method on the deck
        deck.shuffle();

        // Draw cards for both players using a traditional for loop
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
        }

        // Flip cards for both players using a traditional for loop
        for (int i = 0; i < 26; i++) {
            Card card1 = player1.flip();
            Card card2 = player2.flip();

            // Compare the values of the two cards and call the incrementScore method on the player with the higher card
            if (card1.getValue() > card2.getValue()) {
                player1.incrementScore();
            } else if (card1.getValue() < card2.getValue()) {
                player2.incrementScore();
            }
        }

        // Compare the final scores of both players
        int score1 = player1.getScore();
        int score2 = player2.getScore();

        // Print the final scores and the winner or if it's a draw
        System.out.println(player1.getName() + "'s score: " + score1);
        System.out.println(player2.getName() + "'s score: " + score2);
        
        if (score1 > score2) {
            System.out.println(player1.getName() + " wins!");
        } else if (score1 < score2) {
            System.out.println(player2.getName() + " wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}