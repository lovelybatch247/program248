package selenium;

public class Factorial 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n=5;
		int f=1;
		int temp=n;
		while(n!=0)
		{
			f=f*n;
			n--;
		}
		System.out.println("Factorial of "+temp+" is :"+f);
	}

}
