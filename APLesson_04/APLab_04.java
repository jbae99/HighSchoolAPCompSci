import java.util.Scanner;

public class APLab_04
{
	public static void main(String[]args)
	{
		APLab_04 form = new APLab_04();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter item 1:");
		String item1 = kb.nextLine();
		System.out.println("Please enter the price:");
		double price1 = kb.nextDouble();
		System.out.println("Please enter item 2:");
		String absorb = kb.nextLine();
		String item2 = kb.nextLine();
		System.out.println("Please enter the price:");
		double price2 = kb.nextDouble();
		System.out.println("Please enter item 3:");
		String absorb2 = kb.nextLine();
		String item3 = kb.nextLine();
		System.out.println("please enter the price:");
		double price3 = kb.nextDouble();
		
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>");
		form.format(item1, item2, item3, price1, price2, price3);
		
		double subtotal = (price1 + price2 + price3);
		double tax = (subtotal*.1);
		double total = (subtotal + tax);
		
		System.out.println("\n");
		
		form.format("Subtotal", "Tax", "Total", subtotal, tax, total);
		System.out.println("\n_________________________________________");
		System.out.println("        * Thank you for coming!*");
	}
	
	public void format(String item1, String item2, String item3, double price1, double price2, double price3)
	{
		System.out.printf("\n* %15s ........... %5.2f", item1, price1);
		System.out.printf("\n* %15s ........... %5.2f", item2, price2);
		System.out.printf("\n* %15s ........... %5.2f", item3, price3);
		
	}
}