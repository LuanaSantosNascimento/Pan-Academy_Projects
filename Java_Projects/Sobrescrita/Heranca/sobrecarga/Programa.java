package sobrecarga;

public class Programa {

	public static void main(String[] args) {

		int myNumber1 = somando(3, 4);
		double myNumber2  = somando(5.5, 6.6);
		
		System.out.println("Int: " + myNumber1);
		System.out.println("Double: " + myNumber2);

	}

	static double somando(double i, double j) {
		return i + j;
	}

	static int somando(int i, int j) {
		return i + j;
	}
}