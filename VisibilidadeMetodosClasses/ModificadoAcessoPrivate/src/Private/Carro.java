package Private;

public class Carro {
	
	//Cria a vari�vel/atributo nome - privado s� � visto dentro da mesma classe
	private String nome;

	//M�todo que imprime a vari�vel
	private void exibeVelocidade() {
		System.out.println("A velocidade de uma "+ nome +" � de 380km.");	
	}
}