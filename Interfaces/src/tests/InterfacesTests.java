package tests;

import java.util.ArrayList;

import impl.*;

public class InterfacesTests {

	public static void main(String[] args) {
		ArrayList<Edible> eatableThing = new ArrayList<>();
		eatableThing.add(new Chicken());
		eatableThing.add(new Tiger());
		eatableThing.add(new Apple());
		
		//makeAnimalsTalk(animals);
		tellMeHowToEat(eatableThing);
	}

	private static void tellMeHowToEat(ArrayList<Edible> animals) {
		for (Edible animal : animals) {
			System.out.println(animal.howToEat());
		}		
	}

	private static void makeAnimalsTalk(ArrayList<Animal> animals) {
		for (Animal animal : animals) {
			System.out.println(animal.makeSound());
		}		
	}
}
