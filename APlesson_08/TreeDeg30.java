import java.util.Scanner;
public class TreeDeg30
{
	public static void main(String[]args)
	{
		Scanner k = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String a = k.next();
		int stop = a.length();
		int start = 0;
		tree(a, stop, start);
	}
	public static void tree(String a, int stop, int start)
	{
		if (start <= stop)
		{
			String format = "%" + a.length() + "s";
			System.out.printf(format+"\n",a.substring(0,start));
			start++;
			tree(a,stop,start);
		}
	}
}