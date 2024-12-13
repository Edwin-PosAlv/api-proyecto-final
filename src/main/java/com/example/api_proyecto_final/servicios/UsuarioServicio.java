package com.example.api_proyecto_final.servicios;

import com.example.api_proyecto_final.modelos.Usuario;
import com.example.api_proyecto_final.repositorios.IUsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicio {

    @Autowired
    IUsuarioRepositorio iUsuarioRepositorio;

    public Usuario guardarUsuario(Usuario datosUsuario){
        return iUsuarioRepositorio.save(datosUsuario);
    }
    public List<Usuario> buscarUsuarios (){
        return iUsuarioRepositorio.findAll();
    }
    public void eliminarUsuario (Integer idUsuario){
        iUsuarioRepositorio.deleteById(idUsuario);
    }
}
