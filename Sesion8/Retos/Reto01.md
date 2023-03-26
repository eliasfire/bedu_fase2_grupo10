# Reto 01: Persistencia de datos con Spring Data JPA

- Código correspondiente a:

1. CLASE PRODUCTOCONTROLLER EN CONTROLLER

package org.bedu.javabackend.reto1.controller;

import org.bedu.javabackend.reto1.model.Producto;
import org.bedu.javabackend.reto1.persistence.ProductoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    private final ProductoRepo productoRepo;

    @Autowired
    public ProductoController(ProductoRepo productoRepo) {
        this.productoRepo = productoRepo;
    }

    @PostMapping
    public ResponseEntity<Void> creaProducto(@RequestBody Producto producto) {

        Producto productoDB = productoRepository.save(producto);

        return ResponseEntity.created(URI.create(String.valueOf(producto.getId()))).build();
    }

    @GetMapping("/{productoId}")
    public ResponseEntity<Producto> getProducto(@PathVariable Long productoId) {

        Optional<Producto> productoDB = productoRepos.findById(productoId);

        if (!productoDB.isPresent())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "El producto especificado no existe.");

        return ResponseEntity.ok(productoDB.get());
    }
}

2. CLASE PRODUCTO EN MODEL
       
          package org.bedu.java.backend.reto1.model;

          import javax.persistence.*;
          import java.time.LocalDate;

          @Entity
          @Table(name = "PRODUCTOS")
          public class Producto {
              @Id
              @GeneratedValue(strategy = GenerationType.IDENTITY)
              private Long id;
              private String nombre;
              private String categoria;
              private float precio;

              @Column(name = "numero_registro", length = 20)
              private String numeroRegistro;

              @Column(name = "fecha_creacion")
              private LocalDate fechaCreacion;

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

              public String getCategoria() {
                  return categoria;
              }

              public void setCategoria(String categoria) {
                  this.categoria = categoria;
              }

              public float getPrecio() {
                  return precio;
              }

              public void setPrecio(float precio) {
                  this.precio = precio;
              }

              public String getNumeroRegistro() {
                  return numeroRegistro;
              }

              public void setNumeroRegistro(String numeroRegistro) {
                  this.numeroRegistro = numeroRegistro;
              }

              public LocalDate getFechaCreacion() {
                  return fechaCreacion;
              }

              public void setFechaCreacion(LocalDate fechaCreacion) {
                  this.fechaCreacion = fechaCreacion;
              }
          }

   
3. CLASE PRoDUCTOREPO EN PERSISTENCE


            package org.bedu.javabackend.reto1.persistence;

            import org.bedu.javabackend.reto1.model.Producto;
            import org.springframework.data.jpa.repository.JpaRepository;

            public interface ProductoRepo extends JpaRepository<Producto, Long> {

            }
