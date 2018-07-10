package com.spring.amazondatamodel.weblayer.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
//import com.spring.amazondatamodel.datalayer.daos.AccountDAO;
import com.spring.amazondatamodel.datalayer.daos.Product;
import com.spring.amazondatamodel.implementors.ProductServiceImpl;
//import com.spring.amazondatamodel.weblayer.beans.ProductBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductServiceImpl productService;

    @Autowired
    public ProductController(ProductServiceImpl productService) {
        this.productService = productService;
    }

//    @RequestMapping(
//                value = {"/products"},
//                produces = "application/json",
//                method = RequestMethod.POST
//            )
//    @ResponseBody
//    public ResponseEntity addNewProduct(
//            @RequestBody() String productJson;
//    ) {
//        ObjectMapper mapper = new ObjectMapper();
//        ProductBean productBean;
//
//        try {
//            productBean = mapper.readValue(productJson, ProductBean.class);
//        } catch (IOException e) {
//            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//
//        Product productDAO = productRepository.save(productBean);
//        List<AccountDAO> accountDAOS;
//
//        if ( accountId != null) {
//            AccountDAO accountDaoToSearchFor
//        }
//        return null;
//    }

//    @RequestMapping(value = {"/products"}, method = RequestMethod.GET)
//    @ResponseBody
//    public ResponseEntity showAllProducts(@RequestBody)
//

    @GetMapping(produces = "application/json")
    @ResponseBody
    public List<Product> showAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping(consumes = "application/json")
    @ResponseBody
    public ResponseEntity addNewProduct(
            @Valid
            @RequestBody String productJson) {

        ObjectMapper mapper = new ObjectMapper();
        Product product;

        try {
            product = mapper.readValue(productJson, Product.class);
        } catch (IOException e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        productService.saveProduct(product);

        return new ResponseEntity(HttpStatus.OK);
    }

}
