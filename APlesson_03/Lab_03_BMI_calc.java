import java.util.Scanner;

public class Lab_03_BMI_calc
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your height(inches)? ");
		int height = kb.nextInt();
		System.out.println("What is your weight? ");
		int weight = kb.nextInt();
		double BMI = 703 * (weight/(height^2));
		System.out.println("Your BMI is " + BMI);
	}
}