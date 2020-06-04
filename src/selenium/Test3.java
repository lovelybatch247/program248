package selenium;

import java.util.Arrays;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string:");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		// String s1="35522213322";

		/*
		 * int[] values = { Integer.parseInt(s1) }; System.out.println(values);
		 */
		char arr[] = s1.toCharArray();
		int a[]=new int[arr.length];
		int n = a.length;
		for (int i = 0; i<n; i++){
			a[i] = arr[i] - '0';
		    System.out.println(a[i]);
			
		}
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < n; i++) {
			int count=1;
			if (i != n - 1) {
				//count = 1;
				if (a[i] != a[i + 1]) {
					count=1;
					System.out.println(a[i] + " - " + count);

				}else {
					count++;
					System.out.println(a[i]+" - "+count);
					i=i+1;
				}
			}else {
				System.out.println(a[i]+" - "+count);
			}
			// while(i!=n-1) {
			/*
			 * int count=1; if(a[i]!=a[i+1]){ System.out.println(a[i]+" - "+count);
			 * 
			 * }else { count++; }
			 */
		}

		/*
		 * for(i=0;i<n;i++) {
		 * 
		 * int count=1;
		 * 
		 * if(a[i]==a[i+1]) { count=count+1; System.out.println(a[i]+" - "+count); }else
		 * 
		 * System.out.println(a[i]+" - "+count); a[i]=a[i+1]; }
		 * 
		 * }
		 */
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("Largest no is :" + a[n - 1]);
		for (int j = n - 2; j >= 0; j--) {
			if (a[j] < a[n - 1]) {
				System.out.println("Second largest no is :" + a[j]);
				break;
			}
		}

	}

}
