package org.keroro.store;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

public class KioskServer {

	//bad code
	public static void main(String[] args)throws Exception {
				
		ServerSocket server = new ServerSocket(5555);

		System.out.println("ready........");

		while (true) {
			//데이터 주고받기
			Socket socket = server.accept();
			DataInputStream din = new DataInputStream(socket.getInputStream());
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

			//고객이 입력한 문자열
			String str = din.readUTF();
			System.out.println("고객의 문자열");
			System.out.println(str);
			
			//사용자가 보내는 메시지를 Gson처리
			Gson gsonMsg = new Gson();
			// Gson처리된 문자열을 map로 저장
			Map<String, Object> map = gsonMsg.fromJson(str, HashMap.class);
			
			String oper = (String)map.get("oper");
			
			System.out.println("OPER: " + oper);
			
			Gson gson = new Gson();
			String resultStr = "";
			
			if(oper.equals("M")) {
				
				List<Menu> menuList = new ArrayList<>();
				menuList.add(new Menu("0빅맥", 5000));
				menuList.add(new Menu("1빅맥", 1000));
				menuList.add(new Menu("2빅맥", 4000));
				menuList.add(new Menu("3빅맥", 5000));			
				
				resultStr = gson.toJson(menuList);
				
			}else if(oper.equals("O")) {
				resultStr = "주문결과";
			}
			
			dos.writeUTF(resultStr);
			
			dos.close();
			din.close();
			socket.close();
		} // end while
		
	}
	
}
