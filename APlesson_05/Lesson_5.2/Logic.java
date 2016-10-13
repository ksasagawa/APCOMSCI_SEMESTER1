import java.util.Scanner;
public class Logic{
	static Scanner k;
	public static void main(String[]args)
	{
		k = new Scanner(System.in);
		//boolean a = true;
		//boolean b = false;
		//System.out.println(a&&b);
		//System.out.println(a||b);
		//System.out.println(!(a&&b));
		checkNum();
	}
	public static void checkNum()
	{
		System.out.println("Pick a number between 1 and 10");
		int guess = k.nextInt();
		int number = (int)(Math.random()*10)+1;
		System.out.println("The number is " + number);
		if (guess >= 1 && guess <= 10)
		{
			if (guess == number)
				System.out.println("The number is right!");
			else
				System.out.println("The number is wrong!");
		}
		else{
			System.out.println("Make is a 1-10 please");
			checkNum();
		}
	}
}