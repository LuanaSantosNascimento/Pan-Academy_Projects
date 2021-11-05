package parte_2;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Organiza o código
	public String toString() {
		return name + ", $ " + price + ", " + quantity;
	}
}