package selenium;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int n=sc.nextInt();
		if(n<0)
		{
			n=n*(-1);
		}
		System.out.println(n);
	}

}
