//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Jeremy Chen
//Date -  8/26/22
//Class - Mauro, P2
//Lab  - OddEvenNum Lab ifs 4

import static java.lang.System.*;

public class NumberVerify
{
	public static boolean isOdd( int num )
	{
		if(num % 2 == 0) {
			return false;
		}
		return true;
	}
	public static boolean isEven( int num )
	{
		if(num % 2 == 0) {
			return true;
		}
		return false;
	}	
}