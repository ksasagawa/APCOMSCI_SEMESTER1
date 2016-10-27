import java.util.Scanner;
public class Factorial
{
	public static void main(String[]args)
	{
		Scanner k = new Scanner(System.in);
		System.out.println("What is the number?");
		int number = k.nextInt();
		int factorial = number;
		for (int i = 1; i <= factorial; i++)
		{
			number = number*i;
			System.out.println(number);
		}
	}
}