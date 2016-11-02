package com.akash;

public class LinkedList {
	Node head;
	Node tail;
	int size=0;
	
	
	public void add(int pValue){
		Node newNode = new Node(pValue);
		
		if(this.size==0) {
			System.out.println("\n===This list is empty, creating first node===");
			this.head=newNode;
			this.tail=newNode;
		}
		else{
			System.out.println("Adding new element in the list");
			newNode.previous=this.tail;
			this.tail.next=newNode;
			this.tail=newNode;
			
			this.tail.index=this.tail.getPrevNodeIndex()+1;
			
		}	
		
		this.size++;
		System.out.println("Now total no of elements are:"+this.size);
	}
	
	public int remove(){
		int value=-1;
		
		if (this.size==0)
			System.out.println("Empty List");
			
		else{
			System.out.println("Removing element from tail");
			
			value = this.tail.value;
			this.tail=this.tail.previous;
			this.tail.next=null;
			this.size--;
		}
		
		return value;
	}
	
	public int remove(int index){
		
	int value=-1;
		
		if (this.size==0)
			System.out.println("Empty List");
			
		else{
			System.out.println("Removing element from position : "+index);
			Node tempNode = new Node();
			tempNode=this.head;
			
			while(tempNode != null){
				
				if(tempNode.index==index){
					value=tempNode.value;
					tempNode.previous.next=tempNode.next;
					tempNode.next.previous=tempNode.previous;
				}
				if (tempNode.index>index){
					tempNode.index=tempNode.index-1;
				}
				tempNode=tempNode.next;		
			} 
			this.size--;
		}	
		return value;

	}
	
	
	public void printList(){
		if (this.size==0)
			System.out.println("Empty List");
		else{
			Node tempNode = new Node();
			tempNode=this.head;
			
			while(tempNode != null){
				System.out.println(tempNode.index+" : "+tempNode.value);
				tempNode=tempNode.next;		
			} 
		}	
	}
	
	public void printListInfo(){
		System.out.println("=========================");
		System.out.println("size : "+this.size);
		System.out.println("head index : "+this.head.index);
		System.out.println("head value : "+this.head.value);
		System.out.println("tail index : "+this.tail.index);
		System.out.println("tail value : "+this.tail.value);
		System.out.println("=========================");
	}
}
