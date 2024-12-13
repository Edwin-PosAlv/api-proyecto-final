package com.example.api_proyecto_final.controlador;

import com.example.api_proyecto_final.modelos.Usuario;
import com.example.api_proyecto_final.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioControlador {

    @Autowired
    UsuarioServicio usuarioServicio;

    @PostMapping
    public ResponseEntity<?> guardarUsuario(@RequestBody Usuario datosUsuario) throws Exception{
        try{
            return ResponseEntity.status(HttpStatus.OK).body(usuarioServicio.guardarUsuario(datosUsuario));
        }catch (Exception error){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }
    @GetMapping
    public ResponseEntity<?> buscarUsuario() throws Exception{
        try{
            return ResponseEntity.status(HttpStatus.OK).body(usuarioServicio.buscarUsuarios());
        }catch (Exception error){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }
    @DeleteMapping(path = "/{id}")
    public void eliminarUsuario(@PathVariable Integer id)throws Exception{
        try{
            usuarioServicio.eliminarUsuario(id);
        }catch (Exception error){
            ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }
}
