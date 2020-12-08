package thread;

import java.io.*;

class myWriter extends Thread{
	private PipedOutputStream outStream;
	private String messages[] = {"Monday","Tuesday","Wednsday","Thursday","Friday","Saturday","Sunday"};
	public myWriter(PipedOutputStream o) {
		outStream = o;
	}

	public void run() {
		PrintStream p = new PrintStream(outStream);
		for(int i = 0;i<messages.length;i++) {
			p.println(messages[i]);
			p.flush();
			System.out.println("Writer:"+messages[i]);
		}
		p.close();
		p = null;
	}
}

class myReader extends Thread{
	private PipedInputStream inStream;
	public myReader(PipedInputStream i) {
		inStream = i;
	}
	public void run() {
		String line;
		boolean reading = true;
		BufferedReader d = new BufferedReader (new InputStreamReader(inStream));
		while(reading && d != null) {
			try {
				line = d.readLine();
				if (line != null)
					System.out.println("Reader:" + line);
				else
					reading = false;
			} catch (IOException e) {
				
			}
		}
		try {
			Thread.currentThread().sleep(4000);
		} catch (InterruptedException e) {
			
		}
	}
}
public class Pipethread {
	public static void main(String[] args) {
		Pipethread thisPipe = new Pipethread();
		thisPipe.process();
	}

	private void process() {
		PipedInputStream inStream;
		PipedOutputStream outStream;
		try {
			outStream = new PipedOutputStream();
			inStream = new PipedInputStream(outStream);
			new myWriter(outStream).start();
			new myReader(inStream).start();
		} catch (IOException e) {
			
		}
	}
}
