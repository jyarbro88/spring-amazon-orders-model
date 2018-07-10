package com.spring.amazondatamodel.datalayer.mappers;

import com.spring.amazondatamodel.datalayer.daos.ShipmentDAO;
import com.spring.amazondatamodel.weblayer.beans.ShipmentBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShipmentDAOMapper {

    private final AddressDAOMapper addressDAOMapper;
    private final OrderLineItemDAOMapper orderLineItemDAOMapper;

    @Autowired
    public ShipmentDAOMapper(AddressDAOMapper addressDAOMapper, OrderLineItemDAOMapper orderLineItemDAOMapper) {
        this.addressDAOMapper = addressDAOMapper;
        this.orderLineItemDAOMapper = orderLineItemDAOMapper;
    }

    public ShipmentDAO toDAO(ShipmentBean shipmentBean) {
        ShipmentDAO shipmentDAO = new ShipmentDAO();

        shipmentDAO.setDeliveryDate(shipmentBean.getDeliveryDate());
        shipmentDAO.setShippedDate(shipmentBean.getShippedDate());
//        shipmentDAO.setAddressId(shipmentBean.getAddressBean().getId());
        shipmentDAO.setOrderId(shipmentBean.getOrderId());
//        shipmentDAO.setAddressDAO(shipmentBean.getAddressBean());
//        shipmentDAO.setOrderLineItemDAO(shipmentBean.getOrderLineItemBean());

//        Todo set up address DAO
//        Todo set up order line item DAO

        return shipmentDAO;
    }
}
