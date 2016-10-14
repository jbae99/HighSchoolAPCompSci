import java.util.Scanner;

public class APLab_EX06
{
	static String user;
	static String pass;
	static String userGuess;
	static String passGuess;
	static Scanner kb;
	
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		
		user = "jbae99";
		pass = "pokemon99";
		passCheck();
		
	}
	public static void passCheck()
	{
		System.out.println("Please enter your username:");
		userGuess = kb.next();
		System.out.println("Please enter your password:");
		passGuess = kb.next();
		
		
		if (userGuess.equals(user) && passGuess.equals(pass))
		{
				System.out.println("Access granted");
		}
		else 
		{
			if (user.equals(userGuess))
			{
				System.out.println("Incorrect Password");
				passCheck();	
			}
			else if(pass.equals(passGuess))
			{
				System.out.println("Incorrect Username");
				passCheck();
			}
			else
				System.out.println("Incorrect username and password");
				passCheck();
		}
				
	}
}