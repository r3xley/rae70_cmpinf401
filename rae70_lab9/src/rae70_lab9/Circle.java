package rae70_lab9;

public class Circle {
    private double radius;
	private String color;
	
	public Circle() {
		this.radius = 5.0;
		this.color = "Green";
	}
	
	public Circle(double radius) {
		this.radius = radius;
		
	}
	
	public Circle(String color, double radius) {
		this.color = color;
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	public String getColor() {
		return this.color;
		
	}
	public double getArea() {
		return radius * radius * Math.PI;
	}
}
