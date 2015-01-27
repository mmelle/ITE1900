package tests;

import static org.junit.Assert.*;
import impl.Circle;
import impl.Rectangle;

import org.junit.Test;

public class GeometricObjectsTests {

	@Test
	public void getArea_OfCircle_ComputesCorrectArea() {
		Circle c = new Circle(1.0);
		assertEquals(3.14, c.getArea(), 0.01);
	}
	
	@Test
	public void getPerimiter_OfCircle_ComputesCorrectPerimiter() {
		Circle c = new Circle(1.0);
		assertEquals(6.28, c.getPerimiter(), 0.01);
	}

	@Test
	public void getArea_OfRectangle_ComputesCorrectArea() {
		Rectangle rect = new Rectangle(2, 3);
		assertEquals(6.0, rect.getArea(), 0);
	}
	
	@Test
	public void getPerimiter_OfRectangle_ComputesCorrectPerimiter() {
		Rectangle rect = new Rectangle(2, 3);
		assertEquals(10.0, rect.getPerimiter(), 0);
	}
}
