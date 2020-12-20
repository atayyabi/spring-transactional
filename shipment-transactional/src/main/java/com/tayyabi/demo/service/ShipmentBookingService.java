package com.tayyabi.demo.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tayyabi.demo.dto.ShipmentBookingAcknowledgement;
import com.tayyabi.demo.dto.ShipmentBookingRequest;
import com.tayyabi.demo.entity.PaymentInfo;
import com.tayyabi.demo.entity.ShipmentInfo;
import com.tayyabi.demo.repository.PaymentInfoRepository;
import com.tayyabi.demo.repository.ShipmentInfoRepository;
import com.tayyabi.demo.utilities.PaymentUtils;

@Service
public class ShipmentBookingService {
	
	@Autowired
	private ShipmentInfoRepository shipmentInfoRepository;
	
	@Autowired
	private PaymentInfoRepository paymentInfoRepository;
	
	@Transactional
	public ShipmentBookingAcknowledgement bookShipment(ShipmentBookingRequest request) {
		
		ShipmentInfo shipmentInfo = request.getShipmentInfo();
		
		shipmentInfo = shipmentInfoRepository.save(shipmentInfo);
		
		PaymentInfo paymentInfo = request.getPaymentInfo();
		
		PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(), shipmentInfo.getTotalCharge());
		
		paymentInfo.setCustomerId(shipmentInfo.getCustomerId());
		
		paymentInfo.setAmount(shipmentInfo.getTotalCharge());
		paymentInfoRepository.save(paymentInfo);
		
		return new ShipmentBookingAcknowledgement("Success", shipmentInfo.getTotalCharge(), UUID.randomUUID().toString(), shipmentInfo);
	}

}
