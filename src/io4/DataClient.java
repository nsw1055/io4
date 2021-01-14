package io4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class DataClient {

	//bad code
	public static void main(String[] args)throws Exception {
		
		String str = "MENU";
		
		Socket socket = new Socket("127.0.0.1", 5555);
		
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		DataInputStream din = new DataInputStream(socket.getInputStream());
		
		dos.writeUTF(str);
		System.out.println("------------------------------");
		String line = din.readUTF();
		System.out.println(line);
		
		
		dos.close();
		din.close();
		socket.close();
		
	}
}
