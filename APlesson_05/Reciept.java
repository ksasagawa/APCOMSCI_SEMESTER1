import java.util.Scanner;
public class Reciept
{
	static double total;
	public static void main(String[]args)
	{
		Reciept r = new Reciept();
		Scanner k = new Scanner(System.in);
		System.out.println("What is the first item?");
		String i1 = k.next();
		System.out.println("What is the price of the first item?");
		double p1 = k.nextDouble();
		System.out.println("What is the second item?");
		String i2 = k.next();
		System.out.println("What is the price of the second item?");
		double p2 = k.nextDouble();
		System.out.println("What is the third item?");
		String i3 = k.next();
		System.out.println("What is the price of the third item?");
		double p3 = k.nextDouble();
		System.out.println("What is the fourth item?");
		String i4 = k.next();
		System.out.println("What is the price of the fourth item?");
		double p4 = k.nextDouble();
		total = p1+p2+p3+p4;
		discount();
		System.out.println("<<<<<<<<<__Receipt__>>>>>>>>>>>>>>");
		r.print(i1, p1);
		r.print(i2, p2);
		r.print(i3, p3);
		r.print(i4, p4);
		System.out.printf("\n*%10s______________%8.2f", "Total",total);
		if (total >= 2000)
		{
		System.out.printf("\n*%10s______________15", "Discount");
		}
		else
		{
		System.out.printf("\n*%10s______________0", "Discount");	
		}
	}
	public static void discount()
	{
		if (total >= 2000)
		{
			total = total-(total*.15);
		}
	}
	public void print(String entry, double price)
	{
		System.out.printf("\n*%10s______________%8.2f", entry, price);
	}
}