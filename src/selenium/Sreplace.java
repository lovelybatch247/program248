package selenium;

public class Sreplace {

	public static void main(String[] args) {
		String x="kalam";
		x=x.replace("a", "da");
		System.out.println(x);
		String y="Hello Pratibha ?";
		y=y.replace(" ", "");
		System.out.println(y);
		String z="$234.678";
		z=z.replace("$", "");
		float w=Float.parseFloat(z);
		System.out.println(w);
	}
}
