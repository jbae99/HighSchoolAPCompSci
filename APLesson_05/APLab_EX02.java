import java.util.Scanner;

public class APLab_EX02
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your items:");
		String item1 = kb.nextLine();
		kb.next();
		String item2 = kb.nextLine();
		kb.next();
		String item3 = kb.nextLine();
		kb.next();
		String item4 = kb.nextLine();
		kb.next();
		
		System.out.println("Please enter the prices in order:");
		double price1 = kb.nextDouble();
		double price2 = kb.nextDouble();
		double price3 = kb.nextDouble();
		double price4 = kb.nextDouble();
		
		double subtotal = price1+price2+price3+price4;
		
		double discountPer = calcDiscount(subtotal);
		
		double discount = subtotal * discountPer;
	
		double tax = subtotal * 0.08;
		double total = subtotal - discount + tax;
	
	System.out.println("<<<<<<<<< Receipt >>>>>>>>>>");
	format(item1, price1);
	format(item2, price2);
	format(item3, price3);
	format(item4, price4);		
	format("Subtotal", subtotal);
	format("Discount", discount);
	format("Tax", tax);
	format("Total", total);
	System.out.println("_____________________");
	System.out.println("Thank you for coming!");
	}
	
	public static double calcDiscount(double subtotal)
	{
		double discountPer =;
		if (subtotal >= 2000)
		discountPer = 0.15;
		if (subtotal < 2000)
		discountPer = 0;
		return discountPer;
	}
	
	public static void format(String item, double price)
	{
		System.out.printf("$20s ....... $18.2f", item, price);
	}
}