package com.akash;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList myList = new LinkedList();
		myList.printList();
		
		//Adding a  new element in list
		myList.add(10);
		myList.printListInfo();
		myList.printList();
		
		//Adding a  new element in list
		myList.add(20);
		myList.printListInfo();
		myList.printList();
		
		//Adding a  new element in list
		myList.add(40);
		myList.printListInfo();
		myList.printList();
	
		//Remove an element from tail
		myList.remove();
		myList.printListInfo();
		myList.printList();
		
		//Adding a  new element in list
		myList.add(30);
		myList.printListInfo();
		myList.printList();
		
		//Remove an element from tail
		myList.remove(1);
		myList.printListInfo();
		myList.printList();
		
		
	}

}
