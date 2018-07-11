package com.spring.amazondatamodel.services;

import com.spring.amazondatamodel.datalayer.ProductDAO;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Optional<ProductDAO> getProductById(Long id);
    void saveProduct(ProductDAO productDAO);
    void updateProduct(ProductDAO productDAO);
    void deleteProduct(ProductDAO productDAO);
    List<ProductDAO> getAllProducts();
}
