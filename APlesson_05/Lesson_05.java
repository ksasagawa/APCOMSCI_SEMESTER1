import java.util.Random;
public class Lesson_05
{
	public static void main (String[]args)
	{
		if (tOrF())
		{
			System.out.println("It is true!");
		}
		
		if (!tOrF())
		{
			System.out.println("It is false!");
		}
		random2();
	}
	public static boolean tOrF()
	{
		return 8>=8;
	}
	
	
	
	
	
	
	public static void random1()
	{
		int num = (int) (Math.random()*101);
		System.out.println(num);
	}
	public static void random2()
	{
		Random rand = new Random();
		int num = rand.nextInt(3);
		System.out.println(num);
	}
}