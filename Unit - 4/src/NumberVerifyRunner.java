//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Jeremy Chen
//Date - 8/26/22
//Class - Mauro, P2
//Lab  - OddEvenNum Lab ifs 4

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		Scanner keyboard = new Scanner(in);
		System.out.print("Enter a whole number :: ");
		int num = keyboard.nextInt();
		
		System.out.println(num + " is odd :: " + NumberVerify.isOdd(num));
		System.out.println(num + " is even :: " + NumberVerify.isEven(num));
		
		//add in more test cases
	}
}