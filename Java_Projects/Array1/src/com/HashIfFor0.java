package com;

import java.util.HashMap;

public class HashIfFor0 {
	public static void main(String[] args) {
		HashMap<String, String> capitais = new HashMap<String, String>();
		capitais.put("Inglaterra", "Londres");   //1 -> N | Ex: S�o Paulo, Campinas ; S�o Paulo, Sumar�.... (Banco chave : valor)
		capitais.put("Alemanha", "Berlim");
		capitais.put("Brasil", "Bras�lia");
												//N�o ordena, mostra de forma rand�mica
		for(String i : capitais.keySet()) {
			if(i != "Inglaterra") {
				System.out.println(i);
			}
		}
	}
}