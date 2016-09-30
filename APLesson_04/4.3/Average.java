import java.util.Scanner;

public class Average
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter 3 numbers \nNumber 1:");
		double num1 = kb.nextDouble();
		System.out.println("Number 2:");
		double num2 = kb.nextDouble();
		System.out.println("Number 3:");
		double num3 = kb.nextDouble();
		double avg = average(num1, num2, num3);
		print(num1, num2, num3, avg);
	}
	
	public static double average(double a, double b, double c)
	{
		 return (a + b + c)/3;
	}
	public static void print(double a, double b, double c, double avg)
	{
		System.out.printf("The average of %.5f, %.5f, and %.5f is %.5f", a, b, c, avg);
	}
}