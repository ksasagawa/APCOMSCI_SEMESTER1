import java.util.Random;
public class Dice_roll
{
	public static void main (String[]args)
	{
		Random rand = new Random();
		int pRoll = rand.nextInt(6)+1;
		int cRoll = rand.nextInt(6)+1;
		String winner = rollDice(pRoll, cRoll);
		System.out.println("You rolled a " + pRoll);
		System.out.println("The compuer rolled a " + cRoll);
		System.out.println("The winner is " + winner);
	}
	public static String rollDice(int pr, int cr)
	{
		if (pr > cr)
		{
			return "You!";
		}
		else
		{
			return "The Computer!";
		}
	}
//	public static String rollDice2(int pr, int cr)
//	{
//		if (pr > cr)
//		{
//			return "You!";
//		}
//		if (pr < cr)
//		{
//			return "Computer!";
//		}
//	}
}