import java.util.Scanner;
public class reverseNumber
{
	static int number;
	static int num;
	static int rev;
	public static void main(String[]ars)
	{
		Scanner k = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		number = k.nextInt();
		rev = 0;
		num = number;
		getReverse();
		System.out.println( number +" reversed is " + rev);
	}
	public static void getReverse()
	{
		while(num > 0)
		{
			rev *= 10;
			rev += (num%10);
			num /= 10;
		}
	}
}