//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jeremy Chen

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
   public Perfect() {
	   setNum(0);
   }
   
	//add a set method
   public void setNum(int num) {
	   number = num;
   }
   

	public boolean isPerfect(int num)
	{
		int ans = 0;
		for(int i = 1; i<= num/2; i++) {
			if(num % i == 0) {
				ans += i;
			}
		}
		if(ans == num) {
			return true;
		}
		else {
			return false;
		}
	}

	//add a toString	
	public String toString() {
		if(isPerfect(number)) {
			return "" + number + " is perfect";
		}
		else {
			return "" + number +" is not perfect.";
		}
	}
	
	
}