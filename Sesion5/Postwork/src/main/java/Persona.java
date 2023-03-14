package org.bedu.java.backend.postwork5.model;

public class Persona {

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
}
