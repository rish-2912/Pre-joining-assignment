package collections.custom;

import java.util.ArrayList;
import java.util.Collections;

public class StudentComparable extends Student implements Comparable<StudentComparable> {

	// Used to sort student by id
	public int compareTo(StudentComparable x) {
		return this.id - x.id;
	}

	public StudentComparable(int id, String name) {
		super(id, name);
	}

	public static void print(ArrayList<StudentComparable> list) {
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
		ArrayList<StudentComparable> sList = new ArrayList<StudentComparable>();

		sList.add(new StudentComparable(3, "Rishabh"));
		sList.add(new StudentComparable(1, "Ayush"));
		sList.add(new StudentComparable(2, "Vallabh"));

		System.out.print("Student list before sorting: ");
		print(sList);

		Collections.sort(sList);

		System.out.print("Student list after sorting: ");
		print(sList);

	}

}
