package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Usuario;

public interface UsuarioRepo extends JpaRepository<Usuario, Long>{

}
