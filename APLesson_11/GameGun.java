import java.util.Scanner;

public class GameGun
{
	static int bulletCount, shotCount;
	static int CLIPSIZE = 16;
	static String[] clip;
	
	public static void main(String[]args)
	{
		bulletCount = 96;
		shotCount = 0;
		clip = new String[16];
		Scanner kb = new Scanner(System.in);
		
		resetClip();
		
		while(bulletCount > 0 || shotCount > 0)
		{
			System.out.println("Action (R = Reload, S = Shoot):");
			String action = kb.nextLine();
			if(action.equals("r"))
			{
				reload();
			}
			if(action.equals("s"))
			{
				System.out.println(shoot());
			}
			printClip();
		}
		System.out.println("Out of Bullets!!");
	}
	public static void resetClip()
	{
		for(int i= 0;i == clip.length;i++)
		{
			clip[i] = "[]";
		}
	}
	public static String shoot()
	{
		if(shotCount>0)
		{
			clip[shotCount-1] = "[]";
			shotCount -= 1;
			return "Boom!!!";
		}
		else
		{
			return "Reload!!";
		}
	}
	public static void reload()
	{
		if(bulletCount>= CLIPSIZE)
		{
			bulletCount -= CLIPSIZE;
			shotCount = CLIPSIZE;
		}
		else
		{
			shotCount = bulletCount;
			bulletCount = 0;
		}
		resetClip();
		for(int i = 0;i<shotCount;i++)
		{
			clip[i] = " * ";
		}
	}
	public static void printClip()
	{
		String output = "Bullets:\t" + bulletCount + "\nClip:\t";
		for(int i = 0;i < CLIPSIZE;i++)
		{
			output += clip[i];
		}
		System.out.println(output);
	}
}