package kosta.network;

import java.net.Socket;

public class ClientExample2 {

	public static void main(String[] args) {

		Socket socket = null;

		try {
			socket = new Socket("127.0.0.1", 9900);

			Thread sender = new ClientSender(socket);
			Thread receive = new ClientReceive(socket);
			sender.start();
			receive.start();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
