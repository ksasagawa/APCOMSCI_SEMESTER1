import java.util.Scanner;

public class Reciept
{
	public static void main(String[]args)
	{
		Reciept pr = new Reciept();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter item 1:");
		String entry1 = sc.next();
		System.out.println("Please enter the price:");
		double price1 = sc.nextDouble();
		System.out.println("Please enter item 2:");
		String entry2 = sc.next();
		System.out.println("Please enter the price:");
		double price2 = sc.nextDouble();
		System.out.println("Please enter item 3:");
		String entry3 = sc.next();
		System.out.println("Please enter the price:");
		double price3 = sc.nextDouble();
		System.out.println("<<<<<<<<<__Receipt__>>>>>>>>>>>>>>");
		String sub = "Subtotal:";
		String tx = "Tax:";
		String tot = "Total:";
		double subtotal = (price1+price2+price3);
		double tax = (subtotal*.08);
		double total = (subtotal+tax);
		pr.receipt_print(entry1, price1);
		pr.receipt_print(entry2, price2);
		pr.receipt_print(entry3, price3);
		System.out.println("\n");
		pr.receipt_print(sub, subtotal);
		pr.receipt_print(tx, tax);
		pr.receipt_print(tot, total);
		System.out.println("_____________________________________\n\t\tThank you!");
	}
	public void receipt_print(String entry, double price)
	{
		System.out.printf("\n*%10s........%8.2f", entry, price);
	}
}