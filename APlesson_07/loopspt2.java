import java.util.Scanner;
public class loopspt2
{
	static String sentence;
	static int top = 0;
	public static void main(String[]args)
	{
		Scanner k = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		sentence = k.nextLine();
		while(sentence.indexOf(" ") >= 0)
		{
			sentence = sentence.substring(0, sentence.indexOf(" ")) + sentence.substring(sentence.indexOf(" ")+1);
		}
		System.out.println("Without spaces... " + sentence);
		
	}
}