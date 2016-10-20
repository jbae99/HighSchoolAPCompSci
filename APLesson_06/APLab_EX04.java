import java.util.Scanner;

public class APLab_EX04
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter size of the table (The height and width will be the same): ");
		int size = kb.nextInt();
		System.out.println("Please enter any number: ");
		int num = kb.nextInt();
		
		for(int i = 1; i <= size; i++)
		{
			System.out.printf("%5d		%10d\n", i, i*num);
		}
	}
}