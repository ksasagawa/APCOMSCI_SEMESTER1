public class toyota implements location
{
	private String in;
	private double x;
	private double y;
	public toyota()
	{
		x = 0;
		y = 0;
	}
	public toyota(String i)
	{
		in = i;
		x = Double.parseDouble(in.substring(0,1));
		y = Double.parseDouble(in.substring(3));
	}
	public int getID()
	{
		return (int)(Math.random() * Math.pow(10,6))+1;
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