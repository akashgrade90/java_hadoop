package com.akash;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack1 = new Stack();
		
		for(int i=0;i<5;i++)
			stack1.push(i+1);
		
		stack1.stackInfo();
		
		System.out.println("Pulled Item: "+stack1.pull());
		stack1.stackInfo();
	}

}