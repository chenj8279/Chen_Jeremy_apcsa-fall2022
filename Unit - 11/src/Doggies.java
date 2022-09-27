//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jeremy Chen

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new array of Dog
		pups = new Dog[size];
		
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds
		pups[spot] = new Dog(age, name);

	}

	public String getNameOfOldest()
	{
		Dog elder = pups[0];
		for(int i = 0; i < pups.length; i++) {
			if(elder.getAge() < pups[i].getAge()) {
				elder = pups[i];
			}
		}
		return elder.getName();
	}

	public String getNameOfYoungest()
	{
		Dog pup = pups[0];
		for(int i = 0; i < pups.length; i++) {
			if(pup.getAge() > pups[i].getAge()) {
				pup = pups[i];
			}
		}
		return pup.getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}