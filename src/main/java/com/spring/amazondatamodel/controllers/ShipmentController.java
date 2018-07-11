package com.spring.amazondatamodel.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.amazondatamodel.datalayer.ShipmentDAO;
import com.spring.amazondatamodel.implementors.ShipmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/shipments")
public class ShipmentController {

    private final ShipmentServiceImpl shipmentService;

    @Autowired
    public ShipmentController(ShipmentServiceImpl shipmentService) {
        this.shipmentService = shipmentService;
    }

    @GetMapping(produces = {"application/json"})
    @ResponseBody
    public List<ShipmentDAO> showAllShipments(){
        return shipmentService.getAllShipments();
    }

    @PostMapping(consumes = {"application/json"})
    @ResponseBody
    public ResponseEntity addNewShipment(
            @Valid
            @RequestBody String shipmentJson
    ) {
        ObjectMapper mapper = new ObjectMapper();
        ShipmentDAO shipmentDAO;
        try {
            shipmentDAO = mapper.readValue(shipmentJson, ShipmentDAO.class);
        } catch (IOException e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        shipmentService.saveShipment(shipmentDAO);

        return new ResponseEntity(HttpStatus.OK);
    }
}
