# Ejemplo 2: Inicialización de base de datos con CommandLineRunner

1. Generamos los subpaquetes y clases necesarias:
      
      Controller - tendrá la clase ClienteController
      Model  - tendrá la clase Etapa
      Persistence - tendrá la interface EtapaRepository
      Runners -

2.1 CLASE ETAPA
    
    public Long getEtapaId() {
        return etapaId;
    }

    public void setEtapaId(Long etapaId) {
        this.etapaId = etapaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }
    
        @Entity
    @Table(name = "ETAPAS")
    public class Etapa {

    }
    
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long etapaId;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, unique = true)
    private Integer orden;
    
 2.2 INTERFAZ ETAPAREPOSITORY
     
     public interface EtapaRepository extends JpaRepository<Etapa, Long> {

     }
     
 2.3 CLASE ETAPAS VENTASRUNNER
    
        @Component
    public class EtapasVentaRunner implements CommandLineRunner {

    private final EtapaRepository etapaRepository;

    @Autowired
    public EtapasVentaRunner(EtapaRepository etapaRepository) {
        this.etapaRepository = etapaRepository;
    }

    @Override
    public void run(String... args) throws Exception {

      }
    }
    
        @Override
    public void run(String... args) throws Exception {
        Etapa etapa1 = creaEtapa("En espera", 0);
        Etapa etapa2 = creaEtapa("Reunión de exploración", 1);
        Etapa etapa3 = creaEtapa("Metas establecidas", 2);
        Etapa etapa4 = creaEtapa("Plan de acción presentado.", 3);
        Etapa etapa5 = creaEtapa("Contrato firmado", 4);
        Etapa etapa6 = creaEtapa("Venta ganada", 5);
        Etapa etapa7 = creaEtapa("Venta perdida", 6);

        List<Etapa> etapas = Arrays.asList(etapa1, etapa2, etapa3, etapa4, etapa5, etapa6, etapa7);

        etapaRepository.saveAll(etapas);
    }

    private Etapa creaEtapa(String nombre, Integer orden) {
        Etapa etapa = new Etapa();
        etapa.setNombre("En espera");
        etapa.setOrden(orden);

        return etapa;
    }
    
3. Ejecutar la aplicación
4. La base de datos inicia en la columna etapa_id si todo salió bien
5. Fin del ejemplo 2
