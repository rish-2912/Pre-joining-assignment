package oops.inheritance;

public class Pet {
	String name;
	int age;

	Pet(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void sound() {
		System.out.println("Default animal sound...");
	}
}
