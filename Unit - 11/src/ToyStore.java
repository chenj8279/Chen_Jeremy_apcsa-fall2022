//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private List<Toy> toyList;

	public ToyStore()
	{
		
	}

	public void loadToys( String toys )
	{
		toyList = new ArrayList<Toy>();
		String tys[] = toys.split(null);
		for(int i = 0; i < tys.length; i++) {
			out.println(tys[i]);
			for(int j = 0; j < toyList.size(); j++) {
				//if() {
					
				//}
			}
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		return "";
  	}  
  
  	public void sortToysByCount()
  	{
  		
  	}  
  	  
	public String toString()
	{
	   return "";
	}
}