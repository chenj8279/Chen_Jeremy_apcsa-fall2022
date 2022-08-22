//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void setNums()
	{
		Scanner keyboard = new Scanner(in);

		out.print("Enter the distance :: ");
		int dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();
		
	}

	public void calcMPH()
	{
		double time = hours + (double)minutes/60;
		mph = distance/time;
	}

	public void print()
	{
		out.println("" + distance + " miles in " + hours + " hours and " + minutes + " minutes = " + (String.format("%.0f", mph)) + " MPH.");
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "" + distance + " miles in " + hours + " hours and " + minutes + " minutes = " + (String.format("%.0f", mph)) + " MPH.";
	}
}