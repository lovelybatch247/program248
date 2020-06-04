package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Scanner;

public class Robotcalculator 
{

	public static void main(String[] args) throws Exception 
	{
		//get data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input1");
		String i1=sc.nextLine();
		System.out.println("Enter input2");
		String  i2=sc.nextLine();
		//Open calculator s/w(window based s/w)
		Runtime.getRuntime().exec("c:\\Windows\\System32\\calc.exe");
		Thread.sleep(5000);
		//Send input to calculator window
		StringSelection x=new StringSelection(i1);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x, null);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(5000);
		//Click +
		r.keyPress(KeyEvent.VK_DIVIDE);
		r.keyRelease(KeyEvent.VK_DIVIDE);
		Thread.sleep(5000);
		//Send input2 to calculator window
		StringSelection y=new StringSelection(i2);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(y, null);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(5000);
		//Click =
		r.keyPress(KeyEvent.VK_EQUALS);
		r.keyRelease(KeyEvent.VK_EQUALS);
		//Get output from calculator window into clipboard via copy
		r.keyPress(KeyEvent.VK_CONTEXT_MENU);//right click
		r.keyRelease(KeyEvent.VK_CONTEXT_MENU);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		String z=(String)Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		System.out.println(z);
		//Validations
		int a=Integer.parseInt(i1);
		int b=Integer.parseInt(i2);
		int c=Integer.parseInt(z);
		if(c==a/b)
		{
			System.out.println("Division test passed for calculator");
		}
		else
		{
			System.out.println("Division test failed for calculator");
		}
		//Close calculator window using ALT F4
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_ALT);
		
	}
}
