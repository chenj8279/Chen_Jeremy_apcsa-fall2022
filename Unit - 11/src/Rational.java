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
		this.num = (this.getNum() * other.getDen() + other.getNum() * this.getDen());
		this.den = this.getDen() * other.getDen();
		reduce();
	}

	private void reduce()
	{
		int factor = gcd(Math.max(getNum(), getDen()), Math.min(getNum(),getDen()));
		num = getNum()/factor;
		den = getDen()/factor;
	}

	private int gcd(int numOne, int numTwo)
	{
		int factor = 1;
		for(int i = numTwo; i> 0; i--) {
			if(numTwo%i == 0 && numOne%i == 0) {
				factor = i;
				return factor;
			}
		}
		return factor;
	}
	
	public Object clone()
	{
		Rational c = new Rational(getNum(), getDen());
		return c;
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
		if(this.compareTo((Rational) obj) == 0) {
			return true;
		}
		return false;
	}

	public int compareTo(Rational other)
	{
		double decThis = (double)this.getNum()/this.getDen();
		double decOther = (double)other.getNum()/other.getDen();
		if(decThis > decOther) {
			return 1;
		}
		else if(decThis < decOther) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	//write  toString() method
	public String toString() {
		
		return "" + this.getNum() + "/" + this.getDen();
	}
}