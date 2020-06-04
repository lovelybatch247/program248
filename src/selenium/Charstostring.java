package selenium;

public class Charstostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch= {'s','h','l','f'};
		//logic-1
		/*String str="";
		str=str.valueOf(ch);
		System.out.println(str);*/
		//logic-2
		String str="";
		for(int i=0;i<ch.length;i++)
		{
			str=str+ch[i];
		}
		System.out.println(str);
		
	}

}
