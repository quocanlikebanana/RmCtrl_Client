package client;

import java.io.IOException;

import java.net.InetSocketAddress;
import java.net.Socket;

enum State{
	OPENED,
	CLOSED,
}

public class SocketConnection extends Socket{
	private final int TIME_OUT = 10000;
	
	private static int port;
	private static String ipAddress;
	private static State client_state;
	private Socket connection = this;
	
	public SocketConnection(String ipv4, int port) {
		this.port = port;
		this.ipAddress = ipv4;
		
		try {
			connection = new Socket(ipAddress, port);
			
		}catch(IOException e) {
			
		}
			
		
	}
	
}
