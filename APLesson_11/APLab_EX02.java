import java.util.Scanner;

public class APLab_EX02
{
	public static void main (String[]args)
	{
		String[][] words = new String[4][4];
		Scanner kb = new Scanner(System.in);
		
		
		int i = 0;
		int j = 0;
		
		for(i = 0;i<words.length;i++)
		{
			for(j=0;j<words[i].length;j++)
			{
				System.out.println("Please enter a word:");
				words[i][j] = kb.nextLine();
			}
		}
		
		i=0;
		j=0;
		for(i = 0;i<words.length;i++)
		{
			for(j=0;j<words[i].length;j++)
			{
				System.out.print(words[i][j] + " ");
			}
			System.out.println();
		}
	}
}