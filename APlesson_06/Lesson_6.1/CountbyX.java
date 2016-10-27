import java.util.Scanner;
public class CountbyX
{
	public static void main(String[]args)
	{
		Scanner k = new Scanner(System.in);
		System.out.println("Please enter the end number: ");
		int countTo = k.nextInt();
		System.out.println("Please enter the added number");
		int x = k.nextInt();
		
		for(int fin = x; fin <= countTo; fin+=x)
		{
			System.out.printf(fin+"\t");
		}
	}
}