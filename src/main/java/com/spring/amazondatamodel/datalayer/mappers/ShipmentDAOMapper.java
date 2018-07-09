package com.spring.amazondatamodel.datalayer.mappers;

import com.spring.amazondatamodel.datalayer.daos.ShipmentDAO;
import com.spring.amazondatamodel.weblayer.beans.ShipmentBean;

public class ShipmentDAOMapper {

    public ShipmentDAO toDAO(ShipmentBean shipmentBean) {
        ShipmentDAO shipmentDAO = new ShipmentDAO();

        shipmentDAO.setDeliveryDate(shipmentBean.getDeliveryDate());
        shipmentDAO.setShippedDate(shipmentBean.getShippedDate());

//        shipmentDAO.setAddressDAO(shipmentBean.getAddressBean());
//        shipmentDAO.setOrderLineItemDAO(shipmentBean.getOrderLineItemBean());

//        Todo set up address DAO
//        Todo set up order line item DAO

        return shipmentDAO;
    }
}
