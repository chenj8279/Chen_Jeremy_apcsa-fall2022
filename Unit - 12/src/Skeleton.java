//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jeremy Chen

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	//add instance variables
	private int size;
	private String name;
	
	//add a constructor
	public Skeleton() {
		this("name", 1);
	}
	public Skeleton(String name, int size) {
		setName(name);
		setSize(size);
	}
	
	//add code to implement the Monster interface
	public void setName(String name) {
		this.name = name;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getName() {
		return this.name;
	}
	public int getHowBig() {
		return this.size;
	}
	
	public boolean isSmaller(Monster other) {
		if(this.getHowBig() < other.getHowBig()) {
			return true;
		}
		return false;
	}
	public boolean isBigger(Monster other) {
		if(this.getHowBig() > other.getHowBig()) {
			return true;
		}
		return false;
	}
	
	
	//add a toString
}