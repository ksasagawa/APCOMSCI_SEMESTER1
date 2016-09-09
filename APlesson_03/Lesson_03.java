import java.util.Scanner; //impor scanner

public class Lesson_03
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How old are you? ");
		int num = keyboard.nextInt();
		System.out.println("Wow " + num + " is perfect.");
		String name = keyboard.next();
		System.out.println(name);
		
	}
}