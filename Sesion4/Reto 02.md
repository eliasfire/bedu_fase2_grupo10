# Reto 02 - Controladores PUT para actualización de información

1- Se desea agregar una nueva variable al saludo de usuario, por lo que las clases usadas durante la sesión (Saludo.java y SaludoController.java) deben
   actualizarse con una nueva variable (la fecha de nacimiento) y sus métodos para que sea muestre dentro del mensaje en la pantalla al usuario. 
   Para ello primero se actualiza la clase Saludo.java
 
    Saludo.java
   
       package org.bedu.java.backend.sesion4.models;

      import java.time.LocalDate;

      public class Saludo {

          private String mensaje;
          private String nombre;
          private int edad;
          private LocalDate fechaNacimiento;  //Se añade la variable

          public LocalDate getFechaNacimiento() {   //Se añade su método get y
              return fechaNacimiento;
          }

          public void setFechaNacimiento(LocalDate fechaNacimiento) {  //Se añade su método set
              this.fechaNacimiento = fechaNacimiento;
          }

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
      
2- Posteriormente debe actualizarse la clase SaludoController.java, donde es importante tomar en cuenta la modificación que se hará a la fecha mostrada
     en pantalla
     
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

                 @PutMapping("/saludo")    //Se cambia el uso a una anotación, el tipo PUT es el indicado para este caso
                 public Saludo saluda(@RequestBody Saludo saludo){  //Anotación de solicitud

                     saludo.setFechaNacimiento(saludo.getFechaNacimiento().plusDays(1)); //Se modifica y suma así un día a la fecha indicada por el usuario

                     return saludo;
                 }
             }
             
3- Se ejecutó la aplicación desde el IDE con el comando: gradle bootRun
  
4- Se ingresó la dirección URL http://localhost:8080/saludo a Postman y el tipo de petición se especificó como PUT
  
5- Se eligió en la pestaña de la petición de Postman "Body", "Raw" y "JSON" como en los ejercicios anteriores. Se escribió:
  
           1   {
           2 "mensaje": "Hola Mundo",
           3 "nombre": "beto",
           4 "edad": 5,
           5 "fechaNacimiento": "2022-11-01"
           6  }
   
6- El resultado en Postman (después de seleccionar Send) es:
   
           1   {
           2 "mensaje": "Hola Mundo",
           3 "nombre": "beto",
           4 "edad": 5,
           5 "fechaNacimiento": "2022-11-02"
           6  }
           
           
7- En el navergador web el resultado debe verse de la siguente manera después de consultar la URL http://localhost:8080/saludo:
    
    {"mensaje":"Hola Mundo!!!", "nombre":"beto", "edad":5, "fechaNacimiento":"2022-11-02"}

8- Fin del reto
