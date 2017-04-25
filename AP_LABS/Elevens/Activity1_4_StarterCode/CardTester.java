/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card one = new Card();
		Card two = new Card("heart", "king", 12);
		Card three = new Card();
		System.out.println(one.rank());
		System.out.println(two.rank());
		System.out.println(three.rank());
		System.out.println(one.suit());
		System.out.println(two.suit());
		System.out.println(three.suit());
		System.out.println(one.pointValue());
		System.out.println(two.pointValue());
		System.out.println(three.pointValue());
		if(one.matches(two))
			System.out.println("True");
		if(one.matches(three))
			System.out.println("True");
		if(two.matches(three))
			System.out.println("True");
	}
}
