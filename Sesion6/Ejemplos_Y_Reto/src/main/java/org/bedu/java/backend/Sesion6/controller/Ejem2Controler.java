package org.bedu.java.backend.Sesion6.controller;

import org.bedu.java.backend.Sesion6.model.Direccion;
import org.bedu.java.backend.Sesion6.model.Usuario;
import org.bedu.java.backend.Sesion6.model.UsuarioEjem2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v3/usuario")
public class Ejem2Controler {

    @PostMapping
    public ResponseEntity<UsuarioEjem2> creaUsuario(@RequestBody UsuarioEjem2 user){
        System.out.println("creaUsuario");
        System.out.println("Nombre "+ user.getNombre());
        System.out.println("Apellido " + user.getApellido());
        System.out.println("Correo" + user.getCorreoElectronico());
        System.out.println("Contraseña" + user.getPassword());

        Direccion direccion = new Direccion();
        direccion.setCalle("Córdoba");
        direccion.setNumero("225");
        direccion.setCP("28999");

        user.setDireccion(direccion);

        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
