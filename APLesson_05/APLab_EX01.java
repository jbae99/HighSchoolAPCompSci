import java.util.Scanner;
import java.util.Random;

public class APLab_EX01
{
	static boolean result;
	static String winner;
	static int player;
	static int comp;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Random rd = new Random();
		
		player = rd.nextInt(6)+1;
		comp = rd.nextInt(6)+1;
		
		rollDice();
		
		System.out.println("You rolled a " + player);
		System.out.println("The computer rolled a " + comp);
		System.out.println("The winner is " + winner);
	}
	
	public static void rollDice()
	{
		if (player > comp)
			winner = "You!";
		if (comp >= player)
			winner = "Computer";
	}
}