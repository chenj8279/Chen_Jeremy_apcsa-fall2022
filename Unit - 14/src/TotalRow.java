//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jeremy Chen

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	//add code here
    	
    	List<Integer> rowTotals = new ArrayList<Integer>();
    	for(int i = 0; i < m.length; i++) {
    		int count = 0;
    		for(int j = 0; j < m[i].length; j++) {
    			count += m[i][j];
    		}
    		rowTotals.add(count);
    	}
		return rowTotals;
    }
}
