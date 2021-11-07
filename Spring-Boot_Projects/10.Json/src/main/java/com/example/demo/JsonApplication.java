package com.example.demo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.json.simple.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class JsonApplication {

	public static void main(String[] args) throws FileNotFoundException {		
		JSONObject jsonzinho = new JSONObject();
		jsonzinho.put("Nome", "Julia");
		jsonzinho.put("Sobrenome", "Smith");
		jsonzinho.put("Idade", 25);
		
		System.out.println(jsonzinho);
		
		PrintWriter salvar = new PrintWriter("./src/main/java/teste2.json");
		salvar.write(jsonzinho.toJSONString());
		
		salvar.flush();
		salvar.close();
	}
}