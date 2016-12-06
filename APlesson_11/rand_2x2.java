public class rand_2x2
{
	public static void main(String[]args) //Whoops
	{
		int[][] rand = new int[4][4];
		for (int i = 0; i<rand.length; i++)
		{
			for (int j = 0;j<rand[i].length; j++)
			{
				rand[j][i] = (int)(Math.random()*100);
			}
		}
		for (int i = 0; i<rand.length; i++)
		{
			for (int j = 0;j<rand[i].length; j++)
			{
				System.out.print(rand[i][j] + "\t");
			}
			System.out.println();
		}
	}
}