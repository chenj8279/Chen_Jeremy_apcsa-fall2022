import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
	///////////////////// constructors //////////////////////////////////

	/**
	 * Constructor that takes no arguments 
	 */
	public Picture ()
	{
		/* not needed but use it to show students the implicit call to super()
		 * child constructors always call a parent constructor 
		 */
		super();  
	}

	/**
	 * Constructor that takes a file name and creates the picture 
	 * @param fileName the name of the file to create the picture from
	 */
	public Picture(String fileName)
	{
		// let the parent class handle this fileName
		super(fileName);
	}

	/**
	 * Constructor that takes the width and height
	 * @param height the height of the desired picture
	 * @param width the width of the desired picture
	 */
	public Picture(int height, int width)
	{
		// let the parent class handle this width and height
		super(width,height);
	}

	/**
	 * Constructor that takes a picture and creates a 
	 * copy of that picture
	 * @param copyPicture the picture to copy
	 */
	public Picture(Picture copyPicture)
	{
		// let the parent class do the copy
		super(copyPicture);
	}

	/**
	 * Constructor that takes a buffered image
	 * @param image the buffered image to use
	 */
	public Picture(BufferedImage image)
	{
		super(image);
	}

	////////////////////// methods ///////////////////////////////////////

	/**
	 * Method to return a string with information about this picture.
	 * @return a string with information about the picture such as fileName,
	 * height and width.
	 */
	public String toString()
	{
		String output = "Picture, filename " + getFileName() + 
				" height " + getHeight() 
				+ " width " + getWidth();
		return output;

	}

	/** Method to set the blue to 0 */
	public void zeroBlue()
	{
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels)
		{
			for (Pixel pixelObj : rowArray)
			{
				pixelObj.setBlue(0);
			}
		}
	}
	
	public void keepOnlyBlue() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setGreen(0);
				pixelObj.setRed(0);
			}
		}
	}
	
	public void keepOnlyRed() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setGreen(0);
				pixelObj.setBlue(0);
			}
		}
	}
	
	public void keepOnlyGreen() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setBlue(0);
				pixelObj.setRed(0);
			}
		}
	}
	
	public void negate() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setRed(255 - pixelObj.getRed());
				pixelObj.setGreen(255 - pixelObj.getGreen());
				pixelObj.setBlue(255 - pixelObj.getBlue());
			}
		}
	}
	
	public void grayscale() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				int gray = (pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue())/3;
				pixelObj.setRed(gray);
				pixelObj.setGreen(gray);
				pixelObj.setBlue(gray);
			}
		}
	}
	
	public void fixUnderwater() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				int newRed = (pixelObj.getRed() * 27)/10;
				if(newRed > 255) newRed = 255;
				pixelObj.setRed(newRed);
			}
		}
	}
	
	/** Method that mirrors the picture around a 
	 * vertical mirror in the center of the picture
	 * from left to right */
	public void mirrorVerticalLeftToRight()
	{
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++)
		{
			for (int col = 0; col < width / 2; col++)
			{
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}
	
	/** Method that mirrors the picture
	 * vertical mirror in the center of the picture
	 * right side on the left side */
	public void mirrorVerticalRightToLeft() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		for (int row = 0; row < pixels.length; row++) {
			int width = pixels[row].length;
			for (int col = width/2; col < width; col++) {
				rightPixel = pixels[row][col];
				leftPixel = pixels[row][width/2 - (col-(width/2))];
				leftPixel.setColor(rightPixel.getColor());
			}
		}
	}
	
	/** Method that mirrors the picture
	 * horizontal mirror in the center of the picture
	 * top side on the bot side */
	public void mirrorHorizontalTopToBot() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel botPixel = null;
		for (int row = 0; row < pixels.length/2; row++) {
			for (int col = 0; col < pixels[row].length; col++) {
				topPixel = pixels[row][col];
				botPixel = pixels[pixels.length - 1 - row][col];
				botPixel.setColor(topPixel.getColor());
			}
		}
	}
	
	/** Method that mirrors the picture
	 * horizontal mirror in the center of the picture
	 * bot side on the top side */
	public void mirrorHorizontalBotToTop() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel botPixel = null;
		for (int row = 0; row < pixels.length/2; row++) {
			for (int col = 0; col < pixels[row].length; col++) {
				topPixel = pixels[row][col];
				botPixel = pixels[pixels.length - 1 - row][col];
				topPixel.setColor(botPixel.getColor());
			}
		}
	}
	
	/** Method that mirrors the picture
	 * diagonal mirror where rows == cols
	 * botLeft side on the topRight side */
	public void mirrorDiagonalBotLeft() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel overPixel = null;
		Pixel underPixel = null;
		
		int boundry = pixels.length;
		
		for (int row = boundry-1; row > -1; row--) {
			for (int col = 0; col < boundry; col++) {
				underPixel = pixels[row][col];
				overPixel = pixels[col][row];
				overPixel.setColor(underPixel.getColor());
			}
		}
	}

	/** Mirror just part of a picture of a temple */
	public void mirrorTemple()
	{
		int mirrorPoint = 276;
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int count = 0;
		Pixel[][] pixels = this.getPixels2D();

		// loop through the rows
		for (int row = 27; row < 97; row++)
		{
			// loop from 13 to just before the mirror point
			for (int col = 13; col < mirrorPoint; col++)
			{
				count++;
				leftPixel = pixels[row][col];      
				rightPixel = pixels[row]                       
						[mirrorPoint - col + mirrorPoint];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
		System.out.print(count);
	}
	
	/** Mirror arms of a snowman to have 4 arms */
	public void mirrorArms() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel pix1 = null;
		Pixel pix2 = null;
		
		//og arm positions
		int xBeginR = 104;
		int xStopR = 170;
		int yBeginR = 159;
		int yStopR = 191;
		
		int xBeginL = 238;
		int xStopL = 294;
		int yBeginL = 171;
		int yStopL = 195;
		
		//new arm positions
		int xNewArmR = 238 + xStopR - xBeginR;
		int yNewArmR = 194 + yStopR - yBeginR;
		
		int xNewArmL = 170;
		int yNewArmL = 206 + 180 - yBeginL;
		
		//right arm
		for(int x = xBeginR; x < xStopR; x++) {
			for(int y = yBeginR; y < yStopR; y++) {
				int offsetX = x - xBeginR;
				int offsetY = y - yBeginR;
				
				pix1 = pixels[y][x];
				pix2 = pixels[yNewArmR - offsetY][xNewArmR - offsetX];
				pix2.setColor(pix1.getColor());
			}
		}
		
		//left arm
		for(int x = xBeginL; x < xStopL; x++) {
			for(int y = yBeginL; y < yStopL; y++) {
				int offsetX = x - xBeginL;
				int offsetY = y - yBeginL;
				
				pix1 = pixels[y][x];
				pix2 = pixels[yNewArmL - offsetY][xNewArmL - offsetX];
				pix2.setColor(pix1.getColor());
			}
		}
	}
	
	public void mirrorGull() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel ogBird = null;
		Pixel newBird = null;
		
		//ogBird position
		int xBird = 238;
		int yBird = 235;
		
		int mirrorPoint = 345;
		int yGround = 323;
		
		for(int x = xBird; x < mirrorPoint; x++) {
			for(int y = yBird; y < yGround; y++) {
				ogBird = pixels[y][x];
				newBird = pixels[y+8][mirrorPoint + mirrorPoint - x];
				newBird.setColor(ogBird.getColor());
			}
		}
	}

	/** copy from the passed fromPic to the
	 * specified startRow and startCol in the
	 * current picture
	 * @param fromPic the picture to copy from
	 * @param startRow the start row to copy to
	 * @param startCol the start col to copy to
	 */
	public void copy(Picture fromPic, 
			int startRow, int startCol)
	{
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = 0, toRow = startRow; 
				fromRow < fromPixels.length &&
				toRow < toPixels.length; 
				fromRow++, toRow++)
		{
			for (int fromCol = 0, toCol = startCol; 
					fromCol < fromPixels[0].length &&
					toCol < toPixels[0].length;  
					fromCol++, toCol++)
			{
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}
		}   
	}
	
	public void copy(Picture fromPic, int copyRow, int copyCol, int startRow, int endRow, int startCol, int endCol) {
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for(int fromRow = startRow, toRow = copyRow;
				fromRow < endRow && toRow < toPixels.length;
				fromRow++, toRow++) 
		{
			for(int fromCol = startCol, toCol = copyCol;
					fromCol < endCol && toCol < toPixels[toRow].length;
					fromCol++, toCol++)
			{
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}
		}
	}
	
	/** Method to create a collage of several pictures */
	public void createCollage()
	{
		Picture flower1 = new Picture("C:\\Users\\chenj8279\\Desktop\\Jeremy Chen - APCSA\\Unit - 16\\src\\images\\flower1.jpg");
		Picture flower2 = new Picture("C:\\Users\\chenj8279\\Desktop\\Jeremy Chen - APCSA\\Unit - 16\\src\\images\\flower2.jpg");
		this.copy(flower1,0,0);
		this.copy(flower2,100,0);
		this.copy(flower1,200,0);
		Picture flowerNoBlue = new Picture(flower2);
		flowerNoBlue.zeroBlue();
		this.copy(flowerNoBlue,300,0);
		this.copy(flower1,400,0);
		this.copy(flower2,500,0);
		this.mirrorVerticalLeftToRight();
		this.write("collage.jpg");
	}
	
	public void myCollage() {
		Picture beach = new Picture("C:\\Users\\chenj8279\\Desktop\\Jeremy Chen - APCSA\\Unit - 16\\src\\images\\beach.jpg");
		Picture beachMirror = new Picture(beach);
		beachMirror.mirrorDiagonalBotLeft();
		Picture flower1 = new Picture("C:\\Users\\chenj8279\\Desktop\\Jeremy Chen - APCSA\\Unit - 16\\src\\images\\flower1.jpg");
		Picture flower1Gray = new Picture(flower1);
		flower1Gray.grayscale();
		Picture snowman = new Picture("C:\\Users\\chenj8279\\Desktop\\Jeremy Chen - APCSA\\Unit - 16\\src\\images\\snowman.jpg");
		Picture snowman4Arm = new Picture(snowman);
		snowman4Arm.mirrorArms();
		
		this.copy(flower1Gray, 200, 0);
		this.copy(snowman4Arm, 0, 0, 150, 230, 0, 400);
		this.copy(beachMirror, this.getHeight() - 320, this.getWidth() - 320, 0, 320, 0, 320);
	}
	
	/** Method to show large changes in color 
	 * left to right
	 * @param edgeDist the distance for finding edges
	 */
	public void edgeDetection(int edgeDist)
	{
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		Color rightColor = null;
		for (int row = 0; row < pixels.length; row++)
		{
			for (int col = 0; 
					col < pixels[0].length-1; col++)
			{
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][col+1];
				rightColor = rightPixel.getColor();
				if (leftPixel.colorDistance(rightColor) > 
				edgeDist)
					leftPixel.setColor(Color.BLACK);
				else
					leftPixel.setColor(Color.WHITE);
			}
		}
	}
	
	/** Method to show large changes in color 
	 * top to bot and left to right
	 * @param edgeDist the color distance for finding edges
	 */
	
	public void edgeDetection2(int edgeDist) {
		Pixel pix1 = null;
		Pixel pix2 = null;
		Pixel pix3 = null;
		Pixel[][] pixels = this.getPixels2D();
		
		for(int row = 0; row < pixels.length-1; row++) {
			for(int col = 0; col < pixels[row].length-1; col++) {
				pix1 = pixels[row][col];
				pix2 = pixels[row][col+1];
				pix3 = pixels[row+1][col];
				if((pix1.colorDistance(pix2.getColor()) > edgeDist) || (pix1.colorDistance(pix3.getColor()) >  edgeDist)) {
					pix1.setColor(Color.BLACK);
				}
				else {
					pix1.setColor(Color.WHITE);
				}
			}
		}
		//last col
		for(int i = 0; i < pixels.length-1; i++) {
			pix1 = pixels[i][pixels.length-1];
			pix2 = pixels[i+1][pixels.length-1];
			if(pix1.colorDistance(pix2.getColor()) > edgeDist) {
				pix1.setColor(Color.BLACK);
			}
			else {
				pix1.setColor(Color.WHITE);
			}
		}
		//last row
		for(int i = 0; i < pixels[pixels.length-1].length-1; i++) {
			pix1 = pixels[pixels.length-1][i];
			pix2 = pixels[pixels.length-1][i+1];
			if(pix1.colorDistance(pix2.getColor()) > edgeDist) {
				pix1.setColor(Color.BLACK);
			}
			else {
				pix1.setColor(Color.WHITE);
			}
		}
	}
	
	/** Method to encode and hide a msg in a picture
	 * 
	 * @param messagePict is picture is with the msg
	 */
	public void encoder(Picture messagePict) {
		Pixel[][] msgPixels = messagePict.getPixels2D();
		Pixel[][] currPixels = this.getPixels2D();
		
		int[] blacksInRow = new int[currPixels.length];
		int[] blacksInCol = new int[currPixels[0].length];
		
		//blacks going across
		for(int row = 0; row < msgPixels.length && row < blacksInRow.length; row++) {
			int count = 0;
			for(int col = 0; col < msgPixels[row].length && col < currPixels[row].length; col++) {
				if(msgPixels[row][col].getColor() == Color.BLACK) count++;
			}
			blacksInRow[row] = count;
			count = 0;
		}
		
		//blacks going down
		for(int col = 0; col < blacksInCol.length && col < msgPixels[0].length; col++) {
			int count = 0;
			for(int row = 0; row < msgPixels.length && row < currPixels.length; row++) {
				if(msgPixels[row][col].getColor() == Color.BLACK) count++;
			}
			blacksInCol[col] = count;
			count = 0;
		}
		
		//values in pixels
		//ones
		//tens
		//hundreds
		
		//blacks going across
		for(int col = 0; col < 3; col++) {
			for(int row = 0; row < blacksInRow.length && row < currPixels.length; row++) {
				int g = currPixels[row][col].getGreen();
				int n = (int) ((blacksInCol[col]/Math.pow(10,row))%10);
				int d = g%10 - n;
				
				
				if(d<5 || d>-5) currPixels[row][col].setGreen(g-d);
				
				else if(g%10>n) currPixels[row][col].setGreen(g+(10-d));
				
				else if(d>g) currPixels[row][col].setGreen(g+(10-d));
				
				else currPixels[row][col].setGreen(g-(10-Math.abs(d)));
			}
		}
		
		//blacks going down
		for(int row = 0; row < 3; row++) {
			for(int col = 0; col < blacksInCol.length && col < currPixels[row].length; col++) {
				int b = currPixels[row][col].getBlue();
				int n = (int) ((blacksInCol[col]/Math.pow(10,row))%10);
				int d = b%10 - n;
				
				
				if(d<5 || d>-5) currPixels[row][col].setBlue(b-d);
				
				else if(b%10>n) currPixels[row][col].setBlue(b+(10-d));
				
				else if(d>b) currPixels[row][col].setBlue(b+(10-d));
				
				else currPixels[row][col].setBlue(b-(10-Math.abs(d)));
			}
		}
	}
	
	/** Method to decode a picture from encoder
	 * 
	 * @return picture with hidden msg
	 */
	public Picture decode() {
		Pixel[][] pixels = this.getPixels2D();
		Picture messagePicture = new Picture(this.getHeight(), this.getWidth());
		Pixel[][] msgPixels = messagePicture.getPixels2D();
		
		int[] blacksInRow = new int[pixels.length];
		int[] blacksInCol = new int[pixels[0].length];
		
		//blacks going across
		for(int i = 0; i < blacksInRow.length; i++) {
			
		}
		
		//blacks going down
		for(int i = 0; i < blacksInCol.length; i++) {
			
		}
		
		return messagePicture;
	}

	/* Main method for testing - each class in Java can have a main 
	 * method 
	 */
	public static void main(String[] args) 
	{
		Picture beach = new Picture("C:\\Users\\chenj8279\\Desktop\\Jeremy Chen - APCSA\\Unit - 16\\src\\images\\beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}

} // this } is the end of class Picture, put all new methods before this
