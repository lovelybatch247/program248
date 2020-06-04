package selenium;

import java.util.Scanner;

public class Binarytodecimal 
{

	public static void main(String[] args) 
	{
		//logic-1
		//System.out.println("Decimal value is :"+Integer.parseInt("1010",2));
		//logic-2
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a binary number:");
		int n=sc.nextInt();
		int decval=0;
		int base=1;//Math.pow(2,0)
		int temp=n;
		while(n!=0)
		{
			int lastdigit=n%10;
			n=n/10;
			decval=decval+lastdigit*base;
			base=base*2;
		}
		System.out.println("Decimal value of "+temp+" is:"+decval);
	}

}
