import java.util.Scanner;

public class APLab_EX05
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the max number ");
		int max = kb.nextInt();
		System.out.println("Please enter the amount by which you would like to count: ");
		int skip = kb.nextInt();
		
		for (int i = 0;i <= max; i+=skip)
		{
			System.out.printf(" %d ", i);
		}
	}
}

