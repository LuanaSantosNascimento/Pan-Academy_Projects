package com;

import java.util.ArrayList;
import java.util.HashMap;

public class AquecimentoListaArray {
	public static void main(String[] args) {
		HashMap<String, String> hashMapinho = new HashMap<>();
		hashMapinho.put("Procuro", "Fui achado hash");   //1 -> N | Ex: S�o Paulo, Campinas ; S�o Paulo, Sumar�.... (Banco chave : valor)
		hashMapinho.put("Procuro2", "Fui achado hash 2"); // "put" -> add; A Utilidade do hashmap ( quero todas as cidades de S�o Paulo) 
		
		String value = hashMapinho.get("Procuro");
		System.out.println(value);
		
		ArrayList<String> lista = new ArrayList<>();
		lista.add("T�pico 1 da lista me achou");
		lista.add("T�pico 2 da lista me achou");
		
		String str1 = lista.get(0);
		System.out.println(str1);
		
	}
}
