package impl;

public class Rectangle extends GeometricObject {
	private double height;
	private double width;
	
	public Rectangle() {
		
	}
	
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	public Rectangle(double height, double width, String color, boolean isFilled) {
		super(color, isFilled);
		this.height = height;
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getArea(){
		return width * height;
	}
	
	public double getPerimiter(){
		return 2* (width + height); 
	}
}
