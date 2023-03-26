# EJEMPLO 3 - Método POST para creación y actualización de información

1- Se actualizaron las dos clases creadas previamente (Saludo.java y SaludoController.java) para incluir una variables nueva junto con sus métodos, 
   para obtener la edad del usuario. Las clases quedaron de la siguiente manera:
   
      Saludo.java
   
          package org.bedu.java.backend.sesion4.models;

          import java.time.LocalDate;

          public class Saludo {

              private String mensaje;
              private String nombre;
              private int edad;

              public int getEdad() {
                  return edad;
              }

              public void setEdad(int edad) {
                  this.edad = edad;
              }

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

                @GetMapping ("/saludo/ {nombre}")
                public Saludo saludaConParam (@PathVariable String nombre){
                    Saludo saludo = new Saludo();
                    saludo.setMensaje("Hola Mundo!!!");
                    saludo.setNombre(nombre);
                    return saludo;
                    }

                    @PostMapping("/saludo")
                        public Saludo saludaPost(@RequestBody Saludo saludo){
                        return saludo;
                    }

           
            
2- Se ejecutó la aplicación desde el IDE con el comando: gradle bootRun

3- Se ingresó la dirección URL http://localhost:8080/saludo en el navegador

4- El mensaje que apareció fue:

    {"mensaje":"Hola Mundo!!!"| "nombre":"beto"| "edad":null}
    
5-Para corregir el detalle con la edad, se abrió Postman y se solicitó un nueva petición tipo POST con la URL http://localhost:8080/saludo

6-En la pestaña que apareció se seleccionó "Body", "Raw", y "JSON", se editó el mensaje de la siguiente manera:

      1  {
      2     "mensaje": "Hola Mundo",
      3     "nombre": "beto",
      4     "edad": 5
      5 }
      
7-Volvió a solicitarse la petición a la URL http://localhost:8080/saludo, obteniéndose el siguiente mensaje, ahora correcto:

      1 {
      2  "mensaje": "Hola Mundo",
      3  "nombre": "beto",
      4   "edad": 5
      5 }

8- Fin del ejemplo
  



