import java.util.ArrayList;
import java.util.Arrays;
public class toyStore
{
	public String list;
	static public ArrayList<toy> toyList = new ArrayList<toy>();
	public toyStore()
	{
		list = "";
	}
	public toyStore(String list)
	{
		loadToys(list);
	}
	public static void loadToys(String ts)
	{
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		for (int i = 0; i < toys.size(); i+=2)
		{
			String name = toys.get(i);
			String type = toys.get(i+1);
			toy object = getThatToy(name);
			if(getThatToy(name) == null)
			{
				if (type.equals("Car"))
					toyList.add(new car(name));
				else
					toyList.add(new aFigure(name));
			}
			else
				object.setCount(object.getCount() + 1);
		}
	}
	public static toy getThatToy(String nm)
	{
		for(toy object : toyList)
		{
			if(object.getName().equals(nm))
				return object;
		}
		return null;
	}
	public static String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for(toy object : toyList)
		{
			if(max < object.getCount())
			{
				max  = object.getCount();
				name = object.getName();
			}
		}
		return name;
	}
	public static String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		for(toy object : toyList)
		{
			if(object.getType().equals("Car"))
				cars++;
			if(object.getType().equals("Action Figure"))
				figures++;
		}
		if(cars<figures)
		{
			if(cars == figures)
				return "Equal Amounts of Cars and Figures";
			else
				return "Figures";
		}
		else
			return "Cars";
	}
	public String toString()
	{
		return ""+toyList;
	}
}