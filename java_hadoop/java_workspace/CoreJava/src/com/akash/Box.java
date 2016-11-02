package com.akash;

public class Box {
	double width;
	double height;
	double depth;
	double volume;
	double surfaceArea;
	
	Box(){
		width=height=depth=0.0;
		this.volume();
		this.surfaceArea();
	}
	
	Box(double pWidth, double pHeight, double pDepth){
		width=pWidth;
		height=pHeight;
		depth=pDepth;
		this.volume();
		this.surfaceArea();
	}
	
	public void volume(){
	 this.volume=(this.depth*this.height*this.width);
	}
	
	public void surfaceArea(){
		this.surfaceArea=2*((this.depth*this.height) + (this.depth*this.width) +(this.height*this.width));
	}
}
