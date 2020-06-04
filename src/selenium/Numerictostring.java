package selenium;

public class Numerictostring 
{

	public static void main(String[] args) 
	{
		int i=234;
		//Logic-1
		/*String str="";
		str=str+i;
		System.out.println(str);*/
		//Logic-2
		/*String str="";
		str=str.valueOf(i);
		System.out.println(str);*/
		//logic-3
		Integer io=new Integer(i);
		String str=io.toString();
		System.out.println(str);
	}

}
