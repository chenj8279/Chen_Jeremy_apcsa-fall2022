//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jeremy Chen

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class WordSortTwoRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\chenj8279\\Desktop\\APCSA Units\\Unit13Students\\Unit13-Assignments\\wordsorttwo.dat"));
		int size = file.nextInt();
		file.nextLine();
		
		for(int i = 0; i<size; i++)
		{
			String sentence = file.nextLine();
			//instantiate a new WordSort
			WordSortTwo test = new WordSortTwo(sentence);
			System.out.print(test);
		}
	}
}