package tests;

import java.util.Arrays;

import impl.*;

public class GeometricObjectsMain {

	public static void main(String[] args) {
		GeometricObject[] objects = new GeometricObject[2];
		objects[0] = new Circle(2.9);
		objects[1] = new Rectangle(2, 4);
		
		Arrays.sort(objects);
		
		GeometricObject biggest = getBiggest(objects[0], objects[1]);
		
		assert(biggest instanceof Circle);
	}

	private static GeometricObject getBiggest(GeometricObject object1,
			GeometricObject object2) {
		double area1 = object1.getArea();
		double area2 = object2.getArea();
		
		if (area1 > area2){
			return object1;
		}else{
			return object2;
		}
	}
}
