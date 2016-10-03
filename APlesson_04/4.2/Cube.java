import java.util.Scanner;

public class Cube
{
	static double side;
	static double sa;
	public static void main(String[]args)
	{
		Scanner k = new Scanner(System.in);
		System.out.println("What is the length of the side?");
		side = k.nextDouble();
		calcSA();
		print();
	}
	public static void calcSA()
	{
		side = Math.pow(side*6, 2);
	}
	public static void print()
	{
		System.out.printf("The surface area of a cube with %4f sides is %8.5f", side, sa);
	}
}