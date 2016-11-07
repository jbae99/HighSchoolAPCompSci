import java.util.Scanner;

public class APLab_EX04
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please type a sentence:");
		String sentence = kb.nextLine();
		
		System.out.println(replace(sentence));
	}
	public static String replace(String sentence)
	{
			while(sentence.indexOf("a") >= 0)
			{
				sentence = sentence.substring(0, sentence.indexOf("a")) + "@" + sentence.substring(sentence.indexOf("a") + 1);
			}
			return sentence;
	}
}