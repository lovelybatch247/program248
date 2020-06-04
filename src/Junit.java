//import static org.junit.Assert.fail;

import static org.junit.Assert.fail;

import org.junit.Test;

public class Junit {
	
	//Gets executed every time when we run this program
	
	@Test
	
	public  void test1() {
		if(multiply(10,30)==300) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
			fail("Multiply failed for 10 and 30");
		}
	}
	

	//Multiply
	
	public int multiply(int x,int y) {
		return x*y;
	}
	
	
	@Test
	
	public void test2() {
		if(add(10,30)==300) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
			fail("Add failed for 10 and 30");
		}
	}
	//Add
	
	public int add(int x,int y) {
		return x+y;
	}
	
	
	
	//Divide
	
	/*public double divide(int x,int y) {
		return x/y;
	}*/
	
	
}
