package selenium;

import java.util.Scanner;

public class Digitsumtoonedigit 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int temp=n;
		
		while(n>9)
		{
			int sum=0;
			while(n!=0)
			{
				int d=n%10;
				sum=sum+d;
				n=n/10;
			}
			n=sum;
		}
		System.out.println("Sum of digits of "+temp+" upto single digit : "+n);
	}

}
