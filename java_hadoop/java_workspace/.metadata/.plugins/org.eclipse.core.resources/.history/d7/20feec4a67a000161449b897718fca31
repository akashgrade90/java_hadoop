package com.akash;

import java.io.File;

public class RenameFile {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\gradea\\Documents\\test.txt");
		System.out.println("Current File name : " + file.getName());

		if (file.getName().split("\\.")[0].equals(file.getName().split("\\.")[0].toUpperCase()))
			System.out.println("File Already has name in Upper case hence not gona change");
		else {
			String NewFileName = file.getName().split("\\.")[0].toUpperCase()
					.concat("." + file.getName().split("\\.")[1]);

			System.out.println("New FileName is " + NewFileName + "\n\nNow changing the file name in the dir");

			File file2 = new File("C:\\Users\\gradea\\Documents\\" + NewFileName);

			if (file.renameTo(file2)) {
				System.out.println("File renamed");
			} else {
				System.out.println("Sorry! the file can't be renamed");
			}

		}

	}

}
