//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Jeremy Chen

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
		setPlayers(player);
		setComp();
	}

	public void setPlayers(String player)
	{
		playChoice = player;
	}
	
	public void setComp() {
		
		double ranNum2 = Math.floor(Math.random()*3);;
		int ranNum = (int)ranNum2;

		switch (ranNum){
			case 0:
				compChoice = "R";
				break;
			case 1 :
				compChoice = "P";
				break;
			case 2 :
				compChoice = "S";
				break;
		}
	}

	public String determineWinner()
	{
		String winner="";
		String gameLog = "";

		if(playChoice.equals(compChoice)) {
			winner = "draw";
		}
		else if((playChoice.equals("P") && compChoice.equals("R"))||(playChoice.equals("R") && compChoice.equals("S")) || (playChoice.equals("S") && compChoice.equals("P"))) {
			winner = "You win!";
		}
		else {
			winner = "Computer wins!";
		}
		
		String outcome = "";
		
		if((playChoice.equals("R")||compChoice.equals("R")) && ((compChoice.equals("P")||playChoice.equals("P")))) {
			outcome = "<<paper covers rock>>";
		}
		else if((playChoice.equals("P")||compChoice.equals("P")) && ((compChoice.equals("S")||playChoice.equals("S")))) {
			outcome = "<<scissors cuts paper>>";
		}
		else if((playChoice.equals("S")||compChoice.equals("S")) && ((compChoice.equals("R")||playChoice.equals("R")))){
			outcome = "<<rock crushes scissors>>";
		}
		else {
			outcome = "<<nothing happened>>";
		}
		
		gameLog = "You played " + playChoice + "\nComputer played " + compChoice + "\n" + winner + " " + outcome;
		
		return gameLog;
	}

	public String toString()
	{	
		String output= "" + determineWinner();
		return output;
	}
}