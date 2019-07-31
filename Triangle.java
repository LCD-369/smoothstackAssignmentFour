package com.louis;

public class Triangle implements Shape {

	public double area = 0;
	
	public Triangle() {
		
	}
	
	@Override
	public void calculateArea(double base, double height) {
		area = (base * height)/2;
		
	}

	@Override
	public String display() {
		return "Triangle Area is: "+area;
		
	}

}
