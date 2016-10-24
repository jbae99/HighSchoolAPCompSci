public class APLab_EX08
{
	public static void main(String[]args)
	{
		String line1 = "J'aime les fraises tagada et je reve d'un Wayne's world 3, je veux une mega-happy";
		String line2 = "End enlacee dans tes bras Je n'ai pas de dents de sagesse, ca ne me";
		String chorus = "oh oh oh oh oh oh";
		String line3 = "Manque pas, quand je mords la nuit Pleines dents pour faire la nouba";
		String line4 = "Je suis un enfant, comme un adolescent Je suis un adulte, comme un adolescent";
		
		
		sing(line1, 1);
		sing(line2, 1);
		sing(chorus, 5);
		sing(line3, 1);
		sing(line4, 1);
		sing(chorus, 5);
	}
	public static void sing(String lyric, int repeat)
	{
		for (int i = 1; i <= repeat; i++)
		{
			System.out.println(lyric);
		}
	}
}