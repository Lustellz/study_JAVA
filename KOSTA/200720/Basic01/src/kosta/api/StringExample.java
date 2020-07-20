package kosta.api;

public class StringExample {

	public static void main(String[] args) {
		String str = "ABC";
		String str2 = new String("abc");// 무조건 새로 생성

		// String 불변성
		String str3 = str.concat(str2);

		System.out.println(str);
		System.out.println(str3);

		String sql = "select * from board";
		int num = 10;
		if (num == 10)
			sql += " where num = 10";

		System.out.println(sql);

		StringBuffer sb = new StringBuffer("가나다");
		sb.append("라마바");
		System.out.println(sb);

		// 해당 문자열의 위치를 파악: indexOf("문자열") <-0으로 시작, 없으면 -1 return
		System.out.println(sql.indexOf("select"));

		// 문자열 길이
		System.out.println(sql.length());
		System.out.println(sql.substring(2, 4));

		// sql변수 문자열에 "board" 단어를 추출해 보세요. (indexOf()와 substring을 사용해서)

		System.out.println(sql.substring(sql.indexOf("b"), sql.indexOf("d")));
		String fileName = "kosta.jpg";
		String head = fileName.substring(0, fileName.indexOf("."));
		String pattern = fileName.substring(head.length(), fileName.length());

		System.out.println(head + ": " + pattern);

		String id = "kosta";
		String m_id = "Kosta ";

		if (id.equalsIgnoreCase(m_id.trim()))
			System.out.println("같다.");
		else
			System.out.println("다르다.");

		// 문자열: 배열 변환
		String fruits = "사과 배 포도 수박";
		String arr[] = fruits.split("\\ ");

		for (String name : arr)
			System.out.println(name);

		// startsWith, endsWith(): 해당 문자열로 시작/종료하는 체크 메서드
		// kosta.jpg가 이미지 파일인지를 체크하세요.

		if (fileName.endsWith("gif") || fileName.endsWith("jpg") || fileName.endsWith("gif"))
			System.out.println("이미지 파일입니다.");
		String path = "C:\\Users\\Public\\Pictures\\Sample Pictures\\등대.jpg";
		String path_result[] = path.split("\\\\");
		int file_length = path_result.length - 1;
		String tmp = path_result[file_length];
		String ext = tmp.substring(tmp.indexOf("."), tmp.length());
		String result = path.substring(path.indexOf(tmp), path.indexOf(".") ) + "_small" + ext;
		System.out.println(result);
	}

}
