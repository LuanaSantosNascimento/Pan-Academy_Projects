package com.data.controller;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.data.model.Tarefas;
import com.data.repository.TarefasRepository;

@RestController
@RequestMapping(value = "/api")
public class TarefaController {
	
	Calendar c = Calendar.getInstance();
	int hora = c.get(Calendar.HOUR_OF_DAY);
	
	@Autowired
	private TarefasRepository tarefasRepository;
	
	@GetMapping
	public List<Tarefas> findAll(){
		return tarefasRepository.findAll();
	}
	
	@GetMapping(value = "/tarefas")
	public ResponseEntity< List<Tarefas> > getAll(){
		if(hora > 7 && hora < 17) {
			System.out.println("Requisição foi feita dentro do horário permitido.");
			return ResponseEntity.ok(tarefasRepository.findAll());
		}
		else {
			System.out.println("Requisição foi feita fora do horário permitido.");
		return ResponseEntity.noContent().build();
		}
	}
	
	@PostMapping
	public ResponseEntity<Tarefas> post(@RequestBody Tarefas tarefinha){
		return ResponseEntity.status(HttpStatus.CREATED).body(tarefasRepository.save(tarefinha));
	}
}