package selenium;

public class Largestno 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a[]= {786,123,0,7,9,1225,-78};
		int largest=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(largest<a[i])
			{
				largest=a[i];
			}
		}
		System.out.println("Largest no is : "+largest);
	}

}
