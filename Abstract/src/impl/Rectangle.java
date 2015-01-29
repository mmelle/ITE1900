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
	
	@Override
	public double getArea(){
		return width * height;
	}
	
	@Override
	public double getPerimiter(){
		return 2* (width + height); 
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
