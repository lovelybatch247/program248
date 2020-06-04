package selenium;

import java.util.ArrayList;

public class Collectiontoarr {

	public static void main(String[] args) {
		//Declare dynamic array
		ArrayList<String> al=new ArrayList<>();
		al.add("Hello");
		al.add("I");
		al.add("Am");
		al.add("Joker");
		String ar[]=al.toArray(new String[0]);
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		
	}

}
