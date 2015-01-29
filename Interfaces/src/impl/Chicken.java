package impl;

public class Chicken extends Animal implements Edible{

	@Override
	public String makeSound() {
		return "Chicken: kvakk, kvakk";
	}

	@Override
	public String howToEat() {
		return "Chicken: Cook it";
	}
	
}
