package com.bancoby.backend.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancoby.backend.models.Usuario;
import com.bancoby.backend.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public Usuario findById(Integer id) {
		Optional<Usuario> obj = usuarioRepository.findById(id);
		return obj.orElse(null);
	}

	public Usuario create(Usuario obj) {
		obj.setId(null);
		return usuarioRepository.save(obj);
	}
}
