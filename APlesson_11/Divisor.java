import java.util.Scanner;
import java.util.Random;
public class Divisor
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		Scanner k = new Scanner(System.in);
		int[][]nums = new int[4][4];
		for (int i = 0; i<nums.length; i++)
		{
			for (int j = 0;j<nums[i].length; j++)
			{
				nums[i][j] =(rand.nextInt(50)+1);
				System.out.print(nums[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Please enter a number: ");
		int divisor = k.nextInt();
		int count = 0;
		for (int i = 0; i<nums.length; i++)
		{
			for (int j = 0;j<nums[i].length; j++)
			{
				if (nums[i][j]%divisor == 0)
					count++;
			}
		}
		System.out.println("There are "+count+" numbers divisible by "+divisor+" in the Array.");
	}
}