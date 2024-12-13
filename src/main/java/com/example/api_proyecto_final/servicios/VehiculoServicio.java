package com.example.api_proyecto_final.servicios;

import com.example.api_proyecto_final.modelos.Vehiculo;
import com.example.api_proyecto_final.repositorios.IVehiculoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculoServicio {
    @Autowired
    IVehiculoRepositorio iVehiculoRepositorio;

    public Vehiculo guardarVehiculo(Vehiculo datosVehiculo){

        return iVehiculoRepositorio.save(datosVehiculo);
    }
    public List<Vehiculo> buscarVehiculos(){

        return iVehiculoRepositorio.findAll();
    }
    public ResponseEntity<?> eliminarVehiculo(Integer idVehiculo){
        iVehiculoRepositorio.deleteById(idVehiculo);
        return null;
    }
}
