//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jeremy Chen

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;
	private int wordLen;

	public Word( String s )
	{
		this.word = s;
		this.wordLen = word.length();
	}
	

	public int compareTo( Word rhs )
	{
//		if(word.length() == rhs.toString().length()) {
//			int ind = 0;
//			while(word.charAt(ind) == rhs.toString().charAt(ind) && ind < wordLen) {
//				ind++;
//			}
//			if(word.charAt(ind) < rhs.toString().charAt(ind)) {
//				return 1;
//			}
//		}
		//out.print(this.wordLen + " " + rhs.wordLen);
		if(this.wordLen > rhs.wordLen){
			return 1;
		}
		return -1;
		
	}

	public String toString()
	{
		return word;
	}
}