package collections.custom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentComparator {
	// Class to compare students by Name
	public class StudentNameCompare implements Comparator<Student> {

		// Implement compare() method for interface to compare names
		public int compare(Student student1, Student student2) {
			return student1.getName().compareTo(student2.getName());
		}
	}

	public static void print(ArrayList<Student> list) {
		System.out.print("[");
		for (int i = 0; i < list.size() - 1; i++) {
			System.out.print("(" + list.get(i).id + "," + list.get(i).name + "),");
		}
		if (list.size() > 0) {
			System.out.print("(" + list.get(list.size() - 1).id + "," + list.get(list.size() - 1).name + ")");
		}
		System.out.print("]\n");
	}

	public static void main(String[] args) {
		ArrayList<Student> sList = new ArrayList<Student>();

		StudentComparator mycomm = new StudentComparator();
		sList.add(new Student(3, "Rishabh"));
		sList.add(new Student(1, "Ayush"));
		sList.add(new Student(2, "Vallabh"));

		System.out.print("Befor sorting: ");
		print(sList);

		Collections.sort(sList, mycomm.new StudentNameCompare());

		System.out.print("After sorting: ");
		print(sList);

	}

}
