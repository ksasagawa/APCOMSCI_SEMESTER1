import java.util.Scanner;
public class AverageDigits
{
	static int number;
	static int digits;
	static double average;
	public static void main(String[]ars)
	{
		Scanner k = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		number = k.nextInt();
		digits = 0;
		average = 0;
		averageDigits();
		System.out.println("The average of the digits in " + number + " is " + average/digits);
	}
	public static void averageDigits()
	{
		int num = number;
		while(num > 0)
		{
			digits += 1;
			average += (num % 10);
			num /= 10;
		}
	}
}