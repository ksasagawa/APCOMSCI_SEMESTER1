import java.util.Scanner;

public class Lab_03_pt3
{
	public static void main (String[]args)
	{
		Scanner k = new Scanner (System.in);
		System.out.println("What is the radius? ");
		int r = k.nextInt();
		System.out.println("What is the height? ");
		int h = k.nextInt();
		int pi = 3;
		long SFA = 2 * pi * r * h + 2 * pi * (r^2);
		System.out.println("The surface area is " + SFA);
	}
}