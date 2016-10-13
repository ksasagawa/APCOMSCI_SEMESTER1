import java.util.Scanner;
public class Adventure
{
	public static void main(String[]args)
	{
		Scanner k = new Scanner(System.in);
		System.out.println("What will you do?\n1.Nothing\n2.Something\n3.Unsure");
		int choice1 = k.nextInt();
		if (choice1 == 1)
		{
			System.out.println("You did nothing.\nWhat will you do next?\n1.Nothing\n2.Something\n3.What?");
			int choice2 = k.nextInt();
			if(choice2 == 1)
			{
				System.out.println("You did nothing again.\nWhat will you do next?\n1.Nothing\n2.Something\n3.Umm?");
				int choice3 = k.nextInt();
				if (choice3==1)
	
					System.out.println("Congrats, you\'ve done nothing.\nYou\'ve been lazy this whole time.");
				else if (choice3 == 2)
					System.out.println("You dicided to do something\n great job..");
				else 
					System.out.println("What? What did you expect?");
			}
			else if(choice1 == 2)
			{
				System.out.println("You did something after nothing. What did you do?\n1.Ran\n2.Fought\n3.Sang");
				int choice4 = k.nextInt();
				if(choice4 == 1)
					System.out.println("You ran and fell. Game over");
				else if (choice4 == 2)
					System.out.println("You fought and lost. Game over");
				else
					System.out.println("You sang and everyone stopped around the world to listen\nCongradulationsss, you\'ve won!");
			}
			else 
			{
				System.out.println("I'm also confused. Are you hungry?\n1.Yes\n2.No\n3.HUNGRY");
				int choice5 = k.nextInt();
				if(choice5 == 1)
					System.out.println("Good. Lets go eat");
				else if (choice5 == 2)
					System.out.println("Aww. I'm kinda hungry though...");
				else
					System.out.println("HUNGRYHUNGRYHUNGRYHUNGRYHUNGRY.");
			}
		}
		else if(choice1 == 2)
		{
			System.out.println("You did something. What was it?\n1.Trash\n2.Food\n3.Pork");
			int choice6 = k.nextInt();
			if(choice6 == 1)
			{
				System.out.println("Trashy. Next?\n1.\n2.\n.3.");
				int choice7 = k.nextInt();
				if (choice7 == 1)
					System.out.println(".");
				else if (choice7==2)
					System.out.println("..");
				else
					System.out.println("...");
			}	
			else if (choice6 ==2)
			{
				System.out.println("Lots and lots of foods for food. Favorite food?\n1.Anything\n2.Only candy\n3.I don\'t like food");
				int choice8 = k.nextInt();
				if (choice8 == 1)
					System.out.println("I agree, food is good");
				else if (choice8==2)
					System.out.println("Candy is gross");
				else
					System.out.println("Food is good though...");
			}
			else
			{
				System.out.println("Oink!Oink oink?\n1.Oinks\n2.Oinken\n3.Oik");
				int choice9 = k.nextInt();
				if (choice9 == 1)
					System.out.println("Oink oink oinks oink");
				else if (choice9 == 2)
					System.out.println("Oink oinks oink oink oinks");
				else
					System.out.println("Oinken! Oinken!");
			}
		}
		else
		{
			System.out.println("Unsure about what?\n1.This\n2.The Question\n3.?");
			int choice10 = k.nextInt();
			if (choice10 == 1)
			{
				System.out.println("What do you want to know?\n1.Everything\n2.Nothing\n3.ABCs?");
				int choice11 = k.nextInt();
				if (choice11 == 1)
					System.out.println("42");
				else if (choice11 == 2)
					System.out.println("");
				else
					System.out.println("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
			}
			else if (choice10 == 2)
			{
				System.out.println("The Question is...\n1.This\n2.That\n3.They");
				int choice12 = k.nextInt();
				if (choice12 == 1)
					System.out.println("AAAAAAAAAAA");
				else if (choice12 == 2)
					System.out.println("BBBBBBBBBBB");
				else 
					System.out.println("CCCCCCCCCCC");
			}
			else
			{
				System.out.println("I give up. This has taken too long");
			}
		}
	}
}