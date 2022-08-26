//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Jeremy Chen
//Date - 8/31/22
//Class - Mauro, P2
//Lab  - String Odd Or Even

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven()
	{
		
	}

	public StringOddOrEven(String s)
	{
		
	}

	public void setString(String s)
	{
		word = s;
	}

 	public boolean isEven()
 	{
 		if(word.length()%2 == 0) {
 			return true;
 		}
		return false;
	}

 	public String toString()
 	{
 		String bob = "odd";
 		if(isEven() == true) {
 			bob = "even";
 		}
 		String output = word + " is " + bob;
 		return output;
	}
}