import java.util.Scanner;

public class RudeAI
{
	public static void main(String [] args)
	{
		System.out.println("Hello, I'm RudeAI and I would like to ask you some questions");
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your name?");
		String a1 = keyboard.nextLine();
		System.out.println(a1 + ", Were your parents too rushed to pick a good name?");
		System.out.println("How old are you?");
		int a2 = keyboard.nextInt();
		if (a2 < 18) {
			System.out.println("You're so young!");
		}
		else {
			System.out.println("Why are you still at a highschool?");
		}
		System.out.println("What do you do for fun, " + a1 + "?");
		String a3 = keyboard.next();
		System.out.println(a3 + "?" + "You Mean waste your time?");
		System.out.println("What kind of music do you like?");
		String a4 = keyboard.next();
		System.out.println("Try listening to real music, not that " + a4 + " Garbage!");
		System.out.println("How many siblings do you have?");
		int a5 = keyboard.nextInt();
		if (a5 >= 3) {
			System.out.println("I bet you don't get a lot of attention.");
		}
		else { 
		System.out.println("Now that's about the first normal thing about you.");
		}
		System.out.println("What do you want to be when you grow up?");
		String a6 = keyboard.next();
		System.out.println("I highly doubt you're gonna be a " + a6 + ", but do what you want.");
		System.out.println("So " + a1 + ", it seems you're " + a2 + ", you like to " + a3 + ", and you want to be a " + a6 );
		System.out.println("Your life sucks!");
		System.out.println("I'm just kidding though");
	}
}