import java.util.Scanner;
public class MPHRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter distance, hours, and minutes");
		System.out.println("distance:");
		int dis = kb.nextInt();
		System.out.println("hours:");
		int hrs = kb.nextInt();
		System.out.println("minutes:");
		int min = kb.nextInt();
		
		
		
		MilesPerHour object = new MilesPerHour(dis, hrs, min);
		
		System.out.println(object.getDis()+ " miles in " + object.getHrs() +" hours = "+object.getMPH() +" mph");
		
		object.setValues(66, 6, 6);
		
		System.out.println(object.getDis()+ " miles in " + object.getHrs() +" hours = "+object.getMPH() + " mph");
	}
}