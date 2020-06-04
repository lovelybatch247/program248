package selenium;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Dateandtime {

	public static void main(String[] args) {
		//Logic-1
		/*SimpleDateFormat sf=new SimpleDateFormat("dd-mm-yyyy hh-mm-ss");
		Date dt=new Date();
		String x=sf.format(dt);
		System.out.println(x);*/
		//Logic-2
		SimpleDateFormat sf=new SimpleDateFormat("dd-MMM-yyyy hh-mm-ss");
		Calendar cal=Calendar.getInstance();
		String x=sf.format(cal.getTime());
		System.out.println(x);

	}

}
