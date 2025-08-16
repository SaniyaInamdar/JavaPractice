package filePractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	
	static String filename="SaniyaDemo.txt";
	static String filepath="D:\\Eclipse\\Kiran Academy Practical\\SaniyaFolder\\";
	static File file=null;
	
	public ReadFile() {
		readData();
	}
	public static void readData() {
		file=new File(filepath+filename);
		try {
			FileReader read=new FileReader(file);
			int code = read.read();
			while(code!=-1) {
				char ch=(char)(code);
				System.out.print(ch);
				code=read.read();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadFile read=new ReadFile();
	}

}
