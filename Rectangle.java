package com.louis;

public class Rectangle implements Shape {

	private double area = 0;
	
	public Rectangle() {
		
	}
	
	@Override
	public void calculateArea(double length, double width) {
	
	area = length*width;		
	}

	@Override
	public String display() {
		
		return "Rectangle Area is: "+area;
	}

}
