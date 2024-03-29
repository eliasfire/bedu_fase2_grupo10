# Ejemplo 3: Consola de H2

1. Partimos del proyecto que se empleó en el Ejemplo 1
2. Realizamos modificaciones en diferentes archivos 

    2.1 BUILD.GRADLE

        plugins {

        id 'java'

        id 'org.springframework.boot' version '3.0.2'

        id 'io.spring.dependency-management' version '1.1.0"

        group = 'com.example'

        version = '0.0.1-SNAPSHOT' SourceCompatibility = '19'.

        repositories {

        mavenCentral()

        }

        dependencies {

        implementation 'org.springframework.boot: spring-boot-starter-data-jpa' implementation 'org.springframework.boot: spring-boot-starter-web'

        runtimeOnly 'com.h2database: h2'

        runtimeOnly 'com.mysql:mysql-connector-j'

        testImplementation 'org.springframework.boot: spring-boot-starter-test'

        }

        tasks.named('test') { Task it ->

        UseJUnitPlatform()

        }
        
   2.2 APPLICATION.PROPERTIES
   
        spring.h2.console.enabled=true
        spring.jpa.hibernate.ddl-auto=none
        spring.sql.init.mode=always
        spring.jpa.open-in-view=false
        spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect
        spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
        spring.datasource.url=jdbc:mysql://
        spring.datasource.username=<usuario>
        spring.datasource.password=<password>
        
3. Ejecutamos la aplicación
4. Abrimos la URL : http://localhost:8080/h2-console/ en el navegador
5. Actualizar los valores necesarios en MySQL (Driver Class, JDBC URL, User Name y Password), según el archivo appplication.properties 
6. Hacer una prueba de conexión
7. Ingresar a la consola H2
8. Hacer consultas
9. Fin del ejercicio
