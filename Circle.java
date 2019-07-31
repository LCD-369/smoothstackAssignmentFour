package com.louis;

public class Circle implements Shape {
	
	private double area = 0;
	
	public Circle() {
		
	}
	
	@Override
	public void calculateArea(double radius, double pi) {
        
        area = pi * radius * radius;
        
	}

	@Override
	public String display() {
		
		return "Circle area is: "+area;
		
	}

}
