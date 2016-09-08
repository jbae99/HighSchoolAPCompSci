import java.util.Scanner;

public class Calculation
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Guess how much I care");
		int a1 = input.nextInt();
		if (a1 == 47){
			System.out.println("Correct!!");
		}
		else if (a1 > 47){
			System.out.println("Lower!");
		}
		else {
			System.out.println("Higher!");
		}
		
		
	}	
}