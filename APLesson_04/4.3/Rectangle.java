import java.util.Scanner;

public class Rectangle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("This will calculare the Perimeter of a rectangle \nEnter the length of the rectangle:");
		double l = kb.nextDouble();
		
		System.out.println("Enter the width of the rectangle:");
		double w = kb.nextDouble();
		double perim = calcPerim(l, w);
		print(perim);
	}
	public static double calcPerim(double l, double w)
	{
		return((2*l) + (2*w));
	}
	public static void print(double perim)
	{
		System.out.printf("Your rectangle is %.5f ft around", perim);
	}
}