//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Jeremy Chen
//Date - 8/26/22
//Class - Mauro, P2
//Lab  - Discount Lab ifs 6

import static java.lang.System.*;
import java.util.Scanner;

public class Discount
{
	//instance variables and constructors could be used, but are not really needed
	
	//getDiscountedBill() will return final amount of the bill
	//			if the bill is >2000, the bill receives a 15% discount
	public static double getDiscountedBill(double bill)
	{
		if(bill > 2000) {
			bill = bill*(1-.15);
		}
		return bill;
	}
}