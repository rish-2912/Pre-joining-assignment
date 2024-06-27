package basics;

public class FlowControl {
	static void forLoop(int itr) {
		for (int i = 0; i < itr; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	static void forLoop(int itr, int bpoint) {
		if (bpoint > itr) {
			System.out.println("Invalid break point");
			return;
		}
		for (int i = 0; i < itr; i++) {
			if (i == bpoint) {
				break;
			}
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		forLoop(4);
		forLoop(4, 1);
	}
}
