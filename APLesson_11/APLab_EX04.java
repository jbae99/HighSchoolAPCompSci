import java.util.Scanner;

public class APLab_EX04
{
	public static void main(String[]args)
	{
		int[][] nums = new int[4][4];
		Scanner kb = new Scanner(System.in);
		
		int i=0;
		int j = 0;
		for(i=0;i<nums.length;i++)
		{
			for(j=0;j<nums[i].length;j++)
			{
				nums[i][j] = (int)(Math.random() *(99) + 1);
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Please enter a number:");
		int divisor = kb.nextInt();
		
		int count = 0;
		i = 0;
		j = 0;
		for(i=0;i<nums.length;i++)
		{
			for(j=0;j<nums[i].length;j++)
			{
				if((nums[i][j] % divisor) == 0)
				{
					count += 1;
				}
			}
		}
		System.out.println("There are "+count+" numbers divisible by "+divisor+" in the Array");
	}
}