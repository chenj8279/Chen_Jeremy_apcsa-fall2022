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
		this(1, 1);
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
		int factor;
		if(num>den) {
			factor = gcd(num, den);
		}
		else if(den>num) {
			factor = gcd(den, num);
		}
		else {
			factor = 1;
		}
		num = num/factor;
		den = den/factor;
	}

	private int gcd(int numOne, int numTwo)
	{
		int factor = 1;
		for(int i = numTwo/2; i> 0; i--) {
			if(numTwo%i == 0 && numOne%i == 0) {
				factor = i;
				break;
			}
		}
		return factor;
	}
	
	public Object clone ()
	{
		return new Rational(getNum(), getDen());
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
		((Rational) obj).reduce();
		this.reduce();
		if(this == obj) {
			return true;
		}
		return false;
	}

	public int compareTo(Rational other)
	{
		double ofThis = this.num/this.den;
		double ofOther = other.num/other.den;
		if(ofThis > ofOther) {
			return 1;
		}
		else if(ofThis == ofOther) {
			return 0;
		}
		return -1;
	}
	
	//write  toString() method
	public String toString() {
		
		return "" + this.num + "/" + this.den;
	}
}