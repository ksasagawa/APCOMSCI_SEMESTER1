import java.util.Scanner;
public class Reciept
{
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
		double total = p1+p2+p3+p4;
		double discount = discount(total);
		double tax = total*.08;
		System.out.println("<<<<<<<<<__Receipt__>>>>>>>>>>>>>>");
		r.print(i1, p1);
		r.print(i2, p2);
		r.print(i3, p3);
		r.print(i4, p4);
		System.out.printf("\n*%10s______________%8.2f", "Subtotal",total);
		System.out.printf("\n*%10s______________%8.2f", "Discount", discount);
		System.out.printf("\n*%10s______________%8.2f", "Tax", tax);
		System.out.printf("\n*%10s______________%8.2f", "Total", total-discount+tax);
		System.out.println("\n_________________________________________________________\n\t\t\t Thank You!");
	}
	public static double discount(double total)
	{
		if (total >= 2000)
			return (total*.15);
		else
			return 0.0;
	}
	public void print(String entry, double price)
	{
		System.out.printf("\n*%10s______________%8.2f", entry, price);
	}
}