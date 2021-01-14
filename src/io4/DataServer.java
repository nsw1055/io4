package io4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class DataServer {

	//bad code
	public static void main(String[] args)throws Exception {
		
		ServerSocket server = new ServerSocket(5555);
		
		System.out.println("ready..........");
		
		while(true) {
			
			Socket socket = server.accept();
			DataInputStream din = new DataInputStream(socket.getInputStream());
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			
			String str = din.readUTF();
			
			System.out.println(str);
			
			dos.writeUTF(str);
			
			
			dos.close();
			din.close();
			socket.close();
			
			
		}//end while
		
	}
	
}
