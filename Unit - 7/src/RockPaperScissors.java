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
		setPlayers(player);
		setComp();
	}

	public void setPlayers(String player)
	{
		playChoice = player;
	}
	
	public void setComp() {
		int ranNum = (int)Math.floor((int)Math.random()*3);
		switch (ranNum){
			case 0: compChoice = "R";
			case 1 : compChoice = "P";
			case 2 : compChoice = "S";
		}
	}

	public String determineWinner()
	{
		//setComp();
		
		//int playChoiceNum = 0;
		//int compChoiceNum = 0;
		String winner="";
		String gameLog = "";
		
		/*switch(playChoice) {
			case "R" : playChoiceNum = 0;
			case "P" : playChoiceNum = 1;
			case "S" : playChoiceNum = 2;
		}*/
		
		/*switch(compChoice) {
			case "R" : compChoiceNum = 0;
			case "P" : compChoiceNum = 1;
			case "S" : compChoiceNum = 2;
		
		}*/
		
		/*if(playChoiceNum == compChoiceNum) {
			winner = "draw";
		}
		else if(playChoiceNum == compChoiceNum -1 || playChoiceNum == compChoiceNum + 2) {
			winner = "Computer wins!";
		}
		else {
			winner = "You win!";
		}*/
		
		if(playChoice.equals(compChoice)) {
			winner = "draw";
		}
		else if(playChoice.compareTo(compChoice) == -1) {
			winner = "You win!";
		}
		else {
			winner = "Computer wins!";
		}
		
		String outcome = "";
		
		if((playChoice.equals("R")||compChoice.equals("R")) && (compChoice.equals("P")||playChoice.equals("P"))) {
			outcome = "<<paper covers rock>>";
		}
		if((playChoice.equals("P")||compChoice.equals("P")) && (compChoice.equals("S")||playChoice.equals("S"))) {
			outcome = "<<scissors cuts paper>>";
		}
		else if((playChoice.equals("S")||compChoice.equals("S")) && (compChoice.equals("R")||playChoice.equals("R"))){
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
		String output= "" + determineWinner();;
		return output;
	}
}