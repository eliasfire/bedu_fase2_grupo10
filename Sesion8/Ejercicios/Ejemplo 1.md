# Ejemplo 1: Persistencia de datos con Spring Data JPA

1. Crear las dependencias a agregar con Srping Initializr
2. Generamos los subpaquetes y clases necesarias:
      
      Controller - tendrá la clase ClienteController
      Model  - tendrá la clase Cliente
      Persistence - tendrá la interface ClienteRepository
      
      
 2.1 CLASE CLIENTE 
 
      public class Cliente {
    private Long id;
    private String nombre;
    private String correoContacto;
    private int numeroEmpleados;
    private String direccion;
    }
     
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoContacto() {
        return correoContacto;
    }

    public void setCorreoContacto(String correoContacto) {
        this.correoContacto = correoContacto;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
        @Entity
    @Table(name = "CLIENTE")
    public class Cliente {

    }
    
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @Column(name = "correo_contacto", length = 30)
    private String correoContacto;

    @Column(name = "numero_empleados")
    private int numeroEmpleados;

    private String direccion;
    
    
2.2 CLASE CLIENTECONTROLLER

        @RestController
    @RequestMapping("/cliente")
    public class ClienteController {
    
      private final ClienteRepository clienteRepository;

    }
    
        @Autowired
    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
    
        @PostMapping
    public ResponseEntity<Void> creaCliente(@RequestBody Cliente cliente){
        return ResponseEntity.created(URI.create("")).build();
    }
    
        @PostMapping
    public ResponseEntity<Void> creaCliente(@RequestBody Cliente cliente){

        Cliente clienteDB = clienteRepository.save(cliente);

        return ResponseEntity.created(URI.create(clienteDB.getId().toString())).build();
    }

2.3 INTERFACE CLIENTEREPOSITORY (se queda sin métodos)
    
    public interface ClienteRepository  extends JpaRepository<Cliente, Long> {
    
    }
      
3. Actualizamos los datos requeridos

3.1 APPLICATION PROPERTIES

    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.hibernate.generate_statistics=true
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.datasource.url=jdbc:mysql://
    spring.datasource.username=<usuario>
    spring.datasource.password=<password>

4.En Postman solicitamos

    1  {
    2     "nombre": "BeduORG",
    3     "correoContacto": "contacto@bedu.org",
    4     "numeroEmpleados": "20",
    5     "direccion": "direccion"
    6  }
 
 5. Revisamos la base de datos, que ahora debe contener los datos que mandamos desde Postman en la tbla cliente
 
 6. Fin del ejemplo 1
    

