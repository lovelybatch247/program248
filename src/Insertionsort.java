import java.util.Arrays;
import java.util.Scanner;
public class Insertionsort {
	
	public static void main(String[] args) {
		
		//Enter size of an array from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int n=sc.nextInt();
		int a[]=new int[n];
		//Enter elements of array from keyboard
		System.out.println("Enter the elements of array :");
		int e,i,j,temp;
		for(e=0;e<n;e++) {
			a[e]=sc.nextInt();
		}
		//Display array before insertion sort
		System.out.println("Array before applying insertion sort: "+Arrays.toString(a));
		//P1erform insertion sort
		for(i=1;i<a.length;i++) {
			temp=a[i];
			j=i-1;
			while(j>=0 && a[j]>temp) {
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=temp;
		}
		//Display array after insertion sort
		System.out.println("Array after applying insertion sort: "+Arrays.toString(a));
	}

}
