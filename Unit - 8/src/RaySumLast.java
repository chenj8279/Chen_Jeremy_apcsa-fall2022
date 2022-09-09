//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jeremy Chen
//Date - 8/14/22

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int ans = 0;
		if((boolean) (ray.length <= 1)) {
			return -1;
		}
		else {
			for(int i =0; i< ray.length; i++) {
				if(ray[i]>ray[ray.length-1]) {
					ans += ray[i];
				}
			}
			return ans;
		}
	}	
}