package com.spring.amazondatamodel.weblayer.mappers;

import com.spring.amazondatamodel.datalayer.daos.ShipmentDAO;
import com.spring.amazondatamodel.weblayer.beans.ShipmentBean;

public class ShipmentBeanMapper {

    public ShipmentBean toBean(ShipmentDAO shipmentDAO) {
        ShipmentBean shipmentBean = new ShipmentBean();

        shipmentBean.setDeliveryDate(shipmentDAO.getDeliveryDate());
        shipmentBean.setShippedDate(shipmentDAO.getShippedDate());



//        shipmentBean.setOrderLineItemBean(shipmentDAO.getOrderLineItemDAO());
//        shipmentBean.setAddressBean(shipmentDAO.getAddressDAO());

//        Todo Fix Address Bean
//        Todo Fix Order Line Item Bean


        return shipmentBean;
    }
}
