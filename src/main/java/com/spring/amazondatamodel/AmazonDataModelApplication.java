package com.spring.amazondatamodel;

import com.spring.amazondatamodel.datalayer.AccountDAO;
import com.spring.amazondatamodel.datalayer.OrderDAO;
import com.spring.amazondatamodel.datalayer.AddressDAO;
import com.spring.amazondatamodel.implementors.AccountServiceImpl;
import com.spring.amazondatamodel.implementors.OrderServiceImpl;
import com.spring.amazondatamodel.implementors.ProductServiceImpl;
import com.spring.amazondatamodel.services.AddressService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
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
    public CommandLineRunner populateDatabase(ProductServiceImpl repository, AccountServiceImpl accountService, AddressService addressService, OrderServiceImpl orderService) {
        return (args) -> {

            List<AddressDAO> addressDAOS = new ArrayList<>();

            AccountDAO accountDAO = new AccountDAO("Joe", "Yarbrough", "jyarbrough@email.com");
            AddressDAO addressDAO = new AddressDAO("811 E Stone ct", "apt", "Addison", "IL", "60101", "USA");

            addressDAOS.add(addressDAO);
            accountDAO.setAddressDAOS(addressDAOS);
            addressService.saveAddress(addressDAO);
            accountService.saveAccount(accountDAO);
            OrderDAO orderDAO = new OrderDAO(new Date(2018,2,17), accountDAO.getId(), addressDAO.getId(), 23.98);
            orderService.saveOrder(orderDAO);
        };
    }
}
