package com.example.api_proyecto_final.repositorios;

import com.example.api_proyecto_final.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepositorio extends JpaRepository<Usuario, Integer> {
}
