package selenium;

import java.util.Scanner;

public class Decimaltobinary 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a decimal number:");
		int n=sc.nextInt();
		String binary="";
		int temp=n;
		while(n!=0)
		{
			int r=n%2;
			binary=r+binary;
			n=n/2;
		}
		System.out.println("Binary value of "+temp+" is:"+binary);

	}

}
