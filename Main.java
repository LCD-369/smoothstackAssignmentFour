package com.louis;

public class Main {

	public static void main(String[] args) {
		final double pi = 3.14;
		double r = 6.89;
		double base = 5.09;
		double height = 10.78;
		
		Circle c = new Circle();
		c.calculateArea(r, pi);
		System.out.println(c.display());
		
		Triangle t = new Triangle();
		t.calculateArea(base, height);
		System.out.println(t.display());

	}

}
