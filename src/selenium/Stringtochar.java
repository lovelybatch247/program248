package selenium;

public class Stringtochar 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str="hgji";
		//logic-1
		/*char[] ch=str.toCharArray();
		System.out.println(ch);*/
		//logic-2
		char[] ch=new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
			ch[i]=str.charAt(i);
		}
		System.out.println(ch);
	}

}
