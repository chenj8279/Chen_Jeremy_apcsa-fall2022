import java.awt.Color;

public class Wall extends Block{
	public Wall() {
		super();
	}
	public Wall(int x, int y) {
		super(x, y);
	}
	
	public Wall(int x, int y, Color col) {
		super(x, y, col);
	}
	
	public Wall(int x, int y, int w, int h) {
		super(x, y, w, h);
	}
	
	public Wall(int x, int y, int w, int h, Color col) {
		super(x, y, w, h, col);
	}
}
