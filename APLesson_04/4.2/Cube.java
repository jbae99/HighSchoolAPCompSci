import java.util.Scanner;

public class Cube
{
	static double side, sa;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("This will calculate the Surface Area of a cube \nPlease enter the Side length:");
		side = kb.nextDouble();
		calcSurf();
		print();
	}
	public static void calcSurf()
	{
		sa = (side*side)*6;
	}
	public static void print()
	{
		System.out.printf("The surface area of a cube with sidelength %.5f is %.5f", side, sa);
	}
}