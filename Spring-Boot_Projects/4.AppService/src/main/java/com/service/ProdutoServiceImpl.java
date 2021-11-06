package com.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceImpl implements ProdutoService {

	private static Map<String, Produto> produtoRepository = new HashMap<>(); //"Banco de dados do HashMap"
	static {
		//Mocka um produto chocolate
		Produto chocolate = new Produto();
		chocolate.setId("1");
		chocolate.setNome("Chocolate");
		produtoRepository.put(chocolate.getId(), chocolate);
		
		//Mocka um produto chocolate
		Produto trufa = new Produto();
		trufa.setId("2");
		trufa.setNome("Trufa");
		produtoRepository.put(trufa.getId(), trufa);
		
		Produto doce = new Produto();
		doce.setId("3");
		doce.setNome("Doce");
		produtoRepository.put(doce.getId(), doce);
	}
	
	//Salva
	@Override
	public void createProduto(Produto produtinho) {
		produtoRepository.put(produtinho.getId(), produtinho);
	}
	
	//Deleta
	@Override
	public void deleteProduto(String id) {
		produtoRepository.remove(id);
	}
	
	//Mostra
	@Override
	public Collection<Produto> getProdutos() {
		return produtoRepository.values();
	}
}