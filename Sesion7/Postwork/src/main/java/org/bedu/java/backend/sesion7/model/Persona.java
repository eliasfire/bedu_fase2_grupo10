package org.bedu.java.backend.sesion7.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.lang.Comparable;
import java.util.Objects;

public class Persona implements Comparable <Persona>{
    @NotBlank(message = "El nombre de la persona es obligatorio.")
    private String nombre;

    @Pattern(regexp = "^(\\d{2,4}[- .]?){2}\\d{4}$", message = "El formato para teléfono es ##-####-####")
    private String telefono;

    @Email(regexp = ".+@.+\\..+", message = "El correo electrónico tiene un formato incorrecto.")
    private String email;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Persona() {  //Constructor sin parámetros

    }
    public Persona(String nombre, String telefono, String email) {  //Constructor con parámetros
        this.nombre = nombre;
        this.nombre = telefono;
        this.email = email;

    }


    @Override //Sobreescribir para mostrar los datos necesarios
    public String toString() {
        return "Persona{" +
                "nombre ='" + nombre + '\'' +
                ", numero de telefono ='" + telefono + '\'' +
                ", email ='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return nombre.equals(persona.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public int compareTo(Persona o) {
        return this.nombre.compareTo(o.nombre);
    }
}
