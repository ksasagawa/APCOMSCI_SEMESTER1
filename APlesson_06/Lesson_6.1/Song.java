public class Song
{
	//Na Na Hey Hey Kiss Him Goodbye
	public static void main(String[]args)
	{
		Sing("Na", 4);
		Sing("Na", 4);
		Sing("Hey", 3);
		Sing("Goodbye!", 1);
	}
	public static void Sing(String a, int i)
	{
		for (int b=0;b < i;b++)
		{
			System.out.printf(a +" ");
		}
		System.out.printf("\n");
	}
}