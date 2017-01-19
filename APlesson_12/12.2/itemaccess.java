import java.util.Scanner;
public class itemaccess
{
	public static void main(String[]args)
	{
		Scanner k = new Scanner(System.in);
		System.out.println("Are you entering price and catagory?");
		if (k.next().equals("n"))
		{
			System.out.println("Please enter the name: ");
			String name = k.next();
			System.out.println("Please enter the manufacturer: ");
			String manu = k.next();
			item n1 = new item(manu, name);
			System.out.println("\n"+n1);
		}
		else
		{
			System.out.println("Please enter the name: ");
			String name = k.next();
			System.out.println("Please enter the manufacturer: ");
			String manu = k.next();
			System.out.println("Please enter the price: ");
			double price = k.nextDouble();
			System.out.println("Please enter the category: ");
			String cata = k.next();
			item n2 = new item(manu, name, cata, price);
			System.out.println("\n"+n2);
		}
	}
}