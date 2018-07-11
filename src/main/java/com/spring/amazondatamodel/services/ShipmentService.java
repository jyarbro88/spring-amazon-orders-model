package com.spring.amazondatamodel.services;

import com.spring.amazondatamodel.datalayer.ShipmentDAO;

import java.util.List;

public interface ShipmentService {

    void saveShipment(ShipmentDAO shipmentDAO);
    void updateShipment(ShipmentDAO shipmentDAO);
    void deleteShipment(ShipmentDAO shipmentDAO);
    List<ShipmentDAO> getAllShipments();
}
