package com.akash;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ShowFile2 {

	public static void main(String[] args) throws IOException {
		
		String filePath = "C:\\Users\\gradea\\Documents\\showFile.txt";
		File file = new File(filePath);

			FileReader reader = new FileReader(file);
			BufferedReader br = new BufferedReader(reader);
			String line=null;
			while((line = br.readLine())!= null){
				System.out.println(line);
			}
			
			br.close();
	}

}
