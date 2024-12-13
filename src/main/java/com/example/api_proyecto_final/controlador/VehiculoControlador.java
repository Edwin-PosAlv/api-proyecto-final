package com.example.api_proyecto_final.controlador;

import com.example.api_proyecto_final.modelos.Vehiculo;
import com.example.api_proyecto_final.repositorios.IVehiculoRepositorio;
import com.example.api_proyecto_final.servicios.VehiculoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vehiculos")//EndPoint
public class VehiculoControlador {

    @Autowired
    VehiculoServicio vehiculoServicio;

    @PostMapping
    public ResponseEntity<?> guardarVehiculo(@RequestBody Vehiculo datosVehiculo) throws Exception{
        try {
            return ResponseEntity.status(HttpStatus.OK).body(vehiculoServicio.guardarVehiculo(datosVehiculo));
        }catch (Exception error){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }
    @GetMapping
    public ResponseEntity<?> buscarVehiculos()throws Exception{
        try {
            return ResponseEntity.status(HttpStatus.OK).body(vehiculoServicio.buscarVehiculos());
        }catch (Exception error){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> eliminarVehicilo(@PathVariable Integer id) throws Exception{
        try {
            return vehiculoServicio.eliminarVehiculo(id);
        }catch (Exception error){
            ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
        return null;
    }
}
