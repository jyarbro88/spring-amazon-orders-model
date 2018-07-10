package com.spring.amazondatamodel;

import com.spring.amazondatamodel.datalayer.Account;
import com.spring.amazondatamodel.datalayer.Product;
import com.spring.amazondatamodel.datalayer.daos.AddressDAO;
import com.spring.amazondatamodel.implementors.AccountServiceImpl;
import com.spring.amazondatamodel.implementors.ProductServiceImpl;
import com.spring.amazondatamodel.services.AddressService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
    public CommandLineRunner populateDatabase(ProductServiceImpl repository, AccountServiceImpl accountService, AddressService addressService) {
        return (args) -> {

            AddressDAO addressDAO = new AddressDAO();

            List<AddressDAO> addressDAOS = new ArrayList<>();

            addressDAO.setAddressOne("811 e stone ct");
            addressDAO.setCity("Addison");
            addressDAO.setState("IL");
            addressDAO.setZipCode("60101");

            addressDAOS.add(addressDAO);

            Account account = new Account("Joe", "Yarbrough", "jyarbrough@email.com");

//            account.setAddressDAOS(addressDAOS);

//            repository.saveProduct(new Product("New Product", "new product description here", 22.22 ));

            accountService.saveAccount(account);

        };

    }
}
