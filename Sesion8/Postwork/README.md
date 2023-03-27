# CONEXIÓN A BASE DE DATOS CON SPRING DATA

Almacenar la información de la agenda en MySQL y despues recuperarlas.

### OBJETIVO

- Persistir la información de la agenda en BD relacional como MySQL.
- Recuperar las personas para mostrarlas en pantalla.
- Que la información ingresada no desaparezca al momento de reiniciar la aplicación.

<img align="right" src="https://kinsta.com/wp-content/uploads/2019/04/logo-mysql-1.svg" alt="gradle" width="300"/>

### DESARROLLO

1. Decidimos usar Bootstrap para darle una presentacion mas agradable a la aplicacion, usamos la plantilla [Cover](https://getbootstrap.com/docs/5.0/examples/cover/)
  porque tiene un estilo similar a la pagina web de BEDU. 
2. Ademas de la operacion de agregar una nueva persona a la agenda, agregamos dos operacion mas: Editar y Eliminar una persona.
3. Al arrancar la aplicacion se cargan 4 personas (integrantes del grupo) en la base de datos y se muestran en la pagina principal.

#### Pantalla principal:

![pantalla-aplicacion](img/index.png)

#### Agregando una persona:

4. Se abre un formulario para ingresar los datos.
5. Antes de persistir los datos en la BD se validan segun el modelo Persona.

![pantalla-h2-console-connection](img/nuevo.png)

#### Editando una persona:

7. Para editar una persona usamos la misma plantilla nuevo.html que recibe un id correspondiente a la persona selecionada en la tabla principal.
8. Antes de actualizar los datos tambien se validan.
9. Si todo sale correctamente se nuestra una mensaje indicando que la operacion fue exitosa.

![pantalla-h2-console](img/editar.png)

#### Elimnando una persona:

10. Antes de eliminar una persona se pide confirmacion.
11. Se actualiza la tabla y se muestra un mensaje de operacion exitosa.

![pantalla-h2-console-connection](img/eliminar.png)


<br>

[**`Regresar`**](../)
