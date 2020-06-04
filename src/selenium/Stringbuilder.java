package selenium;

public class Stringbuilder 
{

	public static void main(String[] args) 
	{
		//Using String class
		String s="q";
		long sst=System.currentTimeMillis();
		for(int i=1;i<=100000;i++)
		{
			s=s+"q";
		}
		long set=System.currentTimeMillis();
		System.out.println("Time for String class is : "+(set-sst));
		//Using StringBuffer class
		StringBuffer t=new StringBuffer("q");
		long sbst=System.currentTimeMillis();
		for(int i=1;i<=100000;i++)
		{
			t=t.append("q");
		}
		long sbet=System.currentTimeMillis();
		System.out.println("Time for StringBuffer class is : "+(sbet-sbst));
		//Using StringBuilder class
		StringBuilder u=new StringBuilder("q");
		long sbust=System.currentTimeMillis();
		for(int i=1;i<=100000;i++)
		{
			u=u.append("q");
		}
		long sbuet=System.currentTimeMillis();
		System.out.println("Time for StringBuilder class is : "+(sbuet-sbust));
	}

}

