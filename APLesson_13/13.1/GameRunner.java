public class GameRunner
{
	public static void main(String[]args)
	{
		PC firstPc = new PC("Gaming PC");
		
		XBox firstXbox = new XBox("XBox One");
		
		PlayStation firstPS = new PlayStation("PlayStation 4");
		
		System.out.println("\n" + firstPc);
		System.out.println("\n" + firstXbox);
		System.out.println("\n" + firstPS);
	}
}