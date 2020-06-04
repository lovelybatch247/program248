package selenium;

public class Digitsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=456;
		int sd=0;
		int temp=n;
		while(n!=0)
		{
			int rem=n%10;
			sd=sd+rem;
			n=n/10;
			
		}
		System.out.println("Sum of digits in "+temp+" is :"+sd);
	}

}
