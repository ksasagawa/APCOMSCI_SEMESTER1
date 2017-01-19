public class item
{
	private String Item_Manufactuer;
	private String Item_Name;
	private String Item_Catagory;
	private double Item_Price;
	private long UPC;
	public item()
	{
		Item_Manufactuer = "";
		Item_Name = "";
		Item_Catagory = "Undefined";
		Item_Price = 0;
		UPC = 0;
	}
	public item(String iM, String iN)
	{
		Item_Manufactuer = iM;
		Item_Name = iN;
		Item_Catagory = "Undefined";
		Item_Price = 0;
		UPC = (long)(Math.random() * Math.pow(10,10)) + 1;
	}
	public item(String iM, String iN, String iC, double iP)
	{
		Item_Manufactuer = iM;
		Item_Name = iN;
		Item_Catagory = iC;
		Item_Price = iP;
		UPC = (long)(Math.random() * Math.pow(10,10)) + 1;
	}
	public String toString()
	{
		if (Item_Price == 0)
		{
			return "Item Info...\nItem Manufactuer: " + Item_Manufactuer +
									"\nItem Name: " + Item_Name +
									"\nItem Catagory: " + Item_Catagory +
									"\nItem Price: " + "(not set)" +
									"\nUPC#: " + UPC;
		}
		else
		{
			return "Item Info...\nItem Manufactuer: " + Item_Manufactuer +
									"\nItem Name: " + Item_Name +
									"\nItem Catagory: " + Item_Catagory +
									"\nItem Price: " + Item_Price +
									"\nUPC#: " + UPC;
		}
	}
	public void changeiM(String iM)
	{
		Item_Manufactuer = iM;
	}
	public void changeiN(String iN)
	{
		Item_Name = iN;
	}
	public void changeiC(String iC)
	{
		Item_Catagory = iC;
	}
	public void changep(double p)
	{
		Item_Price = p;
	}
}
