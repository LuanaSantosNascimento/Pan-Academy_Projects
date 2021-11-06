package com.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.data.model.Tarefas;

public interface TarefasRepository extends JpaRepository<Tarefas, Long> {

}
