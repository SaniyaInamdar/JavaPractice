package filePractice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteWithExistingData {
	 String filename="SaniyaDemo.txt";
	 String dirpath="D:\\Eclipse\\Kiran Academy Practical\\SaniyaFolder\\";
	 File file=null;
	
	public WriteWithExistingData() {
		write();
	}
	
	public void write() {
		file=new File(dirpath+filename);
		
			try {
				FileWriter writeData = new FileWriter(file,true);
				String data="Hello Saniya...";
				writeData.write(data);
				writeData.flush();
				writeData.close();
				System.out.println("Writing done....");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WriteWithExistingData write=new WriteWithExistingData();
	}

}
