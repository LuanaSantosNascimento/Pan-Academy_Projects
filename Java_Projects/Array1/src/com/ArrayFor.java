package com;
/*Percorrendo Array's*/

import java.util.ArrayList;

public class ArrayFor {

	public static void main(String[] args) {
		ArrayList<String> pessoas = new ArrayList();
		
		pessoas.add("Luíza");
		pessoas.add("Gabriel");
		pessoas.add("Marcio");
		pessoas.add("Gabriela");
		pessoas.add("Luna");
		pessoas.add("Abgail");
		
		System.out.println("-".repeat(10) + "Todas as pessoas" + "-".repeat(10));
		for(String pessoinha : pessoas) {
			System.out.printf("Posição: %s\n", pessoinha);
		}
		
		System.out.println("-".repeat(10) + "Começa com L" + "-".repeat(10));
		for(String pessoinha : pessoas) {
			if(pessoinha.charAt(0) == 'L')
				System.out.printf("Posição: %s\n", pessoinha);
		}
		
		System.out.println("-".repeat(10) + "Pessoas e Indíces" + "-".repeat(10));
		System.out.println("Indo de um por um");
		int i = 0;
		for(String pessoinha : pessoas) {
			System.out.printf("Posição: %d- %s\n", i, pessoinha);
			i++;
		}
	}
}