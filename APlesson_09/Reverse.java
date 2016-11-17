import java.util.Scanner;
public class Reverse
{
	public static void main(String[]args)
	{
		String[]names = new String[5];
		Scanner k = new Scanner(System.in);
		System.out.println("Please enter 5 words: ");
		for(int i = 0; i<names.length; i++)
			names[i] = k.next();
		System.out.println("In order...");
		for(String word : names)
			 System.out.println(word+" ");
		System.out.println("Reversed...");
		reverse(names);
	}
	public static void reverse(String[] n)
	{
		for(int i =n.length-1; i>=0; i--)
		{
			System.out.println(n[i]);
		}
	}
}