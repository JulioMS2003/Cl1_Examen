package cibertec.edu.pe.Cl1_Examen_Pregunta_1.service;

import cibertec.edu.pe.Cl1_Examen_Pregunta_1.client.placeholder.iclientservice.ProductoClient;
import cibertec.edu.pe.Cl1_Examen_Pregunta_1.client.placeholder.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProductoService {

    private final ProductoClient ProductoClient;

    public Product obtenerProductoXid(Long id){
        return ProductoClient.obtenerProductoXid(id);
    }

    public Product crearProducto(Product title){
        return ProductoClient.crearProducto(title);
    }

}
