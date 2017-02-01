import java.util.ArrayList;
import java.util.Arrays;
public class toyStore
{
	public String list;
	public static void main(String[]args)
	{
		ArrayList<toy> toyList = new ArrayList<toy>();
		
	}
	public toyStore()
	{
		list = "";
	}
	public toyStore(String list)
	{
		list = loadToys();
	}
	public static String loadToys(String ts)
	{
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		for (int i = 0; i < toys.size(); i++)
		{
			String name = toys.get(i);
			String type = toys.get(i+1);
			toys.set(getThatToy(),Toy ty = new Toy(name))
		}
	}
}