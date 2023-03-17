package org.bedu.java.backend.Sesion6.controller;


import org.bedu.java.backend.Sesion6.model.Usuario;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2/usuario")
public class RetoControler {

    @PostMapping
    public String creaUsuario(@RequestBody Usuario user, @RequestParam("id") int id, @RequestParam("rol") String rol){
        System.out.println("creaUsuario");
        System.out.println("Nombre: "+ user.getNombre());
        System.out.println("Apellido: " + user.getApellido());
        System.out.println("Correo: " + user.getCorreo());
        System.out.println("Contraseña: " + user.getPassword());
        System.out.println("Rol: " + rol);

        return "Usuario " + id + " creado!!!";
    }
}
