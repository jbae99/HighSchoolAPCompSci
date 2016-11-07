import java.util.Scanner;

public class APLab_EX02
{
	public  static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int number = kb.nextInt();
		
		int dgts = 0;
		int avg = 0;
		double average = avDigits(number, avg, dgts);
		System.out.printf("The average value of the digits of %d is %.2f", number, average);
		
	}
	public static double avDigits(int number, int avg, int dgts)
	{
		int num = number;
		while (num >0)
		{
			dgts+=1;
			avg += num % 10;
			num /= 10;
		}
		return (double)(avg)/dgts;
		
	}
}