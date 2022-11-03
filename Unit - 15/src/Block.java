//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jeremy Chen

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;
	
	public Block()
	{
		xPos = 100;
		yPos = 150;
		width = 10;
		height = 10;
		color = Color.black;
	}

	//add other Block constructors - x , y , width, height, color
	public Block(int x, int y) {
		setPos(x, y);
		width = 10;
		height = 10;
		color = Color.black;
	}
	public Block(int x, int y, int w, int h) {
		setPos(x, y);
		setWidth(w);
		setHeight(h);
		color = Color.black;
	}
	
	public Block(int x, int y, int w, int h, Color col) {
		setPos(x, y);
		setWidth(w);
		setHeight(h);
		setColor(col);
	}
	
	//add the other set methods
	public void setPos(int x, int y) {
		setX(x);
		setY(y);
	}
	public void setX(int x) {
		xPos = x;
	}
	
	public void setY(int y) {
		yPos = y;
	}
	
	public void setWidth(int w) {
		width = w;
	}
	
	public void setHeight(int h) {
		height = h;
	}
	
	public void setColor(Color col) {
		color = col;
	}
	
	//graphics
	public void draw(Graphics window) {
		//uncomment after you write the set and get methods
		window.setColor(color);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	public void draw(Graphics window, Color col) {
		window.setColor(col);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	public boolean equals(Object obj) {
		Block o = (Block) obj;
		if(getX() == o.getX() && getY() == o.getY() && getWidth() == o.getWidth() &&
				getHeight() == o.getHeight() && getColor() == o.getColor()) {
			return true;
		}
		return false;
	}
	
	//add the other get methods
	public int getX() {
		return xPos;
	}
	public int getY() {
		return yPos;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public Color getColor() {
		return color;
	}
	
	//add a toString() method  - x , y , width, height, color
	public String toString() {
		return "" + getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor();
	}	
}