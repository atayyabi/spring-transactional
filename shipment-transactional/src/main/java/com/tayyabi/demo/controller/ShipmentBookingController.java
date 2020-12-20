package com.tayyabi.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tayyabi.demo.dto.ShipmentBookingAcknowledgement;
import com.tayyabi.demo.dto.ShipmentBookingRequest;
import com.tayyabi.demo.service.ShipmentBookingService;

@RestController
@EnableTransactionManagement
public class ShipmentBookingController {
	
	@Autowired
	private ShipmentBookingService service;
	
	@PostMapping("/bookShipment")
	private ShipmentBookingAcknowledgement bookShipment(@RequestBody ShipmentBookingRequest request) {
		
		return service.bookShipment(request);
		
	}
	

}
