public class Biggest_number
{
	public static void main (String[]args)
	{
		int[]arr = new int[10];
		fillArray(arr);
		printArray(arr);
		System.out.println("\nThe biggest is:\n"+getBiggest(arr));
	}
	public static void fillArray(int[] a)
	{
	for(int i =0; i< a.length; i++)
		{
			a[i] = (int)(Math.random()*100) + 1;
		}
	}
	public static void printArray(int[] a)
	{
		for(int num :a)
			System.out.print(num+"\n");
	}
	public static int getBiggest(int[]a)
	{
		int max = 0;
		for(int num:a)
		{
			if(num > max)
				max = num;
		}
		return max;
	}
	
}