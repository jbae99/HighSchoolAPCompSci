import java.util.Scanner;

public class Rectangle
{
	static double l;
	static double w;
	static double perim;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle:");
		l = kb.nextDouble();
		
		System.out.println("Enter the width of the rectangle:");
		w = kb.nextDouble();
		calcPerim();
		print();
	}
	public static void calcPerim()
	{
		perim = (2*l) + (2*w);
	}
	public static void print()
	{
		System.out.printf("Your rectangle is %.5f ft around", perim);
	}
}