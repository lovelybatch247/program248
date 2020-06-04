package selenium;

public class Digitsno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=456;
		int nd=0;
		int temp=n;
		while(n!=0)
		{
			int rem=n%10;
			nd++;
			n=n/10;
			
		}
		System.out.println("No of digits in "+temp+" is :"+nd);
	}

}
