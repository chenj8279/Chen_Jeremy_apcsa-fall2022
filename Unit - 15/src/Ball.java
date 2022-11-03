//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jeremy Chen

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	//add the other Ball constructors
	public Ball(int x, int y) {
		setPos(x, y);
		xSpeed = 3;
		ySpeed =1;
	}
	
	public Ball(int x, int y, int w, int h) {
		setPos(x, y);
		setWidth(w);
		setHeight(h);
		xSpeed = 3;
		ySpeed =1;
	}
	
	public Ball(int x, int y, int w, int h, Color col) {
		setPos(x, y);
		setWidth(w);
		setHeight(h);
		setColor(col);
		xSpeed = 3;
		ySpeed =1;
	}
	
	public Ball(int x, int y, int w, int h, Color col, int xSpd, int ySpd) {
		setPos(x, y);
		setWidth(w);
		setHeight(h);
		setColor(col);
		setXSpeed(xSpd);
		setYSpeed(ySpd);
	}
	
	//add the set methods
	public void setXSpeed(int xSpd) {
		xSpeed = xSpd;
	}
	public void setYSpeed(int ySpd) {
		ySpeed = ySpd;
	}
	
	public void moveAndDraw(Graphics window) {
		//draw a white ball at old ball location
		setX(getX()+xSpeed);
		//setY
		setY(getY()+ySpeed);
		//draw the ball at its new location
		draw(window, this.getColor());
	}
	
	public boolean equals(Object obj) {
		Ball o = (Ball) obj;
		if(getX() == o.getX() && getY() == o.getY() && getWidth() == o.getWidth() &&
				getHeight() == o.getHeight() && getColor() == o.getColor() && 
				this.getXSpeed() == o.getXSpeed() && getYSpeed() == o.getYSpeed()) {
			return true;
		}
		return false;
	}
	
	//add the get methods
	public int getXSpeed() {
		return xSpeed;
	}
	
	public int getYSpeed() {
		return ySpeed;
	}
	
	//add a toString() method
	public String toString() {
		return "" + getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor() + " " + getXSpeed() + " " + getYSpeed();
	}
	
}