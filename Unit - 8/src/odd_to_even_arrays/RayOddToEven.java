package odd_to_even_arrays;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jeremy Chen
//Date - 8/14/22

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int span = 0;
		for(int i = 0; i < ray.length; i++) {
			if(ray[i]%2 == 1) {
				for(int j = i+1; j < ray.length; j++) {
					
					if(ray[j] % 2 ==0) {
						span = j-i;
						return span;
					}
				}
			}
		}
		return -1;
	}
}