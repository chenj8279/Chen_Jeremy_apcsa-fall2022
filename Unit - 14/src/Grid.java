//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jeremy Chen

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				grid[i][j] = vals[(int) Math.floor(Math.random()*vals.length)];
				//grid[i][j] = vals[0];
			}
		}
		//findMax(vals);
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int max = 0;
		for(int i = 0; i < vals.length; i++) {
			System.out.println(countVals(vals[i]) + " " + vals[i]);
			max = Math.max(countVals(vals[i]), countVals(vals[max]));
		}
		System.out.println(max);
		return "\n\n" + vals[max] + "occurs the most";
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count = 0;
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j <grid[i].length; j++) {
				if(val.equals(grid[i][j])) {
					count++;
				}
			}
		}
		return count;
	}

	//display the grid
	public String toString()
	{
		String output="";
    	for(int i = 0; i < grid.length; i++) {
    		for(int j = 0; j < grid[i].length; j++) {
    			output += grid[i][j] + " ";
    		}
    		output += "\n";
    	}
		return output + "\n";
	}
}