import java.util.Scanner;
public class Seven
{
	public static void main(String[]args)
	{
		Scanner k = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = k.nextInt();
		System.out.println(luck(a));
	}
	public static int luck(int a)
	{
		if(a > 0)
		{
			if (a % 10 == 7)
				return 1 + luck(a/10);
			else
				return 0 + luck(a/10);
		}
		else
			return 0;
	}
}