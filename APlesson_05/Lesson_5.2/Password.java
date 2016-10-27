import java.util.Scanner;
public class Password
{
	static Scanner k;
	static String user = "Kas";
	static String pass = "Sas";
	public static void main(String[]args)
	{
		k = new  Scanner(System.in);
		passCheck();
	}
	public static void passCheck()
	{
		System.out.println("What is your username?");
		String userin = k.nextLine();
		System.out.println("What is your password?");
		String passin = k.nextLine();
		if (userin.equals(user)|| passin.equals(pass))
		{
			if (userin.equals(user) && passin.equals(pass))
				System.out.println("You are granted access!");
			else if (userin.equals(user))
				System.out.println("Your password is incorrect");
			else
				System.out.println("Your username is incorrect");
		}
		else
		{
			System.out.println("Your username and password are incorrect!");
			passCheck();
		}
	}
}