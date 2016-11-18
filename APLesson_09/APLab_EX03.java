public class APLab_EX03
{
	public static void main(String[]args)
	{
		int[] numbers = new int[10];
		for(int i = 0;i < numbers.length;i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println("\nNumbers...\n");
		for(int num : numbers)
		{
			System.out.print(num + " ");
		}
		System.out.println("\nThe average of the numbers above is..." + average(numbers));
				
	}
	public static double average(int[] nums)
	{
		double avg = 0;
		for(int num : nums)
		{
			avg += num;
		}
		return avg/10;
	}
}