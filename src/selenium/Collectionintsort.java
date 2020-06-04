package selenium;

import java.util.ArrayList;
import java.util.Scanner;

public class Collectionintsort 
{

	public static void main(String[] args) 
	{
		//Declare dynamic array
		ArrayList<Integer> al=new ArrayList<>();
		//Get data
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size :");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" values:");
		for(int i=0;i<n;i++)
		{
			al.add(sc.nextInt());
		}
		//Display elements before sorting
		System.out.println("Elements before sorting :");
		for(int i=0;i<n;i++)
		{
			System.out.print(al.get(i)+" ");
		}
		//Sorting
		int temp;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(al.get(j)>al.get(j+1))
				{
					temp=al.get(j+1);
					al.set(j+1, al.get(j));
					al.set(j, temp);
				}
			}
		}
		//Display elements after sorting
		System.out.println("\nElements after sorting");
		for(int i=0;i<n;i++)
		{
			System.out.print(al.get(i)+" ");
		}
		
		System.out.println("\nLargest no is :"+al.get(n-1));
		System.out.println("Second largest no is :"+al.get(n-2));
		System.out.println("Smallest no is :"+al.get(0));
	}

}
