import java.util.Scanner;
public class test
{
	public void diIt()
	{
		a();
		b();
		c();
	}
	public void a()
	{
		System.out.println("FAIL");
	}
	public void b()
	{
		System.out.println("FAIL");
	}
	public void c()
	{
		System.out.println("FAIL");
	}
	public static void main(String[]args)
	{
		testc1 a= new testc1();
		a.diIt();
		testc2 b= new testc2();
		b.diIt();
		testc3 c= new testc3();
		c.diIt();
		/*int[] arr1 = {0, 6, 0, 4, 0, 0, 2};
		int count = 0;
	for (int i = 0; i < arr1.length; i++)
	{
		if (arr1[i] != 0)
		{
		arr1[count] = arr1[i];
		count++;
		}
	}
	int[] arr2 = new int[count];
	for(int i = 0; i < count; i++)
		arr2[i] = arr1[i];
	for (int num : arr1)
		System.out.println(num);
		if (!(0>0)&&!(0*5 < 100)) 
			System.out.println("AAA");
		else
			System.out.println("BBB");
		
		double one = 1;
		double two = 2;
		testNum(one, two);
		//System.out.printf("This is a test %10.2f %10f", testNum(), (one+two));
		imps();*/
	}
	/*public static void testNum(double one, double two){
		System.out.printf("This is a test %10.2f %10f %10f %.2f\n", one, two, testRet(one, two), one-two);
	}
	public static double testRet(double one, double two)
	{
		return one + two;
	}*/
	/*public static void imps(){
		Scanner k = new Scanner(System.in);
		k.next();
		System.out.println("a");
		String a = k.nextLine();
		System.out.println("b");
		String b = k.nextLine();
		System.out.println("c");
		String c = k.nextLine();
		System.out.println("d");
		String d = k.nextLine();
		System.out.println(a+b+c+d);
	}*/
	/*public class classes
	{
		private int a,b,d,e,f,zzz;
		public classes()
		{
			a = 0;
			b = 0;
			d = 0;
			e = 0;
			f = 0;
			zzz = 0;
		}
		public classes (int a1, int b2, int d3)
		{
			a = a1;
			b = b2;
			d = d3;
		}
	}*/
	
}