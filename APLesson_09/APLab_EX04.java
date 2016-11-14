import java.util.Scanner;

public class APLab_EX04
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your starting number:");
		int start = kb.nextInt();
		System.out.println("Please enter your sequence length:");
		int length = kb.nextInt();
		
		int[] seq = new int[length];
		
		for(int i = 0;i < seq.length;i++)
		{
			if(i==0 || i==1)
			{
				seq[i] = start;
			}
			else
			{
				seq[i] = seq[i-1] + seq[i-2];
			}
			System.out.print(seq[i] +" ");
		}
	}
}