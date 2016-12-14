import java.util.Scanner;
public class Hthver
{
	public static int HEALTHLOAD = 6;
	public static int healthCount;
	public static String[] health;
	public static void main (String[]args)
	{
		Scanner k = new Scanner(System.in);
		int damage = 0;
		String turn = "";
		int amount = 0;
		healthCount = 6;
		health = new String[HEALTHLOAD];
		while (!turn.equals("Q") && healthCount > 0)
		{
			System.out.println("Your turn! Hit enter when ready: ");
			turn = k.next();
			damage = (int)(Math.random()*2)+1;
			amount = (int)(Math.random()*6)+1;
			System.out.println(takeDamage(damage, amount));
			printClip();
		}
		System.out.println("You Died.");
	}
	public static String takeDamage(int dmg, int amt)
	{
		if (dmg == 1)
		{
			healthCount =healthCount -amt;
			return "Taking "  + amt + " damage";
		}
		else
		{
			if(healthCount + amt < HEALTHLOAD)
			{
				healthCount =healthCount + amt;
			}
			else
				healthCount = HEALTHLOAD;
		}
		return "Power Up " + amt;
	}
	public static void printClip()
	{
		String output = "Health:\t";
		for (int i = HEALTHLOAD; i>0;i--)
		{
			if (i > healthCount)
				health[i-1] = "[]";
			else
				health[i-1] = " @ ";
			output = output + health[i-1];
		}
		System.out.println(output);
	}
}