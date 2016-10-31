import java.util.Scanner;
public class digitadder
{
	static int number;
	static int sum;
	static int num;
	public static void main(String[]ars)
	{
		Scanner k = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		number = k.nextInt();
		sum = 0;
		num = number;
		sumDigits();
		System.out.println("The sum of the digits in " + number +" is " + sum);
	}
	public static void sumDigits()
	{
		while(num > 0)
		{
			sum += (num % 10);
			num /= 10;
		}
	}
}