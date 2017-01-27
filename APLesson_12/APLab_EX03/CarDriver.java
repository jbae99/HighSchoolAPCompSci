import java.util.Scanner;

public class CarDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the color of paint you would like:");
		String p = kb.nextLine();
		System.out.println("Please enter the type of interior you would like:");
		String i = kb.nextLine();
		System.out.println("Please enter the engine you would like:");
		String e = kb.nextLine();
		System.out.println("PLease enter the tires you would like:");
		String t = kb.nextLine();
		
		Car object = new Car(p,i,e,t);
		
		System.out.println("Your vehicle is ready....");
		System.out.printf("Paint:		%s",object.getPaint());
		System.out.printf("\nInterior:		%s",object.getInterior());
		System.out.printf("\nEngine:		%s",object.getEngine());
		System.out.printf("\nTires:		%s",object.getTires());
		
	}
}