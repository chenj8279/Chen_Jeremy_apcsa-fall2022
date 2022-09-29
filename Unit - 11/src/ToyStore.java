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
				Toy temp1 = toyList.get(j);
				Toy temp2 = toyList.get(i);
				if(temp1.getName().equals(temp2.getName())) {
					temp1.setCount(temp1.getCount());
				}
				else if (j == toyList.size()-1) {
					toyList.add(new Toy(tys[i]));
				}
			}
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for(int i = 0; i < toyList.size(); i++) {
  			Toy temp1 = toyList.get(i);
			if(temp1.getName().equals(nm)) {
				return toyList.get(i);
			}
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		sortToysByCount();
  		return "" + toyList.get(0);
  	}  
  
  	public void sortToysByCount()
  	{
  		List<Integer> tempC = new ArrayList<Integer>();
  		List<Toy> tempT = new ArrayList<Toy>();
  		for (int i = 0; i < toyList.size(); i++) {
  			tempC.add(toyList.get(i).getCount());
  		}
  		Collections.sort(tempC);
  		Collections.reverse(tempC);
  		for(int i = 0; i < toyList.size(); i++) {
  			for(int j = 0; j != toyList.get(i).getCount(); j++) {
  				if(toyList.get(i).getCount() == tempC.get(j)) {
  					
  				}
  			}
  		}
  	}  
  	  
	public String toString()
	{
	   return "";
	}
}