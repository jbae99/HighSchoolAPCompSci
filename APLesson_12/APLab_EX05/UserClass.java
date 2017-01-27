import java.lang.Math.*;

public class UserClass
{
	private String firstName;
   private String lastName;
   private String avatar;
   private int userID;
   
   public UserClass()
   {
	   firstName = "";
	   lastName = "";
	   avatar = "";
	   userID = (int)(Math.random() * 1000000) + 1;
   }
   
   public UserClass(String fN, String lN)
	{
		firstName = fN;
		lastName = lN;
		avatar = "Undefined";
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public UserClass(String fN, String lN, String av)
	{
		firstName = fN;
		lastName = lN;
		avatar = av;
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public void changeAva(String ava)
	{
		avatar = ava; 
	}
	
	public String toString()
	{
		return "Customer Info...\nFirst Name: " + firstName +
                           "\nLast Name: " + lastName +
                           "\nAvatar: " + avatar +
                           "\nUser ID#: " + userID;
	}

}