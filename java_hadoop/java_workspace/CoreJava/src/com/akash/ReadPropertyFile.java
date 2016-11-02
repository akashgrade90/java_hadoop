package com.akash;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class ReadPropertyFile {

	
	Properties properties = new Properties();
	
	ReadPropertyFile(String path){
		try {
			File file = new File(path);
			FileReader reader = new FileReader(file);
			properties.load(reader);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	String getName(){
			return properties.getProperty("name");	
	}
	
	String getAge(){
		return properties.getProperty("age");
	}
	
	public static void main(String[] args){
		ReadPropertyFile rp = new ReadPropertyFile("C:\\Users\\gradea\\.babun\\cygwin\\home\\gradea\\personal\\java_workspace\\CoreJava\\src\\com\\akash\\config.properties");
		System.out.println(rp.getName());
	}
}
