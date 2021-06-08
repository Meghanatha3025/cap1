
 class Overloading1 {
	static int add(int a, int b) {
		return a + b;
	}

	static double add(double a, double b) {
		return a + b;
	}

	static double add(float a, double b) {
		return a + b;
	}

	static float add(float a, float b) {
		return a + b;
	}

	static double add(int a, double b) {
		return a + b;
	}

	static double add(double a, float b) {
		return a + b;
	}
}

public class Overloading {
	public static void main(String[] args) {
		System.out.println(Overloading1.add(11, 11));
		System.out.println(Overloading1.add(12.3, 12.6));
		System.out.println(Overloading1.add(12.30, 12));
		System.out.println(Overloading1.add(12, 12.65));
	}
}
