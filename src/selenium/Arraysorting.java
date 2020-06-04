package selenium;

import java.util.Arrays;

public class Arraysorting 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[]= {8,-10,-32,4,86,13};
		int temp;
		System.out.println("Before sorting : "+Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("After sorting : "+Arrays.toString(a));
	}

}
