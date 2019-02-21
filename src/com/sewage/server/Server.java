package com.sewage.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	private ServerSocket serverSocket;
	
	public Server(int port) {
		try {
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			System.out.println("端口被占用");
		}
	}
	
	public void start() throws IOException {
		Socket socket = serverSocket.accept();
		
	}
	

}
