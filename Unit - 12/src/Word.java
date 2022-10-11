//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jeremy Chen

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}

	public int compareTo( Word rhs )
	{
		int result = 1;
		if(word.length() > rhs.toString().length()) {
			result = 1;
			return 1;
		}
		else if(word.length() < rhs.toString().length()){
			result = -1;
			return -1;
		}
		else {
			int ind = 0;
			do {
				if(word.charAt(ind) < rhs.toString().charAt(ind)) {
					result = -1;
					return -1;
				}
				ind++;
			}while(word.charAt(ind) == rhs.toString().charAt(ind));
			//for(int i = 0; word.charAt(i) == rhs.toString().charAt(i); i++) {
				//if(word.charAt(i) < rhs.toString().charAt(i)) {
					//result = -1;
					//return -1;
				//}
			//}
			//result = 1;
			//return 1;
		}
		
		return result;
		
	}

	public String toString()
	{
		return word;
	}
}