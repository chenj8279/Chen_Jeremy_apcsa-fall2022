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
		
		this.num = (this.num * other.den + other.num * this.den);
		this.den = this.den * other.den;
		
		reduce();
	}

	private void reduce()
	{
		int gcd =gcd(num, den);
		num = num/gcd;
		den = den/gcd;
	}

	private int gcd(int numOne, int numTwo)
	{
		int gcd = 1;
		for(int i = 0; i < numOne/2; i++) {
			if(numOne%i == 0 && numTwo%i == 0) {
				gcd = i;
			}
		}
		
		return gcd;
	}
	
	public Object clone ()
	{
		return "";
	}
	
	//ACCESSORS
	
	//write get methods for numerator and denominator
	public int getNum() {
		return this.num;
	}
	
	public int getDen() {
		return this.den;
	}
	
	public boolean equals(Object obj)
	{

		return false;
	}

	public int compareTo(Rational other)
	{
		
		return -1;
	}
	
	//write  toString() method
	public String toString() {
		
		return "";
	}
}