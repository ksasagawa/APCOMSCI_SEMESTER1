import java.util.Scanner;
public class toyRunner
{
	public static void main(String[]args)
	{
		/*car a = new car("aaaaaass");
		aFigure b =new aFigure("bbbbbbbbbbbbdd");
		System.out.println(a);
		System.out.println(b);*/
		String toys = "";
		Scanner k = new Scanner(System.in);
		System.out.println("Please enter the toys, type");
		toys = k.nextLine();
		toyStore nw = new toyStore(toys);
		System.out.println(nw);
		System.out.println("Most Frequent Toy " + nw.getMostFrequentToy());
		System.out.println("Most Frequent Type " + nw.getMostFrequentType());
	}
}