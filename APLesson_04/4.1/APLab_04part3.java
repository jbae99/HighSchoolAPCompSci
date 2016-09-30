import java.util.Scanner;

public class APLab_04part3
{
	public static void main(String[]args)
	{
		APLab_04part3 interest = new APLab_04part3();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("This program will calculate compound interest of a loan compounded monthly \nPlease enter the rate of interest:");
		double rate = kb.nextDouble();
		
		System.out.println("Please enter the original amount of the loan:");
		kb.nextLine();
		double orig = kb.nextDouble();
		
		System.out.println("Please state how many years you will have the loan:");
		double time = kb.nextDouble();
		
		int n = 12;
		double finalInterest = interest.interestCalc(rate, orig, time, n);
		
		double monthly = ((finalInterest-orig)/(n*time));
		
		System.out.printf("Your total monthly payment is $%.2f", monthly);
		System.out.printf("\nThe amount you must pay back will be $%.2f", finalInterest);
	
	}
	public double interestCalc(double rate, double orig, double time, int n)
	{
		double pt1 = 1+(rate/n);
		double pt2 = n*time;
		
		
		
		return (orig*(Math.pow((double)pt1, (double)pt2)));
	}
}