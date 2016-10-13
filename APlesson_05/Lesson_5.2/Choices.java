import java.util.Scanner;
public class Choices
{
	public static void main(String[]args)
	{
		Scanner k = new Scanner(System.in);
		System.out.println("Would you like to..." +
							"\n 1. Do a Math Problem"+
							"\n 2. Answer a question");
		int mathOrWords = k.nextInt();
		if(mathOrWords == 1)
		{
			System.out.println("What is 2*2? ");
			int mathAnswer = k.nextInt();
			if(mathAnswer == 4)
				System.out.println("Correct");
			else
				System.out.println("Incorrect");
		}
		else
		{
			System.out.println("Who said the phrase \"Whatever you are, be a good one.\"?");
			k.nextLine();
			String wordAnser = k.nextLine();
			if(wordAnser.equals("Abraham Lincoln") || wordAnser.equals("abraham lincoln"))
				System.out.println("Correct");
			else
				System.out.println("Incorrect");
		}
	}
}