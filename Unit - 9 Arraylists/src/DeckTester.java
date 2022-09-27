
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String ranks[] = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String suits[] = {"Diamond", "Clubs", "Hearts", "Spades"};
		int[] pointValues = {10, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10}; 
		Deck d = new Deck(ranks, suits, pointValues);
		System.out.println(d);
	}
}
