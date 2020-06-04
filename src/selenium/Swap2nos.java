package selenium;

public class Swap2nos {

	public static void main(String[] args) {
		int x=-20;
		int y=47;
		//Logic-1
		/*int temp=x;//-20
		x= y;//47
		y=temp;//-20
		System.out.println(x+" "+y);*/
		//Logic-2
		/*y=x+y;//-20+47
		x=y-x;//-20+47-(-20)
		y=y-x;//(-20+47)-47
		System.out.println(x+" "+y);*/
		//Logic-3
		/*x=x*y;//-20*47
		y=x/y;//-20
		x=x/y;
		System.out.println(x+" "+y);*/
		//Logic-4
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println(x+" "+y);
	}

}
