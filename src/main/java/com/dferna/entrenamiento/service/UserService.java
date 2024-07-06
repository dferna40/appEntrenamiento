package com.dferna.entrenamiento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dferna.entrenamiento.model.User;
import com.dferna.entrenamiento.repository.UserRepository;

@Service
public class UserService {

	@Autowired
    private UserRepository usuarioRepository;

    public List<User> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    public User getUsuarioById(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public User saveUsuario(User usuario) {
        return usuarioRepository.save(usuario);
    }

    public void deleteUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
}
