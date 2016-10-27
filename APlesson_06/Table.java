import java.util.Scanner;
public class Table
{
	public static void main(String[]args)
	{
		Scanner k = new Scanner(System.in);
		System.out.println("What is the integer?");
		int num = k.nextInt();
		System.out.println("What is the table size?");
		int table_size = k.nextInt();
		System.out.printf("%10s|%-10s\n%14s", "X", "Y", "_______");
		for (int i = 1; i<=table_size;i++)
		{
			System.out.printf("\n%10d|%-10d", i, (i*num));
		}
	}
}