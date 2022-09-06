//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Jeremy Chen

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		
		//add in a do while loop after you get the basics up and running
		
			String player = "";
			String again = "y";
			
			while(again.equals("y")){
				out.print("type in your prompt [R,P,S] :: ");
				player = keyboard.next();
				
				//read in the player value
				RockPaperScissors game = new RockPaperScissors(player);
				out.println(game);
				
				out.println("Do you want to play agian? [y,n]");
				again = keyboard.next();
			}
			
	}
}



