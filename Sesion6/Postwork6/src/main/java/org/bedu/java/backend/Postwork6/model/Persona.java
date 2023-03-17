package org.bedu.java.backend.Postwork6.model;

import java.lang.Comparable;
import java.util.Objects;

public class Persona implements Comparable <Persona>{

    private String name;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Persona() {  //Constructor sin parámetros

    }
    public Persona(String name, String phone) {  //Constructor con parámetros
        this.name = name;
        this.name = phone;
    }

    @Override //Sobreescribir para mostrar los datos necesarios
    public String toString() {
        return "Persona{" +
                "nombre ='" + name + '\'' +
                ", numero de telefono ='" + phone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return name.equals(persona.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Persona o) {
        return this.name.compareTo(o.name);
    }
}
