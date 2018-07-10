package com.spring.amazondatamodel.datalayer.services;

import com.spring.amazondatamodel.datalayer.daos.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    public abstract Optional<Product> getProductById(Long id);
    public abstract void saveProduct(Product product);
    public abstract void updateProduct(Product product);
    public abstract void deleteProduct(Product product);
    public abstract List<Product> getAllProducts();
}
