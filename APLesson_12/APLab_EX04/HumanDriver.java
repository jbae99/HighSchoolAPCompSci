import java.util.Scanner;

public class HumanDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the conditions of your human:");
		System.out.println("Hair:");
		String h = kb.nextLine();
		System.out.println("Eyes:");
		String e = kb.nextLine();
		System.out.println("Skin:");
		String s = kb.nextLine();
		
		Human object = new Human(h,e,s);
		System.out.println("Your Human is Ready:");
		System.out.println("Hair:" + object.getHair());
		System.out.println("Eyes:" + object.getEyes());
		System.out.println("Skin:" + object.getSkin());
		System.out.println("");
		
		
		object.setHES("blonde", "green", "light");
		System.out.println("My Specs:");
		System.out.println("Hair:" + object.getHair());
		System.out.println("Eyes:" + object.getEyes());
		System.out.println("Skin:" + object.getSkin());
		
	}
}