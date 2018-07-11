package com.spring.amazondatamodel.datalayer;

import javax.persistence.*;

@Entity
@Table(name = "order_line_items")
public class OrderLineItemDAO {

    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    private ProductDAO productDAO;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "total_price")
    private Double lineItemTotalPrice;
//    @OneToOne
//    private Long shipmentId;


    public OrderLineItemDAO(Integer quantity, Double lineItemTotalPrice, ProductDAO productDAO) {
        this.quantity = quantity;
        this.productDAO = productDAO;
        this.lineItemTotalPrice = lineItemTotalPrice;
    }

    public OrderLineItemDAO() { }

    public ProductDAO getProductDAO() { return productDAO; }

    public void setProductDAO(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getLineItemTotalPrice() {
        return lineItemTotalPrice;
    }

    public void setLineItemTotalPrice(Double lineItemTotalPrice) {
        this.lineItemTotalPrice = lineItemTotalPrice;
    }

//    public Long getShipmentId() {
//        return shipmentId;
//    }
//
//    public void setShipmentId(Long shipmentId) {
//        this.shipmentId = shipmentId;
//    }
}
