import java.util.Scanner;

public class APLab_EX05
{
	
	static Scanner kb;
	
	public static void main(String[]args)
	{
		System.out.println("Choose your own adventure! The choices you make will change the way your \nadventure ends.Choose wisely!");
		System.out.println("\nYou are a farmer in a small village. You awake one morning and your \nfamily is not in the house. You figure they must have an early start to their day.");
		System.out.println("Go outside(1) or go back to sleep(2)?");
		storyChoices();
	}
	public static void storyChoices()
	{
		kb = new Scanner(System.in);
		String choiceA = kb. nextLine();
		if (choiceA.equals("1"))
		{
			System.out.println("You get out of bed and walk outside. There doesn't seem to be anybody around.");
			System.out.println("You start to tend to your animals but they are always fidgeting, looking behind you and running away.");
			System.out.println("Around noon you start to feel on edge, and you decide to try and find some company");
			System.out.println("Look around outside of town(1) or knock on peoples doors(2)?");
			String choiceB = kb.nextLine();
			if (choiceB.equals("1"))
			{
				System.out.println("You grab your pocketknife and a chunk of bread and start into the woods");
				System.out.println("As you reach the woods, you hear a shriek from back in the village. \nIt scares you after so many hours of relative silence. \nIt could be an animal, or a person, you can't quite be sure.");
				System.out.println("Go back(1) or head into the woods(2)?");
				String choiceD = kb.nextLine();
			}
				
			if (choiceB.equals("2"))
			{
				System.out.println("You head over to your best friends house and knock on his door. You hear a growl.\nGo inside(1) or back away(2)?");
				String choiceC = kb.nextLine();
				if (choiceC.equals(1))
				{
					System.out.println("You go into his house to see a hulking beast crouched over the body of your friend.\nIt turns its head to look at you.");
					
				}
				if (choiceC.equals(2))
				{
					System.out.println("You back away, and decide it would be better if you went home for the rest of the day");
				}
			}
				
		}
		else
			System.out.println("You go back to sleep, and wake up several hours later to find a\nsevered horse head in your bed. You look up into \nthe face of demon who promtly eats you.\nYou Died!");
	}
}

