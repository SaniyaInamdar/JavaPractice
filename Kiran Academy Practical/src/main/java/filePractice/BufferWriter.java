package filePractice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {
	String filename="SaniyaFolder.txt";
	String pathname="D:\\Eclipse\\Kiran Academy Practical\\";
	File file=null;
	FileWriter filewriter=null;
	BufferedWriter writer=null;
	
	public BufferWriter() {
		write();
	}
	public void write() {
		try {
		file=new File(pathname+filename);
		filewriter=new FileWriter(file,true);
		writer=new BufferedWriter(filewriter);
		String data="Hello java programm !";
		writer.write(data);
		String datanew="I love java ";
		writer.newLine();
		writer.write(datanew);
		writer.flush();
		System.out.println("Done Writing....");
		filewriter.close();
		writer.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferWriter b=new BufferWriter();
	}

}
