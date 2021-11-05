package entradas;

import java.util.Scanner;

public class ScanOutrosTipos {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Short: ");
		short num2 = ler.nextShort();
		System.out.println(num2);
		
		System.out.println("Long: ");
		long num3 = ler.nextLong();
		System.out.println(num3);
	}
}