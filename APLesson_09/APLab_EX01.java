import java.util.Scanner;

public class APLab_EX01
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String[] words = new String[5];
		
		System.out.println("Please enter 5 words (Press enter between each):");
		for(int i = 0; i < words.length; i++)
		{
		words[i] = kb.next();
		}
		System.out.println("\nIn order...\n");
		for(String word : words)
		{
			System.out.println(word);
		}
		
		System.out.println("\nReversed\n");
		reverse(words);
	}
	public static void reverse(String[] s)
	{
		for(int i = s.length - 1; i >= 0; i--)
		{
			System.out.println(s[i]);
		}
	}
}