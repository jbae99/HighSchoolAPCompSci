public class Magpie2
{
	/** Get a default greeting @return a greeting*/
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/** getResponse() method
	 * ===========================================
	 * 	Gives a response to a user statement
	 *  @param statement (the user statement)
	 * 	@return a response based on the rules given */
	public String getResponse(String statement)
	{
		String response = "";

		/** Exercise_01:
		 * ==================================================
		 * 	Code that asks the user "Say something, please."
		 * 	if you enter nothing, or if you accidentally hit
		 * 	enter. Think to yourself: "What is the length of
		 * 	an empty String?" */
		 
		 if (statement.trim().equals(""))
		 {
			 System.out.println("Say Something, Please.");
		 }
		 
		/** To be completed in Exercise_02:
		 * 	Modify the following code to use the findKeyword
		 * 	Method (details in "Exercise_02" below. */
		if (findKeyword(statement, "no") >= 0)
		{
			response = "Why so negative?";
		}

		else if (findKeyword(statement, "mother") >= 0
				|| findKeyword(statement, "father") >= 0
				|| findKeyword(statement, "sister") >= 0
				|| findKeyword(statement, "brother") >= 0)
		{
			response = "Tell me more about your family.";
		}

		/** Exercise_03(Final)
		 * ==================================================
		 * Create additional code (another else if) that
		 * responds "Tell me more about your pet" if the
		 * user mentions the word cat, dog, fish, or turtle
		 * in their statement.
		 *
		 * Create addtional code (another else if) that
		 * responds "He sounds like a pretty dank teacher"
		 * if you mention "Robinette" in your statement */

		 else if (findKeyword(statement, "cat") >= 0
				|| findKeyword(statement, "dog") >= 0
				|| findKeyword(statement, "fish") >= 0
				|| findKeyword(statement, "turtle") >=0)
				{
					response = "Tell me more about your pet.";
				}
				
		else if (findKeyword(statement, "Robinette") >= 0)
		{
			response = "He definitely sounds like a teacher";
		}
		 
		 else if(findKeyword(statement, "xxxtentacion") >= 0)
		{
			response = "YUHH AYE, OKAY. YUHH AYE, OKAY.";
		}
		 else if (findKeyword(statement, "I want to", 0) >= 0)
		{
			response = transformIWantToStatement(statement);
		}
		


		else if (findKeyword(statement, "you", 0) >= 0)
		{
		// Look for a two word (you <something> me)
		// pattern
			int psn = findKeyword(statement, "you", 0);
			if (psn >= 0
					&& findKeyword(statement, "me", psn) >= 0)
			{
				response = transformYouMeStatement(statement);
			}
			
			else if(findKeyword(statement, "I") >= 0)
			{
				psn = findKeyword(statement, "I", 0);			
				if (psn >= 0
						&& findKeyword(statement, "you", psn) >= 0)
				{
					response = transformIYouStatement(statement);
				}					
			}
		}
		
		else
		{
			response = getRandomResponse();
		}
		
		return response;
	}

	
	
	
	private String transformIWantStatement(String statement)
	{
		 statement.trim();
   
		int l = statement.length();
		String lastChar = statement.substring(l-1);
   
		if(lastChar.equals("."))
		{
			statement = statement.substring(0, statement.indexOf(lastChar));
		}
		
		int psn = findKeyword(statement, "I want", 0);
		
		String restOfStatement = statement.substring(psn + 6).trim();
		
		return "Would you really be happy if you had" + restOfStatement + "?";
	}
	/**
* Take a statement with "I want to <something>." and transform it into
* "What would it mean to <something>?"
* @param statement the user statement, assumed to contain "I want to"
* @return the transformed statement
*/
	private String transformIWantToStatement(String statement)
	{
	  /**
	   * trim the statement
	   * variable lastChar = last character in statement
	   * if lastChar is a period...
	   *        remove the last character from statement
	   *
	   * Set new int psn to the result from...
	   *        findKeyword() method @param statement, goal is "I want to "
	   * Set new String restOfStatement to the rest of statement after the
	   * "I want to ".
	   * /
	   * return "What would it mean to" + restOfStatement; **/

   statement.trim();
   
   int l = statement.length();
   String lastChar = statement.substring(l-1);
   
   if(lastChar.equals("."))
   {
	 statement = statement.substring(0, statement.indexOf(lastChar));
   }
   
   int psn = findKeyword(statement, "I want to", 0);
   
   String restOfStatement = statement.substring(psn+10).trim();
   
   return "What would it mean to " + restOfStatement + "?";
	}

 /**
* Take a statement with "you <something> me" and transform it into
* "What makes you think that I <something> you?"
* @param statement the user statement, assumed to contain "you" followed by "me"
* @return the transformed statement
*/
	private String transformYouMeStatement(String statement)
	{
  /**
   * trim the statement
   * Set new String lastChar to the last character in statement
   * if lastChar is a period...
   *        remove the period
   *
   * Set new int psnOfYou to the result of findKeyword
   *        @param statement and "you"
   * Set new int psnOfMe to the result of findKeyword
   *      @param statement, "me", and psnOfYou + 3
   * Set new String restOfStatement to the rest of statement after "You" + 3,
   * and before "me".
   *
   * return "What makes you think that I " + restOfStatement + "you?"
   * */
   
   statement.trim();
   int l = statement.length();
   String lastChar = statement.substring(l-1);
   
   if (lastChar.equals("."))
   {
	   statement = statement.substring(0, statement.indexOf(lastChar));
   }
   
   int psnOfYou = findKeyword(statement, "You");
   int psnOfMe = findKeyword(statement, "Me", psnOfYou + 3);
   
   String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe);
   return "what makes you think that I" + restOfStatement +  "you?";
   
   
	}
	
	private String transformIYouStatement(String statement)
	{
		statement.trim().toLowerCase();
		int l = statement.length();
		String lastChar = statement.substring(l-1);
   
		if (lastChar.equals("."))
		{	
			statement = statement.substring(0, statement.indexOf(lastChar));
		}
		
		int psnOfI = findKeyword(statement, "I");
		int psnOfYou = findKeyword(statement, "you", psnOfI + 1);
		
		String restOfStatement = statement.substring(psnOfI + 1, psnOfYou);
		return "Why do you" + restOfStatement + "me?";
	}
	
	
	
	/** Ex_02: The findKeyword() Method...
	 * ========================================================= */
	private int findKeyword(String statement, String goal, int startPos)
	{
		String phrase = statement.trim().toLowerCase();
		goal = goal.toLowerCase();
		
		int psn = phrase.indexOf(goal, startPos);
		
		String before = "";
		String after = "";
		
		while(psn >= 0)
		{
			if(psn > 0)
			{
				before = phrase.substring(psn-1, psn);
			}
			
			if(psn + goal.length() < phrase.length())
			{
				after = phrase.substring(psn + goal.length(), psn + goal.length() + 1);
			}
			
			if((before.compareTo("a") < 0 || before.compareTo("z") > 0) && 
				(after.compareTo("a") < 0 || after.compareTo("z") > 0))
			{
				return psn;
			}
			psn = statement.indexOf(goal, psn+1);
		}

		return -1;

	}

	/** Override - this method is used if there are only 2 parameters...*/
	private int findKeyword(String statement, String goal)
	{
		//set startPos to 0 if not specified
		return findKeyword(statement, goal, 0);
	}

	/** getRandomResponse() method
	 * =============================================================*/
	/** Pick a default response to use if nothing else fits.
	 * 	@return a non-committal string*/
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
			response = "Interesting, tell me more.";
		else if (whichResponse == 1)
			response = "Hmmm.";
		else if (whichResponse == 2)
			response = "Do you really think so?";
		else if (whichResponse == 3)
			response = "You don't say.";

		return response;
	}
}
