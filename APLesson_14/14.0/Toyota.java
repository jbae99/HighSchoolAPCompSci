public class Toyota implements Location
{
	private double[] location;
	
	public Toyota()
	{
		location = new double[2];
	}
	public Toyota(String p)
	{
		location = new double[2];
		String[] locs = p.split(", ");
		location[0] = Double.parseDouble(locs[0]);
		location[1] = Double.parseDouble(locs[1]);
	}
	public int getID()
	{
		return (int )(Math.random() * 999999 + 1);
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