//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jeremy Chen

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block {
	//instance variables
	private int speed;
	
	public Paddle() {
		super(10,10);
		speed = 5;
	}
	
	//add the other Paddle constructors
	public Paddle(int x, int y) {
		super(x, y);
		speed = 5;
	}
	
	public Paddle(int x, int y, int spd) {
		super(x, y);
		setSpeed(spd);
	}
	
	public Paddle(int x, int y, int w, int h) {
		super(x, y, w, h);
		speed = 5;
	}
	
	public Paddle(int x, int y, int w, int h, Color col) {
		super(x, y, w, h, col);
		speed = 5;
	}
	
	public Paddle(int x, int y, int w, int h, int spd) {
		super(x, y, w, h);
		setSpeed(spd);
	}
	
	public Paddle(int x, int y, int w, int h, Color col, int spd) {
		super(x, y, w, h, col);
		setSpeed(spd);
	}
	
	//setter method
	public void setSpeed(int spd) {
		speed = spd;
	}
	
	//add get methods
	public int getSpeed() {
		return speed;
	}
	
	public void moveUpAndDraw(Graphics window) {
		draw(window, Color.white);
		
		setY(getY()-getSpeed());
		
		draw(window, super.getColor());
	}
	
	public void moveDownAndDraw(Graphics window) {
		super.draw(window, Color.white);
		
		setY(getY()+getSpeed());
		
		super.draw(window, super.getColor());
	}
	
	//add a toString() method
	public String toString() {
		return super.toString() + " " + getSpeed();
	}
}