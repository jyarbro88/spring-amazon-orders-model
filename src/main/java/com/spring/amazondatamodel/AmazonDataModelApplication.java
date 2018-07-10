package com.spring.amazondatamodel;

import com.spring.amazondatamodel.datalayer.Product;
import com.spring.amazondatamodel.implementors.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

@SpringBootApplication
public class AmazonDataModelApplication {

    public AmazonDataModelApplication() throws IOException {
    }

    public static void main(String[] args) {
        SpringApplication.run(AmazonDataModelApplication.class, args);
    }

//    ClassPathResource imgToSave = new ClassPathResource("../resources/images/Shield-Silhouette.png");
//    byte[] arrayPic = new byte[(int) imgToSave.contentLength()];

    @Bean
    public CommandLineRunner populateDatabase(ProductServiceImpl repository) {
        return (args) -> {
            repository.saveProduct(new Product("jim", "asdflkj", 22.22 ));
        };

    }
}
