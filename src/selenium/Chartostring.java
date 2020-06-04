package selenium;

public class Chartostring
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		char c='d';
		//logic-1
		/*String str="";
		str=str+c;
		System.out.println(str);*/
		//logic-2
		/*String str="";
		str=str.valueOf(c);
		System.out.println(str);*/
		//logic-3
		Character co=new Character(c);
		String str=co.toString();
		System.out.println(str);
	}

}
