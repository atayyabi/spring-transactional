package com.tayyabi.demo.dto;

import com.tayyabi.demo.entity.ShipmentInfo;


public class ShipmentBookingAcknowledgement {
	
	private String status;
	private double totalCharge;
	private String invoiceNumber;
	private ShipmentInfo shipmentInfo;
	
	public ShipmentBookingAcknowledgement(String status, double totalCharge, String invoiceNumber,
			ShipmentInfo shipmentInfo) {
		
		this.status = status;
		this.totalCharge = totalCharge;
		this.invoiceNumber = invoiceNumber;
		this.shipmentInfo = shipmentInfo;
	}

	public ShipmentBookingAcknowledgement() {
		
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getTotalCharge() {
		return totalCharge;
	}

	public void setTotalCharge(double totalCharge) {
		this.totalCharge = totalCharge;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public ShipmentInfo getShipmentInfo() {
		return shipmentInfo;
	}

	public void setShipmentInfo(ShipmentInfo shipmentInfo) {
		this.shipmentInfo = shipmentInfo;
	}
	
	
	
	
	
	

}
