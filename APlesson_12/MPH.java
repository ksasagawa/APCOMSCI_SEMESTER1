import static java.lang.Math.*;
public class MPH
{
	private int distance, hours, minutes;
	private double mph;
	
	public MPH()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	public MPH(int dis, int hr, int min)
	{
		distance = dis;
		hours = hr;
		minutes = min;
		mph= 0;
	}
	public void setDis(int dis)
	{
		distance = dis;
	}
	public void setHr(int hr)
	{
		hours = hr;
	}
	public void setMin(int min)
	{
		minutes = min;
	}
	public void setMph(int mph)
	{
		mph = mph;
	}
	public int getDis()
	{
		return distance;
	}
	public int getHr()
	{
		return hours;
	}
	public int getMin()
	{
		return minutes;
	}
	public double calcMPH()
	{
		mph = Math.round(distance / (hours + (minutes/60)));
		return mph;
	}
}