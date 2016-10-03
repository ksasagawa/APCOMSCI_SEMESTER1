import java.util.Scanner;

public class Rectangle
{
	public static void main(String[]args)
	{
		Scanner k = new Scanner(System.in);
		System.out.println("What is the length?");
		double l = k.nextDouble();
		System.out.println("What is the width?");
		double w = k.nextDouble();
		print(calcPerim (l, w));
	}
	public static double calcPerim(double l, double w)
	{
		 return (2*l)+(2*w);
	}
	public static void print(double perim)
	{
		System.out.printf("Your rectangle is %10.5f ft around.", perim);
	}
}