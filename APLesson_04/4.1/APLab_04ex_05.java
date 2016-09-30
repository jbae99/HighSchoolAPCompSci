import java.util.Scanner;

public class APLab_04ex_05
{
	public static void main(String[]args)
	{
		APLab_04ex_05 convert = new APLab_04ex_05();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("This program will convert the measurements of your subwoofer into cubic feet \nPlease enter the Height in inches:");
		double height = kb.nextDouble();
		
		System.out.println("Please enter the length in inches:");
		double length = kb.nextDouble();
		
		System.out.println("Please enter the width in inches:");
		double width = kb.nextDouble();
		
		double vol = convert.convertCalc(height, length, width);
		System.out.printf("The volume of your subwoofer in cubic feet is %.2f feet cubed", vol);
	}
	public double convertCalc(double h, double l, double w)
	{
		return((h*l*w)/1728);
	}
}