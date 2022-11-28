/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
	//pictures
	private static Picture beach = new Picture("C:\\Users\\chenj8279\\Desktop\\Jeremy Chen - APCSA\\Unit - 16\\src\\images\\beach.jpg");
	private static Picture canvas = new Picture("C:\\Users\\chenj8279\\Desktop\\Jeremy Chen - APCSA\\Unit - 16\\src\\images\\640x480.jpg");
	private static Picture caterpillar = new Picture("C:\\Users\\chenj8279\\Desktop\\Jeremy Chen - APCSA\\Unit - 16\\src\\images\\caterpillar.jpg");
	private static Picture redMotorcycle = new Picture("C:\\Users\\chenj8279\\Desktop\\Jeremy Chen - APCSA\\Unit - 16\\src\\images\\redMotorcycle.jpg");
	private static Picture snowman = new Picture("C:\\Users\\chenj8279\\Desktop\\Jeremy Chen - APCSA\\Unit - 16\\src\\images\\snowman.jpg");
	private static Picture swan = new Picture("C:\\Users\\chenj8279\\Desktop\\Jeremy Chen - APCSA\\Unit - 16\\src\\images\\swan.jpg");
	private static Picture temple = new Picture("C:\\Users\\chenj8279\\Desktop\\Jeremy Chen - APCSA\\Unit - 16\\src\\images\\temple.jpg");
	private static Picture water = new Picture("C:\\Users\\chenj8279\\Desktop\\Jeremy Chen - APCSA\\Unit - 16\\src\\images\\water.jpg");
	
	
	/** Method to test zeroBlue */
	public static void testZeroBlue()
	{
		
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}
	
	/** Method to test keepOnlyBlue */
	public static void testKeepOnlyBlue() {
		beach.explore();
		beach.keepOnlyBlue();
		beach.explore();
	}
	
	/** Method to test keepOnlyRed */
	public static void testKeepOnlyRed() {
		beach.explore();
		beach.keepOnlyRed();
		beach.explore();
	}
	
	/** Method to test keepOnlyGreen */
	public static void testKeepOnlyGreen() {
		beach.explore();
		beach.keepOnlyGreen();
		beach.explore();
	}
	
	/** Method to test negate */
	public static void testNegate() {
		beach.explore();
		beach.negate();
		beach.explore();
	}
	
	/** Method to test grayscale */
	public static void testGrayscale() {
		beach.explore();
		beach.grayscale();
		beach.explore();
	}
	
	/** Method to test fixUnderwater */
	public static void testFixUnderwater() {
		water.explore();
		water.fixUnderwater();
		water.explore();
	}
	
	/** Method to test mirrorVertical */
	public static void testMirrorVerticalLeftToRight()
	{
		caterpillar.explore();
		caterpillar.mirrorVerticalLeftToRight();
		caterpillar.explore();
	}
	
	/** Method to test mirrorVerticalRightToLeft */
	public static void testMirrorVerticalRightToLeft() {
		redMotorcycle.explore();
		redMotorcycle.mirrorVerticalRightToLeft();
		redMotorcycle.explore();
	}
	
	/** Method to test mirrorHoriztontalTopToBot */
	public static void testMirrorHorizontalTopToBot() {
		redMotorcycle.explore();
		redMotorcycle.mirrorHorizontalTopToBot();
		redMotorcycle.explore();
	}
	
	/** Method to test mirrorHoriztontalTopToBot */
	public static void testMirrorHorizontalBotToTop() {
		redMotorcycle.explore();
		redMotorcycle.mirrorHorizontalBotToTop();
		redMotorcycle.explore();
	}
	
	/** Method to test mirrorDiagonalBotLeft */
	public static void testMirrorDiagonalBotLeft() {
		beach.explore();
		beach.mirrorDiagonalBotLeft();
		beach.explore();
	}
	
	/** Method to test mirrorTemple */
	public static void testMirrorTemple()
	{
		temple.explore();
		temple.mirrorTemple();
		temple.explore();
	}
	
	/** Method to test mirrorArms */
	public static void testMirrorArms() {
		snowman.explore();
		snowman.mirrorArms();
		snowman.explore();
	}

	/** Method to test the collage method */
	public static void testCollage()
	{
		canvas.createCollage();
		canvas.explore();
	}

	/** Method to test edgeDetection */
	public static void testEdgeDetection()
	{
		swan.edgeDetection(10);
		swan.explore();
	}
	
	public static void testEdgeDetection2() {
		swan.edgeDetection2(10);
		swan.explore();
	}

	/** Main method for testing.  Every class can have a main
	 * method in Java */
	public static void main(String[] args)
	{
		// uncomment a call here to run a test
		// and comment out the ones you don't want
		// to run
		//testZeroBlue();
		//testKeepOnlyBlue();
		//testKeepOnlyRed();
		//testKeepOnlyGreen();
		//testNegate();
		//testGrayscale();
		//testFixUnderwater();
		//testMirrorVerticalLeftToRight();
		//testMirrorVerticalRightToLeft();
		//testMirrorHorizontalTopToBot();
		//testMirrorHorizontalBotToTop();
		//testMirrorDiagonalBotLeft();
		//testMirrorTemple();
		//testMirrorArms();
		//testMirrorGull();
		//testMirrorDiagonal();
		//testCollage();
		//testCopy();
		//testEdgeDetection();
		testEdgeDetection2();
		//testChromakey();
		//testEncodeAndDecode();
		//testGetCountRedOverValue(250);
		//testSetRedToHalfValueInTopHalf();
		//testClearBlueOverValue(200);
		//testGetAverageForColumn(0);
	}
}