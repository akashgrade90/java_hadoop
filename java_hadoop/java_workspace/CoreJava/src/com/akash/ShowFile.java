package com.akash;

import java.io.*;

public class ShowFile {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String filePath = "C:\\Users\\gradea\\Documents\\showFile.txt";
		FileInputStream f;
		int i=0;
		
		try{
			f = new FileInputStream(filePath);
		} catch(FileNotFoundException e){
			System.out.println("File Not found");
			return;
		}

		while(i!=-1){
			i = f.read();
			System.out.println((char) i);
		}
				


		//Here is the code to read a file per line
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));
		String line=null;
		while((line = br.readLine())!= null){
			System.out.println(line.split(" ").length);
		}
		
		br.close();
		f.close();
		
	}

}
