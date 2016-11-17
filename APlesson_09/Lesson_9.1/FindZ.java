import java.util.Scanner;
public class FindZ
{
	public static void main(String[]args)
	{
		String[]words = new String[5];
		fillArray(words);
		System.out.print("For the words ");
		printArray(words);
		System.out.println("Only "+hasZs(words)+" contain the letter z");
	}
	public static void fillArray(String[] w)
	{
		Scanner a = new Scanner(System.in);
		System.out.println("Enter 5 words");
		for (int i =0; i<w.length;i++)
		{
			w[i] = a.next();
		}
	}
	public static void printArray(String[] w)
	{
		for (String word : w)
			System.out.println(word + "\t");
	}
	public static String hasZs(String[] w)
	{
		String zs = "";
		for (String word : w)
		{
			if(word.indexOf("z") >= 0)
			{
				zs += (word+"\t");
			}
		}
		return zs;
	}
	
}