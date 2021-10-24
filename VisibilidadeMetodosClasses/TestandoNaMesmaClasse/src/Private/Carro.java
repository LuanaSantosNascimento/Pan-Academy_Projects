package Private;

public class Carro {
	
	//Cria a variável/atributo nome - Privado só é visto dentro da mesma classe
	private String nome;

	//Método que imprime a variável
	private void exibeVelocidade() {
		System.out.println("A velocidade de uma "+ nome +" é de 380km.");	
	}
	
	public static void main(String[] args) {
		//Instancia o objeto
		Carro c = new Carro();
		
		//Atribui valor ao atributo nome
		c.nome = "Ferrari";
		
		//Chama o método
		c.exibeVelocidade();	
	}
}