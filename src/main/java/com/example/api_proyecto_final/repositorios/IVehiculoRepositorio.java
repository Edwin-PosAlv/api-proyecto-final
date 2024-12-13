package com.example.api_proyecto_final.repositorios;

import com.example.api_proyecto_final.modelos.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVehiculoRepositorio extends JpaRepository<Vehiculo, Integer> {
}
