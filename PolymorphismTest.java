package test;
class Animal
{
	Animal() {
		System.out.println("Animal shout");	
	}
	void shout() {
		System.out.println("shout");
	}
}
class Dog extends Animal{
	Dog() {
		System.out.println("Dog shout");
	}
	void shout() {
		System.out.println("bow bow");
	}
}
class Horse extends Animal {
	Horse() {
		System.out.println("Horse shouts");
	}
	void shout() {
		System.out.println("neigh neigh");
	}
}
class Cat extends Animal {
	Cat() {
		System.out.println("Cat shouts");
	}
	void shout() {
		System.out.println("meow meow");
	}
}
public class PolymorphismTest {

	public static void main(String[] args) {
		Animal a = new Dog();
		a.shout();
		Animal a1 = new Horse();
		a1.shout();
		Animal a2 = new Cat();
		a2.shout();

	}

}
