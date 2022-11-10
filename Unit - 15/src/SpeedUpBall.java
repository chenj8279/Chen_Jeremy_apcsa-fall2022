//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jeremy Chen

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends Ball {
	//instance variables
	private int xSpeed, ySpeed;
	
	public SpeedUpBall() {
		super();
	}
	
	public SpeedUpBall(int x, int y) {
		super(x, y);
	}
	
	public SpeedUpBall(int x, int y, int xSpd, int ySpd) {
		super(x, y);
		setXSpeed(xSpd);
		setYSpeed(ySpd);
	}
	
	public SpeedUpBall(int x, int y, int wid, int ht, int xSpd, int ySpd) {
		super(x, y, wid, ht, xSpd, ySpd);
	}
	
	public SpeedUpBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd) {
		super(x, y, wid, ht, col, xSpd, ySpd);
	}
	
	public void setXSpeed( int xSpd ) {
		if(xSpd > 0) {
			xSpeed = xSpd + (int) Math.random()*10;
		}
		xSpeed = xSpd - (int) Math.random()*10;
	}
	
	public void setYSpeed( int ySpd ) {
		if(ySpd > 0) {
			ySpeed = ySpd + (int) Math.random()*10;
		}
		ySpeed = ySpd - (int) Math.random()*10;
	}
}

