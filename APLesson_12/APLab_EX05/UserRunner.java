import java.util.Scanner;
public class UserRunner
{
	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a Username");
		String uname = kb.nextLine();
		System.out.println("Please enter a Password:");
		String pword = kb.nextLine();
		System.out.println("Would you like a public avatar? ( Y or N)");
		String answer = kb.nextLine();
		
		UserClass user1 = new UserClass();
		
		if (answer.equals("Y"))
		{
			System.out.println("Please enter your avatar:");
			String avatar = kb.nextLine();
			
			UserClass noAva = new UserClass(uname, pword, avatar);
			System.out.println(noAva);
		}
		else 
		{
			UserClass yesAva = new UserClass(uname, pword);
			System.out.println(yesAva);
		}
	}
}