package oops.inheritance;

public class Dog extends Pet {

	static String species = "dog";

	Dog(String name, int age) {
		super(name, age);
	}

	// Overriding the method sound
	void sound() {
		System.out.println("bark...");
	}

	public static void main(String[] args) {
		Dog d = new Dog("choclate", 3);
		System.out.println(d.name + " " + d.age);

	}

}
