package com.spring.amazondatamodel.services;

import com.spring.amazondatamodel.datalayer.ShipmentDAO;

import java.util.List;

public interface ShipmentService {

    public abstract void saveShipment(ShipmentDAO shipmentDAO);
    public abstract void updateShipment(ShipmentDAO shipmentDAO);
    public abstract void deleteShipment(ShipmentDAO shipmentDAO);
    public abstract List<ShipmentDAO> getAllShipments();
}
