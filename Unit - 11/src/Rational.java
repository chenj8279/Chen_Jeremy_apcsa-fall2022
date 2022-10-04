//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jeremy Chen

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int den;
	private int num;

	//write two constructors
	public Rational() {
		this(0, 0);
	}
	
	public Rational(int num, int den) {
		setRational(num, den);
	}
	
	//write a setRational method
	public void setRational(int num, int den) {
		setNum(num);
		setDen(den);
	}
	
	
	//write  a set method for numerator and denominator
	public void setNum(int num) {
		this.num = num;
	}
	
	public void setDen(int den) {
		this.den = den;
	}
	
	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		
		//other.den
		
		
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
