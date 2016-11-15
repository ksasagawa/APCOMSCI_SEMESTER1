public class Average
{
	public static void main(String[]args)
	{
		int[]numbers = new int[10];
		for(int i =0; i< numbers.length; i++)
		 {
			 numbers[i] = (int)(Math.random()*100) + 1;
		 }
		 System.out.println("Numbers...");
		 for(int num : numbers)
		 {
			 System.out.print(num+" ");
		 }
		 System.out.println("\n");
		 System.out.println(average(numbers));
	}
	public static int average(int[] n)
	{
		int a = 0;
		for(int b : n)
		{
			a += b;
		}
		return a/n.length;
	}
}