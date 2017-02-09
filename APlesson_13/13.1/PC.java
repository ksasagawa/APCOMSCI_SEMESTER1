public class PC extends gameSystem
{
	public PC()
	{
		super("PC");
	}
	public String getInput()
	{
		return "Keyboard and Mouse";
	}
	public String toString()
	{
		return "Platform: " + super.getPlatform() + "\nSerial #: " + super.getSerialNo() + "\nController: " + getInput();
	}
}