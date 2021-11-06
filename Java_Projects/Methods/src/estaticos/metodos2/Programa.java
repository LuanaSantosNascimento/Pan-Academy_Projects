package estaticos.metodos2;

import estaticos.atributos.Time;

public class Programa 
{	
	public static void main(String[] args) {
		System.out.println(Produto.resultado(10, 50));
		Produto nomeProduto = new Produto();
		
		System.out.println(nomeProduto.mudeNomeProduto("João"));
		System.out.println(Produto.pegarCpf(">    999-888-777-66"));
	}
}