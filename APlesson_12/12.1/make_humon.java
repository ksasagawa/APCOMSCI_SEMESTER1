import java.util.Scanner;
public class make_humon
{
	public static void main(String[]args)
	{
		humon f1 = new humon();
		Scanner k = new Scanner(System.in);
		System.out.println("Enter the hair: ");
		String h = k.next();
		System.out.println("Enter the eyes: ");
		String e = k.next();
		System.out.println("Enter the skin: ");
		String s = k.next();
		humon h1 = new humon(h,e,s);
		
		System.out.println("\nMy info.......\nHair: " + h1.gethair());
		System.out.println("Skin: " + h1.getskin());
		System.out.println("Eyes: " + h1.geteyes());
		
		System.out.println("\nEnter the hair: ");
		h = k.next();
		System.out.println("Enter the eyes: ");
		e = k.next();
		System.out.println("Enter the skin: ");
		s = k.next();
		h1.sethair(h);
		h1.setskin(s);
		h1.seteyes(e);
		System.out.println("\nFriend\'s info.......\nHair: " + h1.gethair());
		System.out.println("Skin: " + h1.getskin());
		System.out.println("Eyes: " + h1.geteyes());
	}
}