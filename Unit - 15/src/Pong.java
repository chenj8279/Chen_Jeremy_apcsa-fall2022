//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jeremy Chen

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Wall rightWall;
	private Wall leftWall;
	private Wall topWall;
	private Wall botWall;
	
	private Ball ball;
	
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	
	private Block scoreBox;
	private int leftScore;
	private int rightScore;
	
	private boolean[] keys;
	private BufferedImage back;
	
	
	public Pong() {
		//set up all variables related to the game
		leftWall = new Wall (20, 20, 10, 520);
		rightWall = new Wall (750, 20, 10, 520);
		topWall = new Wall (20, 20, 730, 10);
		botWall = new Wall (20, 540, 740, 10);
		
		ball = new BlinkyBall();
		
		leftPaddle = new Paddle(105, 230, 10, 75, 5);
		rightPaddle = new Paddle(675, 230, 10, 75, 5);
		
		leftScore = 0;
		rightScore = 0;
		scoreBox = new Block(350, 45, 100, 50, Color.cyan);
		
		keys = new boolean[4];
		
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
	public void update(Graphics window){
		paint(window);
	}

	public void paint(Graphics window) {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;
		
		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
			back = (BufferedImage)(createImage(getWidth(),getHeight()));
		
		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();
		
		scoreBox.draw(graphToBack);
		twoDGraph.drawString("Leftscore: " + leftScore, 360, 60);
		twoDGraph.drawString("Rightscore: " + rightScore, 360, 90);
		
		leftWall.draw(graphToBack);
		rightWall.draw(graphToBack);
		topWall.draw(graphToBack);
		botWall.draw(graphToBack);
		
		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);
		
		
		//see if ball hits left wall or right wall
		if(ball.didCollideLeft(leftWall)) {
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			rightScore++;
			ball.setColor(Color.white);
			ball.draw(graphToBack);
			ball = new BlinkyBall();
		}
		if(ball.didCollideRight(rightWall)) {
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			leftScore++;
			ball.setColor(Color.white);
			ball.draw(graphToBack);
			ball = new BlinkyBall();
		}
		
		//see if the ball hits the top or bottom wall 
		if(ball.didCollideBottom(botWall) || ball.didCollideTop(topWall)) {
			ball.setYSpeed(-ball.getYSpeed());
		}
		
		//see if the ball hits the left paddle
		if(ball.didCollideLeft(leftPaddle)) {
			ball.setXSpeed(-ball.getXSpeed());
		}
		
		//see if the ball hits the right paddle
		if(ball.didCollideRight(rightPaddle)) {
			ball.setXSpeed(-ball.getXSpeed());
		}
		
		//see if the paddles need to be moved
		if(keys[0] && (leftPaddle.getY() > (topWall.getY() + topWall.getHeight()))) {
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[1] && ((leftPaddle.getY() + leftPaddle.getHeight()) < botWall.getY())) {
			leftPaddle.moveDownAndDraw(graphToBack);
		}
		if(keys[2] && (rightPaddle.getY() > (topWall.getY() + topWall.getHeight()))) {
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[3] && ((rightPaddle.getY() + rightPaddle.getHeight()) < botWall.getY())) {
			rightPaddle.moveDownAndDraw(graphToBack);
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
		
		
	}
	
	public void keyPressed(KeyEvent e) {
		switch(toUpperCase(e.getKeyChar())) {
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}
	
	public void keyReleased(KeyEvent e) {
		switch(toUpperCase(e.getKeyChar())) {
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}
	
	public void keyTyped(KeyEvent e){}
	
	public void run() {
		try {
			while(true) {
				Thread.currentThread().sleep(8);
				repaint();
			}
		}catch(Exception e) {
			
		}
  	}	
}