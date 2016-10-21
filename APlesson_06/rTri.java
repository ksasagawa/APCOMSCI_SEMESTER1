import java.util.Scanner;
public class rTri
{
	public static void main(String[]args)
	{
		Scanner k = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String word = k.next();
		
		for(int i = word.length(); i >= 0; i--)
		{
			System.out.println(word.substring(0, i));
		}
	}
}