//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Jeremy Chen
//Date - 8/23/22
//Class - Mauro, P2
//Lab  - MilesPerHour Lab

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MPHRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);

		out.print("Enter the distance :: ");
		int dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();

		MilesPerHour test1 = new MilesPerHour();
		test1.setNums(dist, hrs, mins);
		test1.calcMPH();
		out.println(test1);
		
		//add more test cases
		
		
	}
}