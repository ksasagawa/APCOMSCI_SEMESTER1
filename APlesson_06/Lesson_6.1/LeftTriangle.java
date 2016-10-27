import java.util.Scanner;
public class LeftTriangle
{
	public static void main(String[]args)
	{
		Scanner k = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String word = k.next();
		
		for(int i = 0; i <= word.length(); i++)
		{
			System.out.println(word.substring(i,word.length()));
		}
	}
}