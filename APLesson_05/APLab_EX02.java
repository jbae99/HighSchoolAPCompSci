import java.util.Scanner;

public class APLab_EX02
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your first item:");
		String item1 = kb.nextLine();
		System.out.println("Please enter the price: ");
		double price1 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter your second item:");
		String item2 = kb.nextLine();
		System.out.println("Please enter the price: ");
		double price2 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter your third item:");
		String item3 = kb.nextLine();
		System.out.println("Please enter the price: ");
		double price3 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter your fourth item:");
		String item4 = kb.nextLine();
		System.out.println("Please enter the price: ");
		double price4 = kb.nextDouble();
		kb.nextLine();
		
		
		double subtotal = price1+price2+price3+price4;
		
		double discountPer = calcDiscount(subtotal);
		double tax = subtotal * 0.08;
		double total = subtotal - discountPer + tax;
	
	System.out.println("            <<<<<<<<< Receipt >>>>>>>>>>");
	format(item1, price1);
	format(item2, price2);
	format(item3, price3);
	format(item4, price4);		
	format("Subtotal", subtotal);
	format("Discount", discountPer);
	format("Tax", tax);
	format("Total", total);
	System.out.println("\n             _____________________");
	System.out.println("               Thank you for coming!");
	}
	
	public static double calcDiscount(double subtotal)
	{
		if (subtotal >= 2000)
			return subtotal*0.15;
		return 0.0;
	}
	
	public static void format(String item, double price)
	{
		System.out.printf("\n%20s ....... %18.2f", item, price);
	}
}