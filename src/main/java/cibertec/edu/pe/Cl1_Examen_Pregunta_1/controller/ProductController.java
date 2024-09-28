package cibertec.edu.pe.Cl1_Examen_Pregunta_1.controller;

import cibertec.edu.pe.Cl1_Examen_Pregunta_1.client.placeholder.model.Product;
import cibertec.edu.pe.Cl1_Examen_Pregunta_1.service.ProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class ProductController {

    private final ProductoService productoService;

    @GetMapping("/products/{id}")
    public Product obtenerProductoXid(@PathVariable("id") Long id){
        return productoService.obtenerProductoXid(id);
    }

    @PostMapping("/products")
    public Product crearProducto(@RequestBody Product title){
        return productoService.crearProducto(title);
    }
}
