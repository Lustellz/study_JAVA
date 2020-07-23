package kosta.io;

import java.io.File;
import java.util.GregorianCalendar;

public class FileExample {

	public static void main(String[] args) {
		File file = new File(".");
		File arr[] = file.listFiles();
		for(int cnt = 0 ; cnt<arr.length;cnt ++) {
			String name = arr[cnt].getName();
			if(arr[cnt].isFile())
				System.out.println(name+" "+arr[cnt].length());
			else
				System.out.println("<DIR> "+name);
		
			long time = arr[cnt].lastModified();
			GregorianCalendar calendar = new GregorianCalendar();
			calendar.setTimeInMillis(time);
			System.out.println(calendar);
		}
	}

}
