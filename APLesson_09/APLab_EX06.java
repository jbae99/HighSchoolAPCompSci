public class APLab_EX06
{
	static int[] nums = new int[10];
	
	public static void main(String[]args)
	{
		fillArray();
		System.out.println("For the following numbers");
		printArray();
		System.out.println("The biggest number is "+ getBiggest());
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
	public static int getBiggest()
	{
		int max = 0;
		for(int num : nums)
		{
			if(num > max)
			{
				max = num;
			}
		}
		return max;
	}
}