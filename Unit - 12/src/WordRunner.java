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
			//out.println(words[i]);
		}
		
		Arrays.sort(words);
		
		out.print("\n");
//		for(int i = 0; i < words.length; i++) {
//			int spot = i;
//			for(int j = i + 1; j < words.length; j++) {
//				//out.println(words[j].compareTo(words[spot]) + " " + words[j] + " " + words[spot]);
//				if(words[j].compareTo(words[spot]) < 0) {
//					spot = j;
//				}
//			}
//			String temp = words[i];
//			words[i] = words[spot];
//			words[spot] = temp;
//			//out.println("\n" + words[i] + "\n");
//			out.println(words[i]);
//		}
		
		for(int i = 0; i < words.length; i++) {
			out.println(words[i]);
		}
		
	}
}