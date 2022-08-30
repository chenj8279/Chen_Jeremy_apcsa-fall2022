//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jeremy Chen

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		//call set
		setRemover("", ' ');
	}

	//add in second constructor
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned = "";
		/*for(int i = 0; i<sentence.length(); i++) {
			if(sentence.charAt(i) != lookFor) {
				cleaned += sentence.charAt(i);
			}
		}*/
		
		int o = 0;
		while (o<sentence.length()) {
			if(sentence.charAt(o) != lookFor) {
				cleaned += sentence.charAt(o);
			}
			o++;
		}
		
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters() + "\n";
	}
}