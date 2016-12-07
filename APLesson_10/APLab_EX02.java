import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class APLab_EX02
{
	static ArrayList<String> equation;
	static String[] equationArray;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an equation (Put spaces between each number and operator):");
		String eq = kb.nextLine();

		equation = new ArrayList<String>(Arrays.asList(eq.split(" ")));
		System.out.println(equation);
		
		doEquation();
	}
	public static void doEquation()
	{
		int i = 0;
		while(i < equation.size())
		{
			if(equation.get(i).equals("*") || equation.get(i).equals("/"))
			{
				if((equation.get(i)).equals("*"))
				{
					equation.set(i, "" + (Integer.parseInt(equation.get(i - 1)) * Integer.parseInt(equation.get(i + 1))));
				}
				else
				{
					equation.set(i, "" + (Integer.parseInt(equation.get(i - 1)) / Integer.parseInt(equation.get(i + 1))));
				}
				equation.remove(i - 1);
				equation.remove(i);
			}
			else
			 i ++;
		}
		
		i = 0;
		while(i < equation.size())
		{
			if(equation.get(i).equals("+") || equation.get(i).equals("-"))
			{
				if((equation.get(i)).equals("+"))
				{
					equation.set(i, "" + (Integer.parseInt(equation.get(i - 1)) + Integer.parseInt(equation.get(i + 1))));
				}
				else
				{
					equation.set(i, "" + (Integer.parseInt(equation.get(i - 1)) - Integer.parseInt(equation.get(i + 1))));
				}
				equation.remove(i - 1);
				equation.remove(i);
			}
			else
			 i ++;
		}
		System.out.println(equation);
	}
}