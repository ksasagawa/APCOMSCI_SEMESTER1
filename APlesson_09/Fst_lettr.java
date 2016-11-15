import java.util.Scanner;
public class Fst_lettr
{
	public static void main(String[]args)
	{
		String[]words = new String[5];
		Scanner k = new Scanner(System.in);
		System.out.println("Please enter 5 words: ");
		for(int i = 0; i<words.length; i++)
			words[i] = k.next();
		first(words);
	}
	public static void first(String[] w)
	{
		for (String word : w)
			System.out.println(word.substring(0,1));
	}
}