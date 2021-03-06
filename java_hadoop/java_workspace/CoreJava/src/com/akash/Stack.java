package com.akash;

public class Stack {
	int stackArray[] = new int[10];
	int pos;
	int noOfElements;
	
	Stack(){
		pos = -1;
		noOfElements=0;
	}
	
	public void push(int element){
		if(this.pos==9)
			System.out.println("Stack is full");
		else{
			this.stackArray[++pos]=element;
			noOfElements++;			
		}	
	}
	
	public int pull(){
		if(pos > -1){
			noOfElements--;
			return this.stackArray[pos--];
		}
		else
		{
			System.out.println("Stack Underflow");
			return -1;
		}
	}
	
	public void stackInfo(){
		System.out.println("Total elements in this stack = "+this.noOfElements);
		System.out.println("Current pos position = "+this.pos);

		for(int i=this.pos; i>-1;i--)
			System.out.println(this.stackArray[i]);
	}
}
