package Private;

public class Carro {
	
	//Cria a variável/atributo nome - privado só é visto dentro da mesma classe
	private String nome;

	//Método que imprime a variável
	private void exibeVelocidade() {
		System.out.println("A velocidade de uma "+ nome +" é de 380km.");	
	}
}