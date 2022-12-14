//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Jeremy Chen

import static java.lang.System.*;

public class DoubleRunner
{
	public static void main(String[] args)
	{
		BiggestDouble run = new BiggestDouble(4.5,6.7,7.8,9.0);
		System.out.println(run);
		//System.out.println("biggest = " + run.getBiggest() + "\n");

		//add more test cases
		
		BiggestDouble test1 = new BiggestDouble(14.51, 6.7, 7.8, 9.0);
		System.out.println(test1);
		
		test1.setDoubles(41.15, 6.17, 71.8, 19.0);
		System.out.println(test1);
		
		test1.setDoubles(884.5, 16.7, 7.8, 9.0);
		System.out.println(test1);
		
		test1.setDoubles(4.5, -456.7, 677.8, 9.0);
		System.out.println(test1);
		
		test1.setDoubles(4.5, 16.7, -7.8, -9.0);
		System.out.println(test1);
		
	}
}