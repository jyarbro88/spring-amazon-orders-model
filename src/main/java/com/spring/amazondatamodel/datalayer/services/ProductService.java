package com.spring.amazondatamodel.datalayer.services;

import com.spring.amazondatamodel.datalayer.daos.ProductDAO;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    public abstract Optional<ProductDAO> getProductById(Long id);
    public abstract void saveProduct(ProductDAO productDAO);
    public abstract void updateProduct(ProductDAO productDAO);
    public abstract void deleteProduct(ProductDAO productDAO);
    public abstract List<ProductDAO> getAllProducts();
}
