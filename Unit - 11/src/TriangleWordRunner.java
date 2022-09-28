//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jeremy Chen

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		TriangleWord test = new TriangleWord();
		
		String r = "";
		
		do {
			out.print("Enter a word :: ");
			String word = keyboard.next();
			
			test.printTriangle(word);
			
			out.print("\nDo you want to enter more sample input?");
			r = keyboard.next();
		} while (r.equals("y")|| r.equals("Y"));
		
	}
}