package selenium;

public class Scompareto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abdul kalam";
		String s2="abdul k";
		int x=s1.compareTo(s2);
		System.out.println(x);//6
		int y=s2.compareTo(s1);
		System.out.println(y);//-6
		String s3="Abdul";
		int z=s2.compareTo(s3);
		System.out.println(z);//32
		int p=s3.compareTo(s2);
		System.out.println(p);//-32
		String s4="Abdul";
		int q=s3.compareTo(s4);
		System.out.println(q);//0
		int r=s2.compareToIgnoreCase(s4);
		System.out.println(r);//0
		
	}

}
