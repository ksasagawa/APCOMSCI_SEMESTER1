public class test
{
	public static void main(String[]args)
	{
		double one = 1;
		double two = 2;
		testNum(one, two);
	//	System.out.printf("This is a test %10.2f %10f", testNum(), (one+two));
	}
	public static void testNum(double one, double two){
		System.out.printf("This is a test %10.2f %10f %10f", one, two, testRet(one, two));
	}
	public static double testRet(double one, double two){
		return one + two;
	}
}