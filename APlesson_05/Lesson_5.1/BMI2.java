import java.util.Scanner;
public class BMI2
{
	static double weight;
	static double height;
	static double bmi;
	public static void main(String[]args)
	{
		Scanner k = new Scanner(System.in);
		System.out.println("What is your weight?");
		weight = k.nextDouble();
		System.out.println("What is your height?");
		height = k.nextDouble();
		bmi = 0;
		String condition = calcBMI();
		System.out.printf("Your BMI is: %4.1f", bmi);
		System.out.println("\nYou are "+condition);
	}
	public static String calcBMI()
	{
		bmi = 703*(weight/(Math.pow(height, 2)));
		if (bmi >=39.9)
			return "Morbidly Obese";
		else if (bmi >= 35)
			return "Very Obese";
		else if (bmi >=29.9)
			return "Obese";
		else if (bmi >=25)
			return "Overweight";
		else if (bmi >=18.5)
			return "Normal";
		else
			return "Underweight";
	}
}