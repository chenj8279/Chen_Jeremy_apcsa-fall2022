//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		
	}

	public RockPaperScissors(String player)
	{
		setPlayers("");
	}

	public void setPlayers(String player)
	{
		playChoice = player;
	}
	
	public void setComp() {
		int ranNum = (int) Math.floor(Math.random()*3);
		switch (ranNum){
			case 0: compChoice = "rock";
			case 1 : compChoice = "paper";
			case 2 : compChoice = "scissors";
		}
	}

	public String determineWinner()
	{
		String winner="";
		if(playChoice.equals(compChoice)) {
			winner = "draw";
		}
		//else if(playchoice equals ranNum + 1 winner is player) {
			
		//}
		
		return winner;
	}

	public String toString()
	{
		String output="";
		return output;
	}
}