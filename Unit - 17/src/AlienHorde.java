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

	public AlienHorde(int size) {
		for(int i = 0; i < size; i++) {
			
			this.add(new Alien());
		}
	}

	public void add(Alien al) {
		Alien before = null;
		if(aliens.size() > 0) {
			before = aliens.get(aliens.size() - 2);
		}
		al = new Alien(before.getX() + before.getWidth() + 10, before.getY());
		
		aliens.add(al);
	}

	public void drawEmAll( Graphics window ) {
		
	}

	public void moveEmAll() {
		
	}

	public void removeDeadOnes(List<Ammo> shots) {
		
	}

	public String toString() {
		return "";
	}
}
