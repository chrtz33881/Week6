package week6Final;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

				// 5. Create Game Board:
				//		Create and test a method that takes an int as a parameter (representing the
				// 			number of players for a game) and returns a Map<String, List<Card>>
				// 			that represents each player (i.e. "Player 1", "Player 2", etc..) 
				//			and their cards.
				//
				// 			The method should create a new instance of Deck, shuffle it,
				// 			and deal the cards out to the "players" in the Map.
				System.out.println("\nQuestion 5: Create Game");
				// Call your method here
				
				Map<String, List<Card>> gameBoard = new HashMap<>();
				int numberOfPlayers = 2;
				gameBoard = createGame(numberOfPlayers);
				
				System.out.println("------------------------------------");
				for(int i = 1; i <= numberOfPlayers; i++)	{
					String playerName = "Player " + i;
					System.out.println(playerName + "\n---------------------------");
					List<Card> playerList = gameBoard.get(playerName);
					for(Card handCard : playerList)	{
						handCard.describe();
					}
					System.out.println("------------------------------------");
				}


	}
	
	//Method 5:
	
	public static Map<String, List<Card>> createGame(int numOfPlayers)	{
		Map<String, List<Card>> finalGameBoard = new HashMap<>();
		
		Deck deck = new Deck();
		deck.shuffle();
		System.out.println("Deck has" + deck.getCards().size() + "cards!");
		
		for(int i = 1; i <= numOfPlayers; i++)	{
			List<Card> playerList = new ArrayList<>();
			String playerName = "Player " + i;
			finalGameBoard.put(playerName, playerList);
		}
		
		for (int i = 0; i < 52/numOfPlayers; i++)	{
			for (int j = 1; j <= numOfPlayers; j++)	{
				String playerName = "Player " + j;
				List<Card> playerList = finalGameBoard.get(playerName);
				playerList.add(deck.draw());
				finalGameBoard.put(playerName, playerList);
			}
		}
		
		if(52%numOfPlayers != 0)	{
			System.out.println("With " + numOfPlayers + " players --");
			System.out.println("Cards left in deck:" + 52%numOfPlayers);
		} else {
			System.out.println("All cards have been dealt!");
		}
		
		return finalGameBoard;
	}


}
