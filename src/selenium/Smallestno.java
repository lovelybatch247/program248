package selenium;

public class Smallestno 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[]= {10,-28,0,48,-3,62};
		int smallest=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(smallest>a[i])
			{
				smallest=a[i];
			}
		}
		System.out.println("Smallest no is : "+smallest);
	}

}
