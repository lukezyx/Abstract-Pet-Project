package pet;

public class Cat extends Pet {
	
	//static variable
	//only accessible within this class
	private static String SOUND = "Meow!";
	
	private String type;
	
	//constructor
	public Cat(String name, int age, double weight, String type) {
		//must call superclass constructor
		super(age, name, weight);
		this.type = type;
	}
	
	@Override
	public void makeSound() {
		System.out.println(Cat.SOUND);
			}

	@Override
	public String toString() {
		return this.name + " is a " + this.type;
	}	
	
	
}
