package parte_3;

import java.util.Locale;
import java.util.Scanner;

import parte_2.Product;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Name: ");
		String name = sc.nextLine();

		System.out.println("Price: ");
		Double price = sc.nextDouble();
		
		//A variável deveria ser do tipo int
		System.out.println("Quantity: ");
		Double quantity = sc.nextDouble();
		
		if(sc.hasNextInt()) {
			Product product = new Product(name, price, quantity);
			System.out.println();
			System.out.println("Product data: "+ product);
		}
		else {
			Product product = new Product(name, price);
			System.out.println();
			System.out.println("Product data: " + product);
		}
		sc.close();
	}
}