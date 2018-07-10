package com.spring.amazondatamodel.implementors;

import com.spring.amazondatamodel.datalayer.ProductDAO;
import com.spring.amazondatamodel.repositories.ProductRepository;
import com.spring.amazondatamodel.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Component
public class ProductServiceImpl implements ProductService {


    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional
    public Optional<ProductDAO> getProductById(Long id) {
        return productRepository.findById(id);
    }

    @Transactional
    public void saveProduct(ProductDAO productDAO) {
        productRepository.save(productDAO);
    }

    @Transactional
    public void updateProduct(ProductDAO productDAO) {
        productRepository.save(productDAO);
    }

    @Transactional
    public void deleteProduct(ProductDAO productDAO) {
        productRepository.delete(productDAO);
    }

    @Transactional
    public List<ProductDAO> getAllProducts() {
        List<ProductDAO> allProductsFound = productRepository.findAll();
        return allProductsFound;
    }
}
