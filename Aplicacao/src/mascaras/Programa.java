package mascaras;

public class Programa {
	public static void main(String[] args) {
		
		System.out.println("CNPJ\n");

		System.out.println(Regex.adicionarMascara("1234567890123") + "\n");

		System.out.println(Regex.adicionarMascara("68814734000148"));
		
		System.out.println("\n" + "-".repeat(50) + "\n\nCPF\n");

		System.out.println(Regex.adicionarMascaraCPF("1234567890123") + "\n");

		System.out.println(Regex.adicionarMascaraCPF("93516189002") + "\n");
	
		System.out.println(Regex.limpar("594.326.960-65"));
	}
}
