//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Jeremy Chen
//Date - 8/31/22
//Class - Mauro, P2
//Lab  - String Equality if else

import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo;

	public StringEquality()
	{
		
	}

	public StringEquality(String one, String two)
	{
		
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public boolean checkEquality( )
	{
		if(wordOne.equals(wordTwo)) {
			return true;
		}
		return false;
	}

	public String toString()
	{
		if(checkEquality() == true) {
			return wordOne + " does have the same letters as " + wordTwo + "\n";
		}
		return wordOne + " does not have the same letters as " + wordTwo + "\n";
	}
}