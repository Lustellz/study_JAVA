package kosta.io;

import java.io.FileReader;

public class FileReaderExample {

	public static void main(String[] args) {
		// 파일의 문자 데이터를 읽어오기 위해 FileReader 클래스를 사용합니다.
		FileReader reader = null;
		char arr[] = new char[50];
		try {
			reader = new FileReader("poem.txt");

//			while (true) {
//				int data = reader.read();
//				if (data == -1)
//					break;
//				char c = (char) data;
//				System.out.print(c);
//			}

//			reader.read(arr);
//			System.out.println(arr);

			while (true) {
				int data = reader.read(arr);
				if (data == -1)
					break;
				System.out.print(arr);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
