# EJERCICIO 1 - Proyecto Gradle con Spring Initializr

1- Generar el proyecto en la página de Spring Initializr, eligiendo los parámetros de acuerdo a las características de la versión de java de cada dispositivo. 
   Los parámetros que se seleccionan independientemete de esto, son:
   
   **Project: Gradle - Groovy**
   
   **Language: Java**
   
   **Packaging: jar**
   
2- Se añade la dependencia "Spring Web" y se genera el proyecto

3- Se descarga y descomprime el archivo zip resultante dentro de la carpeta en la que se desee trabajar el proyecto

4- Se abre este nuevo proyecto desde el IDE (posiblemete tarde unos momentos) 

5- Se ejecuta el siguiente comando en la terminal del IDE:
  ```
      gradle clean build
  ```    
6- Después de la compliación exitosa se ejecuta:
  ```
      gradle bootRun
  ```    
7- Se muestra un gran texto que nos indica que se está ejecutando la aplicación en el puerto 8080 y mediante Tomcat. La ejecución de esta aplicación continuará 
   a menos que se le detenga usando el comando CTRL + C en la terminal del IDE
8- Probamos el servidor local que se ha activado introduciendo la URL http://localhost:8080 en el navegador web. Aparece un texto de advertencia sobre un
   fondo blanco, la fecha varía según la consulta, pero el texto dice:
   
   ### Whitelabel Error Page
   ### This application has no explicit mapping for/error, so you are seeing this as a fallback.
   
   #### Tue Mar 07 20:08:10 CST 2023
   #### There was an unexpected error (type=Not Found, status=404).
   
 9- Si se detiene la ejecución de la aplicación (CTRL + C) y se vuelve a cargar la página de la URL http://localhost:8080, entonces el mensaje que aparece es como
    el de cualquer página que intenta cargarse pero en la que no se pudo establecer una conexión.

10- También puede inicializarse la aplicación empleando el comando usado para ejecutar archivos .jar desde la terminal (normal o del IDE):
```
        java -jar (s4-ejercicio1)-0.0.1-SNAPSHOT.jar  
```     

El paréntesis indica que este campo será variable según la nomenclatura que se haya adoptado para el proyecto.

11- Debe mostrarse el mismo texto que apareció al hacer el paso 7 y si se realizan los pasos 8 y 9, los resultados deben ser los mismos. Se está ejecutando
    la misma aplicación pero de dos diferentes maneras.

12- Fin del ejemplo
    
        
   
