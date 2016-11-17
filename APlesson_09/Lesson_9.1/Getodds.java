public class Getodds
{
	public static void main (String[]args)
	{
		int[]arr = new int[10];
		fillArray(arr);
		System.out.println("For the following numbers... ");
		printArray(arr);
		System.out.println("The odd numbers are ");
		getOdds(arr);
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
			System.out.print(num+"\t");
	}
	public static void getOdds(int[]a)
	{
		int odds = 0;
		for (int num : a)
		{
			if (num%2 == 1)
				System.out.print(num+"\t");
		}
	}
}