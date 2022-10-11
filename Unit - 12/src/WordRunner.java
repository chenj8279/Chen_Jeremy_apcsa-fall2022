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

		int size = file.nextInt();
		file.nextLine();
		
		String[] words = new String[size];
		for(int i = 0; file.hasNext(); i++) {
			words[i] = file.nextLine();
			//out.println(words[i]);
		}
		//out.print("\n");
		for(int i = 0; i < words.length; i++) {
			String temp = words[i];
			for(int j = i + 1; j < words.length; j++) {
				out.println(words[i].compareTo(words[j]) + " " + words[i] + " " + words[j]);
				if(words[i].compareTo(words[j]) > 0) {
					words[i] = words[j];
					words[j] = temp;
					temp = words[i];
					out.print(words[i] + "\n" + words[j] + "\n");
				}
			}
			out.println("\n" + words[i] + "\n");
		}
		
	}
}