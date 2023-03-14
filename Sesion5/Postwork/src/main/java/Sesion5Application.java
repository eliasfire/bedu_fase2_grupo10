package org.bedu.java.backend.postwork5;

import org.bedu.java.backend.postwork5.service.FormateadorTelefono;
import org.bedu.java.backend.postwork5.model.Persona;
import org.bedu.java.backend.postwork5.service.ValidadorTelefono;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Sesion5Application implements CommandLineRunner {
    private final ValidadorTelefono validadorTelefono;
    private final FormateadorTelefono formateadorTelefono;
    @Autowired
    public Sesion5Application(ValidadorTelefono validadorTelefono, FormateadorTelefono formateadorTelefono) {
        this.validadorTelefono = validadorTelefono;
        this.formateadorTelefono = formateadorTelefono;
    }
    @Override
    public void run(String... args) throws Exception {

        Scanner reader = new Scanner(System.in);
        System.out.println("Introduzca un nombre: ");

        String nombre = reader.nextLine();
        System.out.println("Introduzca un telefono: ");
        String telefono = reader.nextLine();

        //validamos
        if (validadorTelefono.isValido(telefono)) {
            telefono = validadorTelefono.limpiaNumero(telefono);
            telefono = formateadorTelefono.formatea(telefono);
            Persona persona = new Persona(nombre, telefono);
            System.out.println(persona);
        } else {
            System.out.println("Numero de telefono valid, introduzca un numero valido.");
        }

    }

    public static void main(String[] args) {

        SpringApplication.run(Sesion5Application.class, args);
    }

}