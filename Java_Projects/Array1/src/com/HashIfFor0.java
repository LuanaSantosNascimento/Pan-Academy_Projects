package com;

import java.util.HashMap;

public class HashIfFor0 {
	public static void main(String[] args) {
		HashMap<String, String> capitais = new HashMap<String, String>();
		capitais.put("Inglaterra", "Londres");   //1 -> N | Ex: São Paulo, Campinas ; São Paulo, Sumaré.... (Banco chave : valor)
		capitais.put("Alemanha", "Berlim");
		capitais.put("Brasil", "Brasília");
												//Não ordena, mostra de forma randômica
		for(String i : capitais.keySet()) {
			if(i != "Inglaterra") {
				System.out.println(i);
			}
		}
	}
}