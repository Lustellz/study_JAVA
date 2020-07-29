package kosta.io;

import java.io.FileReader;
import java.io.FileWriter;

public class CopyExample {

	public static void main(String[] args) {
		FileReader reader = null;
		FileWriter writer = null;

		String tmp = "";

		try {
			reader = new FileReader("poem.txt");
			while (true) {
				int data = reader.read();
				if (data == -1)
					break;
				char c = (char) data;
				tmp += c;
			}
			try {
				writer = new FileWriter("poem3.txt");
				writer.write(tmp);

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (Exception e3) {
				e3.printStackTrace();
			}
		}

	}

}
