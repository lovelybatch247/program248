package selenium;

import java.util.Arrays;

public class Assignment4 {

	public static void main(String[] args) {
		int ar[]= {7,2,4,8,5,6,3,0,1,9};
		int temp=ar[9];
		ar[9]=ar[0];
		ar[0]=temp;
		temp=ar[8];
		ar[8]=ar[1];
		ar[1]=temp;
		
		
		System.out.println(Arrays.toString(ar));
		
	}

}
