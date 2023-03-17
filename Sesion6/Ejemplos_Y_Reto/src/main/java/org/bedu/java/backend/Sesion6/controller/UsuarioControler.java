package org.bedu.java.backend.Sesion6.controller;


import org.bedu.java.backend.Sesion6.model.Usuario;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioControler {

    @PostMapping
    public String creaUsuario(@RequestBody Usuario user){
        System.out.println("creaUsuario");
        System.out.println("Nombre "+ user.getNombre());
        System.out.println("Apellido " + user.getApellido());
        System.out.println("Correo" + user.getCorreo());
        System.out.println("Contraseña" + user.getPassword());

        return "Usuario creado!!!";
    }

    @PostMapping("/{id}")
    public String creaUsuarioParams(@RequestBody Usuario user, @PathVariable("id") long id){
        System.out.println("creaUsuario");
        System.out.println("Nombre "+ user.getNombre());
        System.out.println("Apellido " + user.getApellido());
        System.out.println("Correo" + user.getCorreo());
        System.out.println("Contraseña" + user.getPassword());

        return "Usuario " + id + " creado!!!";
    }

}
