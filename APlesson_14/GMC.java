public class GMC implements location
{
	private double x;
	private double y;
	public GMC()
	{
		x = 0;
		y = 0;
	}
	public GMC(double X, double Y)
	{
		x += X;
		y += Y;
	}
	public int getID()
	{
		int ID = (int)(Math.random()*Math.pow(10,6))+1;
		return ID;
	}
	public void move(double X, double Y)
	{
		x = X;
		y = Y;
	}
	public double[] getLoc()
	{
		double[] loc = new double[] {x,y};
		return loc;
	}
}