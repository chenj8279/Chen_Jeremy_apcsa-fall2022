//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
		//add test cases	
		Distance test1 = new Distance(x1, y1, x2, y2);
		test1.print();
		test1.setCoordinates(x1, y1, x2, y2);
		test1.print();
		test1.toString();
			
	}
}