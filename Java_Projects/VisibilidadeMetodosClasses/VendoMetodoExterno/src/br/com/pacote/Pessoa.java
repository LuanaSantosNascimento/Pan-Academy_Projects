package br.com.pacote;

public class Pessoa {
	private String nome = "Luana";
	
	private String getNome(String visitanteNome) {
		System.out.println("Quem � ??..." + visitanteNome);
		return nome;
	}
}