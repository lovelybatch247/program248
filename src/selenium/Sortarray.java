package selenium;

import java.util.Arrays;
import java.util.Scanner;

public class Sortarray 
{

	public static void main(String[] args) 
	{
		
		int arr[]= {17,2,8,1,5,10,3,25,12,22};
		sortArray(arr);
		
	}
	
	public static void sortArray(int[] arr) {
		Arrays.sort(arr,0,5);
		System.out.println("Array after sorting : "+Arrays.toString(arr));
	}

}
