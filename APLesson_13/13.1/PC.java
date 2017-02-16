public class PC extends GameSystem
{
	public PC()
	{
		super();
	}
	public PC(String n)
	{
		super(n);
	}
	
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	public String toString()
	{
		return "Platform: " + super.getPlat() + "\nSerial #: " + super.getSN() + "\nSystem Input: " + systemInput();
	}
}