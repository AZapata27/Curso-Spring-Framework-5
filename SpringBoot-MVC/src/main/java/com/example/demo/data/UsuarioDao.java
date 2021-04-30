package com.example.demo.data;

import com.example.demo.models.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository<Usuario,Long> {

    Usuario findByUsername(String username);
    
}
