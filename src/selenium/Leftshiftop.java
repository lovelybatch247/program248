package selenium;

import java.util.Scanner;

public class Leftshiftop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		//Multiply no with 2 without using *
		int y=x<<1;
		System.out.println(y);
		//Multiply no with 4 without using *
		int z=x<<2;
		System.out.println(z);
		//Multiply no with 8 without using *
		int w=x<<3;
		System.out.println(w);
		
	}

}
