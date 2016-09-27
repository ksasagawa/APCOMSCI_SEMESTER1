import java.util.Scanner;

public class Average
{
	static double num1;
	static double num2; 
	static double num3;
	static double avg;
	public static void main(String[]args)
	{
		Scanner k = new Scanner(System.in);
		System.out.println("What is the first number?");
		num1 = k.nextDouble();
		System.out.println("What is the second number?");
		num2 = k.nextDouble();
		System.out.println("What is the third number?");
		num3 = k.nextDouble();
		calcAvg();
		print();
	}
	public static void calcAvg()
	{
		avg = (num1+num2+num3)/3;
	}
	public static void print()
	{
		System.out.printf("The average of %3f, %3f, and %3f is %8.5f", num1, num2, num3, avg);
	}
}