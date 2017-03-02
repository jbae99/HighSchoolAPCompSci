import java.util.Arrays;

public class GMC implements Location
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
		return (int )(Math.random() * 999999 + 1);
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