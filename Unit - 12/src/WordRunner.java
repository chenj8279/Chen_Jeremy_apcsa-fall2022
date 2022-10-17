//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jeremy Chen

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\chenj8279\\Desktop\\APCSA Units\\Unit12Students\\Unit12-Assignments\\words.dat"));
		
		
		Word[] words = new Word[file.nextInt()];
		file.nextLine();
		for(int i = 0; file.hasNext(); i++) {
			words[i] = new Word(file.nextLine());
		}
		
		Arrays.sort(words);
		
		for(int i = 0; i < words.length; i++) {
			out.println(words[i]);
		}
		
	}
}