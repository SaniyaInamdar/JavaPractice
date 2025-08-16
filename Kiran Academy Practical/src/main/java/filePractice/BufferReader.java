package filePractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {
	
	String filename="SaniyaFolder.txt";
	String pathname="D:\\Eclipse\\Kiran Academy Practical\\";
	File file=null;
	FileReader fileread=null;
	BufferedReader read=null;
	public BufferReader() {
		read();
	}
	
	public void read() {
		try {
		file=new File(pathname+filename);
		fileread=new FileReader(file);
		read=new BufferedReader(fileread);
		
		String data=read.readLine();
		while(data!=null) {
			System.out.println(data);
			data=read.readLine();
		}
		
//		int data=read.read();
//		while(data!= -1) {
//			char ch=(char)(data);
//			System.out.print(ch);
//			data=read.read();
//		}
		
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferReader b=new BufferReader();
	}

}
