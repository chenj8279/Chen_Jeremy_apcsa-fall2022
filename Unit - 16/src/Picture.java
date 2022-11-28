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
		//code on home pc
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

	/** Method to create a collage of several pictures */
	public void createCollage()
	{
		Picture flower1 = new Picture("flower1.jpg");
		Picture flower2 = new Picture("flower2.jpg");
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
