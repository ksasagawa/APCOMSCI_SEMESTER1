import java.util.Scanner;
public class Underscores
{
	public static void main(String[]args)
	{
		Scanner k = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		String a = k.nextLine();
		System.out.println(replace(a));
	}
	public static String replace(String a)
	{
		if (a.indexOf(" ") < 0)
			return a;
		else
		{
			a = (a.substring(0, a.indexOf(" ")) + "_" + a.substring(a.indexOf(" ")+1));
			return replace(a);
		}
	}
}
