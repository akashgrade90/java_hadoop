package com.akash;

public class Factorial {
	private static int ComputeFactorial(int inputNumber){
		if(inputNumber==0 || inputNumber==1)
			return 1;
		return inputNumber*ComputeFactorial(inputNumber-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int element=4;
		System.out.println(ComputeFactorial(element));
	}
	
}
