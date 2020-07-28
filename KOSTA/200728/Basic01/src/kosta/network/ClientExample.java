package kosta.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExample {

	public static void main(String[] args) {

		Socket socket = null;

		try {
			socket = new Socket("127.0.0.1", 9900);
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();

			String message = "Server connected";
			out.write(message.getBytes());
			byte arr[] = new byte[100];
			in.read(arr);
			System.out.println("from server: " + new String(arr));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
