//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jeremy Chen

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		int count = 0;
		int measure = 2;
		String lets = "";
		String output="";
				
		while(amount>0) {
			lets = lets + " ";
			for(int i = 0; i < amount; i++) {
				lets += letter;
			}
			if(letter+1 <= 90) {
				letter++;
			}
			else if(letter+1 == 91) {
				letter = 65;
			}
			//letter++;
			amount--;
			count++;
		}
		while(count>0) {
			int len = lets.length();
			output += lets + "\n";
			if(amount == 0) {
				len = len - measure;
				lets = lets.substring(0, len);

			}
			else {

				lets = lets.substring(0, lets.length() - measure);
			}
			measure = measure + 1;
			count--;
		}
		
		
		output += "\n";
		return output;
	}
}