//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jeremy Chen

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable{
	private int xSpeed;
	private int ySpeed;
	
	public Ball() {
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	//add the other Ball constructors
	public Ball(Color col) {
		super(200, 200, col);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y) {
		super(x,y);
		xSpeed = 3;
		ySpeed =1;
	}
	
	public Ball(int x, int y, int w, int h) {
		super(x, y, w, h);
		xSpeed = 3;
		ySpeed =1;
	}
	
	public Ball(int x, int y, int w, int h, int xSpd, int ySpd) {
		super(x, y, w, h);
		setXSpeed(xSpd);
		setYSpeed(ySpd);
	}
	
	public Ball(int x, int y, int w, int h, Color col) {
		super(x, y, w, h, col);
		xSpeed = 3;
		ySpeed =1;
	}
	
	public Ball(int x, int y, int w, int h, Color col, int xSpd, int ySpd) {
		super(x, y, w, h, col);
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
	
	//add the get methods
	public int getXSpeed() {
		return xSpeed;
	}
	
	public int getYSpeed() {
		return ySpeed;
	}
	
	public void moveAndDraw(Graphics window) {
		//draw a white ball at old ball location
		super.draw(window, Color.white);
		//setX
		setX(getX()+xSpeed);
		//setY
		setY(getY()+ySpeed);
		//draw the ball at its new location
		super.draw(window, super.getColor());
	}
	
	public boolean equals(Object obj) {
		Ball o = (Ball) obj;
		if(getXSpeed() != o.getXSpeed()) {
			return false;
		}
		else if(getYSpeed() != o.getYSpeed()) {
			return false;
		}
		else {
			return true;
		}
	}
	
	//add a toString() method
	public String toString() {
		return "" + super.toString() + " " + getXSpeed() + " " + getYSpeed();
	}
	
	//collisions
		/*collision for paddles (left and right collisions)
			left y >= ball y
			and
			ball y <= left y + height
			
			or
			
			ball y + ball height >= left y
			and
			ball y + ball height < left height + left y
			
			AND
			
			ball.x <= left.x + left.width + abs(ballXSpeed)
			
			AND
			
			ball.x <= left.x + left.width - abs(ballXSpeed)*/
	
	public boolean didCollideLeft(Object obj) {
		Block o = (Block) obj;
		return ((((o.getY() <= this.getY()) && (this.getY() <= (o.getY() + o.getHeight()))) || (((this.getY() + this.getHeight()) >= o.getY()) 
						&& ((this.getY() + this.getHeight()) < (o.getY() + o.getHeight())))) 
				&& (this.getX() <= (o.getX() + o.getWidth() + Math.abs(this.getXSpeed()))) && (this.getX() >= (o.getX() + o.getWidth() - Math.abs(this.getXSpeed()))));
	}
	
	public boolean didCollideRight(Object obj) {
		Block o = (Block) obj;
		return ((((o.getY() <= this.getY()) && (this.getY() <= (o.getY() + o.getHeight()))) || (((this.getY() + this.getHeight()) >= o.getY()) 
						&& ((this.getY() + this.getHeight()) < (o.getY() + o.getHeight())))) 
				&& (this.getX() >= (o.getX() - Math.abs(this.getXSpeed())) && (this.getX() <= (o.getX()+ Math.abs(this.getXSpeed())))));
	}
	
	public boolean didCollideTop(Object obj) {
		Block o = (Block) obj;
		return this.getY() < (o.getY() + o.getHeight());
	}
	
	public boolean didCollideBottom(Object obj) {
		Block o = (Block) obj;
		return (this.getY() + this.getHeight()) > o.getY();
	}
}
