//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jeremy Chen

import static java.lang.System.*;

public class Toy
{
	private String name;
	private int count;

	public Toy()
	{
		
	}

	public Toy( String nm )
	{
		setName(nm);
		setCount(count);
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void setCount( int cnt )
	{	
		count = cnt + 1;
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName( String nm )
	{
		name = nm;
	}

	public String toString()
	{
	   return "" + getName() + " " + getCount();
	}
}