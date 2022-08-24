//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Jeremy Chen
//Date - 8/26/22
//Class - Mauro, P2
//Lab  - Discount Lab ifs 6

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		Discount Bob = new Discount();
		out.println("Bill after discount :: " + String.format("%.2f", Bob.getDiscountedBill(amt)));

	}
}