package com.scoket;

import java.io.*;
import java.net.*;

public class SimpleServer {
	public static void main(String[] args) {
		ServerSocket s = null;
		Socket s1;
		String sendString = "Hello Net World!";
		int slength = sendString.length();
		OutputStream slout;
		DataOutputStream dos;
					
		try {
			s = new ServerSocket(5432);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		while(true) {
			try {
			s1 = s.accept();
			slout = s1.getOutputStream();
			dos = new DataOutputStream(slout);
			
			dos.writeUTF(sendString);
			
			dos.close();
			slout.close();
			s1.close();
			
			} catch (IOException e) {}
		}
	}
}

