import java.util.Scanner;
public class DistRunner
{
	public static Scanner k = new Scanner(System.in);
	public static void main (String[]args)
	{
		Scanner k = new Scanner(System.in);
		Dist dorg = new Dist();
		reset();
	}
	public static void reset()
	{
		System.out.println("Enter x1: ");
		int x1 = k.nextInt();
		System.out.println("Enter y1: ");
		int y1 = k.nextInt();
		System.out.println("Enter x2: ");
		int x2 = k.nextInt();
		System.out.println("Enter y2: ");
		int y2 = k.nextInt();
		Dist d1 = new Dist(x1,y1,x2,y2);
		d1.setxOne(x1);
		d1.setyOne(y1);
		d1.setxTwo(x2);
		d1.setyTwo(y2);
		System.out.printf("Distance = %5.2f", d1.getDist());
		
		System.out.println("\nRetry? Y/N");
		if (k.next().equals ("y")||k.next().equals("Y"))
			reset();
	}
}