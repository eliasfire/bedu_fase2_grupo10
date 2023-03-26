# Reto02: Inicialización de datos con SQL

- Código modificado en las clases:

1. ETAPA EN MODEL
            package org.bedu.javabackend.reto02.model;

            import javax.persistence.*;

            @Entity
            @Table(name = "ETAPAS")
            public class Etapa {
                @Id
                @GeneratedValue(strategy = GenerationType.IDENTITY)
                private Long etapaId;

                @Column(nullable = false, length = 100)
                private String nombre;

                @Column(nullable = false, unique = true)
                private Integer orden;

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
            }
2. ETAPAREPO EN PERSISTENCE

            package org.bedu.javabackend.reto02.persistence;

            import org.bedu.javabackend.reto02.model.Etapa;
            import org.springframework.data.jpa.repository.JpaRepository;

            public interface EtapaRepo extends JpaRepository<Etapa, Long> {

            }
            
3. APPLICACIÓN DEL RETO 02

            package org.bedu.javabackend.reto02;

            import org.springframework.boot.SpringApplication;
            import org.springframework.boot.autoconfigure.SpringBootApplication;

            @SpringBootApplication
            public class Reto02Application {

                public static void main(String[] args) {
                    SpringApplication.run(Reto02nApplication.class, args);
                }

            }
