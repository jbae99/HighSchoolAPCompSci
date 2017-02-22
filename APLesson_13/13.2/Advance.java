public class Advance extends Ticket
{
	private int daysLeft;
	
	public Advance()
	{
		super();
	}
	public Advance(int n)
	{
		daysLeft = n;
	}
	
	public int getDaysLeft()
	{
		return daysLeft;
	}
	
	public double getPrice()
	{
		if(getDaysLeft() >= 10)
		{
			return 30.00;
		}
		else
		{
			return 40.00;
		}
	}
}