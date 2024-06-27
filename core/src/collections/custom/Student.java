package collections.custom;

import java.util.ArrayList;

public class Student {
	protected int id;
	protected String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// getters and setters for id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// getters and setters for name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
