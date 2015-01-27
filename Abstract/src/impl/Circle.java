package impl;

public class Circle extends GeometricObject{
	private double radius;
	
	public Circle() {
	}
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean isFilled){
		super(color, isFilled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea(){
		return radius * radius * Math.PI;
	}
	
	public double getPerimiter(){
		return 2 * radius * Math.PI;
	}	
}
