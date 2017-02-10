import java.util.ArrayList;
import java.lang.Integer;

public class ToyStore
{
	ArrayList<Toy> ToyList;
	
	
	public ToyStore()
	{
		ToyList = new ArrayList<>();
	}
	
	public ToyStore(String list)
	{
		loadToys(list);
	}
	
	public void loadToys(String ts)
	{
		ToyList = new ArrayList<>();
		String[] toys = ts.split(", ");
		
		for(int i = 0 ; i< toys.length; i += 2)
		{
			String name = toys[i];
			String type = toys[i + 1];
			Toy t = getThatToy(name);
			
			if(t==null)
			{
				if(type.equals("Car"))
				{
					ToyList.add(new Car(name));
				}
				else
				{
					ToyList.add(new AFigure(name));
				}
			}
			else
			{
				t.setCount(t.getCount() + 1);
			}
			
		}
	}
	public Toy getThatToy(String nm)
	{
		for(Toy t : ToyList)
		{
			if(t.getName().equals(nm))
			{
				return t;
			}
		}
		return null;
	}
	
	public String getMostFrequentToy()
	{
		String name;
		int max = Integer.MIN_VALUE;
		for(Toy t : ToyList)
		{
			if(max < t.getCount())
			{
				max = t.getCount();
				name = t.getName();
			}
		}
		return name;
	}
	
	public String toString()
	{ 
		return ToyList.toString();
	}
}