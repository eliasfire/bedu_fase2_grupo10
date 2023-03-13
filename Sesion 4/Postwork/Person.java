package org.bedu.java.backend.postwork4.datos;

public class Person {

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

    public Person() {  //Constructor sin parámetros

    }
    public Person(String name, String phone) {  //Constructor con parámetros
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
