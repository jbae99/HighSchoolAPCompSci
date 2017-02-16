public class StudentAdvance extends Advance
{
	public StudentAdvance()
	{
		super();
	}
	public Student Advance(int n)
	{
		super(n);
	}
	
	public double getPrice()
	{
		return super.getPrice()/2;
	}
	
	public String toString()
	{
		return super.toString() + "\n(Student ID Required)";
	}
}