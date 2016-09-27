import java.util.Scanner;

public class Rectangle
{
	static double l;
	static double w; 
	static double perim;
	public static void main(String[]args)
	{
		Scanner k = new Scanner(System.in);
		System.out.println("What is the length?");
		l = k.nextDouble();
		System.out.println("What is the width?");
		w = k.nextDouble();
		calcPerim();
		print();
	}
	public static void calcPerim()
	{
		perim = (2*l)+(2*w);
	}
	public static void print()
	{
		System.out.printf("Your rectangle is %10.5f ft around.", perim);
	}
}