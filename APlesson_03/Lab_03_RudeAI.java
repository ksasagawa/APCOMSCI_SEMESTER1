import java.util.Scanner;

public class Lab_03_RudeAI
{
	public static void main (String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hi, my name is RudeAI.\nI'd like to ask you a few questions.\nWhat is your name?");
		
		String Name = keyboard.next();
		
		System.out.println(Name + " Oh, so that's your name\n How old are you " + Name + " ?");
		
		int age = keyboard.nextInt();
		
		System.out.println("Hmmf... " + age + "?" + " A mere fledging compared to my age.\n What do you do for fun " + Name + "?");
		
		keyboard.nextLine(); //clear line
		
		String forFun = keyboard.nextLine();
		
		System.out.println("Oh... " + forFun + " Is..umm...really interesting\nWhat kind of music do you like?");
		
		String music = keyboard.nextLine();
		
		System.out.println("I don't really like " + music + "\nOh well. How many siblings do you have?");
		
		int Sybnum = keyboard.nextInt();
		
		System.out.println("You have " + Sybnum + " siblings? Wow, I don't have any.\n What do you want to be when you grow up?");
		
		keyboard.nextLine(); //clear line
		
		String job = keyboard.nextLine();
		
		System.out.println(" I think you'll have a tough time with that\n So " + Name + " you're " + age + "... \n You like to " + forFun + " and listen to " + music + "...\nGood Luck becoming a " + job);
	}
}