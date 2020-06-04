package selenium;

import java.util.Scanner;

public class Palindromeno
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int r=0;
		int temp=n;
		while(n!=0)
		{
			int d=n%10;
			r=r*10+d;
			n=n/10;
		}
		System.out.println("Reverse of "+temp+" is : "+r);
		if(temp==r)
		{
			System.out.println(temp+" is palidrome");
		}
		else
		{
			System.out.println(temp+" not palindrome");
		}

	}

}
