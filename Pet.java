package pet;

import java.util.ArrayList;

public abstract class Pet {
	
	//instance variables
	//default access. accesible anywhere in the same package
	int age;
	String name; 
	double weight;
	
	//constructor
	public Pet (int age, String name, double weight) {
		
		this.age = age;
		this.name = name;
		this.weight = weight;
	}
	
	//weight getters and setters 
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

	//concrete eat method
	public void eat(Food food) {
		
		this.weight += (food.getCalories() /100);
		
	}
	
	//abstract method
	//force all pets to make their own sound
	//all subclasses of Pet must implement this method
	public abstract void makeSound();
	
	//force all pets to override toString for printing/debugging
	public abstract String toString();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Pet> pets = new ArrayList<Pet>();
		
		Cat cat = new Cat("Piko", 2, 5, "Domestic shorthair");
		
		pets.add(cat);
		
		for (Pet pet :pets ) {
			System.out.println(pet);
			pet.makeSound();
		}
		
		
	}

	
}
