package com.akash;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EmailValidation {
	public static void main(String args[]){
		
		/*
		 ^[_A-Za-z0-9-\\+]+    : Must start with any of the character and have atleast on occurance 
		 (\\.[_A-Za-z0-9-]+)*   : This is optional for the second part
		 @ : This is mandatory
		 
		 [A-Za-z0-9-]+ : atleast one occurance of a char 
		 (\\.[_A-Za-z0-9-]+)* : optional
		 (\\.[A-Za-z]{2,})$  : Ends with a . and atlease 2 char after it
		 */
		
		String emailPattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"	+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		String inputString="akashgrade@gmail.com";
		Pattern p = Pattern.compile(emailPattern);
		Matcher m = p.matcher(inputString);
		
		if (m.matches())
			System.out.println("Yes");
		else
			System.out.println("No");
	
	}
}
