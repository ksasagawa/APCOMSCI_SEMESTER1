public class xndo
{
	public static void main (String[]args)
	{
		String[][]xo = new String[4][4];
		for (int i = 0; i<xo.length; i++)
		{
			for (int j = 0;j<xo[i].length; j++)
			{
				if (Math.random() < 0.5)
					xo[i][j] = "x";
				else
					xo[i][j] = "o";
			}
		}
		for (int i = 0; i<xo.length; i++)
		{
			for (int j = 0;j<xo[i].length; j++)
			{
				System.out.print(xo[i][j] + "\t");
			}
			System.out.println();
		}
	}
}