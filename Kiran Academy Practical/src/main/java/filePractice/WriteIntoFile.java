package filePractice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoFile {

	static String myfile="SaniyaDemo.txt";
	static String mydirectory="D:\\Eclipse\\Kiran Academy Practical\\SaniyaFolder\\";
	static File file=null;
	File directory=null;
	
	public WriteIntoFile(){
		writeFile();
	}
	
	public static void writeFile() {
		
		try {
			file=new File(mydirectory+myfile);
			FileWriter writer=new FileWriter(file);
			String data="Saniya is a very good programmer";
			writer.write(data);
			writer.flush();
			writer.close();
			System.out.println("Suceesfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WriteIntoFile write=new WriteIntoFile();
	}

}
