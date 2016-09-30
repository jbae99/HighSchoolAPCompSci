import java.util.Scanner;

public class Circle
{
	static double r, area;
	
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("This will calculate the area of a circle \nPlease enter the radius:");
		r = kb.nextDouble();
		calcArea();
		print();
	}
	public static void calcArea()
	{
		area = (r*r)*3.14;
	}
	public static void print()
	{
		System.out.printf("The area of a circle with radius %.5f is %.5f", r, area);
	}
}