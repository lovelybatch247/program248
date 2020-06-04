package selenium;

import java.util.Scanner;

public class Armstrongno 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int sum=0;
		int nd=0;
		int temp=n;
		while(n!=0)
		{
			int d=n%10;
			nd++;
			n=n/10;
		}
		System.out.println("No of digits is:"+nd);
		n=temp;
		while(n!=0)
		{
			int d=n%10;
			sum=(int) (sum+Math.pow(d, nd));
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println(temp+" is armstrong number");
		}
		else
		{
			System.out.println(temp+" is not armstrong number");
		}
	}

}
