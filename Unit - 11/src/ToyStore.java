//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jeremy Chen

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
		String tys[] = toys.split(" ");
		
		for(int i = 0; i < tys.length; i++) {
			if(getThatToy(tys[i]) == null) {
				toyList.add(new Toy(tys[i]));
			}
			else {
				getThatToy(tys[i]).setCount(getThatToy(tys[i]).getCount());
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
  		return "" + toyList.get(0).getName();
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
  		
  		Toy temp;
  		for(int i = 0; i < toyList.size(); i++) {
  			int j = i;
  			while(tempC.get(i) != toyList.get(j).getCount()) {
  				j++;
  			}
  			temp = toyList.get(i);
  			toyList.set(i,toyList.get(j));
  			toyList.set(j, temp);
  		}
  	}
  	 
	public String toString()
	{
		sortToysByCount();
		return "" + toyList + "\n" + "max == " + getMostFrequentToy();
	}
}