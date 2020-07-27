package kosta.network;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample2 {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;

		try {
			serverSocket = new ServerSocket(9900);
			socket = serverSocket.accept();

			Thread receive = new ServerReceive(socket);
			Thread send = new ServerSender(socket);

			receive.start();
			send.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
