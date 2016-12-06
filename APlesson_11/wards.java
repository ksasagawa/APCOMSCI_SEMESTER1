import java.util.Scanner;
public class wards
{
	public static void main (String[]args)
	{
		Scanner k = new Scanner(System.in);
		String[][] words = new String[4][4];
		for (int i = 0; i<words.length; i++)
		{
			for (int j = 0;j<words[i].length; j++)
			{
				System.out.println("Please enter a line: ");
				words[i][j] = k.nextLine();
			}
		}
		for (int i = 0; i<words.length; i++)
		{
			for (int j = 0;j<words[i].length; j++)
			{
				System.out.print(words[i][j] + "\t");
			}
			System.out.println();
		}
	}
}