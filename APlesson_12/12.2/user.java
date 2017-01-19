public class user
{
	private String firstName;
	private String lastName;
	private String avatar;
	private int userID;
	public user()
	{
		firstName = "";
		lastName = "";
		avatar = "Undefined";
		userID = 0;
	}
	public user(String fN, String lN)
	{
		firstName = fN;
		lastName = lN;
		avatar = "Undefined";
		userID = (int)(Math.random() * 1000000) + 1;
	}
	public user(String fN, String lN, String av)
	{
		firstName = fN;
		lastName = lN;
		avatar = av;
		userID = (int)(Math.random() * 1000000) + 1;
	}
	public String toString()
	{
		return "Customer Info...\nFirst Name: " + firstName +
								"\nLast Name: " + lastName +
								"\nAvatar: " + avatar +
								"\nUser ID#: " + userID;
	}
	public void changefN(String fN)
	{
		firstName = fN;
	}
	public void changelN(String lN)
	{
		lastName = lN;
	}
	public void changeAvatar(String ava)
	{
		avatar = ava;
	}
}
