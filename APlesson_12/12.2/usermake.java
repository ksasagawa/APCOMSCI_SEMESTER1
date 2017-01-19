import java.util.Scanner;
public class usermake
{
	public static void main(String[]args)
	{
		Scanner k = new Scanner(System.in);
		System.out.println("Would you like to use a pubic avatar? (y/n)");
		if (k.next().equals("n"))
		{
			user pH = new user("Professor", "Handsome");
			System.out.println(pH);
		}
		else
		{
			user pH2 = new user("Professor", "Handsome", "profHansizzle");
			System.out.println(pH2);
		}
	}
}