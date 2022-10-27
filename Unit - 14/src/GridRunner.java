//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jeremy Chen;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		String[] vals = new String[36];
		for(int i = 0; i < vals.length; i++) {
			if(48 + i < 58) {
				vals[i] = "" + ((char) (48+i));
			}
			else{
				vals[i] = "" + ((char) (97+i-10));
			}
		}
		Grid test = new Grid(20, 20, vals);
		System.out.println(test);
		System.out.println(test.findMax(vals));
	}
}