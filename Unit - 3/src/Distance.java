//(c) A+ Computer Science 
//www.apluscompsci.com

//Name - Jeremy Chen
//Date - 8/23/22
//Class - Mauro, P2
//Lab  - Distance Lab

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
		setCoordinates(x1,y1,x2,y2);
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
		double xPow = Math.pow(((double)xOne-xTwo),2);
		double yPow = Math.pow(((double)yOne-yTwo),2);
		distance = Math.sqrt((xPow+yPow));
	}
	
	public double getDistance()
	{
		return 0.0;
	}
	
	public void print()
	{
		
	}
	
	//complete print or the toString

	public String toString()
	{
		return "distance == " + String.format("%.3f", distance);
	}
}