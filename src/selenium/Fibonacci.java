package selenium;

public class Fibonacci
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int l=20;
		int x=0;
		int y=1;
		System.out.print(x+" "+y);
		do
		{
			int z=x+y;
			System.out.print(" "+z);
			x=y;
			y=z;
			
		}while(x+y<=l);
		
	}

}
