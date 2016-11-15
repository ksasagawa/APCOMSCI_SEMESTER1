import java.util.Scanner;
public class fib
{
	public static void main(String[]args)
	{
		Scanner k = new Scanner(System.in);
		System.out.println("Please enter your starting number: ");
		int start = k.nextInt();
		System.out.println("Please enter your sequence size: ");
		int size = k.nextInt();
		int[]seq = new int[size];
		for(int i =0; i<seq.length; i++)
		{
			if(i==0||i==1)
				seq[i] = start;
			else
				seq[i] = seq[i-1]+seq[i-2];
			System.out.println(seq[i]+ " ");
		}
	}
}