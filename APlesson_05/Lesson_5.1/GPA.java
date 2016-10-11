import java.util.Scanner;
public class GPA
{
	public static void main (String[]args)
	{
		Scanner k = new Scanner(System.in);
		System.out.println("What is your grade for math?");
		String math = k.next();
		System.out.println("What is your grade for science?");
		String science = k.next();
		System.out.println("What is your grade for social studies?");
		String soc = k.next();
		System.out.println("What is your grade for language?");
		String lang = k.next();
		System.out.println("What is your grade for english?");
		String eng = k.next();
		System.out.println("What is your grade for the elective?");
		String ele = k.next();
		System.out.println("What is your grade for the elective?");
		String ele2 = k.next();
		double gPoints = calcPoints(math)+calcPoints(science)+calcPoints(soc)+calcPoints(lang)+calcPoints(eng)+calcPoints(ele)+calcPoints(ele2);
		System.out.printf("Your GPA is %2.1f", gPoints/7);
	}
	public static double calcPoints(String grade)
	{
		if (grade.equals("A")||grade.equals("a"))
			return 4.0;
		if (grade.equals("B")||grade.equals("b"))
			return 3.0;
		if (grade.equals("C")||grade.equals("c"))
			return 2.0;
		if (grade.equals("D")||grade.equals("d"))
			return 1.0;
		if (grade.equals("F")||grade.equals("f"))
			return 0.0;
		else 
			return 0.0;
	}
}