package com.spring.amazondatamodel.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
//import com.spring.amazondatamodel.datalayer.AccountDAO;
import com.spring.amazondatamodel.datalayer.ProductDAO;
import com.spring.amazondatamodel.implementors.ProductServiceImpl;
//import com.spring.amazondatamodel.weblayer.beans.ProductBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductServiceImpl productService;

    @Autowired
    public ProductController(ProductServiceImpl productService) {
        this.productService = productService;
    }

    @GetMapping(produces = "application/json")
    @ResponseBody
    public List<ProductDAO> showAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping(consumes = "application/json")
    @ResponseBody
    public ResponseEntity addNewProduct(@Valid @RequestBody String productJson) {
        ObjectMapper mapper = new ObjectMapper();
        ProductDAO productDAO;

        try {
            productDAO = mapper.readValue(productJson, ProductDAO.class);
        } catch (IOException e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        productService.saveProduct(productDAO);

        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping(
            value = {"/{productId}"},
            consumes = "application/json")
    @ResponseBody
    public ResponseEntity updateProduct(
            @Valid
            @RequestBody String productJson,
            @PathVariable(value = "productId") Long productId) {

        ObjectMapper mapper = new ObjectMapper();
        ProductDAO productDAO = null;

        Optional<ProductDAO> foundProduct = productService.getProductById(productId);

        Optional<ProductDAO> productById = productService.getProductById(productId);

        try {
            productDAO = mapper.readValue(productJson, ProductDAO.class);
        } catch (IOException e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        productService.updateProduct(productDAO);

        return new ResponseEntity(HttpStatus.OK);
    }

}
