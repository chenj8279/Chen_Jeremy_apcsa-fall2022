//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;
	private int spacing = 30;

	public AlienHorde(int size) {
		aliens = new ArrayList<Alien>();
		for(int i = 0; i <= size; i++) {

			this.add(new Alien());
		}
	}

	public void add(Alien al) {
		al = new Alien();
		int row = 0;
		if(aliens.size() > 1) {
			Alien before = aliens.get(aliens.size() - 1);
			int s = before.getSpeed();
			int x = before.getX() + before.getWidth() + spacing;
			int y = before.getY();
			if(x > (800 - before.getWidth())) {
				x = 0;
				y = before.getY() - before.getHeight() - spacing;
				s = -s;
			}	
			al = new Alien(x, y, s);
		}
		aliens.add(al);
	}

	public void drawEmAll( Graphics window ) {
		for(int i = 0; i < aliens.size(); i++) {
			aliens.get(i).draw(window);
		}
	}

	public void moveEmAll() {
		for(int i = 0; i < aliens.size(); i++) {
			Alien bob = aliens.get(i);
			if(bob.getX() + bob.getSpeed() < 0 || bob.getX() + bob.getWidth() + bob.getSpeed() > 800) {
				aliens.get(i).setY(bob.getY() + bob.getHeight() + spacing);
				aliens.get(i).setSpeed(-bob.getSpeed());
			}
			aliens.get(i).move("RIGHT");
		}
	}

	public void removeDeadOnes(List<Ammo> shots) {
		//collisions logic
		//ammo.y + ammo.height >= alien.y
		//AND
		//ammo.y <= alien.y + alien.height

		//AND

		//ammo.x + ammo.width > alien.x
		//AND
		//ammo.x < alien.x + alien.width
		//may need to include speed;

		for(int i = 0; i < shots.size(); i++) {
			Ammo ao = shots.get(i);
			for(int j = 0; j < aliens.size(); j++) {
				Alien al = aliens.get(j);
				if((ao.getY() + ao.getHeight()) >= al.getY() && 
						ao.getY() <= (al.getY() + al.getHeight()) &&
						(ao.getX() + ao.getWidth()) >= al.getX() && 
						ao.getX() <= (al.getX() + al.getWidth())) {
					shots.remove(i);
					aliens.remove(j);
					break;
				}
			}
		}
	}

	public String toString() {
		return "" + aliens.toString();
	}
}
