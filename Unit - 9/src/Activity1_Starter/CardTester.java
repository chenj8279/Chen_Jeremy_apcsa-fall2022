package Activity1_Starter;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card1 = new Card("Jack", "Clubs", 11);
		Card card2 = new Card("Jack", "Diamond", 11);
		Card card3 = new Card("Jack", "Diamond", 11);
		System.out.println(card1);
		System.out.println(card2);
		System.out.println(card3);
		System.out.println("Comapares card 1 and card 2 " + card1.matches(card2));
		System.out.println("Comapares card 2 and card 3 " + card2.matches(card3));
		System.out.println("Comapares card 3 and card 1 " + card3.matches(card1));
		
	}
}
