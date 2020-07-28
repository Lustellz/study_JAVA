package kosta.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExample2 {

	public static void main(String[] args) {
		String data[] = {
				"bat", "bba", "bbg", "bonus",
				"CA", "ca", "c232", "car",
				"date", "dic", "diraaa"
		};
		
//		Pattern p = Pattern.compile("c[a-z]*");
//
//		for(int i=0;i<data.length;i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.println(data[i]);
//		}
		
//		String source = "abc?de?fgh";
//		String reg = "(\\w*)"; //글씨를 기준으로 group화 함
//		Pattern p = Pattern.compile(reg);
//		Matcher m = p.matcher(source);//그룹으로 묶을 수 있는 것들만 출력하기 위함
//		
//		while(m.find()) {
//			System.out.println(m.group());
//		}
		
		String source = "HP: 010-1111-1111, HOME: 02-222-2222";
		String gr = "([^a-zA-Z&:&,& ]*)"; //"(0\\d{1,2}-\\d{3,4}-\\d{4})"
		Pattern p = Pattern.compile(gr);
		Matcher m = p.matcher(source);
		while(m.find()) System.out.println(m.group());
	}

}
