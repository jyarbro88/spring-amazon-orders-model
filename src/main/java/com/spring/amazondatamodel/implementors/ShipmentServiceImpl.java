package com.spring.amazondatamodel.implementors;

import com.spring.amazondatamodel.datalayer.ShipmentDAO;
import com.spring.amazondatamodel.repositories.ShipmentRepository;
import com.spring.amazondatamodel.services.ShipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class ShipmentServiceImpl implements ShipmentService {


    private final ShipmentRepository shipmentRepository;

    @Autowired
    public ShipmentServiceImpl(ShipmentRepository shipmentRepository) {
        this.shipmentRepository = shipmentRepository;
    }


    @Transactional
    public void saveShipment(ShipmentDAO shipmentDAO) {
        shipmentRepository.save(shipmentDAO);
    }

    @Transactional
    public void updateShipment(ShipmentDAO shipmentDAO) {
        shipmentRepository.save(shipmentDAO);
    }

    @Transactional
    public void deleteShipment(ShipmentDAO shipmentDAO) {
        shipmentRepository.delete(shipmentDAO);
    }

    @Transactional
    public List<ShipmentDAO> getAllShipments() {
        return shipmentRepository.findAll();
    }
}
