import java.util.Scanner;
public class Factorial
{
	public static void main(String[]args)
	{
		Scanner k = new Scanner(System.in);
		System.out.println("What is the number?");
		int number = k.nextInt();
		int factorial = 1;
		for (int i = 1; i <= number; i++)
		{
			factorial = factorial * i;
			System.out.println(factorial);
		}
	}
}