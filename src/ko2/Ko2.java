package ko2;

 class Calculation {
	int z;

	public void addition(int x, int y) {
		z = x + y;
		System.out.println("The sum of the given numbers:" + z);
	}

	public void Subtraction(int x, int y) {
		z = x - y;
		System.out.println("The difference between the given numbers:" + z);
	}
}

public class Ko2 extends Calculation {
	public void multiplication(int x, int y) {
		z = x * y;
		System.out.println("The product of the given numbers:" + z);
	}

	public static void main(String args[]) {
		int a = 20, b = 10;
		Ko2 demo = new Ko2();
		demo.addition(a, b);
		demo.Subtraction(a, b);
		demo.multiplication(a, b);
	}
}
