package basics;

// A blueprint for real world objects is a class
public class Concept {

	// This is an instance variable for the objects of class Concept
	private int property_1;

	// This is a property of the class which would be same for all objects
	static int property_2;

	// A constructor is used to initialize the properties of an object where an
	// object is an instance of a class
	public Concept() {

	}

	// These are instance methods for the objects of class Concept
	public void setProperty1(int val) {
		this.property_1 = val;
	}

	public int getProperty1() {
		return this.property_1;
	}

}
