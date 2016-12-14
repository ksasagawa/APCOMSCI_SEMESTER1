import java.util.Scanner;
import java.util.Arrays;
public class GameGun
{
	public static int shotOn;
	//public static int HEALTHLOAD = 6;
	//public static int healthCount;
	public static int bulletCount;
	public static int CLIPSIZE = 16;
	public static int shotCount;
	public static String[] clip;
	//public static String[] health;
	public static void main (String[]args)
	{
		Scanner k = new Scanner(System.in);
		bulletCount = 96;
		shotCount = 0;
		shotOn = 0;
		clip = new String[CLIPSIZE];
		resetClip();
		//int damage = 0;
		//String turn = "";
		//int amount = 0;
		//healthCount = 6;
		//health = new String[HEALTHLOAD];
		
		//while (!turn.equals("Q") && healthCount > 0)
		//{
	//		System.out.println("Your turn! Hit enter when ready: ");
	//		turn = k.next();
	//		damage = (int)(Math.random()*2+1);
	//		amount = (int)(Math.random()*6+1);
	//		printClip();
	//	}
		while(bulletCount > 0 || shotCount > 0)
		{
			System.out.println("Action: ");
			String action = k.next();
			if (action.equals("R") || action.equals("r"))
			{
				reload();
				System.out.println(printClip());
			}
			else if (action.equals("s")|| action.equals("S"))
			{
				System.out.println(shoot());
				System.out.println(printClip());
			}
		}
		System.out.println(printClip());
	}
	public static void resetClip()
	{
		for (int i = 0; i<clip.length;i++)
			clip[i] = "[]";
	}
	public static String shoot()
	{
		if (shotCount > 0)
		{
			clip[shotOn] = "[]";
			shotCount--;
			shotOn++;
			return("Boom");
		}
		else 
			return("Reload!!!");
	}
	public static void reload()
	{
		if(bulletCount >= CLIPSIZE)
		{
			bulletCount = bulletCount - CLIPSIZE;
			shotCount = CLIPSIZE;
			shotOn = 0;
		}
		else
		{
			shotCount = bulletCount;
			bulletCount = 0;
			shotOn = 0;
		}
		resetClip();
		for(int i = shotCount; i>0;i--)
			clip[i-1] = " * ";
	}
	public static String printClip()
	{
		String output = "";
		output = "Bullets\t" + bulletCount + "\nClip:\t";
		for (int i = 0; i<CLIPSIZE; i++)
			output= output + clip[i];
		return output;
	}
}