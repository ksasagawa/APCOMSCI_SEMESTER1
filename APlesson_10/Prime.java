import java.util.ArrayList;
import java.util.Arrays;
public class Prime
{
	public static void main(String[]args)
	{
		Integer[] numbers = {2,6,8,9,10,12,13,15,17,24,55,66,78,77,79};
		ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(numbers));
		if(gFactor(numList,i) == 0)
			numList.remove(i);
		System.out.println(numList);
	}
	public static int gFactor(ArrayList<Integer> n)
	{
		for (int a = 2; i < n.get(i);a++)
		if (n.get(i)%a == 0)
			return n.get(i);
		else
			return 0;
	}
}