package week6Final;

public class Card {
	
	//Declarations of instance variables 
	String name;
	String suit; 
	int value;


	//Constructor that takes in the parameters name, suit and value
	Card(String name, String suit, int value)	{
		//Setting the instance variables to the values that were passed in 
		this.name = name;
		this.suit = suit; 
		this.value = value; 
	}

	//Getters and Setters for the instance variables
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	// Describe method -- This will print out the values that are stored in this field in this object. This will be the format in which the cards will be presented 
	public void describe()	{
		System.out.println(this.name + " of " + this.suit + " -- " + this.value);
	}
}