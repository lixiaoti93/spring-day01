package first;

import java.util.Calendar;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		/*
		 * GregorianCalendar是Calendar的子类
		 */
		Calendar cal=Calendar.getInstance();
		System.out.println("cal:"+cal);
		Date date1=cal.getTime();
		System.out.println("date1:"+date1);
	}

}
