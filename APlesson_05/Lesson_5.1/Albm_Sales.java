public class Albm_Sales
{
	public static void main(String[]args)
	{
		String name = "James Brown";
		int units = 1500000;
		String catagory = "";
		
		if (units >= 100000)
			catagory = "Top Seller";
		else if (units >=50000)
			catagory = "Good Seller";
		else if (units >=10000)
			catagory = "Average Seller";
		else
			catagory = "Needs Review";
		
		System.out.println(name + " = " + catagory);
	}
}