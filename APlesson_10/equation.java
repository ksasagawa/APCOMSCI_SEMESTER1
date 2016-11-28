import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class equation
{
	public static void main(String[]args)
	{
		Scanner k = new Scanner(System.in);
		System.out.println("Enter an equation: ");
		String eq = k.nextLine();
		ArrayList<String> equatio = new ArrayList<>(Arrays.asList(eq.split(" ")));
		doEquation(equatio);
		System.out.println(equatio);
	}
	public static ArrayList<String> doEquation(ArrayList<String> q)
	{
		
		for (int i = 0;i < q.size();i++)
		{
			if (i < q.size() && q.get(i).equals("*") || i < q.size() && q.get(i).equals("/"))
			{
				if (q.get(i).equals("*"))
				{
					q.set(i, "" + (Integer.parseInt(q.get(i-1)) * Integer.parseInt(q.get(i+1))));
					q.remove(i-1);
					q.remove(i);
				}
				else
				{
					q.set(i, "" + (Integer.parseInt(q.get(i-1)) / Integer.parseInt(q.get(i+1))));
					q.remove(i-1);
					q.remove(i);
				}
				i--;
			}
		}
				for(int a = 0; a<q.size();a++)
				{
				if (q.get(a).equals("+") || q.get(a).equals("-"))
			{
				if (q.get(a).equals("+"))
				{
					q.set(a, "" + (Integer.parseInt(q.get(a-1)) + Integer.parseInt(q.get(a+1))));
					q.remove(a-1);
					q.remove(a);
				}
				else
				{
					q.set(a, "" + (Integer.parseInt(q.get(a-1)) - Integer.parseInt(q.get(a+1))));
					q.remove(a-1);
					q.remove(a);
				}
				a--;
			}
			}
		
		/*while(i<q.size())
		{
			if (q.get(i).equals("+") || q.get(i).equals("-"))
			{
				if (q.get(i).equals("+"))
				{
					q.set(i+1, "" + (Integer.parseInt(q.get(i-1)) + Integer.parseInt(q.get(i+1))));
					q.remove(i-1);
					q.remove(i);
				}
				else
				{
					q.set(i+1, "" + (Integer.parseInt(q.get(i-1)) - Integer.parseInt(q.get(i+1))));
					q.remove(i-1);
					q.remove(i);
				}
			}
			i++;
		}*/
		return q;
	}
}