package Atividade;

public class Programa {

	public static void main(String[] args) {
		Livro livrinho = new Livro();
		livrinho.setCodigo(978);
		livrinho.setDescricao("O Livro das Sombras: A comunidade Secreta");
		livrinho.setPreco(60.89);
		
		livrinho.exibirDados();
	}
}