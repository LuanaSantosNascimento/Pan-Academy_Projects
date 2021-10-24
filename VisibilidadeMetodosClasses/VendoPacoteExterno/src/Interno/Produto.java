package Interno;

public class Produto {
	
	//Atributo protegido
	protected String nomeProd;
	
	protected void setNomeProduto(String nomeProd) {
		this.nomeProd = nomeProd;
	}
	
	protected String getNomeProd() {
		return nomeProd;
	}
	//Atributos e metodos protected são vistos dentro do mesmo pacote e para pacotes filhos / que herdam
}