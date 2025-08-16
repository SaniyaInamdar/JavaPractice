package filePractice;

import java.io.File;
import java.io.IOException;

public class MyFolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dir_path="D:\\Eclipse\\Kiran Academy Practical\\SaniyaFolder";
		File file = new File(dir_path);
		file.mkdir();
		System.out.println("Directory/Folder  Created Successfully");
		
		String filepath="D:\\Eclipse\\Kiran Academy Practical\\SaniyaFolder\\SaniyaDemo.txt";
		File file2 = new File(filepath);
		try {
			file2.createNewFile();
			System.out.println("File Created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
