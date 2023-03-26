# Reto 01 - Controladores con Spring MVC con parámetros

1- Se desea añadir un nombre al saludo de usuario realizado en el ejemplo1, para ello deben actualizarse las clases creadas en dicho ejemplo. 

2- Las clases creadas se actualizaron añadiendo la variable "nombre" y sus métodos. Las clases quedaron de la siguiente manera:

    Saludo.java
    
          package org.bedu.java.backend.sesion4.models;

          import java.time.LocalDate;

          public class Saludo {

              private String mensaje;
              private String nombre;


              public String getNombre() {
                  return nombre;
              }

              public void setNombre(String nombre) {
                  this.nombre = nombre;
              }


              public String getMensaje() {
                  return mensaje;
              }

              public void setMensaje(String mensaje) {
                  this.mensaje = mensaje;
              }
          }
          
      
      SaludoController.java
      
              package org.bedu.java.backend.sesion4.controllers;

              import org.bedu.java.backend.sesion4.models.Saludo;
              import org.springframework.web.bind.annotation.*;

              @RestController
              public class SaludoController {

                  @GetMapping ("/saludo")
                  public Saludo saluda(){
                      Saludo saludo = new Saludo();
                      saludo.setMensaje("Hola Mundo!!!");
                      return saludo;

                  }

                  @GetMapping ("/saludo/ {nombre}")    // se usa esta anotación porque sólo es un valor estático y se indica la ruta
                  public Saludo saludaConParam (@PathVariable String nombre){         
                      Saludo saludo = new Saludo();
                      saludo.setMensaje("Hola Mundo!!!");
                      saludo.setNombre(nombre);
                      return saludo;
                      }
                  }

3- Se ejecuta la aplicación desde la terminal con el comando: gradle bootRun

4- Se ingresa la URL http://localhost:8080/saludo/beto al navegador web

5- En la pantalla aparece el siguiente mensaje:

        {"mensaje":"Hola Mundo!!!", "nombre":"beto"}    //Aparece el nombre del usuario

6- Si hacemos esta petición mediante GET en Postman, con la misma URL (http://localhost:8080/saludo/beto) el resultado debe ser el mismo mensaje, 
   pero con la siguiente presentación:
        
      1  {
      2     "mensaje": "Hola Mundo",
      3     "nombre": "beto"
      4  }

7- Fin del reto
