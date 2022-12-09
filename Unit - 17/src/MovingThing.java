//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jeremy Chen

import java.awt.Color;
import java.awt.Graphics;

public abstract class MovingThing implements Moveable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	public MovingThing()
	{
		xPos = 10;
		yPos = 10;
		width = 10;
		height = 10;
	}

	public MovingThing(int x, int y)
	{
		xPos = x;
		yPos = y;
		width = 10;
		height = 10;
	}

	public MovingThing(int x, int y, int w, int h) {
		this.setPos(x, y);
		this.setWidth(w);
		this.setHeight(h);
	}

	public void setPos( int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	public void setX(int x) {this.xPos =x;}

	public void setY(int y) {this.yPos = y;}

	public int getX() {return this.xPos;}

	public int getY() {return this.yPos;}

	public void setWidth(int w) {this.width = w;}

	public void setHeight(int h) {this.height = h;}

	public int getWidth() {return this.width;}

	public int getHeight() {return this.height;}

	public abstract void move(String direction);
	public abstract void draw(Graphics window);

	public String toString()
	{
		return getX() + " " + getY() + " " + getWidth() + " " + getHeight();
	}
}