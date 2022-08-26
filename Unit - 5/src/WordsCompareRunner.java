//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Jeremy Chen
//Date - 8/31/22
//Class - Mauro, P2
//Lab  - DictionaryRunner if else

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		//add test cases
	   WordsCompare test1 = new WordsCompare();
	   test1.setWords("abe", "ape");
	   test1.compare();
	   out.print(test1);
	   
	   test1.setWords("giraffe", "gorilla");
	   test1.compare();
	   out.print(test1);
	   
	   test1.setWords("one", "two");
	   test1.compare();
	   out.print(test1);
	   
	   test1.setWords("fun", "funny");
	   test1.compare();
	   out.print(test1);
	   
	   test1.setWords("123", "19");
	   test1.compare();
	   out.print(test1);
	   
	   test1.setWords("193", "1910");
	   test1.compare();
	   out.print(test1);
	   
	   test1.setWords("goofy", "godfather");
	   test1.compare();
	   out.print(test1);
	   
	   test1.setWords("funnel", "fun");
	   test1.compare();
	   out.print(test1);
	}
}