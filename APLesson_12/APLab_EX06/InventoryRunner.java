import java.util.Scanner;

public class InventoryRunner
{
	public static void main(String[]args)
	{
		Inventory item1 = new Inventory();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Item Name:");
		String name = kb.nextLine();
		System.out.println("Manufacturer:");
		String man = kb.nextLine();
		
		System.out.println("Will you be entering a price and category? (y or n)");
		String answer = kb.nextLine();
		
		if(answer.equals("y"))
		{
			System.out.println("Price:");
			String price = kb.nextLine();
			System.out.println("Category:");
			String cat = kb.nextLine();
			
			Inventory yes = new Inventory(man, name, cat, price);
			System.out.println(yes);
		}
		else
		{
			Inventory no = new Inventory(man,name);
			System.out.println(no);
		}
	}
}