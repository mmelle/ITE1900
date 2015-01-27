package tests;

import impl.*;

public class GeometricObjectsMain {

	public static void main(String[] args) {
		GeometricObject[] objects = new GeometricObject[2];
		objects[0] = new Circle(2.9);
		objects[1] = new Rectangle(2, 4);
		
		GeometricObject biggest = getBiggest(objects[0], objects[1]);
		
		assert(biggest instanceof Rectangle);
	}

	private static GeometricObject getBiggest(GeometricObject object1,
			GeometricObject object2) {
		return null;
	}
}
