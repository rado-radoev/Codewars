package com.bob.server;

import java.io.IOException;
import java.net.ServerSocket;

public class BobServer {
	
	private static final int PORT = 65432;
	private boolean listening = true;
	
	
	public BobServer() {
		
		try (ServerSocket socket = new ServerSocket(PORT)) {
			while (listening) {
				System.out.println("Waiting for connection");
				new BobServerMultiTHreaded(socket.accept()).start();
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
			System.err.println(String.format("Could not listen on port %d", PORT));
			System.exit(-1);
		}
		
		
	}

}
