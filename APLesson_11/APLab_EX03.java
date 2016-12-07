public class APLab_EX03
{
	public static void main(String[]args)
	{
		String[][] xAndo = new String[4][4];
		
		int i = 0;
		int j = 0;
		for(i=0;i<xAndo.length;i++)
		{
			for(j=0;j<xAndo[i].length;j++)
			{
				int pick = (int)(Math.random() * (2) + 1);
				if(pick == 1)
				{
					xAndo[i][j] = "x";
				}
				if(pick == 2)
				{
					xAndo[i][j] = "o";
				}
				System.out.print(xAndo[i][j] + "\t");
			}
			System.out.println();
		}
	}
}