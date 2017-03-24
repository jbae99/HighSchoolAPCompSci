import java.util.Arrays;

public class GMC extends Car
{
	double x, y;
	
	public GMC()
	{
		x = y = 0;
	}
	public GMC(double x1, double y1)
	{
		x = x1;
		y = y1;
	}
	
	public int getID()
	{
		return ID;
	}
	public void move(double x1, double y1)
	{
		x = x1;
		y = y1;
	}
	public double[] getLoc()
	{
		double[] location = {x,y};
		return location;
	}
}