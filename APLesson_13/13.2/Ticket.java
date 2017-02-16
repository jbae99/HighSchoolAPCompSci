public class Ticket
{
	private int serialNo;
	
	public Ticket()
	{
		serialNo = (int )(Math.random() * 9999999 +1);
	}
	
	public int getSerialNo()
	{
		return (int )(Math.random() * 9999999 +1);
	}
	
	public abstract double getPrice()
	
	public String toString()
	{
		return "Serial #: " + getSerialNo() + "\nPrice: " + getPrice();
	}
}