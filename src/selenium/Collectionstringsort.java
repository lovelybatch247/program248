package selenium;

import java.util.ArrayList;
import java.util.Scanner;

public class Collectionstringsort 
{

	public static void main(String[] args) 
	{
		//Declare a dynamic array
		ArrayList<String> al=new ArrayList<String>();
		//Get data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of arraylist");
		int n=Integer.parseInt(sc.nextLine());
		System.out.println("Enter "+n+" values ");
		//Enter data
		for(int i=0;i<n;i++)
		{
			al.add(sc.nextLine());
		}
		//Display arraylist before sorting
		System.out.println("Before sorting :");
		for(int i=0;i<n;i++) 
		{
			System.out.print(al.get(i)+" ");
		}
		String temp;
		//Sorting
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(al.get(j).compareTo(al.get(j+1))>0)
				{
					temp=al.get(j+1);
					al.set(j+1, al.get(j));
					al.set(j, temp);
				}
			}
		}
		System.out.println("\nAfter sorting :");
		for(int i=0;i<n;i++) 
		{
			System.out.print(al.get(i)+" ");
		}
	}

}
