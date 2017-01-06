import java.lang.Math.*;
public class Dist
{
	private int xOne,xTwo,yOne,yTwo;
	private double distance;
	public Dist()
	{
		xOne = 0;
		xTwo = 0;
		yOne = 0;
		yTwo = 0;
		distance = 0;
	}
	public Dist (int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		xTwo = x2;
		yOne = y1;
		yTwo = y2;
		distance = 0;
	}
	public void setxOne(int x1)
	{
		xOne = x1;
	}
	public void setxTwo(int x2)
	{
		xTwo = x2;
	}
	public void setyOne(int y1)
	{
		yOne = y1;
	}
	public void setyTwo(int y2)
	{
		yTwo = y2;
	}
	public double getDist()
	{
		distance = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
		return distance;
	}
}