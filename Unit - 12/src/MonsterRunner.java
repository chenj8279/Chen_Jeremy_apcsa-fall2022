//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jeremy Chen

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		out.print("Enter 1st monster's name : ");
		String name1 = keyboard.next();
		out.print("Enter 1st monster's size : ");
		int size1 = keyboard.nextInt();
		
		//instantiate monster one
		Monster mon1 = new Skeleton(name1, size1);
		
		//ask for name and size
		out.print("Enter 2nd monster's name : ");
		String name2 = keyboard.next();
		out.print("Enter 2nd monster's size : ");
		int size2 = keyboard.nextInt();
		
		//instantiate monster two
		Monster mon2 = new Skeleton(name2, size2);
		
		out.print("\n");
		out.println(mon1);
		out.println(mon2);
		if(mon1.isBigger(mon2)) {
			out.println("\nMonster one is bigger than Monster two");
		}
		else if(mon1.isSmaller(mon2)) {
			out.println("\nMonster one is smaller than Monster two");
		}
		else {
			out.println("\nMonsters are the same size");
		}
		if(mon1.namesTheSame(mon2)) {
			out.println("Monster one has the same name as Monster two");
		}
		else {
			out.println("Monster one does not have the same name as Monster two");
		}
		
		
	}
}