import java.util.Arrays;

public class Honda implements Location
{
	private double[] location;

	public Honda()
	{
		location = new double[2];
	}
	
	public Honda(double[] l)
	{
		location = l;
	}
	
	public int getID()
	{
		return (int )(Math.random() * 999999 + 1);
	}
	
	public void move(int x1, int y1)
	{
		location[0] += x1;
		location[1] += y1;
	}
	
	public double[] getLoc()
	{
		return location;
	}
}