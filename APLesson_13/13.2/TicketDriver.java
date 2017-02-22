public class TicketDriver
{
	public static void main (String[]args)
	{
		Walkup walk = new Walkup();
		Advance adv = new Advance();
		StudentAdvance student = new StudentAdvance();
		
		
		System.out.println("Receipt");
		System.out.println("\n" + walk);
		System.out.println("\n" + adv);
		System.out.println("\n" + student);
	}
}