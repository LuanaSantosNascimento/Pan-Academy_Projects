package com.example.demo;

import java.util.Date;

public class Usuario {

	private Long id;
	private String nome;
	private int idade;
	
	private int qtdCaracteresNome;
	private int anoNascimento;
	private Date data = new Date();
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getQtdCaracteresNome() {
		return nome.length();
	}

	public void setQtdCaracteres(int qtdCaracteresNome) {
		this.qtdCaracteresNome = qtdCaracteresNome;
	}

	public int getAnoNascimento() {
		return data.getYear() - idade;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	
	
	
}