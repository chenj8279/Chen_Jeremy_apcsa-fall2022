//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jeremy Chen

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] arr = new int[size];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random()*10 + 1);
		}
		System.out.println(Arrays.toString(arr));
		shiftEm(arr);
		return arr;
	}
	public static void shiftEm(int[] array)
	{
		int l = 0;
		for(int k = 0; k < array.length; k++) {
			if(array[k] == 7) {
				while(array[l] == 7 && l < array.length-1 && k != 0) {
					l++;
				}
				int temp = array[l];
				array[l] = array[k];
				array[k] = temp;
			}
		}
		System.out.println(Arrays.toString(array));
	}
}
