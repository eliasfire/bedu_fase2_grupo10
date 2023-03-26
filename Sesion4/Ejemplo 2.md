# Ejemplo 2 - Controladores de lectura con Spring MVC

1- Se crearon dos clases: Saludo.java y SaludoController.java dentro del proyecto creado previamente con Spring Boot, la finalidad es que estas clases
   permitan dar un saludo al usuario. Las clases quedaron de la siguiente manera:

    Saludo.java 

        package org.bedu.java.backend.sesion4.models;

        import java.time.LocalDate;

        public class Saludo {

            private String mensaje;

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

2- Posteriormente se ejecutó la aplicación desde el IDE con el comando: gradle bootRun

3- Se ingresó la dirección URL http://localhost:8080/saludo en el navegador

4- El mensaje que apareció fue:

    {"mensaje":"Hola Mundo!!!"}
        
5- Se corroboró el mensaje, pero esta vez desde Postman

6- Para ello se empleó la modalidad GET con la misma URL (http://localhost:8080/saludo)

7- Apareció el siguente mensaje:
     
    1 {
    2  "mensaje": "Hola Mundo!!!"
    3 }
     
 8- Fin del ejemplo
