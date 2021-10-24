package Pacote_externo;

import Interno.Produto;

public class TestePacoteExterno 
{	
	public static void main(String[] args) {
		
		//A visibilidade do atributo e do método não permite que essa classe faça alguma manipulação.
		Produto prodLuva = new Produto();
		prodLuva.nomeProd = "Luva";
		System.out.println(prodLuva.getNomeProd());
	}

}
