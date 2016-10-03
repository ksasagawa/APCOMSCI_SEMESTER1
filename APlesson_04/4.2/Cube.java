import java.util.Scanner;

public class Cube
{
	public static void main(String[]args)
	{
		Scanner k = new Scanner(System.in);
		System.out.println("What is the length of the side?");
		double side = k.nextDouble();
		print(side, calcSA(side));
	}
	public static double calcSA(double side)
	{
		return Math.pow(side*6, 2);
	}
	public static void print(double side, double sa)
	{
		System.out.printf("The surface area of a cube with %4f sides is %8.5f", side, sa);
	}
}