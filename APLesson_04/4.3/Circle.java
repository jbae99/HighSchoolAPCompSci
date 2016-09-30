import java.util.Scanner;

public class Circle
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("This will calculate the area of a circle \nPlease enter the radius:");
		double r = kb.nextDouble();
		double area = calcArea(r);
		print(r, area);
	}
	public static double calcArea(double r)
	{
		return (r*r)*3.14;
	}
	public static void print(double r, double area)
	{
		System.out.printf("The area of a circle with radius %.5f is %.5f", r, area);
	}
}