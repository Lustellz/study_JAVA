package kosta.test;

import java.util.Calendar;


public class DateUtil {
	public static String getCurrentDate() {
		Calendar cal = Calendar.getInstance();
		StringBuffer sb = new StringBuffer();
		sb.append(cal.get(Calendar.YEAR));
		sb.append(String.format("%02d", cal.get(Calendar.MONTH)+1));
		sb.append(String.format("%02d", cal.get(Calendar.DATE)));
		return sb.toString();
	};
}
