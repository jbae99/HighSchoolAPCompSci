import java.util.Scanner;

public class APLab_EX01
{

	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a number:");
		int number = kb.nextInt();
		int num = number;
		int sum = 0;
		sumDigits(num, sum, number);
		
	}
	public static void sumDigits(int num, int sum, int number)
	{
		while (num > 0)
		{
			sum += (num % 10);
			num /= 10;
		}
		System.out.println("The sum of the digits in " + number + " is " + sum);
	}
}