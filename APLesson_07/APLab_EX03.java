import java.util.Scanner;

public class APLab_EX03
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a number:");
		int number = kb.nextInt();
		
		int num = number;
		int rev = 0;
		
		System.out.println(number + " reversed is "+ getReverse(number, num, rev));
		
	}
	public static int getReverse(int number, int num, int rev)
	{
		while (num > 0)
		{
			rev *= 10;
			rev += (num % 10);
			num /= 10;
		}
		return rev;
	}
}