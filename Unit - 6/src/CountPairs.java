//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jeremy Chen

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		int count = 0;
		for(int i = 0; i<str.length()-1; i++) {
			String One = str.substring(i, i+1);
			String Two = str.substring(i+1, i+2);
			if(One.equals(Two)) {
				count++;
			}
		}
		return count;
	}
}