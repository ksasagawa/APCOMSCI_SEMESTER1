public class toyota implements location
{
	private double[] loc;
	private double x;
	private double y;
	public toyota()
	{
		x = 0;
		y = 0;
	}
	public toyota(String i)
	{
		//in = i;
		String[] locs = i.split(", ");
		loc[0] = Double.parseDouble(locs[0]);
		loc[1] = Double.parseDouble(locs[1]);
		//x = Double.parseDouble(in.substring(0,1));
		//y = Double.parseDouble(in.substring(3));
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
		//double[] loc = new double[] {x,y};
		return loc;
	}
}