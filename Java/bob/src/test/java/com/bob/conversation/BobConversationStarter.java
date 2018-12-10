package com.bob.conversation;

import java.net.UnknownHostException;

import com.bob.client.BobClient;
import com.bob.server.BobServer;

public class BobConversationStarter {

	public static void main(String[] args) throws UnknownHostException {
		Runnable startServert = () -> {new BobServer();};
		new Thread(startServert).start();
		
		BobClient client = new BobClient();
		
		client.chat();

	}

}
