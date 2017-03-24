import java.util.Arrays;

public class Honda extends Car
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
		return ID;
	}
	
	public void move(double x1, double y1)
	{
		location[0] += x1;
		location[1] += y1;
	}
	
	public double[] getLoc()
	{
		return location;
	}
}