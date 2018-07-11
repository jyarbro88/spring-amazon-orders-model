package com.spring.amazondatamodel;

import com.spring.amazondatamodel.datalayer.*;
import com.spring.amazondatamodel.implementors.AccountServiceImpl;
import com.spring.amazondatamodel.implementors.OrderServiceImpl;
import com.spring.amazondatamodel.implementors.ProductServiceImpl;
import com.spring.amazondatamodel.implementors.ShipmentServiceImpl;
import com.spring.amazondatamodel.services.AddressService;
import com.spring.amazondatamodel.services.OrderLineItemService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.time.LocalDateTime;
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
    public CommandLineRunner populateDatabase(
            ProductServiceImpl productService,
            AccountServiceImpl accountService,
            AddressService addressService,
            OrderLineItemService orderLineItemService,
            ShipmentServiceImpl shipmentService,
            OrderServiceImpl orderService) {
        return (args) -> {

            List<AddressDAO> addressDAOS = new ArrayList<>();
            List<OrderLineItemDAO> orderLineItemList = new ArrayList<>();

            AccountDAO accountDAO = new AccountDAO("Joe", "Yarbrough", "jyarbrough@email.com");
            AddressDAO billingAddressDAO = new AddressDAO("811 E Stone ct", "apt", "Addison", "IL", "60101", "USA");
            AddressDAO shippingAddressDAO = new AddressDAO("421 E Red Oak Dr", "", "Bensenville", "IL", "60701", "USA");
            ProductDAO productDAO = new ProductDAO("product name", "product description", 11.99);
            ProductDAO productDAO2 = new ProductDAO("second product name", "product description", 111.99);
            OrderLineItemDAO orderLineItemDAO = new OrderLineItemDAO(1, productDAO.getPrice(), productDAO);

            orderLineItemList.add(orderLineItemDAO);

            productService.saveProduct(productDAO);
            productService.saveProduct(productDAO2);

            orderLineItemService.saveOrderLineItem(orderLineItemDAO);
//            orderLineItemService.saveOrderLineItem(orderLineItemDAO);
//            orderLineItemService.saveOrderLineItem(orderLineItemDAO2);

            addressDAOS.add(billingAddressDAO);
            accountDAO.setAddressDAOS(addressDAOS);

            addressService.saveAddress(billingAddressDAO);
            addressService.saveAddress(shippingAddressDAO);
            accountService.saveAccount(accountDAO);
            OrderDAO orderDAO = new OrderDAO(new Date(2018, 2, 17), accountDAO.getId(), shippingAddressDAO.getId(), billingAddressDAO.getId(), orderLineItemList, accountDAO, billingAddressDAO, shippingAddressDAO);

            Date date = new Date();

            orderService.saveOrder(orderDAO);

            ShipmentDAO shipmentDAO = new ShipmentDAO(orderDAO.getId(), orderDAO.getAccountId(), orderDAO.getShippingAddressId(), date, null, orderLineItemList, orderDAO.getAccountDAO(), orderDAO.getShippingAddress());

            shipmentService.saveShipment(shipmentDAO);

        };
    }
}
