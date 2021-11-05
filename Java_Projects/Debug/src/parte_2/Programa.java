package parte_2;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Acusa erro, o construtor deve receber parâmetros(String, double, int)
		Product product = new Product();
		
		System.out.println("Name: ");
		product.name = sc.nextLine();

		System.out.println("Price: ");
		product.price = sc.nextDouble();
		
		System.out.println("Quantidade no estoque: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product Data: " + product);
		
		sc.close();
	}
}