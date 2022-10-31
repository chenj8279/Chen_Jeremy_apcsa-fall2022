//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jeremy Chen

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		int len = 1;
		for(int i = 0; i < sentence.length(); i++) {
			if(sentence.charAt(i) == ' ') {
				len++;
			}
		}
		wordRay = new String[len];
		
		int i = 0;
		for(String word : sentence.split(" ")) {
			wordRay[i] = word;
			i++;
		}
		sort();
	}

	public void sort()
	{
		for(int i = 0; i < wordRay.length-1; i++) {
			for(int j = i + 1; j < wordRay.length; j++) {
				if(wordRay[i].compareTo(wordRay[j]) > 0) {
					String temp = wordRay[i];
					wordRay[i] = wordRay[j];
					wordRay[j] = temp;
				}
			}
		}
	}

	public String toString()
	{
		String output = "";
		for(int i = 0; i < wordRay.length; i++) {
			output += wordRay[i] + "\n";
		}
		return output + "\n\n";
	}
}