package Pacote_externo;

import Interno.Produto;

public class TestePacoteExterno 
{	
	public static void main(String[] args) {
		
		//A visibilidade do atributo e do m�todo n�o permite que essa classe fa�a alguma manipula��o.
		Produto prodLuva = new Produto();
		prodLuva.nomeProd = "Luva";
		System.out.println(prodLuva.getNomeProd());
	}

}
