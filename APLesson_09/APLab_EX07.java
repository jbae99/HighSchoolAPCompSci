import java.util.Scanner;

public class APLab_EX07
{
	static String[] words = new String[5];
	static Scanner kb = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		fillArray();
		System.out.println("For the words");
		printArray();
		System.out.println("Only " + hasZs() + "have Z's in them");
	}
	public static void fillArray()
	{
		
		System.out.println("PLease enter 5 words:");
		for(int i = 0; i<words.length; i++)
		{
			words[i] = kb.nextLine();
		}
	}
	public static void printArray()
	{
		for(String word : words)
		{
			System.out.println(word);
		}
	}
	public static String hasZs()
	{
		String zs = "";
		for(String word : words)
		{
			if(word.indexOf("z") >= 0)
			{
				zs += word + ", ";
			}
		}
		return zs;
	}
}