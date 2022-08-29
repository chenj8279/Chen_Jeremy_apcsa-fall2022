//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jeremy Chen

import static java.lang.System.*;

public class Word
{
	private String word;

	public Word()
	{
		
	}

	public Word(String s)
	{
		
	}

	public void setString(String s)
	{
		word = s;
	}

	public char getFirstChar()
	{
		return word.charAt(0);
	}

	public char getLastChar()
	{
		return word.charAt(word.length()-1);
	}

	public String getBackWards()
	{
		String back="";
		for(int i = word.length()-1; i >= 0; i--) {
			char index =  word.charAt(i);
			back += index; 
		}
		
		return back;
	}

 	public String toString()
 	{
 		return "" + getFirstChar() + "\n" + getLastChar() + "\n" + getBackWards() + "\n" + word + "\n";
	}
}