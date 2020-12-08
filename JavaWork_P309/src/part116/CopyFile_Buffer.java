package part116;

import java.io.*;

public class CopyFile_Buffer {
	public static void main(String[] args) {
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		try {
			reader = new BufferedReader(new FileReader("src/part116/T1.txt"));
			writer = new BufferedWriter(new FileWriter("src/part116/T2.txt"));
			
			String line = null;
			while((line = reader.readLine()) != null) {
				writer.write(line);
//				System.out.println(line);
				writer.flush();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {	
				if(writer != null) {
					writer.close();
				}
				if(reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
