import java.util.Scanner;

public class DistanceRunner
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the coordinates");
		System.out.println("x1:");
		int x1 = kb.nextInt();
		System.out.println("x2:");
		int x2 = kb.nextInt();
		System.out.println("y1:");
		int y1 = kb.nextInt();
		System.out.println("y2:");
		int y2 = kb.nextInt();
		
		Distance object = new Distance(x1, x2, y1, y2);
		
		System.out.printf("Distance = %.2f", object.getDist());
		
		object.setValues(1,2,8,9);
		
		System.out.printf("\nDistance = %.2f", object.getDist());
	}
}
