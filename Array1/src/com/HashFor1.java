package com;

import java.util.HashMap;
import java.util.Map;

public class HashFor1 {
	public static void main(String[] args) {
		Map<String, String> tabelaCursos = new HashMap<String, String>();
		
		tabelaCursos.put("Ang", "Angular9");
		tabelaCursos.put("J...", "Java");
		tabelaCursos.put("O...", "Oracle");
		
		//Entry
		for(Map.Entry<String, String> conjuntinho: tabelaCursos.entrySet()) {
			System.out.println(conjuntinho.getKey() + " = " + conjuntinho.getValue());
		}
		
		System.out.println("-".repeat(10));
		
		for(Map.Entry<String, String> conjuntinho: tabelaCursos.entrySet()) {
			if(conjuntinho.getKey() == "Ang") {
			//	System.out.println(conjuntinho.getKey() + " = " + conjuntinho.getValue());
				System.out.printf("%s = %s", conjuntinho.getKey(), conjuntinho.getValue());
			}
		}	
	}
}