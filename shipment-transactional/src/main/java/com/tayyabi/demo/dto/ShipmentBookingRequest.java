package com.tayyabi.demo.dto;

import com.tayyabi.demo.entity.PaymentInfo;
import com.tayyabi.demo.entity.ShipmentInfo;


public class ShipmentBookingRequest {
	
	private ShipmentInfo shipmentInfo;
	
	private PaymentInfo paymentInfo;
	
	

	public ShipmentBookingRequest() {
		
	}

	public ShipmentBookingRequest(ShipmentInfo shipmentInfo, PaymentInfo paymentInfo) {
		
		this.shipmentInfo = shipmentInfo;
		this.paymentInfo = paymentInfo;
	}

	public ShipmentInfo getShipmentInfo() {
		return shipmentInfo;
	}

	public void setShipmentInfo(ShipmentInfo shipmentInfo) {
		this.shipmentInfo = shipmentInfo;
	}

	public PaymentInfo getPaymentInfo() {
		return paymentInfo;
	}

	public void setPaymentInfo(PaymentInfo paymentInfo) {
		this.paymentInfo = paymentInfo;
	}
	
	
	

}
