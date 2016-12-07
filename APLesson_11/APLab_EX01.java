public class APLab_EX01
{
	public static void main (String[]args)
	{
		int[][] nums = new int[4][4];
		int i = 0;
		int j = 0;
		
		for(i = 0; i< nums.length; i++)
		{
			for(j = 0; j < nums[i].length; j++)
			{
				nums[i][j] = (int)(Math.random() * (100) + 1);
			}
		}
		
		i=0;
		j=0;
		for(i=0;i<nums.length;i++)
		{
			for(j=0;j<nums[i].length;j++)
			{
				System.out.print(" " + nums[i][j]);
			}
			System.out.println();
		}
	}
}