package tests;

import java.util.ArrayList;

import impl.*;

public class InterfacesTests {

	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<>();
		animals.add(new Chicken());
		animals.add(new Tiger());
		
		makeAnimalsTalk(animals);
		//tellMeHowToEat(new Chicken(), new Apple());
	}

	private static void makeAnimalsTalk(ArrayList<Animal> animals) {
		for (Animal animal : animals) {
			System.out.println(animal.makeSound());
		}		
	}
}
