import java.util.Scanner;

public class APLab_04part2
{
	public static void main (String[]args)
	{
		APLab_04part2 form = new APLab_04part2();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		String nameFirst = kb.next();
		System.out.println("Enter your last name:");
		String nameLast = kb.next();
		System.out.println("Enter your title:");
		String absorb  = kb.nextLine();
		String title = kb.nextLine();
		System.out.println("Enter the name of your school:");
		String school = kb.nextLine();
		System.out.println("Enter the school year:");
		String year = kb.nextLine();
		System.out.println("What is your subject?");
		String subject = kb.nextLine();
		
		System.out.println("*********************************");
		form.format(nameFirst, nameLast, title, school, year, subject);
		System.out.println("\n*********************************");
		
	}
	
	public void format(String nameFirst, String nameLast, String title, String school, String year, String subject)
	{
		System.out.printf("*%15s %15s*", school, year);
		System.out.printf("\n*%15s %15s*", nameLast, nameFirst);
		System.out.printf("\n*%15s %15s*", title, subject);
	}
}