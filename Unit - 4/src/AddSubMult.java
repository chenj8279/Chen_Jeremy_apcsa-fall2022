//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jeremy Chen

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMult
{
	public static double check( double a, double b )
	{
		double ans = 0;
		if(a>b) {
			ans = a-b;
		}
		else if(b>a) {
			ans = b-a;
		}
		else if(a==b) {
			ans = a*b;
		}
		return ans;
	}
}