//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jeremy Chen

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int den = 0;
	private int num = 0;

	//write two constructors
	public Rational(int num1, int num2) {
		setRational(num1, num2);
	}
	
	//write a setRational method
	public void setRational(int num1, int num2) {
		setNumDen(num1, num2);
		String result = "" + num1 +"/"+ num2;
	}
	
	
	//write  a set method for numerator and denominator
	public void setNumDen(int num1, int num2) {
		num = num1;
		den = num2;
	}
	
	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		
		//int newNum = ;
		
		
		reduce();
	}

	private void reduce()
	{
		
		
		
	}

	private int gcd(int numOne, int numTwo)
	{


		return 1;
	}

	public Object clone ()
	{
		return "";
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	
	
	public boolean equals( Object obj)
	{


		return false;
	}

	public int compareTo(Rational other)
	{


		return -1;
	}



	
	//write  toString() method
	
	
}