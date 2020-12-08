package part1111;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class WriteToTxt {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		System.out.println("请输入需要添加的书目:(输入exit结束)");
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new FileWriter("src/part1111/booklist.txt", true)); 
			String str = br.readLine(); 			
			while (!str.equals("exit")) { 
				bw.newLine();//新起一行
				bw.write(str);  
				bw.flush(); 
				str = br.readLine(); 
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				bw.close(); 
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}	
}
