public class Lab_02	
{
	public static void main(String[]args)
	{
		int num1 = 34;
		int num2 = 15;
		int multSolv = num1 * num2;
		System.out.println(num1 + " Muliplied by" + " " + num2 + "\nEquals " + multSolv + "\n");
		
		String Name = "Kyle Sasagawa";
		String Address = "2564 Glenn St.";
		String City = "Encinitas";
		String zipCode = "92027";
		
		System.out.println("***************************************\n\t" + Name + "\n\t" + Address + "\n\t" + City + ", CA " + zipCode + "\n***************************************");
		
		int L = 15;
		int H = 30;
		int W = 2;
		double sfArea = 2 * (L * H + L * W + W * H);
		
		System.out.println("\nThe surface area of your rectangle is " + sfArea);
	}
}