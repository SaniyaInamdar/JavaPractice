package filePractice;

import java.io.File;
import java.io.IOException;



public class MyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		File file=new File("Saniya.txt");
		
		String file_path="D:\\Eclipse\\Kiran Academy Practical\\src\\Saniya\\Saniya.txt";
		File file=new File(file_path);
		
		try {
			file.createNewFile();
			System.out.println("File Created");
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
