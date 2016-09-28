import java.util.Scanner;

public class NoteScript
{
	static double a1;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("enter a number:");
		double a1 = kb.nextDouble();
		
		System.out.println("Your number to the power of 5 is:");
		double last = power(a1);
		print(last);
	}
	
	public static double power(double one)
	{
		return Math.pow(one, 5);
	}
	public static void print(double last)
	{
		System.out.println(last);
	}
}