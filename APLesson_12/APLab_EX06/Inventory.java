import java.lang.Math.*;

public class Inventory
{
	private String itemMan, itemName, itemCat, itemPrice;
	private int UPC;
	
	
	public Inventory()
	{
		itemMan = "";
		itemName = "";
		itemCat = "";
		itemPrice = "";
		UPC = (int)(Math.random() * 999999999) + 1;
	}
	
	public Inventory(String man, String nam)
	{
		itemMan = man;
		itemName = nam;
		itemCat = "";
		itemPrice = "";
		UPC = (int)(Math.random() * 999999999) + 1;
	}
	
	public Inventory(String man, String nam, String cat, String price)
	{
		itemMan = man;
		itemName = nam;
		itemCat = cat;
		itemPrice = price;
		UPC = (int)(Math.random() * 999999999) + 1;
	}
	
	public String toString()
	{
		return "Manufacturer: " + itemMan +
				"\nName:" + itemName +
				"\nCategory:" + itemCat +
				"\nPrice:" + itemPrice +
				"\nUPC: " + UPC;
	}
}