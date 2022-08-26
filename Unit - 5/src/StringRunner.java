//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Jeremy Chen
//Date - 8/31/22
//Class - Mauro, P2
//Lab  - String Odd Or Even

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(in);
		
		out.print("Enter a word :: ");
		String s = keyboard.nextLine();
		
		StringOddOrEven str = new StringOddOrEven();
		str.setString(s);
		str.isEven();
		out.println(str);
	}
}