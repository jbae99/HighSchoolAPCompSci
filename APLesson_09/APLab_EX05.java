public class APLab_EX05
{
	static int[] nums = new int[10];
	
	public static void main(String[]args)
	{
		fillArray();
		
		System.out.println("For the following numbers");
		printArray();
		System.out.println(getOdds() + " are odd numbers");
	}
	public static void fillArray()
	{
		for(int i = 0;i < nums.length; i++)
		{
			nums[i] = (int)(Math.random() * 101);
		}
	}
	public static void printArray()
	{
		for(int num : nums)
		{
			System.out.println(num);
		}
	}
	public static String getOdds()
	{
		String odds = "";
		for(int num : nums)
		{
			if(num % 2 != 0)
			{
				odds += num + " ";
			}
		}
		return odds;
	}
}
