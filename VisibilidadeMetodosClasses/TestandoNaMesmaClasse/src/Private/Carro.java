package Private;

public class Carro {
	
	//Cria a vari�vel/atributo nome - Privado s� � visto dentro da mesma classe
	private String nome;

	//M�todo que imprime a vari�vel
	private void exibeVelocidade() {
		System.out.println("A velocidade de uma "+ nome +" � de 380km.");	
	}
	
	public static void main(String[] args) {
		//Instancia o objeto
		Carro c = new Carro();
		
		//Atribui valor ao atributo nome
		c.nome = "Ferrari";
		
		//Chama o m�todo
		c.exibeVelocidade();	
	}
}