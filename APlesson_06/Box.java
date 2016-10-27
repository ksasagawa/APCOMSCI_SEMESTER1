import java.util.Scanner;
public class Box
{
	public static void main(String[]args)
	{
		Scanner k = new Scanner(System.in);
		System.out.println("What is the string you are trying to print?");
		String word = k.next();
		for (int i = 0; i<=word.length();i++)
		{
			System.out.println(word);
		}
	}
}