import java.util.Scanner;

public class Compund_Interest
{
	public static void main (String[]args)
	{
		Compund_Interest ci = new Compund_Interest();
		Compund_Interest mci = new Compund_Interest();
		Scanner k = new Scanner(System.in);
		System.out.println("What is the intrest rate?");
		double rate = k.nextDouble();
		System.out.println("What is the principal?");
		double principal = k.nextDouble();
		System.out.println("How many times is the loan compounded annually?");
		double number = k.nextDouble();
		System.out.println("How long is the loan going to last in years?");
		double time = k.nextDouble();
		double monthly_amount = mci.monthly(principal, rate, number, time);
		double amount = ci.Final(principal, rate, number, time);
		System.out.printf("%15.2f Is your loan amount", amount);
		System.out.printf("\n%15.2f Is your monthly loan amount", monthly_amount);
		
	}
	public double Final (double p, double r, double n, double t)
	{
		return Math.pow(1+r/n, n*t)*p;
	}
	public double monthly (double p, double r, double n, double t)
	{
		return Math.pow(1+r/n, n*t)*p/(12*t);
	}
}