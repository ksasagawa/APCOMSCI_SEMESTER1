import java.util.ArrayList;
public class gameRunner
{
	public static void main(String[]args)
	{
		ArrayList<gameSystem> a = new ArrayList<gameSystem>();
		/*playstation a = new playstation();
		xbox b = new xbox();
		PC c = new PC();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);*/
		for(int i = 0; i < 5; i++)
		{
			if((int)(Math.random()*10)+1 == 1)
				a.add(new playstation());
			else if((int)(Math.random()*10)+1 == 2)
				a.add(new xbox());
			else
				a.add(new PC());
		}
		System.out.println(a);
	}
}