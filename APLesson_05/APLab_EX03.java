import java.util.Scanner;

public class APLab_EX03
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your letter grades for each subject\nMath:");
		String math = kb.nextLine();
		System.out.println("Science:");
		String science = kb.nextLine();
		System.out.println("History:");
		String history = kb.nextLine();
		System.out.println("English:");
		String english = kb.nextLine();
		System.out.println("Art:");
		String art = kb.nextLine();
		System.out.println("Music:");
		String music = kb.nextLine();
		System.out.println("AeroDynamics:");
		String aerodynamics = kb.nextLine();
		
	double gPoints = (calcPoints(science) + calcPoints(math) + calcPoints(history) + calcPoints(english) + calcPoints(art) + 
	calcPoints(music) + calcPoints(aerodynamics))/7;
	
	System.out.println("Your GPA is " + gPoints);
	}
	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
			return 4.0;
		if (grade.equals("B"))
			return 3.0;
		if (grade.equals("C"))
			return 2.0;
		if (grade.equals("D"))
			return 1.0;
		
			return 0.0;
	}
}