import java.util.Scanner;

public class Circle
{
	static double r;
	static double area;
	public static void main(String[]args)
	{
		Scanner k = new Scanner(System.in);
		System.out.println("What is the radius?");
		r = k.nextDouble();
		calcArea();
		print();
	}
	public static void calcArea()
	{
		area = Math.pow(r, 2)*Math.PI;
	}
	public static void print()
	{
		System.out.printf("The area of a cube with radius %4.2f is %8.5f", r, area);
	}
}