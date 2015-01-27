package impl;

import java.util.Date;

public class GeometricObject {
	public class Circle {

	}

	private String color = "white";
	private boolean isFilled;
	private Date dateCreated;
	
	public GeometricObject() {
		dateCreated = new Date();
	}
	
	public GeometricObject(String color, boolean isFilled) {
		this.color = color;
		this.isFilled = isFilled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return isFilled;
	}

	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

}
