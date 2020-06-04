package selenium;

import java.util.ArrayList;
import java.util.Scanner;

public class Deleteduplicates {

	public static void main(String[] args) {
		
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
		//Display elements before deleting duplicates
		System.out.println("Elements before deleting duplicates :");
		for(int i=0;i<n;i++)
		{
			System.out.print(al.get(i)+" ");
		}
		//Delete duplicate elements
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(al.get(i)==al.get(j))
				{
					al.remove(j);
					n--;
				}
			}
		}
		System.out.println("\nElements after deleting duplicates :");
		for(int i=0;i<n;i++)
		{
			System.out.print(al.get(i)+" ");
		}

	}

}
