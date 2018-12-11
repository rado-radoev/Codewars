package com.bob.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import com.bob.protocol.BobProtocol;

public class BobServerMultiTHreaded extends Thread {

	private final Socket socket;
	
	public BobServerMultiTHreaded(Socket socket) {
		super();
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try (PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));) {
					
			String inputLine, outputLine;
			
			BobProtocol bp = new BobProtocol();
			
			outputLine = bp.hey("");
			out.println("");
			
			while ((inputLine = in.readLine()) != null) {
				
				outputLine = bp.hey(inputLine);
				out.println(outputLine);
				
				if (outputLine.equalsIgnoreCase("Bye.")) break;
			}
			
			socket.close();
					
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}
	
	
}
