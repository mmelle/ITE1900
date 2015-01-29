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
	
	@Override
	public double getArea(){
		return radius * radius * Math.PI;
	}
	
	@Override
	public double getPerimiter(){
		return 2 * radius * Math.PI;
	}

	@Override
	public int compareTo(GeometricObject o) {
		if (getArea() > o.getArea()){
			return 1;
		}
		if (getArea() < o.getArea()){
			return -1;
		}
		
		return 0;
	}	
}
