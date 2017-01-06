import java.util.Scanner;
public class MPHrunner
{
	public static void main(String[]args)
	{
		Scanner k = new Scanner(System.in);
		MPH solo = new MPH();
		
		System.out.println("Enter Distance: ");
		int distance = k.nextInt();
		System.out.println("Enter Hours: ");
		int Hours = k.nextInt();
		System.out.println("Enter Minutes: ");
		int Minutes = k.nextInt();	
		
		MPH solo2 = new MPH(distance, Hours, Minutes);
		
		solo2.setDis(distance);
		solo2.setHr(Hours);
		solo2.setMin(Minutes);
		
		System.out.printf(solo2.getDis() + " miles in " + solo2.getHr() + " hours and " + solo2.getMin() + " Minutes = " + solo2.calcMPH() + " mph");
	}
}