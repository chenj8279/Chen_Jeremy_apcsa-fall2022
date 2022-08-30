//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jeremy Chen

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		//add test cases	
		LetterRemover test1 = new LetterRemover();
		test1.setRemover("I am Sam I am" , 'a');
		out.println(test1);
		
		test1.setRemover("ssssssssxssssesssssesss" , 's');
		out.println(test1);
		
		test1.setRemover("qwertyqwertyqwerty" , 'a');
		out.println(test1);
		
		test1.setRemover("abababababa" , 'b');
		out.println(test1);
		
		test1.setRemover("abaababababa" , 'x');
		out.println(test1);
		
	}
}