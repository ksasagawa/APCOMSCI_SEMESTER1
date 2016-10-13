import java.util.Scanner;
public class YoN
{
	static Scanner k;
	public static void main(String[]args)
	{
		k= new Scanner(System.in);
		recursion();
	}
	public static void recursion()
	{
		System.out.println("would you like to do some recusion?");
		String choice = k.next();
		if (choice.equals("Y")||choice.equals("N"))
		{
			if (choice.equals("Y"))
				System.out.println("Yay, lets do some recursion!");
			else 
				System.out.println("aww");
		}
		else
		{
			System.out.println("Please enter Y or N");
			recursion();
		}
	}
}