package kosta.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class BufferExample {

	public static void main(String[] args) {
		// Scanner 외에 입출력 스트림을 이용해서 데이터 입력을 구현할 때는
		// System.in->InputStream->InputStreamReader->BufferedReader

		BufferedReader br = null;
		BufferedWriter bw = null;
		String str = "";
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new FileWriter("output.txt",true));
			System.out.print("입력: ");
			while ((str = br.readLine()) != null) {
				str += "\n";
				bw.write(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				br.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
