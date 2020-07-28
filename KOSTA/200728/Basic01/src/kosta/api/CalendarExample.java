package kosta.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExample {

	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		Calendar c = Calendar.getInstance();
		System.out.println(gc);
		System.out.println(c);

		String now = gc.get(Calendar.YEAR) + "년 " + (gc.get(Calendar.MONTH)+1) + "월 " + gc.get(Calendar.DATE)+"일 "+gc.get(Calendar.HOUR)+"시 "+gc.get(Calendar.MINUTE)+"분";
		System.out.println(now);
		
		//100일 후의 날짜를 구하세요.
		gc.add(Calendar.DATE,100);
		String after = gc.get(Calendar.YEAR) + "년 " + (gc.get(Calendar.MONTH)+1) + "월 " + gc.get(Calendar.DATE)+"일 "+gc.get(Calendar.HOUR)+"시 "+gc.get(Calendar.MINUTE)+"분";
		System.out.println("오늘부터 100일 후는 "+after+"입니다.");
	
		//과거의 날짜로부터 100일이 지난 날을 구하세요.
		gc.set(2020,5,30);
		gc.add(Calendar.DATE, 100);
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		
		String str = df.format(gc.getTime());
		System.out.println(str);
		
		char[] week = {'일','월','화','수','목','금','토'};
		
		for(int i=2020;i<=2030;i++) {
			gc.set(i,6,16);
			char dc=week[gc.get(Calendar.DAY_OF_WEEK)-1];
			System.out.println(i+"년의 생일은 "+dc+"요일 입니다.");
		}
	}

}
