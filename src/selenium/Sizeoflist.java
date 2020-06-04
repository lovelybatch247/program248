package selenium;

import java.util.ArrayList;

public class Sizeoflist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		System.out.println("Size of arraylist before inserting data is : "+al.size());
		al.add("Java");
		al.add("Selenium");
		al.add("Appium");
		al.add("Rest Assured");
		al.add("SQL");
		al.add("RDBMS");
		System.out.println("Size of arraylist after inserting data is : "+al.size());
		for(String item:al)
		{
			System.out.println(item);
		}
		
	}

}
