/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Deck one = new Deck();
		Deck two = new Deck();
		Deck three = new Deck();
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(one.deal());
		System.out.println(two.deal());
		System.out.println(three.deal());
	}
}
