import java.util.Scanner;

public class Subwoof
{
	public static void main(String[]args)
	{
		Subwoof sub = new Subwoof();
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the height?");
		double hei = kb.nextDouble();
		System.out.println("What is the width?");
		double wid = kb.nextDouble();
		System.out.println("What is the length?");
		double len = kb.nextDouble();
		double vol = sub.calcVol(hei, wid, len);
		double ftVol = sub.convertFt(vol);
		System.out.printf("The volume is %10.2f cubic inches", vol);
		System.out.printf("\nThe volume is %10.2f cubic feet", ftVol);
	}
	public double calcVol(double height, double width, double length)
	{
		return (height*width*length);
	}
	public double convertFt(double volume)
	{
		return (volume/1728);
	}
	
}