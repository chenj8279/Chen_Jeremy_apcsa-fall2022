//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jeremy Chen

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		for (int i = 1; i <= word.length(); i++) {
			out.print(word.substring(0,i));
			for(int j = i-1; j > 0; j--) {
				out.print(word.substring(0,i));
			}
			out.print("\n");
		}
	}
}