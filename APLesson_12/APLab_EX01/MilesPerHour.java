import java.lang.Math.*;
public class MilesPerHour
{
	private int distance,hours,minutes;
	private double milesPerHour;
	
	public MilesPerHour()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		milesPerHour = 0;
	}
		
	public MilesPerHour(int dis, int hrs, int min)
	{
		distance = dis;
		hours = hrs;
		minutes = min;
		milesPerHour = 0;
	}
	
	public void setValues(int dis, int hrs, int min)
	{
		distance = dis;
		hours = hrs;
		minutes = min;
		milesPerHour = 0;
	}
	
	public int getDis()
	{
		return distance;
	}
	
	public int getHrs()
	{
		return hours;
	}
	
	public int getMin()
	{
		return minutes;
	}
	
	public double getMPH()
	{
		milesPerHour = Math.round(distance / (hours + minutes / 60.0));
		return milesPerHour;
	}
}