package part116;

import java.io.*;

public class CopyFile {
	public static void main(String[] args) {
		File file1 = new File("src/part116/T1.txt");
		File file2 = new File("src/part116/T2.txt");
		Reader reader = null;
		Writer writer = null;
		
		try {
			reader = new FileReader(file1);
			writer = new FileWriter(file2);
			char[] cs = new char[10];
			int len = -1;
			while((len = reader.read(cs)) != -1) {
//				System.out.print(new String(cs, 0, len));
				writer.write(cs, 0, len);
			}
			writer.flush();
			
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
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}

