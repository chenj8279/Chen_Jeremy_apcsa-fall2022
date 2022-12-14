//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jeremy Chen

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	m = new String[size][size];
    	
    	int c = 0;
    	for(int i = 0; i < m.length; i++) {
    		for(int j = 0; j < m[i].length; j++) {
    			m[i][j] = "" + str.charAt(c);
    			c++;
    		}
    	}
    }

    public boolean isFound( String word )
    {
    	boolean result = false;
    	for(int i = 0; i < m.length; i++) {
    		for(int j = 0; j < m[i].length; j++) {
    			if(m[i][j].charAt(0) == word.charAt(0)) {
    				result = (checkRight(word, i, j) || checkLeft(word, i, j) || checkUp(word, i, j) || checkDown(word, i, j) || checkDiagUpRight(word, i, j) || checkDiagUpLeft(word, i, j) || checkDiagDownRight(word, i, j) ||checkDiagDownLeft(word, i, j));
    			}
    			if(result) {
    				return result;
    			}
    		}
    	}
    	return result;
    }

	public boolean checkRight(String w, int r, int c) {
		if(w.equals("")) {
			return true;
		}
		else if(c >= m[r].length) {
			return false;
		}
		else if(w.charAt(0) == m[r][c].charAt(0)) {
			return checkRight(w.substring(1), r, c+1);
		}
		else {
			return false;
		}
	}

	public boolean checkLeft(String w, int r, int c) {
		if(w.equals("")) {
			return true;
		}
		else if(c < 0) {
			return false;
		}
		else if(w.charAt(0) == m[r][c].charAt(0)) {
			return checkLeft(w.substring(1), r, c-1);
		}
		else {
			return false;
		}
	}

	public boolean checkUp(String w, int r, int c) {
		if(w.equals("")) {
			return true;
		}
		else if(r < 0) {
			return false;
		}
		else if(w.charAt(0) == m[r][c].charAt(0)) {
			return checkUp(w.substring(1), r-1, c);
		}
		else {
			return false;
		}
	}

	public boolean checkDown(String w, int r, int c) {
		if(w.equals("")) {
			return true;
		}
		else if(r >= m.length) {
			return false;
		}
		else if(w.charAt(0) == m[r][c].charAt(0)) {
			return checkDown(w.substring(1), r+1, c);
		}
		else {
			return false;
		}
	}

	public boolean checkDiagUpRight(String w, int r, int c) {
		if(w.equals("")) {
			return true;
		}
		else if(r < 0 || c >= m[r].length) {
			return false;
		}
		else if(w.charAt(0) == m[r][c].charAt(0)) {
			return checkDiagUpRight(w.substring(1), r-1, c+1);
		}
		else {
			return false;
		}
	}

	public boolean checkDiagUpLeft(String w, int r, int c) {
		if(w.equals("")) {
			return true;
		}
		else if(r < 0 || c < 0) {
			return false;
		}
		else if(w.charAt(0) == m[r][c].charAt(0)) {
			return checkDiagUpLeft(w.substring(1), r-1, c-1);
		}
		else {
			return false;
		}
	}

	public boolean checkDiagDownLeft(String w, int r, int c) {
		if(w.equals("")) {
			return true;
		}
		else if(r >= m.length || c < 0) {
			return false;
		}
		else if(w.charAt(0) == m[r][c].charAt(0)) {
			return checkDiagDownLeft(w.substring(1), r+1, c-1);
		}
		else {
			return false;
		}
	}

	public boolean checkDiagDownRight(String w, int r, int c) {
		if(w.equals("")) {
			return true;
		}
		else if(r >= m.length || c >= m[r].length) {
			return false;
		}
		else if(w.charAt(0) == m[r][c].charAt(0)) {
			return checkDiagDownRight(w.substring(1), r+1, c+1);
		}
		else {
			return false;
		}
	}

    public String toString() {
 		String output = "";
 		for(int i = 0; i < m.length; i++) {
 			for(int j = 0; j < m[i].length; j++) {
 				output += m[i][j] + " ";
 			}
 			output += "\n";
 		}
    	return "" + output;
    }
}