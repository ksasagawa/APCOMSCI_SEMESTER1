import java.util.ArrayList;
import java.util.Arrays;
public class Prime
{
	public static void main(String[]args)
	{
		int a = 2;
		Integer[] numbers = {2,6,8,9,10,12,13,15,17,24,55,66,78,77,79};
		ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(numbers));
		for(int i = 0; i<numList.size(); i++)
		{
			numList.set(i,gFactor(numList,i,a));
			if(numList.get(i) == 0)
				numList.remove(i);
		}
		System.out.println(numList);
	}
	public static int gFactor(ArrayList<Integer> n, int i, int a)
	{
		while(a<n.get(i))
		{
			if(a != n.get(i))
			{
				if (n.get(i)%a == 0)
				{
					a = 2;
					return 0;
				}
			a++;
			gFactor(n,i,a);
			}
		}
		a =2;
		return n.get(i);
	}
}