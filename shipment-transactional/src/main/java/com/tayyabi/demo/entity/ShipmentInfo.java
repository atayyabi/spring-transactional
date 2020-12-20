package com.tayyabi.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="SHIPMENT_INFO")
public class ShipmentInfo {

	@Id
	@GeneratedValue
	private Long customerId;
	private String name;
	private String email;
	private String shipFrom;
	private String shipTo;
	@JsonFormat(shape= JsonFormat.Shape.STRING, pattern = "dd-MM-yyy")
	private Date shipmentDate;
	private String scheduledPickupTime;
	@JsonFormat(shape= JsonFormat.Shape.STRING, pattern = "dd-MM-yyy")
	private Date estimatedArrivalDate;
	private double totalCharge;

	public ShipmentInfo() {

	}

	public ShipmentInfo(Long customerId, String name, String email, String shipFrom, String shipTo, Date shipmentDate,
			String scheduledPickupTime, Date estimatedArrivalDate, double totalCharge) {

		this.customerId = customerId;
		this.name = name;
		this.email = email;
		this.shipFrom = shipFrom;
		this.shipTo = shipTo;
		this.shipmentDate = shipmentDate;
		this.scheduledPickupTime = scheduledPickupTime;
		this.estimatedArrivalDate = estimatedArrivalDate;
		this.totalCharge = totalCharge;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getShipFrom() {
		return shipFrom;
	}

	public void setShipFrom(String shipFrom) {
		this.shipFrom = shipFrom;
	}

	public String getShipTo() {
		return shipTo;
	}

	public void setShipTo(String shipTo) {
		this.shipTo = shipTo;
	}

	public Date getShipmentDate() {
		return shipmentDate;
	}

	public void setShipmentDate(Date shipmentDate) {
		this.shipmentDate = shipmentDate;
	}

	public String getScheduledPickupTime() {
		return scheduledPickupTime;
	}

	public void setScheduledPickupTime(String scheduledPickupTime) {
		this.scheduledPickupTime = scheduledPickupTime;
	}

	public Date getEstimatedArrivalDate() {
		return estimatedArrivalDate;
	}

	public void setEstimatedArrivalDate(Date estimatedArrivalDate) {
		this.estimatedArrivalDate = estimatedArrivalDate;
	}

	public double getTotalCharge() {
		return totalCharge;
	}

	public void setTotalCharge(double totalCharge) {
		this.totalCharge = totalCharge;
	}

}
