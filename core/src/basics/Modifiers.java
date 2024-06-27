package basics;

final public class Modifiers {

	// can only be accessed within the class
	private int val_1;

	// can be accessed within the class(also by classes within the same package) and
	// by child classes
	protected int val_2;

	// can be accessed from anywhere
	public int val_3;

	// can be accessed from anywhere within the same package
	int val_4;

	final int val_5 = 10;

	Modifiers() {
		// once a variable is declared final and initialized it cannot be changed again
		val_5 = 20;
	}

	final public void m1() {

	}

}

// a final class cannot be extended
class Child extends Modifiers {
	// a final method cannot be overridden
	public void m1() {

	}
}
