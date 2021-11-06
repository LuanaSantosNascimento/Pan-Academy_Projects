package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*") //Habilita todos os navegadores
@RequestMapping("/api")
public class ProdutoController {
	
	//localhost:8089/swagger-ui.html#/produto-controller/createProdutoUsingPOST
	@Autowired
	ProdutoService produtoService;

	@GetMapping("/listar")
	public ResponseEntity<Object> getProduto(){
		return new ResponseEntity<>(produtoService.getProdutos(), HttpStatus.OK);
	}
	
	@DeleteMapping("/deletar/{id}")
	public ResponseEntity<Object> delete(@PathVariable("id") String id){
		produtoService.deleteProduto(id);
		return new ResponseEntity<>("Produto deletado com sucesso", HttpStatus.OK);
	}
	
	//Pedir para a luíza testar o deletar
	
	@PostMapping("/produtos")
	public ResponseEntity<Object> createProduto(@RequestBody Produto produtinho){
		produtoService.createProduto(produtinho);
		return new ResponseEntity<>("Produto Criado", HttpStatus.CREATED);
	}
}
