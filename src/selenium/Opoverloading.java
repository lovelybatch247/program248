package selenium;

public class Opoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=20;
		int y=10;
		int r1=x+y;
		System.out.println(r1);//30
		char ch1='A';
		int r2=ch1+y;
		System.out.println(r2);//75
		int r3=x+ch1;
		System.out.println(r3);//85
		char ch2='a';
		int r4=ch1+ch2;
		System.out.println(r4);//162
		char r5=(char)r4;
		System.out.println(r5);
		String s1="Lovely";
		String r6=y+s1;
		System.out.println(r6);//10Lovely
		String r7=s1+x;
		System.out.println(r7);//Lovely20
		String r8=s1+ch1;
		System.out.println(r8);//LovelyA
		String r9=ch2+s1;
		System.out.println(r9);//aLovely
		String r10=s1+r6;
		System.out.println(r10);//Lovely10Lovely
	}

}
