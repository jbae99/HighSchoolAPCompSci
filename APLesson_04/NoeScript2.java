import java.util.Scanner;

public class NoeScript2
{
	static double a1, last;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("enter a number:");
		a1 = kb.nextDouble();
		
		System.out.println("Your number to the power of 5 is:");
		power();
		print();
	}
	
	public static void power()
	{
		last = Math.pow(a1, 5);
	}
	public static void print()
	{
		System.out.println(last);
	}
}