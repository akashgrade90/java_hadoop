package com.akash;

public class Pallindrom {
	public static boolean PallindromTest(String inputString){
		int StringLen = inputString.length();
		
		if(StringLen == 1 || StringLen == 0)
			return true;
		
		if(inputString.toUpperCase().charAt(0)==inputString.toUpperCase().charAt(StringLen-1))
			return PallindromTest(inputString.substring(1,StringLen-1));

		else
			return false;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(PallindromTest("AbBA") ? "YES" : "NO");

	}

}
