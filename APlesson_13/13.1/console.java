public abstract class console extends gameSystem
{
	public console()
	{
		super();
	}
	public console(String p)
	{
		super(p);
	}
	public abstract String getController();
	public String toString()
	{
		return "Platform: " + super.getPlatform() + "\nSerial #: " + super.getSerialNo() + "\nController: " + getController();
	}
}