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
		if(this.wordLen < rhs.wordLen){
			return -1;
		}
		else if(this.wordLen == rhs.wordLen) {
			//out.print(this.word + " " +rhs.word);
//			for(int i = 0; i < this.wordLen; i++) {
//				out.print(this.word.charAt(i) + " " + rhs.word.charAt(i));
//				out.print(this.word.charAt(i)-rhs.word.charAt(i));
//				if(this.word.charAt(i) < rhs.word.charAt(i)) {
//					
//					return -1;
//				}
//			}
			return this.word.compareTo(rhs.word);
		}
		return 1;
	}

	public String toString()
	{
		return word;
	}
}