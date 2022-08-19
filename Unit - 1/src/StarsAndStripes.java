//� A+ Computer Science
//www.apluscompsci.com

//Name - Jeremy Chen
//Date - 8/23/22
//Class - Mauro, P2
//Lab  - StarsAndStripes Lab

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void print6StarsLine()
   {
	   out.println("---------------*  *  *  *  *  *---------------");
   }
   
   public void print5StarsLine() {
	   out.println("---------------  *  *  *  *  *  --------------");
   }

   public void printHalfLine()
   {
	   out.println("----------\n");
   }
   
   public void printFullLine() {
	   out.println("----------------------------------------------");
   }

   public void printTwoBlankLines()
   {
	   out.println("\n \n");
   }
   
   public void printStarLines()
   {
	   print6StarsLine();
	   
	   print5StarsLine();
	   
	   print6StarsLine();
	   
	   print5StarsLine();
	   
	   print6StarsLine();
	   
	   print5StarsLine();
	   
	   print6StarsLine();
	   
	   print5StarsLine();
	   
	   print6StarsLine();
	   
   }
 
   public void printBigLines()
   {
	   printFullLine();
	   printFullLine();
	   printFullLine();
   }   
}