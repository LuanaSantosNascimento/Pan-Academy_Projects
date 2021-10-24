package Private;

public class Carro 
{
													//1. Atributo
	private String nome;
													//2.Método sem retorno
	private void exibeVelocidade() {
		System.out.println("A velocidade de uma "+ nome +" é de 380km.");	
	}
													//3.getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
													//O lombock pode substituir os getters e setters
													//4. Este método vai divulgar
	public String getName() {
		return this.nome;
	}
}