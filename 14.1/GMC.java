public class GMC extends car
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
	public void move(double X, double Y)
	{
		x += X;
		y += Y;
	}
	public double[] getLoc()
	{
		double[] loc = new double[] {x,y};
		return loc;
	}
}