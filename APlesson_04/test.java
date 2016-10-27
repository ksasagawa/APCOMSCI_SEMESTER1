import java.util.Scanner;
public class test
{
	public static void main(String[]args)
	{
		double one = 1;
		double two = 2;
		testNum(one, two);
		//System.out.printf("This is a test %10.2f %10f", testNum(), (one+two));
		imps();
	}
	public static void testNum(double one, double two){
		System.out.printf("This is a test %10.2f %10f %10f %.2f\n", one, two, testRet(one, two), one-two);
	}
	public static double testRet(double one, double two){
		return one + two;
	}
	public static void imps(){
		Scanner k = new Scanner(System.in);
		System.out.println("a");
		String a = k.nextLine();
		System.out.println("b");
		String b = k.nextLine();
		System.out.println("c");
		String c = k.nextLine();
		System.out.println("d");
		String d = k.nextLine();
		System.out.println(a+b+c+d);
	}
}