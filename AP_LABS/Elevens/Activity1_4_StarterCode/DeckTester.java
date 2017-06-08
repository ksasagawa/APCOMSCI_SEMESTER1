/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = new String[]{"ace","king","queen","jack","10","9","8","7","6","5","4","3","2"};
		String[] suits = new String[]{"Hearts","Spades","Clubs","Diamonds"};
		int[] values = new int[]{11,10,10,10,10,9,8,7,6,5,4,3,2};
		Deck play = new Deck(ranks,suits,values);
		play.deal();
		System.out.println(play);
	}
}
