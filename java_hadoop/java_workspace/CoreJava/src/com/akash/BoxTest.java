package com.akash;

public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box1 = new Box();
		Box box2 = new Box(10,10,10);
		
		System.out.println("Volume of the first box is "+box1.volume+" and surface area is "+box1.surfaceArea);
		System.out.println("Volume of the second box is "+box2.volume+" and surface area is "+box2.surfaceArea);
		
		Box box3 =  new Box(5,5,5);
		box3.volume();
		System.out.println("Volume of third box is : "+box3.volume);
			
	}

}
