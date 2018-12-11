package com.bob.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Inet4Address;
import java.net.Socket;
import java.net.UnknownHostException;

public class BobClient {
	
	private static int port = 65432;
	private static String hostname;
	
	public BobClient() throws UnknownHostException {
		
		this.hostname = Inet4Address.getLocalHost().getHostName();
	}
	
	public static void chat() {
		try (Socket socket = new Socket(hostname, port);
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));) {
			
			BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
			
			String fromServer = null, fromClient = null;
			
			while ((fromServer = in.readLine()) != null) {
				System.out.println(fromServer);
				
				if (fromServer.equalsIgnoreCase("Bye.")) break;
								
				fromClient = stdIn.readLine();
				if (fromClient != null) {
					out.println(fromClient);
				}
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Couldn't get I/O for the connection to " + hostname);
            System.exit(1);
		}
	}
	

}
