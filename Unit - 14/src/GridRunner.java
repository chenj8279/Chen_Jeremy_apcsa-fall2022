//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jeremy Chen;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		String[] vals = new String[36];
		for(int i = 0; i < vals.length; i++) {
			if(48 + i < 58) {
				vals[i] = "" + ((char) 48+i);
			}
			else{
				vals[i] = "" + ((char) 97+i);
			}
		}
		//vals = new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		Grid test = new Grid(20, 20, vals);
		System.out.println(test);
	}
}