import java.util.Scanner;

public class Test
{
	public static void main(String[]args)
	{
		//Scanner is imported...
	Scanner kb = new Scanner(System.in);
	
	System.out.println("How many siblings do you have? ");
	int answer1 = kb.nextInt();
	
	System.out.println("What are their names? ");
	String answer2 = kb.nextLine();
		
	System.out.println("OK, which one is your favorite?");
	String answer3 = kb.nextLine();
	System.out.println("Awe! " + answer3 + " is your favorite.");

	}
}