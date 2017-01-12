import java.util.Scanner;
public class makecar
{
	public static void main(String[]args)
	{
		carclass f1 = new carclass();
		Scanner k = new Scanner(System.in);
		System.out.println("Enter the paint color: ");
		String p = k.next();
		System.out.println("Enter the interior: ");
		String i = k.next();
		System.out.println("Enter the engine: ");
		String e = k.next();
		System.out.println("Enter the tires: ");
		String t = k.next();
		carclass car = new carclass(p,i,e,t);
		
		System.out.println("\nYour vehicle is ready.......\nPaint: " + car.getPaint());
		System.out.println("Interior: " + car.getInterior());
		System.out.println("Engine: " + car.getEngine());
		System.out.println("Tires: " + car.getTires());
	}
}