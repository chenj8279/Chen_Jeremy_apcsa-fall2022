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
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private Alien alienOne;
	private Alien alienTwo;
	private Ammo ao;

	//uncomment once you are ready for this part
	//private AlienHorde horde;
	//private Bullets shots;


	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace() {
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other instance variables
		//Ship, Alien
		ship = new Ship();
		
		//ao = new Ammo(0, 0, 1);
		
		alienOne = new Alien();
		alienTwo = new Alien(300, 300, 50, 50, 1);

		this.addKeyListener(this);
		new Thread(this).start();
		setVisible(true);
	}

	public void update(Graphics window) {
		paint(window);
	}

	public void paint( Graphics window ) {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null) back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		
		
		
		ship.draw(graphToBack);
		if(ao != null) {
			ao.move("UP");
			ao.draw(graphToBack);
		}
		
		if(alienOne != null) {
			alienOne.draw(graphToBack);
		}
		
		alienTwo.draw(graphToBack);

		//add code to move Ship, Alien, etc.
		if(keys[0] == true) {
			ship.move("LEFT");
			//alienOne.move("LEFT");
			//alienTwo.move("LEFT");
		}
		if(keys[1] == true) {
			ship.move("RIGHT");
			//alienOne.move("RIGHT");
			//alienTwo.move("RIGHT");
		}
		
		if(keys[2] == true) {
			ship.move("UP");
			//alienOne.move("UP");
			//alienTwo.move("UP");
		}
		
		if(keys[3] == true) {
			ship.move("DOWN");
			//alienOne.move("DOWN");
			//alienTwo.move("DOWN");
		}
		
		if(keys[4] == true) {
			ao = new Ammo(ship.getX() + (ship.getWidth()/2) - 5, ship.getY(), 5);
			//ao.draw(graphToBack);
		}

		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship
		
		//collisions
			//ammo.y + ammo.height >= alien.y
			//AND
			//ammo.y <= alien.y + alien.height
		
			//AND
		
			//ammo.x + ammo.width > alien.x
			//AND
			//ammo.x < alien.x + alien.width
		if(ao != null && alienOne != null)
		if((ao.getY() + ao.getHeight()) >= alienOne.getY() && 
				ao.getY() <= (alienOne.getY() + alienOne.getHeight()) &&
				(ao.getX() + ao.getWidth()) >= alienOne.getX() &&
				ao.getX() <= (alienOne.getX() + alienOne.getWidth())) {
			
			alienOne = null;
			ao = null;
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
	}


	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e) {
		//no code needed here
	}

	public void run() {
		try {
			while(true) {
				Thread.currentThread().sleep(5);
				repaint();
			}
		} catch(Exception e) {
			
		}
	}
}

