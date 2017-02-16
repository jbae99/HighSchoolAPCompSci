public class GameSystem
{
	private String platform;
	private int serialNo;
	
	public GameSystem()
	{
		platform = "";
		serialNo = 0;
	}
	
	public GameSystem(String p)
	{
		platform = p;
		serialNo = (int )(Math.random() * 9999999 + 1);
	}
	
	public String getPlat()
	{
		return platform;
	}
	public int getSN()
	{
		return serialNo;
	}
	
	
}