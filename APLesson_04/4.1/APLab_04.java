import java.util.Scanner;

public class APLab_04
{
	public static void main(String[]args)
	{
		//new objects
		APLab_04 form = new APLab_04();
		Scanner kb = new Scanner(System.in);
		
		//add item1
		System.out.println("Please enter item 1:");
		String item1 = kb.nextLine();
		System.out.println("Please enter the price:");
		double price1 = kb.nextDouble();
		
		//add item2
		System.out.println("Please enter item 2:");
		kb.nextLine();
		String item2 = kb.nextLine();
		System.out.println("Please enter the price:");
		double price2 = kb.nextDouble();
		
		//add item3
		System.out.println("Please enter item 3:");
		String absorb2 = kb.nextLine();
		String item3 = kb.nextLine();
		System.out.println("please enter the price:");
		double price3 = kb.nextDouble();
		
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>");
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		
		
		double subtotal = (price1 + price2 + price3);
		double tax = (subtotal*.1);
		double total = (subtotal + tax);
		
		System.out.println("\n");
		
		form.format("Subtotal", subtotal);
		form.format("Tax", tax);
		form.format("Total", total);
		
		System.out.println("\n_________________________________________");
		System.out.println("        * Thank you for coming!*");
	}
	
	public void format(String item, double price)
	{
		System.out.printf("\n* %15s ........... %5.2f", item, price);
		
	}
}