//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Jeremy Chen

import static java.lang.System.*;

public class Triples
{
	private String output = "";
	private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
		triSides();
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	public void triSides (){
		
		int max = 0;
		for(int a = 1; a<number; a++) {
			for(int b = 1; b<number; b++) {
				for(int c = 1; c<number; c++) {
					if(Math.pow(c, 2) == Math.pow(b, 2) + Math.pow(a, 2)) {
						max = greatestCommonFactor(a, b, c);
						if(max <= 1) {
							output = output + "\n " + a + " " + b + " " + c;
						}
					}
				}
			}
		}
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		int mini = Math.min(a, b);
		mini = Math.min(mini, c);
		double modA = 0.0;
		double modB = 0.0;
		double modC = 0.0;

			for(int i = 0; i < mini/2; i++) {
				modA = (double)a % i;
				modB = (double)b % i;
				modC = (double)c % i;
				if(modB == 0 && modC == 0 && modA == 0 && i > 1) {
					max = i;
				}
			}

		return max;
	}

	public String toString()
	{
		return output+"\n";
	}
}