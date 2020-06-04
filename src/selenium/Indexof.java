package selenium;

public class Indexof 
{

	public static void main(String[] args) 
	{
		String x="Rs:1234.56/-";
		int si=x.indexOf('1');
		int ei=x.indexOf('/');
		String y=x.substring(si,ei );//1234.56
		float z=Float.parseFloat(y);
		System.out.println(z);

	}

}
