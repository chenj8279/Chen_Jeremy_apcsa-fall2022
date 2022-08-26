//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jeremy Chen
//Date - 8/31/22


public class FirstLastVowel
{
   public static String go( String a )
	{
	   String b = a.toLowerCase();
	   String firstChar = b.substring(0,1);
	   String lastChar = b.substring(b.length()-1);
	   
	   if(firstChar.equals("a") ||lastChar.equals("a") || firstChar.equals("e") || lastChar.equals("e") || firstChar.equals("i") || lastChar.equals("i") || firstChar.equals("o") || lastChar.equals("o") || firstChar.equals("u") || lastChar.equals("u")){
		   return "yes";
	   }
	   return "no";
	   
	}
}