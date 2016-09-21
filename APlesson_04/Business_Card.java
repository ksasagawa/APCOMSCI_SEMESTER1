import java.util.Scanner;

public class Business_Card
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Business_Card bc = new Business_Card();
		System.out.println("Enter your first name:");
		String fName = kb.next();
		System.out.println("Enter your last name:");
		String lName = kb.next();
		System.out.println("Enter your title:");
		String title = kb.next();
		System.out.println("Enter the school site:");
		kb.next();
		String site = kb.nextLine();
		System.out.println("Enter the school year:");
		String year = kb.nextLine();
		System.out.println("What is your subject:");
		kb.next();
		String subject = kb.nextLine();
		System.out.println("*************************************");
		bc.format(site, year);
		bc.format(lName, fName);
		bc.format(title, subject);
		System.out.println("\n*************************************");
	}
	public void format (String pt1, String pt2)
	{
		System.out.printf("\n*%13s %15s *", pt1, pt2);
	}
}