import java.util.Scanner;

public class Average
{
	public static void main(String[]args)
	{
		Scanner k = new Scanner(System.in);
		System.out.println("What is the first number?");
		double num1 = k.nextDouble();
		System.out.println("What is the second number?");
		double num2 = k.nextDouble();
		System.out.println("What is the third number?");
		double num3 = k.nextDouble();
		print(num1, num2, num3, calcAvg(num1, num2, num3));
	}
	public static double calcAvg(double num1, double num2, double num3)
	{
		return(num1+num2+num3)/3;
	}
	public static void print(double num1, double num2, double num3, double avg)
	{
		System.out.printf("The average of %3f, %3f, and %3f is %8.5f", num1, num2, num3, avg);
	}
}