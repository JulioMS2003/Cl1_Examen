package cibertec.edu.pe.Cl1_Examen_Pregunta_1.client.placeholder.iclientservice;

import cibertec.edu.pe.Cl1_Examen_Pregunta_1.client.placeholder.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "userClient",
              url = "https://fakestoreapi.com")
public interface ProductoClient {

    @GetMapping("/products/{id}")
    Product obtenerProductoXid(@PathVariable("id") Long id);

    @PostMapping("/products")
    Product crearProducto(@RequestBody Product title);

}
