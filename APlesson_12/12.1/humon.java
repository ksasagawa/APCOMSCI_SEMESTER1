public class humon
{
	private String hair,eyes,skin;
	public humon()
	{
		hair = "";
		eyes = "";
		skin = "";
	}
	public humon (String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	public void sethair(String h)
	{
		hair = h;
	}
	public void seteyes(String e)
	{
		eyes = e;
	}
	public void setskin(String s)
	{
		skin = s;
	}
	public String gethair()
	{
		return hair;
	}
	public String geteyes()
	{
		return eyes;
	}
	public String getskin()
	{
		return skin;
	}
}