//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calcDistance()
	{
		
	}
	
	public double getDistance()
	{
		return 0.0;
	}
	
	public void print()
	{
		Scanner keyboard = new Scanner(in);
		
		out.print("Enter X1 :: ");
		int x1 = keyboard.nextInt();
		out.print("Enter Y1 :: ");
		int y1 = keyboard.nextInt();
		out.print("Enter X2 :: ");
		int x2 = keyboard.nextInt();
		out.print("Enter Y2 :: ");
		int y2 = keyboard.nextInt();
		
	}
	
	//complete print or the toString

	public String toString()
	{
		return xOne + "" + yOne + "" + xTwo + "" + yTwo;
	}
}