import java.util.Scanner;

public class Circle
{

	public static void main(String[]args)
	{
		Scanner k = new Scanner(System.in);
		System.out.println("What is the radius?");
		double r = k.nextDouble();
		print(r, calcArea(r));
	}
	public static double calcArea(double r)
	{
		return Math.pow(r, 2)*Math.PI;
	}
	public static void print(double r, double area)
	{
		System.out.printf("The area of a cube with radius %4.2f is %8.5f", r, area);
	}
}