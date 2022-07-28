package animals;

public class Test {

	public static void main(String[] args) {

		Animal[] animals = new Animal[10];
		animals[0] = new Dog();
		animals[1] = new Butterfly();
		animals[2] = new Ostrich();
		animals[3] = new Ant();
//		animals[4] = new Dog();
		animals[5] = new Bat();
//		animals[6] = new Dog();
		animals[7] = new Sparrow();
		animals[8] = new Dog();
		animals[9] = new Sparrow();

		// use any method the animal has
		for (Animal animal : animals) {
			if (animal != null) {
				animal.speak();
				if (animal instanceof AdvancedFlyer) {
					AdvancedFlyer advancedFlyer = (AdvancedFlyer) animal;
					advancedFlyer.takeOff();
					advancedFlyer.navigate();
					advancedFlyer.fly();
					advancedFlyer.land();
				}else {
					if(animal instanceof Flyer) {
						((Flyer)animal).fly();
					}
					if(animal instanceof Navigator) {
						((Navigator)animal).navigate();
					}
				}
			} else {
				System.out.println(animal);
			}
			System.out.println("==============");
		}
		
		Sparrow sparrow = new Sparrow();
		sparrow.speak();
		sparrow.takeOff();
		sparrow.navigate();
		sparrow.fly();
		sparrow.land();

	}

}
