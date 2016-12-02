import java.util.Scanner;
public class While_loops
{
	static int number;
	static int digits =0;
	public static void main(String[]args)
	{
		Scanner k = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		number = k.nextInt();
		countDigits();
		System.out.println(number + " has " + digits + " digits.");
	}
	public static void countDigits()
	{
		int num = number;
		while (num > 0)
		{
			digits += 1;
			num /= 10;
		}
	}
}