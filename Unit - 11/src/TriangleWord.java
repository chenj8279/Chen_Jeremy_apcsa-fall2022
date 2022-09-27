//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		for (int i = 0; i < word.length(); i++) {
			out.println(word.substring(i));
			for(int j = i; j > 0; j--) {
				out.print(word.substring(j));
			}
		}
	}
}