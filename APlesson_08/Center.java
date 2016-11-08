import java.util.Scanner;
public class Center
{
	public static void main(String[]args)
	{
		Scanner k = new Scanner(System.in);
		System.out.println("Please enter three words: ");
		String a = k.next();
		String b = k.next();
		String c = k.next();
		System.out.println(makeCenter(a));
		System.out.println(makeCenter(b));
		System.out.println(makeCenter(c));
	}
	public static String makeCenter(String word)
	{
		if(word.length() >= 20)
			return word;
		else
		{
			word = " " + word + " ";
			return (makeCenter(word));
		}
	}
}