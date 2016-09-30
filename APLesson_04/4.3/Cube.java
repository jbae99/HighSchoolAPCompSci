import java.util.Scanner;

public class Cube
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("This will calculate the Surface Area of a cube \nPlease enter the Side length:");
		double side = kb.nextDouble();
		double sa = calcSurf(side);
		print(side, sa);
	}
	public static double calcSurf(double a)
	{
		return (a*a)*6;
	}
	public static void print(double a, double b)
	{
		System.out.printf("The surface area of a cube with sidelength %.5f is %.5f", a, b);
	}
}