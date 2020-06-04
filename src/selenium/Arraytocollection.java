package selenium;

import java.util.List;
import java.util.Arrays;

public class Arraytocollection {

	public static void main(String[] args) {
		String ar[]= {"Hello","I","Am","Joker"};
		List<String> al=Arrays.asList(ar);
		for(String item:al)
		{
			System.out.println(item);
		}

	}

}
