package selenium;

public class Sindexof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="check out";
		int i=x.indexOf('c');
		System.out.println(i);
		int j=x.indexOf('c', 1);
		System.out.println(j);
		int k=x.indexOf("ec");
		System.out.println(k);
		int l=x.indexOf("ck", 1);
		System.out.println(l);
	}

}
