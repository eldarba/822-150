package c.animals;

public class Test {

	public static void main(String[] args) {

		Animal a; // reference of type animal (general)

		a = new Dog(); // point to a specific type of animal - Dog
		a.speak(); // use the dog behavior

		a = new Cat(); // point to a specific type of animal - Cat
		a.speak(); // use the cat behavior

		System.out.println("==============");
		// arrays
		Animal[] animals = new Animal[5];
		animals[0] = new Dog();
		animals[1] = new Cat();
		animals[2] = new Cat();
		animals[3] = new Dog();
		animals[4] = new Cat();

		animals[0].speak();
		animals[1].speak();

		System.out.println("==============");
		for (Animal animal : animals) {
			animal.speak();
			if(animal instanceof Cat) {
				((Cat)animal).scratch();
			}
			System.out.println("===");
		}

	}

}
