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
				if (choiceD.equals("1"))
				{
					System.out.println("On the way back to your house, you see something moving on the far edge of town. You squint but you still can't quite see it.");
					System.out.println("You're oddly afraid. Chase it(1) or return home(2)?");
					String choiceG = kb.nextLine();
					if (choiceG.equals("1"))
					{
						System.out.println("You run after the shape, and it starts towards you. It's moving really fast.\nyou notice that it does not look like a familiar shape.");
						System.out.println("Before you realize it, the beast has already jumped on you and killed you.");
						System.out.println("You have died.");
					}
					else
					{
						System.out.println("You return to your house and go back to sleep. The next day everything is back to normal.");
						System.out.println("Every now and then a sheep dissapears for no reason, but it's quite alright.");
					}
				}
				else
				{
					System.out.println("You head into the woods. After walking for a while, you come across a clearing\nIt is oddly circular. You step into the middle.\nBranches snap behind you. You whirl around, to see...");
					System.out.println("Everyone in your village. Dead in a pile.");
					System.out.println("You feel a pinch in your back, and you look down to see a long thin blade protruding from your chest.");
					System.out.println("You have died.");
				}
			}
				
			else
			{
				System.out.println("You head over to your best friends house and knock on his door. You hear a growl.\nGo inside(1) or back away(2)?");
				String choiceC = kb.nextLine();
				if (choiceC.equals("1"))
				{
					System.out.println("You go into his house to see a hulking beast crouched over the body of your friend.\nIt turns its head to look at you.");
					System.out.println("Attack the beast(1) or run for your life(2)?");
					String choiceE = kb.nextLine();
					if (choiceE.equals("1"))
					{
						System.out.println("You run towards the beast, realizing you don't have your knife on you, and you fall under its claws...");
						System.out.println("You have died.");
					}
					else
					{
						System.out.println("You start to sprint towards your house to grab a weapon, but on the way you encounter \nanother beast, and another when you turn. You're surrounded.");
						System.out.println("Drop to your knees and give up(1) or try and fight(2)");
						String choiceF = kb.nextLine();
						if (choiceF.equals("1"))
						{
							System.out.println("The monsters circle you, but after a minute they skulk away, leaving the path to your house clear.\nYou run home and...");
							System.out.println("You have survived!");
						}
						else
						{
							System.out.println("You rush the monsters, and they rip you apart easily.");
							System.out.println("You have died.");
						}
					}
				}
				else
				{
					System.out.println("You back away, and decide it would be better if you went home for the rest of the day");
					System.out.println("Congratulations, you survived! You wake up the next day and everything is back to normal. \nExcept theres always two moons in the sky for some reason...");
				}
			}
				
		}
		else
		{
			System.out.println("You go back to sleep, and wake up several hours later to find a\nsevered horse head in your bed. You look up into \nthe face of demon who promtly eats you.\nYou Died!");
		}
	}
}

